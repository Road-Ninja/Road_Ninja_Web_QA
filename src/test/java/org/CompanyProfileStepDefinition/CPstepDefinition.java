package org.CompanyProfileStepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.Pages.CompanyProfile;
import org.RNBase.UserBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.internal.thread.ThreadExecutionException;

import io.cucumber.java.en.Given;

public class CPstepDefinition extends UserBaseClass{
	
	CompanyProfile cp;
	@Given("Launch the URL {string}")
	public void launch_the_url(String url) {
	    urlLaunch(url);
	    maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	@Given("Enter email {string}, password {string}, click on the next button and navigate to the company profile page")
	public void enter_email_password_click_on_the_next_button_and_navigate_to_the_company_profile_page(String email, String pass) {
		cp = new CompanyProfile();
		sendKeys(cp.getEmail(), email);
		sendKeys(cp.getPassword(), pass);
		clicks(cp.getNext());
		
		clicks(cp.getCompanyprofile());
		
		
	}
	
	@Given("Click on the Add, enter first name {string}, last name {string}, email {string} and click on the save button")
	public void click_on_the_add_enter_first_name_last_name_email_and_click_on_the_save_button(String fname1, String lname1, String email1) throws Exception {
		cp = new CompanyProfile();
		
			clicks(cp.getAddmanager());
			sendKeys(cp.getFirstname1(), fname1);
			sendKeys(cp.getLastname1(), lname1);
			sendKeys(cp.getEmail1(), email1);
			clicks(cp.getAddmore());
			clicks(cp.getCloseManger2());
			clicks(cp.getSaveManger());
		
	}
	
	@Given("Click on the three dot on mamager profile, and delete the mamager")
	public void click_on_the_three_dot_on_mamager_profile_and_delete_the_mamager() {
		cp = new CompanyProfile();
		moveToElement(cp.getAddmanager());
		clicks(cp.getThreeDot());
		clicks(cp.getDeletemanager());
	}
	
	@Given("Click on the edit, enter company title {string}, reg name {string}, trading name {string}, select loctions, enter phone number {string}, select no. of vehicle, enter description {string} and click on the save")
	public void click_on_the_edit_enter_company_title_reg_name_trading_name_select_loctions_enter_phone_number_select_no_of_vehicle_enter_description_and_click_on_the_save(String title, String regname, String tradname, String phone, String desc) throws Exception {
		cp = new CompanyProfile();
		clicks(cp.getEditCP());
//		WebElement element9 = driver.findElement(By.xpath("//input[@name='title']"));
//		//element9.click();
//		Thread.sleep(2000);
//		element9.sendKeys(Keys.CONTROL + "a");
//		element9.sendKeys(Keys.BACK_SPACE);
//		Thread.sleep(2000);
//		element9.sendKeys("Road");
	
		sendKeys(cp.getCompTitle(), Keys.CONTROL + "a");
		Thread.sleep(2000);
		sendKeys(cp.getCompTitle(), title);
		
		sendKeys(cp.getRegName(), Keys.CONTROL + "a");
		Thread.sleep(2000);
		sendKeys(cp.getRegName(), regname);
		
		sendKeys(cp.getTradName(),Keys.CONTROL + "a");
		Thread.sleep(2000);
		sendKeys(cp.getTradName(), tradname);
		
		clicks(cp.getYardlocations());
		clicks(cp.getSelectlocation1());
		clicks(cp.getSelectlocation2());
		escape();
		
		sendKeys(cp.getPhoneNo(), Keys.CONTROL + "a");
		sendKeys(cp.getPhoneNo(), phone);
		
		clicks(cp.getTotalvehicle());
		Thread.sleep(2000);
		clicks(cp.getVehicleNo());
		
		//sendKeys(cp.getDesc(), Keys.CONTROL + "a");
		sendKeys(cp.getDesc(), desc);
		
		clicks(cp.getSaveCP());
		
		
	}
	
	@Given("click on the View payment, select the jobs, click on the pay button, another CC, enter card name {string}, card number {string}, expiry date {string}, CVC {string} and click on the Make payment")
	public void click_on_the_view_payment_select_the_jobs_click_on_the_pay_button_another_cc_enter_card_name_card_number_expiry_date_cvc_and_click_on_the_make_payment(String cname, String cnum, String date, String cvc) throws Exception {
		cp = new CompanyProfile();
		clicks(cp.getPayment());
		clicks(cp.getJob1());
		clicks(cp.getPay());
	
//		clicks(cp.getAnotherCC());
//		sendKeys(cp.getCname(), cname);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		
//		r.keyPress(KeyEvent.VK_4);
//		r.keyRelease(KeyEvent.VK_4);
//		
//		r.keyPress(KeyEvent.VK_4);
//		r.keyRelease(KeyEvent.VK_4);
//		
//		clicks(cp.getCnumber());
//		Thread.sleep(4000);
//		sendKeys(cp.getCnumber(), cnum); 
//		sendKeys(cp.getExpDate(), date);
//		sendKeys(cp.getCvc(), cvc);
//		clicks(cp.getSavecard());
		
		clicks(cp.getMakePayment());
		
	}
	
	@Given("click on the reviews")
	public void click_on_the_reviews() {
		cp = new CompanyProfile();
		clicks(cp.getReviews());
	}
	
	@Given("Click on the Credit cards and add CC, enter card name {string}, card number {string}, expiry date {string}, CVC {string} and click on the save CC")
	public void click_on_the_credit_cards_and_add_cc_enter_card_name_card_number_expiry_date_cvc_and_click_on_the_save_cc(String cname, String cnum, String date, String cvc) throws AWTException {
		cp = new CompanyProfile();
		clicks(cp.getCreditCards());
		clicks(cp.getAddCC());
		
		sendKeys(cp.getCname(), cname);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		
//		r.keyPress(KeyEvent.VK_4);
//		r.keyRelease(KeyEvent.VK_4);
//		
//		r.keyPress(KeyEvent.VK_4);
//		r.keyRelease(KeyEvent.VK_4);
		
		sendKeys(cp.getCnumber(), cnum); 
		sendKeys(cp.getExpDate(), date);
		sendKeys(cp.getCvc(), cvc);
		clicks(cp.getSaveCC());
	}
	
	@Given("Click on the Credit cards, three vertical dot and delete the card")
	public void click_on_the_credit_cards_three_vertical_dot_and_delete_the_card() {
		cp = new CompanyProfile();
		clicks(cp.getCreditCards());
		clicks(cp.getThreeDot());
		clicks(cp.getDeleteCC());
	}



}
