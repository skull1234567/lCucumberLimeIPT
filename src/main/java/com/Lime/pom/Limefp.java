package com.Lime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lime.base.BaseClass;


public class Limefp extends BaseClass{
		WebDriver driver;
		
		public Limefp(WebDriver driver) {
			this.driver = driver;
			
			PageFactory.initElements(driver,this);
		}
	
		@FindBy(xpath = "(//span[@class='dIb vM wsN owsN fwB'])[1]")
		private WebElement mentab;
		
		@FindBy(xpath = "(//div[@class='c3 fs10 ttU taC ls5 pt4'])[4]")
		private WebElement profileicon;
		
		@FindBy(xpath = "//span[text()='Login']")
		private WebElement loginb;
		
		@FindBy(xpath = "//div[text()='cart']")
		private WebElement cartt;
		
		@FindBy(xpath = "//input[@inputmode='numeric']")
		private WebElement mobilen;
		
		@FindBy(xpath ="//input[@value='NEXT']")
		private WebElement nextb;
		
		@FindBy(xpath ="(//a[@class='dTc cuP mainCategory c2A vM pR bs bdb4T w100 taC tdN'])[4]")
		private WebElement hometab;
		
		@FindBy(xpath ="(//a[text()='blankets'])[1]")
		private WebElement blanketbc;
		
		@FindBy(xpath = "(//img[@alt='Product image'])[3]")
		private WebElement blanketec;
		
		@FindBy(xpath ="//div[@data-pgn='Add to Cart']")
		private WebElement addtocart;

		//public WebDriver getDriver() {
			//return driver;
		//}

		public WebElement getMentab() {
			return mentab;
		}

		public WebElement getProfileicon() {
			return profileicon;
		}

		public WebElement getLoginb() {
			return loginb;
		}

		public WebElement getCartt() {
			return cartt;
		}

		public WebElement getMobilen() {
			return mobilen;
		}

		public WebElement getNextb() {
			return nextb;
		}

		public WebElement getHometab() {
			return hometab;
		}

		public WebElement getBlanketbc() {
			return blanketbc;
		}

		public WebElement getBlanketec() {
			return blanketec;
		}

		public WebElement getAddtocart() {
			return addtocart;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}

