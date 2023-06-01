package com.Lime.pom;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.support.PageFactory;

import com.Lime.base.BaseClass;
public class PageObjectManager extends BaseClass {
	public PageObjectManager(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	private Limefp lf; 
	private secondtshirt st;
	private thirdjeans tj;
	
	public Limefp getlf() {
		lf = new Limefp(driver);
		return lf;
	}
	public secondtshirt getst() {
		st = new secondtshirt(driver);
		return st;
	}
	public thirdjeans gettj() {
		tj = new thirdjeans(driver);
		return tj;
	}

}
