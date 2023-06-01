package com.Lime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lime.base.BaseClass;

public class secondtshirt extends BaseClass {
	WebDriver driver;
	
	public secondtshirt(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//a[@class='dTc cuP mainCategory c2A vM pR bs bdb4T w100 taC tdN'])[2]")
	private WebElement menstab;
	
	@FindBy(xpath = "(//a[text()='t-shirts'])[1]")
	private WebElement tshirttab;
	
	@FindBy(xpath = "(//img[@alt='Product image'])[6]")
    private WebElement tshirtelement;
	
	@FindBy(xpath = "//span[text()=' XL ']")
	private WebElement size;
	
	@FindBy(xpath = "//div[text()='ADD TO CART']")
	private WebElement addtocart;

	public WebElement getMenstab() {
		return menstab;
	}

	public WebElement getTshirttab() {
		return tshirttab;
	}

	public WebElement getTshirtelement() {
		return tshirtelement;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
}
