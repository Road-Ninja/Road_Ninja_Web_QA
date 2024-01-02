package org.JobRequestStepDefinition;

import java.time.Duration;

import org.Pages.JobRequest;
import org.RNBase.UserBaseClass;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;

public class JRStepDefinition extends UserBaseClass {
	
	JobRequest r;
	
	@Given("Launch the URL {string}")
	public void launch_the_url(String url) {
	    urlLaunch(url);
	    maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	@Given("Enter email {string}, password {string} and click on the next button")
	public void enter_email_password_and_click_on_the_next_button(String email, String pass) throws Exception {
		r = new JobRequest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		sendKeys(r.getEmail(), email);
		sendKeys(r.getPassword(), pass);
		Thread.sleep(2000);
		
		clicks(r.getNext());
		
	}
	
	@Given("Navigate to Driver")
	public void navigate_to_driver() throws Exception {
		r = new JobRequest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clicks(r.getDriverpage());
		Thread.sleep(2000);
	}
	
	@Given("Select date and time")
	public void select_date_and_time() throws Exception {
		r = new JobRequest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clicks(r.getWhen());
		Thread.sleep(2000);
		
		clicks(r.getAddnewperiod());
		Thread.sleep(2000);
		
//		clicks(r.getPreviousb());
//		Thread.sleep(2000);
//		clicks(r.getNextb());
//		Thread.sleep(2000);
		
//		clicks(r.getDate1());
		Thread.sleep(2000);
		clicks(r.getDate2());
		clicks(r.getAdd());
		Thread.sleep(2000);
		clicks(r.getClose());
		Thread.sleep(2000);
		/*
		clicks(r.getTime1());
		clicks(r.getPm());
		clicks(r.getStarttime());
		clicks(r.getStarttimemin());
		escape();
		clicks(r.getTime2());
		clicks(r.getPm());
		clicks(r.getEndtime());
		clicks(r.getEndtimemin());
		escape();
		Thread.sleep(2000);
		*/
		escape();
		
	
	}
	@Given("Select Regions")
	public void select_regions() throws Exception {
		r = new JobRequest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clicks(r.getWhere());
		Thread.sleep(2000);
		clicks(r.getNorth());
		clicks(r.getSouth());
//		clicks(r.getAuckland());
		escape();
	
	
	}
	@Given("Select Licence class, type of vehicle, endorsement, gearbox experience and vehicle combination")
	public void select_licence_class_type_of_vehicle_endorsement_gearbox_experience_and_vehicle_combination() throws Exception {
		r = new JobRequest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clicks(r.getSkills());
		clicks(r.getLicenceclass());
		clicks(r.getClass1());
//		clicks(r.getClass2());
//		clicks(r.getClass3());
//		clicks(r.getClass4());
//		clicks(r.getClass5());
//		clicks(r.getClass6());
		
		clicks(r.getTypeofdriving());
		clicks(r.getVehicle());
		Thread.sleep(2000);
		escape();
		/*
		Thread.sleep(2000);
		clicks(r.getEndorsement());
		clicks(r.getD());
		clicks(r.getF());
		clicks(r.getI());
		clicks(r.getO());
		clicks(r.getP());
		clicks(r.getR());
		clicks(r.getT());
		clicks(r.getV());
		clicks(r.getW());
		
		clicks(r.getGearbox());
		clicks(r.getAutomanual());
		clicks(r.getAutomatic());
		clicks(r.getSync());
		clicks(r.getNonsync());
		clicks(r.getRoadranger());
		clicks(r.getSplit());
		
		clicks(r.getVehiclecombination());
		clicks(r.getAtrain());
		clicks(r.getBtrain());
		clicks(r.getSemi());
		clicks(r.getTruck());
		clicks(r.getClearall());
		*/
		
		
	}
	
	@Given("Enter the fixed price {string} and click on the search")
	public void enter_the_fixed_price_and_click_on_the_search(String price) throws Exception {
		r = new JobRequest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		clicks(r.getPayment());
//		clicks(r.getFixedprice());
//		sendKeys(r.getRate(), price);
		
		clicks(r.getSearch());
	}
	
	@Given("Select the driver and click on the Next button")
	public void select_the_driver_and_click_on_the_next_button() throws Exception {
		r = new JobRequest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		clicks(r.getSelectdriver());
		clicks(r.getNextpage());
	}
	
	@Given("Enter the job title {string}, description {string}, select the vehicle, tick the tickbox and click on the next button")
	public void enter_the_job_title_description_select_the_vehicle_tick_the_tickbox_and_click_on_the_next_button(String title, String des) {
		r = new JobRequest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		sendKeys(r.getJobtitle(), title);
		sendKeys(r.getDescription(), des);
		clicks(r.getSelectvehicle());
		clicks(r.getHonda());
		clicks(r.getAutoapprove());
//		clicks(r.getAddtodraft());
		clicks(r.getSubmit());
		
		clicks(r.getItinerary());
	}
	
	@Given("Add a Additional terms {string}, tick the tickbox, select the assignment criteria and click on the send request button")
	public void add_a_additional_terms_tick_the_tickbox_select_the_assignment_criteria_and_click_on_the_send_request_button(String term) {
		r = new JobRequest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		sendKeys(r.getAddterms(), term);
		clicks(r.getAcceptICA());
		clicks(r.getDrugalctest());
		/*
		clicks(r.getHealthsafetysign());
		clicks(r.getSiteinduction());
		clicks(r.getFirstaid());
		clicks(r.getDresscode());
		clicks(r.getMedical());
		clicks(r.getPubliclibrary());
		clicks(r.getCompanypolicy());
		clicks(r.getPhysical());
		clicks(r.getComputerskills());
		clicks(r.getPortandID());
		clicks(r.getAppropriatePPE());
		clicks(r.getOther());
		
		sendKeys(r.getEnterother(), "Others");
		sendKeys(r.getDrugalclink(), "Drug");
		sendKeys(r.getHealthsafetylink(), "Health");
		sendKeys(r.getCompanypolicylink(), "Company");
//		clicks(r.getSavetodraft());
		 */
		clicks(r.getSendrequest());
		
	}



}
