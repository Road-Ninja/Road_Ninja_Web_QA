package org.SignUpStepDefinition;

import static org.testng.Assert.assertEquals;

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
	@Given("Launch the URL {string}")
	public void launch_the_url(String string) throws InterruptedException {
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
		// Empty Field
		//		clicks(s.getTickbox());
		//		Thread.sleep(2000);
		//		clicks(s.getNext());
		//		Thread.sleep(2000);
		//		clicks(s.getLogin());
		//		Thread.sleep(2000);
		//		back();
		//		
		//		clicks(s.getAppIOS());
		//		Thread.sleep(2000);
		//		ParentWindow();
		//		
		//		clicks(s.getAppArd());
		//		Thread.sleep(2000);
		//		ParentWindow();
		//		
		//		clicks(s.getTerms());
		//		Thread.sleep(2000);
		//		ParentWindow();
		//		
		//		clicks(s.getPrivacy());
		//		Thread.sleep(2000);
		//		ParentWindow();

		sendKeys(s.getFullname(), name);
		sendKeys(s.getEmail(), email);
		sendKeys(s.getPhone(), number);
		sendKeys(s.getPassword(), password);
		clicks(s.getTickbox());
		Thread.sleep(2000);
		clicks(s.getNext());

	}

	@Given("Enter Full name {string}, email {string}, phone number {string}, invalid password {string}, tick the box and click on the next button")
	public void enter_full_name_email_phone_number_invalid_password_tick_the_box_and_click_on_the_next_button(String name, String email, String number, String inavlidpass) throws Exception {
		s = new SignUp();
		//		clicks(s.getClose());
		//		back();
		sendKeys(s.getFullname(), name);
		sendKeys(s.getEmail(), email);
		sendKeys(s.getPhone(), number);
		sendKeys(s.getPassword(), inavlidpass);
		clicks(s.getTickbox());
		Thread.sleep(2000);
		clicks(s.getNext());
		System.out.println(s.getInvalidPass().getText());
		assertEquals(s.getInvalidPass().getText(), "The password format is invalid.");


	}

	@Given("Enter First name {string}, email {string}, phone number {string}, password {string}, tick the box and click on the next button")
	public void enter_first_name_email_phone_number_password_tick_the_box_and_click_on_the_next_button(String name, String email, String number, String pass) throws InterruptedException {
		s = new SignUp();
		sendKeys(s.getFullname(), name);
		sendKeys(s.getEmail(), email);
		sendKeys(s.getPhone(), number);
		sendKeys(s.getPassword(), pass);
		clicks(s.getTickbox());
		Thread.sleep(2000);
		clicks(s.getNext());
		System.out.println(s.getLastName().getText());
		assertEquals(s.getLastName().getText(), "The last name field is required.");

	}

	@Given("Enter Full name {string}, registered email {string}, phone number {string}, password {string}, tick the box and click on the next button")
	public void enter_full_name_registered_email_phone_number_password_tick_the_box_and_click_on_the_next_button(String name, String regemail, String number, String pass) throws InterruptedException {
		s = new SignUp();
		sendKeys(s.getFullname(), name);
		sendKeys(s.getEmail(), regemail);
		sendKeys(s.getPhone(), number);
		sendKeys(s.getPassword(), pass);
		clicks(s.getTickbox());
		Thread.sleep(2000);
		clicks(s.getNext());
		System.out.println(s.getRegEmail().getText());
		assertEquals(s.getRegEmail().getText(), "The email address you have entered is already registered");

	}

	@Given("Enter Full name {string}, registered email {string}, less phone number {string}, password {string}, tick the box and click on the next button")
	public void enter_full_name_registered_email_less_phone_number_password_tick_the_box_and_click_on_the_next_button(String name, String email, String lessnumber, String pass) throws InterruptedException {
		s = new SignUp();
		sendKeys(s.getFullname(), name);
		sendKeys(s.getEmail(), email);
		sendKeys(s.getPhone(), lessnumber);
		sendKeys(s.getPassword(), pass);
		clicks(s.getTickbox());
		Thread.sleep(2000);
		clicks(s.getNext());
	}


	// Second Step

	@Given("Enter Company name {string}, Company phone number {string}, select yard locations , Enter position {string}, select total number of vehicle  and click on the app links and Sign Up")
	public void enter_company_name_company_phone_number_select_yard_locations_enter_position_select_total_number_of_vehicle_and_click_on_the_app_links_and_sign_up(String cname, String cphone, String position) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s = new SignUp();

		//		clicks(s.getAppstore());
		//		Thread.sleep(2000);
		//		ParentWindow();
		//		
		//		clicks(s.getGoggleplay());
		//		Thread.sleep(2000);
		//		ParentWindow();

		sendKeys(s.getCompanyname(), cname);
		sendKeys(s.getCompanynumber(), cphone);

		clicks(s.getYardlocations());
		Thread.sleep(2000);
		clicks(s.getSelectlocation1());
		clicks(s.getSelectlocation2());
		escape();

		sendKeys(s.getPosition(), position);

		clicks(s.getTotalvehicle());
		Thread.sleep(2000);
		clicks(s.getVehicleNo());

		clicks(s.getNext2());

	}

	@Given("Click on the Log in button, Enter email {string}, password {string} and click on the next button")
	public void click_on_the_log_in_button_enter_email_password_and_click_on_the_next_button(String email, String pass) {
		s = new SignUp();
		clicks(s.getLogin());
		sendKeys(s.getEmailLogin(), email);
		sendKeys(s.getPasswordLogin(), pass);
		clicks(s.getNext());

	}

	@Given("Enter Company name {string}, Company less phone number {string}, select yard locations , Enter position {string} and click on next button")
	public void enter_company_name_company_less_phone_number_select_yard_locations_enter_position_and_click_on_next_button(String cname, String cphone, String position) throws Exception {
		s = new SignUp();

		clicks(s.getAppstore());
		Thread.sleep(2000);
		ParentWindow();

		clicks(s.getGoggleplay());
		Thread.sleep(2000);
		ParentWindow();
		sendKeys(s.getCompanyname(), cname);
		sendKeys(s.getCompanynumber(), cphone);

		clicks(s.getYardlocations());
		Thread.sleep(2000);
		clicks(s.getSelectlocation1());
		clicks(s.getSelectlocation2());
		escape();

		sendKeys(s.getPosition(), position);

		clicks(s.getTotalvehicle());
		Thread.sleep(2000);
		clicks(s.getVehicleNo());

		clicks(s.getNext2());
	}


	// Last Step
	@Given("Select the categories you want to see on drivers")
	public void select_the_categories_you_want_to_see_on_drivers() throws InterruptedException {
		s = new SignUp();

		refresh();
		clicks(s.getSignUp());
		clicks(s.getEmailNotification());

		// Region
		clicks(s.getRegions());
		clicks(s.getAuckland());
		clicks(s.getBay_of_Plenty());
		clicks(s.getSouthland());
		clicks(s.getNelson());
		clicks(s.getRegions()); // to close region option

		// Licence Class
		clicks(s.getLicenceClass());
		clicks(s.getClass1());
		clicks(s.getClass2());
		clicks(s.getClass3());
		clicks(s.getClass4());
		clicks(s.getClass5());
		clicks(s.getLicenceClass());

		// Type of Driving
		clicks(s.getTypeOfDriving());
		clicks(s.getTours());
		clicks(s.getCurtainsiders());
		clicks(s.getFlat_decks());
		clicks(s.getContainer());
		clicks(s.getTractor_units());
		clicks(s.getClose());

		//Endorsement
		clicks(s.getEndorsement());
		clicks(s.getD());
		clicks(s.getP());
		clicks(s.getR());
		clicks(s.getW());
		clicks(s.getI());
		clicks(s.getO());
		clicks(s.getT());
		clicks(s.getV());
		clicks(s.getEndorsement());

		// Gearbox Experience
		clicks(s.getGearboxExp());
		clicks(s.getAutomanual());
		clicks(s.getAutomatic());
		clicks(s.getSync());
		clicks(s.getNonsync());
		clicks(s.getRoadranger());
		clicks(s.getSplit());
		clicks(s.getGearboxExp());

		// Vehicle Combination
		clicks(s.getVehicleCombination());
		clicks(s.getAtrain());
		clicks(s.getBtrain());
		clicks(s.getSemi());
		clicks(s.getTruck());
		clicks(s.getVehicleCombination());

		// Busy season
		clicks(s.getBusySeason());
		clicks(s.getMay());
		clicks(s.getJuly());
		clicks(s.getAugust());
		clicks(s.getSeptember());
		clicks(s.getOctober());
		clicks(s.getBusySeason());

		Thread.sleep(2000);

		clicks(s.getClearAll());
		clicks(s.getEmailNotification());

		// Region
		clicks(s.getRegions());
		clicks(s.getAuckland());
		clicks(s.getBay_of_Plenty());
		clicks(s.getSouthland());
		clicks(s.getNelson());
		clicks(s.getRegions()); // to close region option

		// Licence Class
		clicks(s.getLicenceClass());
		clicks(s.getClass1());
		clicks(s.getClass2());
		clicks(s.getClass3());
		clicks(s.getClass4());
		clicks(s.getClass5());
		clicks(s.getLicenceClass());

		// Type of Driving
		clicks(s.getTypeOfDriving());
		clicks(s.getTours());
		clicks(s.getCurtainsiders());
		clicks(s.getFlat_decks());
		clicks(s.getContainer());
		clicks(s.getTractor_units());
		clicks(s.getClose());


	}


}
