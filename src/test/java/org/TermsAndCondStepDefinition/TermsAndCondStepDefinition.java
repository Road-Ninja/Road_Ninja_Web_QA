package org.TermsAndCondStepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.Pages.TermsAndConditions;
import org.RNBase.UserBaseClass;
import org.openqa.selenium.WindowType;

import io.cucumber.java.en.Given;

public class TermsAndCondStepDefinition extends UserBaseClass {

	TermsAndConditions tc;

	@Given("Launch the URL {string}")
	public void launch_the_url(String url) {
		urlLaunch(url);
		maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@Given("Enter email {string}, password {string}, click on the next button and navigate to the terms and conditions")
	public void enter_email_password_click_on_the_next_button_and_navigate_to_the_terms_and_conditions(String email, String pass) {
		tc = new TermsAndConditions();
		sendKeys(tc.getEmail(), email);
		sendKeys(tc.getPassword(), pass);
		clicks(tc.getNext());
		
		moveToElement(tc.getSideBar());
//		clicks(tc.getSupport());
//		back();
		clicks(tc.getTermsAndCond());
	}


	@Given("Click on the hyperlink of the Road Ninja App present under the website terms of use")
	public void click_on_the_hyperlink_of_the_road_ninja_app_present_under_the_website_terms_of_use() {
		tc = new TermsAndConditions();
		clicks(tc.getRoadNinjaApp());
		back();
	}
	
	@Given("Click on all the hyperlink present under the Privacy Policy.")
	public void click_on_all_the_hyperlink_present_under_the_privacy_policy() throws Exception   {
		tc = new TermsAndConditions();
		clicks(tc.getPrivacyPolicy());
		
		clicks(tc.getTermsOfUse1());
		back();
		
		clicks(tc.getApp());
		sendKeys(tc.getEmail(), excelRead(1, 2));
		sendKeys(tc.getPassword(), excelRead(1, 3));
		clicks(tc.getNext());
		back();
		
		clicks(tc.getWeb());
		back();

		clicks(tc.getStrip());
		back();

		clicks(tc.getCookies());
		back();
	
		clicks(tc.getSupportemail());
		close();
	
	}


}
