package com.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeAppScreenShot {

	public static String captureScreenShot(WebDriver driver, String ScreenShotName) {
/* We have 3 steps for take a screen shot
 * 1)Convert WebDriver object to  TakesScreenshot(Type casting)
 * 2)Call getScreenshotAs method to create image file.
 * 3)Copy file to desire location
 * 4)System.getProperty("user.dir") fetches the directory or 
 * path of the workspace for the current project.So if the path of project change any time soon,
 * U don't need to change it from TakeAScreenShot class. With "user.dir" I can use any path anytime . 
 * Let say I  push the project  into github. And my offshore team member need  to pull the project from github. 
 * They need to change System.setproperty (path) and 
 * they also change TakeascreenShot System.getProperty(path) if I use user.dir in the first place,
 * they need to change only path one time from System.setProperty(path) that's all. 
 * They don't need to lose any time, or get confuse with path. So that's why I use "user.dir" in my project.
 *  
 */
	 
		TakesScreenshot ts = (TakesScreenshot) driver;// type casting
		File source = ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
	
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd___HH_mm_ss");
		Date date = new Date();
		String dateTime = dateFormat.format(date.getTime());
		 File dir=new File("./Screen Shot");
	       if(!dir.exists()){
	           
	           dir.mkdir();
	       }
		String destination = currentDir + "//Screen Shot//" + dateTime + "___" + ScreenShotName + ".png";
		try {
			
			com.google.common.io.Files.copy(source, new File(destination));
		} catch (IOException e) {

			e.printStackTrace();
		}

		// System.out.println("Screen shot taken");

		return destination;

	}

	public static void emptyScreenShotFolder() {
		
		 Path pathToBeDeleted =Paths.get("./Screen Shot");
			try {
				Files.walk(pathToBeDeleted )
				    .sorted(Comparator.reverseOrder())
				    .map(Path::toFile)
				    .forEach(File::delete);
			} catch (IOException e1) {
				
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
			
		      
			//Arrays.stream(new File("./Screen Shot").listFiles()).forEach(File::delete);
	}

}