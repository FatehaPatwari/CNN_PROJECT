package com.cnn.MasterPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
       @FindBy(xpath="(//*[@class='sc-htoDjs dpodOf'])[1]//li")
       private List<WebElement> allPageName;
       
		
		public List<WebElement> getAllPageName() {
		return allPageName;
		
		
	}
		//@FindBy(xpath ="(//*[@class='sc-htoDjs dpodOf'])[1]//a")
		//private List<WebElement> allpage;
		
		
	   @FindBy(xpath="//*[contains(@class,'ticker-name-change')]")
	 private List<WebElement>topSecurityNameAndValue;
	
		
		public List<WebElement> getTopSecurityNameAndValue() {
		return topSecurityNameAndValue;
	}
		
		
		//@FindBy(xpath ="//*[contains(@class,'logo')]")
		//private List<WebElement> pagelogo;
		//*[@class='stock']
		
		@FindBy(xpath ="//*[@class='module-body wsod most-popular-stocks']//a")
		private List<WebElement> mostPopularStock;
		
		public List<WebElement> getMostPopularStock() {
			return mostPopularStock;
		}
		
		
		 @FindBy(xpath ="//*[name()='g']//*[name()='text'][2]")
		 private List<WebElement> sectorformanceBarName;
		 
		 public List<WebElement> getSectorformanceBarName() {
				return sectorformanceBarName;
			}
		 
		 @FindBy(xpath ="//*[name()='g']//*[@class='pct-change negative']")
			private List<WebElement> sectorformanceBarValues;
		 
		 public List<WebElement> getSectorformanceBarValues() {
				return sectorformanceBarValues;
			}
		 

			@FindBy(xpath ="//*[@class='module-body wsod losers']//li")
			private List<WebElement> losserSectionValues;
			
			
			public List<WebElement> getLosserSectionValues() {
				return losserSectionValues;
			}

			
			
		
		@FindBy(xpath ="//*[@class='module-body wsod key-stats' or @class='module-body wsod commodities']//*[@class='quote']")
		private List<WebElement> KeyStartsAndCommodities;
		
		public List<WebElement> getKeyStartsAndCommodities() {
			return KeyStartsAndCommodities;
		}

		
	   
		
		
		

		

		//public List<WebElement> getPagelogo() {
		//	return pagelogo;
		//}

		//public List<WebElement> getAllpage() {
			//return allpage;
		//}

		
			

		
		
		// Market
		@FindBy(xpath = "(//*[contains(@class,'sc-dnqmqq dMglaH')])[1]")
		private WebElement market;


		public WebElement getMarket() {
			return market;
		}

	//Tech
		@FindBy(xpath = ("(//*[contains(text(),'Tech')])[1]"))
		private WebElement Tech;

		public WebElement getTech() {
			return Tech;
		}

	//Media
		@FindBy(xpath = ("(//*[contains(text(),'Media')])[3]"))
		private WebElement media;

		public WebElement getMedia() {
			return media;
		}

	//Success
		@FindBy(xpath = ("(//*[text()='Success'])[1]"))
		private WebElement success;

		public WebElement getSuccess() {
			return success;
		}

	//Perspective
		@FindBy(xpath = ("(//*[text()='Perspectives'])[1]"))
		private WebElement perspective;

		public WebElement getPerspective() {
			return perspective;
		}

	//Videos
		@FindBy(xpath = ("(//*[text()='Videos'])[1]"))
		private WebElement videos;

		public WebElement getVideos() {
			return videos;
		}
		
		


	}

