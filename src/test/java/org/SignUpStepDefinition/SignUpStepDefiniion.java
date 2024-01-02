package org.SignUpStepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.Pages.SignUp;
import org.RNBase.UserBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;


public class SignUpStepDefiniion extends UserBaseClass{
	
	SignUp s;
	@Given("Launch the URL {string} and click on the Sign Up button")
	public void launch_the_url_and_click_on_the_sign_up_button(String string) throws Exception {
	    urlLaunch(string);
	    maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    s = new SignUp();
//	    clicks(s.getSignUpbutton());
//	    newWindow();
	    Thread.sleep(2000);
	}
	
	// First Step
	
	@Given("Enter Full name {string}, email {string}, phone number {string}, password {string}, tick the box and click on the next button")
	public void enter_full_name_email_phone_number_password_tick_the_box_and_click_on_the_next_button(String name, String email, String number, String password) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		s = new SignUp();
		clicks(s.getLogin());
		Thread.sleep(2000);
		back();
		
		clicks(s.getAppIOS());
		Thread.sleep(2000);
		ParentWindow();
		
		clicks(s.getAppArd());
		Thread.sleep(2000);
		ParentWindow();
		
		clicks(s.getTerms());
		Thread.sleep(2000);
		ParentWindow();
		
		clicks(s.getPrivacy());
		Thread.sleep(2000);
		ParentWindow();
		
		
		sendKeys(s.getFullname(), name);
		sendKeys(s.getEmail(), email);
		sendKeys(s.getPhone(), number);
		sendKeys(s.getPassword(), password);
		clicks(s.getTickbox());
		Thread.sleep(2000);
		clicks(s.getNext());

	}
	
	// Second Step
	
	@Given("Enter Company name {string}, Company phone number {string}, yard locations {string}, Position {string}, Total number of vehicle {string} and click on the app links and Sign Up")
	public void enter_company_name_company_phone_number_yard_locations_position_total_number_of_vehicle_and_click_on_the_app_links_and_sign_up(String cname, String cphone, String locations, String position, String tvehicle) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s = new SignUp();
		sendKeys(s.getCompanyname(), cname);
		
		sendKeys(s.getCompanynumber(), cphone);
		
		
		clicks(s.getYardlocations());
		Thread.sleep(2000);
		clicks(s.getSelectlocations());
		clicks(s.getSelectlocations1());
		escape();
		
		sendKeys(s.getPosition(), position);
		
		clicks(s.getTotalvehicle());
		Thread.sleep(2000);
		clicks(s.getSelecttvehicle());
		
		clicks(s.getAppstore());
		Thread.sleep(2000);
		ParentWindow();
		
		clicks(s.getGoggleplay());
		Thread.sleep(2000);
		ParentWindow();
		
	
		
		
		
	}

}
