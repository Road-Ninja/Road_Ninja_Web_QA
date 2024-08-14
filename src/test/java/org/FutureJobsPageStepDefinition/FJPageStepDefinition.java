package org.FutureJobsPageStepDefinition;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.Pages.FutureJobs;
import org.RNBase.UserBaseClass;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;

public class FJPageStepDefinition extends UserBaseClass {

	FutureJobs fj;

	@Given("Launch the URL {string}")
	public void launch_the_url(String url) {
		urlLaunch(url);
		maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Enter email {string}, password {string}, click on the next button and navigate to Jobs Page")
	public void enter_email_password_click_on_the_next_button_and_navigate_to_jobs_page(String email, String pass) {
		fj = new FutureJobs();
		sendKeys(fj.getEmail(), email);
		sendKeys(fj.getPassword(), pass);
		clicks(fj.getNext());

		clicks(fj.getJobsPage());
	}

	@Given("Select the date from the All dates, regions from the All regions, driver from the all drivers, vehicle from the all vehicle and select the sort by")
	public void select_the_date_from_the_all_dates_regions_from_the_all_regions_driver_from_the_all_drivers_vehicle_from_the_all_vehicle_and_select_the_sort_by()
			throws Exception {
		fj = new FutureJobs();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// All dates filter
		//		clicks(fj.getAllDates());
		//		clicks(fj.getToday());
		//		clicks(fj.getCurrentMonth());
		//		clicks(fj.getUpcoming7Days());
		//		clicks(fj.getUpcomingMonth());
		//		clicks(fj.getCustom());
		//		clicks(fj.getSelectDate1());
		//		Thread.sleep(2000);
		//		clicks(fj.getDate1());
		//		Thread.sleep(2000);
		//		clicks(fj.getSelectDate2());
		//		Thread.sleep(2000);
		//		clicks(fj.getNextb());
		//		//clicks(fj.getPreviousb());
		//		clicks(fj.getDate2());
		//		Thread.sleep(2000);
		//		escape();
		//		Thread.sleep(2000);
		//		clicks(fj.getRemoveDate());

		// All regions
		clicks(fj.getAllRegions());
		clicks(fj.getNorth());
		clicks(fj.getSouth());
		clicks(fj.getSelectRegion());
		escape();
		clicks(fj.getRemoveRegion());

		// All Drivers
		clicks(fj.getAlldrivers());
		sendKeys(fj.getSerchDriver(), "Susant");
		clear(fj.getSerchDriver());
		clicks(fj.getSelectDriver1());
		clicks(fj.getSelectDriver2());
		escape();
		clicks(fj.getRemoveDriver());


		// All vehicles
		clicks(fj.getAllVehicles());
		clicks(fj.getVehicle1());
		clicks(fj.getVehicle2());
		clicks(fj.getVehicle3());
		escape();
		clicks(fj.getRemoveVehicle());

		// Sort By
		clicks(fj.getSortBy());
		clicks(fj.getTitle());

		// Download Job Data to Excel
		clicks(fj.getDownloadJobData());

	}

	@Given("Search the job {string}, click on the job, click on the payment details, close payment details block and send message to driver {string}")
	public void search_the_job_click_on_the_job_click_on_the_payment_details_close_payment_details_block_and_send_message_to_driver(String job, String message) throws Exception {
		fj = new FutureJobs();

		sendKeys(fj.getSearchJob(), job);
		sendKeys(fj.getSearchJob(), Keys.CONTROL + "a" + Keys.BACK_SPACE);

		clicks(fj.getSelectJob());
		clicks(fj.getPaymentDetails());
		escape();
		sendKeys(fj.getChatbox(), message + Keys.ENTER);

	}

	@Given("Click on the three dots and then edit job button, edit the job title {string} and desc {string}, select the vehicle and click on save button")
	public void click_on_the_three_dots_and_then_edit_job_button_edit_the_job_title_and_desc_select_the_vehicle_and_click_on_save_button(String title, String desc) throws InterruptedException {
		fj = new FutureJobs();

		// edit job
		// select the job and edit
//		clicks(fj.getSelectJob()); 
//		clicks(fj.getEditJob());

		//edit through grid list of job 
		clicks(fj.getThreeDot());  
		clicks(fj.getEditButton());

		sendKeys(fj.getJobTitle(), Keys.CONTROL + "a" + Keys.BACK_SPACE);
		sendKeys(fj.getJobTitle(), title);

		sendKeys(fj.getJobDesc(), Keys.CONTROL + "a" + Keys.BACK_SPACE);
		sendKeys(fj.getJobDesc(), desc);

		clicks(fj.getSelectvehicle());
		clicks(fj.getVehicle());
		Thread.sleep(2000);

		clicks(fj.getSave());
		Thread.sleep(2000);
	}




}
