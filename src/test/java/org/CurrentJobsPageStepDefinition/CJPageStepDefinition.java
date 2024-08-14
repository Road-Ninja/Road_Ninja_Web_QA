package org.CurrentJobsPageStepDefinition;

import java.time.Duration;

import org.Pages.CurrentJob;
import org.RNBase.UserBaseClass;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;

public class CJPageStepDefinition extends UserBaseClass{
	
	 CurrentJob cj;
	 
	@Given("Launch the URL {string}")
	public void launch_the_url(String url) {
	    urlLaunch(url);
	    maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given("Enter email {string}, password {string}, click on the next button, click on the jobs at navigation and navigate to current job page")
	public void enter_email_password_click_on_the_next_button_click_on_the_jobs_at_navigation_and_navigate_to_current_job_page(String email, String pass) {
		cj = new CurrentJob();
	    sendKeys(cj.getEmail(), email);
	    sendKeys(cj.getPassword(), pass);
	    clicks(cj.getNext());
	    
	    clicks(cj.getJobsPage());
	    clicks(cj.getCurrentJobPage());
	}
	

	@Given("Select the regions from the All regions, search driver {string} and select driver from the all drivers , vehicle from the all vehicle and select the sort by")
	public void select_the_regions_from_the_all_regions_search_driver_and_select_driver_from_the_all_drivers_vehicle_from_the_all_vehicle_and_select_the_sort_by(String searchDriver) throws Exception {
		cj = new CurrentJob();
		// All regions
				clicks(cj.getAllRegions());
				clicks(cj.getNorth());
				clicks(cj.getSouth());
				clicks(cj.getSelectRegion());
				escape();
				clicks(cj.getRemoveRegion());
				
				// All Drivers
				clicks(cj.getAlldrivers());
//				sendKeys(cj.getSerchDriver(), searchDriver);
//				Thread.sleep(2000);
//				clear(cj.getSerchDriver());
				clicks(cj.getSelectDriver1());
				clicks(cj.getSelectDriver2());
				escape();
				clicks(cj.getRemoveDriver());
				
				
				// All vehicles
				clicks(cj.getAllVehicles());
				clicks(cj.getVehicle1());
				clicks(cj.getVehicle2());
				clicks(cj.getVehicle3());
				escape();
				clicks(cj.getRemoveVehicle());
				
				// Sort By
				clicks(cj.getSortBy());
				clicks(cj.getTitle());
				
				
				// Download Job Data to Excel
				clicks(cj.getDownloadJobData());
	}
	
	@Given("Search the job {string}, click on the job, click on the payment details, close payment details block and send message to driver {string}")
	public void search_the_job_click_on_the_job_click_on_the_payment_details_close_payment_details_block_and_send_message_to_driver(String searchJob, String message) throws Exception {
		cj = new CurrentJob();
		// Search Job
		sendKeys(cj.getSearchJob(), searchJob);
		Thread.sleep(2000);
		sendKeys(cj.getSearchJob(), Keys.CONTROL + "a" + Keys.BACK_SPACE);
		
		//Select Job
		clicks(cj.getSelectJob());
		clicks(cj.getPaymentDetails());
		Thread.sleep(2000);
		escape();
		
		// Send Message
		sendKeys(cj.getChatbox(), message + Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
	@Given("Click on the three dots and then edit job button, edit the job title {string} and desc {string}, select the vehicle and click on save button")
	public void click_on_the_three_dots_and_then_edit_job_button_edit_the_job_title_and_desc_select_the_vehicle_and_click_on_save_button(String title, String desc) throws InterruptedException {
		cj = new CurrentJob();
		// edit job
		// select the job and edit
//		clicks(cj.getSelectJob()); 
//		clicks(cj.getEditJob());
		
		//edit through grid list of job 
		clicks(cj.getThreeDot());  
		clicks(cj.getEditButton());
		
		sendKeys(cj.getJobTitle(), Keys.CONTROL + "a" + Keys.BACK_SPACE);
		sendKeys(cj.getJobTitle(), title);
		
		sendKeys(cj.getJobDesc(), Keys.CONTROL + "a" + Keys.BACK_SPACE);
		sendKeys(cj.getJobDesc(), desc);
		
		clicks(cj.getSelectvehicle());
		clicks(cj.getVehicle());
		Thread.sleep(2000);
		
		clicks(cj.getSave());
		Thread.sleep(2000);
	}
	

}
