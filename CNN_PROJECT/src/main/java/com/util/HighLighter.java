package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLighter {
	
	public static void getColor(WebDriver driver, WebElement element,String i) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;//type casting
		js.executeScript("arguments[0].style.border='3px solid "+i +",", element);
	}

	public static void getColor(WebDriver driver, WebElement data, int indexOf) {
		// TODO Auto-generated method stub
		
	}

}