package com.stepdefinition;

import org.junit.Before;

import com.Lime.base.BaseClass;
import com.Lime.pom.PageObjectManager;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	PageObjectManager pom = new PageObjectManager(driver);
	@Before
	@Given("to launch the url")
	public void to_launch_the_url() throws InterruptedException {
		Thread.sleep(5000);
	    Browselaunch("https://www.limeroad.com/?utm_source=google_paid&utm_medium=cpc_paid&utm_campaign=lr_s_brandname_Exact&utm_source=google&utm_medium=remarketing&utm_campaign=lr_s_brandname_Exact_NK_&gclid=Cj0KCQjwyLGjBhDKARIsAFRNgW-PEWv8pWRlWRs2R8nmeqBwDkBLdeIu2WQRUKFgADcrdj5ibQrKk04aAon5EALw_wcB");
	   
	   
	}
	@When("click on the men's tab")
	public void click_on_the_men_s_tab() throws InterruptedException {
		 Thread.sleep(2000);
	    jsexecutorclick(pom.getlf().getMentab());
	    Thread.sleep(3000);
	 
	}
	@Given("to click on the profile button")
	public void to_click_on_the_profile_button() throws InterruptedException {
	    clickonelement(pom.getlf().getProfileicon());
	    Thread.sleep(2000);
	   
	}
	@When("click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
	    clickonelement(pom.getlf().getLoginb());
	    Mouseactionmovetoelement(pom.getlf().getCartt());
	    Thread.sleep(4000);
	 
	}
	@When("enter the mobile number in the field")
	public void enter_the_mobile_number_in_the_field() {
	    sendkeyyss(pom.getlf().getMobilen(), "7338925461");
	   
	}
	@Then("enter the next button")
	public void enter_the_next_button() throws InterruptedException {
	    clickonelement(pom.getlf().getNextb());
	    Thread.sleep(9000);
	 
	}
	
	@Given("move to the home tab")
	public void move_to_the_home_tab() throws InterruptedException {
	    Mouseactionmovetoelement(pom.getlf().getHometab());
	    Thread.sleep(4000);
	 
	}
	
	@When("click on the blankets tab")
	public void click_on_the_blankets_tab() throws InterruptedException {
	    clickonelement(pom.getlf().getBlanketbc());
	    Thread.sleep(4000);
	  
	}
	
	@When("scrolling and selecting the blanket element")
	public void scrolling_and_selecting_the_blanket_element() throws InterruptedException {
	    executeJavaScriptt("arguments[0].scrollIntoView(true);", pom.getlf().getBlanketec());
	    clickonelement(pom.getlf().getBlanketec());
	    Thread.sleep(2000);
	  
	}
	
	@Then("click on the add to cart element")
	public void click_on_the_add_to_cart_element() {
	    clickonelement(pom.getlf().getAddtocart());

	}
	
	@Given("move to the menss tab")
	public void move_to_the_mens_tab() throws InterruptedException {
	    Mouseactionmovetoelement(pom.getst().getMenstab());
	    Thread.sleep(4000);
	}
	@When("click on the tshirts element")
	public void click_on_the_tshirts_element() throws InterruptedException {
		Thread.sleep(2000);
	    clickonelement(pom.getst().getTshirttab());
	    
	}
	@When("scrolling and selecting the tshirt")
	public void scrolling_and_selecting_the_tshirt() throws InterruptedException {
		Thread.sleep(2000);
	    executeJavaScriptt("arguments[0].scrollIntoView(true);", pom.getst().getTshirtelement());
	    clickonelement(pom.getst().getTshirtelement());
	    Thread.sleep(2000);
	    clickonelement(pom.getst().getSize());
	}
	@Then("click on the add to cartt element")
	public void click_on_the_add_to_cartt_element() {
	    clickonelement(pom.getst().getAddtocart());
	}
	
	@Given("move to the mens tab")
	public void move_to_the_mens_tab1() throws InterruptedException {
	    Mouseactionmovetoelement(pom.gettj().getMensstab());
	    Thread.sleep(4000);
	}
	
	@When("click on the jeans element")
	public void click_on_the_jeans_element() throws InterruptedException {
	    clickonelement(pom.gettj().getJeanstab());
	    Thread.sleep(4000);
	    
	}
	
	@When("scrolling and selecting the jeans")
	public void scrolling_and_selecting_the_jeans() throws InterruptedException {
	    executeJavaScriptt("arguments[0].scrollIntoView(true);", pom.gettj().getJeanse());
	    clickonelement(pom.gettj().getJeanse());
	    Thread.sleep(2000);
	    clickonelement(pom.gettj().getJsize());

	}

	@Then("click on the add to carttt element")
	public void click_on_the_add_to_carttt_element() {
	    clickonelement(pom.gettj().getAddtocarttt());
	    
	}


}
