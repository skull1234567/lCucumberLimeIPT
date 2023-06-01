package com.Lime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lime.base.BaseClass;

public class thirdjeans extends BaseClass {
	WebDriver driver;
	
	public thirdjeans(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//a[@class='dTc cuP mainCategory c2A vM pR bs bdb4T w100 taC tdN'])[2]")
	private WebElement mensstab;
	
	@FindBy(xpath = "(//a[text()='jeans'])[1]")
	private WebElement jeanstab;
	
	@FindBy(xpath ="(//img[@alt='Product image'])[5]")
	private WebElement jeanse;
	
	@FindBy(xpath ="(//span[@class='br10  bd3  p410 hcP hbxs bxs bs size'])[4]")
	private WebElement jsize;
	
	@FindBy(xpath = "//div[text()='ADD TO CART']")
	private WebElement addtocarttt;

	public WebElement getMensstab() {
		return mensstab;
	}

	public WebElement getJeanstab() {
		return jeanstab;
	}

	public WebElement getJeanse() {
		return jeanse;
	}

	public WebElement getJsize() {
		return jsize;
	}

	public WebElement getAddtocarttt() {
		return addtocarttt;
	}
	
}
