package com.regression;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CNN_Testing {
	
	static WebDriver driver;
	@BeforeTest
	public void setup1() {
		driver=TestCaseOne.setup();//return==>driver
			
		}
		@Test
		public void pageTitle_02() {
			TestCaseTwo.getTitle(driver);
		}
	
		@Test
		public void Market_03() {
			
		//Most popular stock==>read from App
		
		}	
			@Test
			public void Market_04() {
				
				//Most popular stock==>read from App
						//Then===>Validate with excell	
			}
@AfterTest
public void teardown() {
	
	
}
}	
		
		

	