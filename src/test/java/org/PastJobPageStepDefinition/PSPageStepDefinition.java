package org.PastJobPageStepDefinition;

import java.time.Duration;

import org.Pages.PastJob;
import org.RNBase.UserBaseClass;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;

public class PSPageStepDefinition extends UserBaseClass {

	PastJob ps;

	@Given("Launch the URL {string}")
	public void launch_the_url(String url) {
		urlLaunch(url);
		maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	@Given("Enter email {string}, password {string}, click on the next button, click on the jobs at navigation and navigate to past job page")
	public void enter_email_password_click_on_the_next_button_click_on_the_jobs_at_navigation_and_navigate_to_past_job_page(String email, String pass) {
		ps = new PastJob();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		sendKeys(ps.getEmail(), email);
	    sendKeys(ps.getPassword(), pass);
	    clicks(ps.getNext());
	    
	    clicks(ps.getJobsPage());
	    clicks(ps.getPastJobPage());
	}
	
	@Given("Enter email {string}, password {string}, click on the next button and navigate to Jobs Page")
	public void enter_email_password_click_on_the_next_button_and_navigate_to_jobs_page(String email, String pass) {
		ps = new PastJob();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		sendKeys(ps.getEmail(), email);
	    sendKeys(ps.getPassword(), pass);
	    clicks(ps.getNext());
	    
	    clicks(ps.getJobsPage());
	    clicks(ps.getPastJobPage());
	}

	

	@Given("Select the Select the date from the All dates, job ststus from all status, regions from the All regions, search driver {string} and select driver from the all drivers , vehicle from the all vehicle and select the sort by")
	public void select_the_select_the_date_from_the_all_dates_job_ststus_from_all_status_regions_from_the_all_regions_search_driver_and_select_driver_from_the_all_drivers_vehicle_from_the_all_vehicle_and_select_the_sort_by(String string) throws Exception {
		ps = new PastJob();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// All dates filter
				clicks(ps.getAllDates());
				clicks(ps.getToday());
				clicks(ps.getCurrentMonth());
				clicks(ps.getLast7Days());
				clicks(ps.getLastMonth());
//				clicks(ps.getCustom());
//				clicks(ps.getDate1());
//				clicks(ps.getSelectDate1());
//				clicks(ps.getDate2());
//				clicks(ps.getPreviousb());
//				clicks(ps.getNextb());
//				clicks(ps.getSelectDate2());
				Thread.sleep(2000);
				escape();
				clicks(ps.getRemoveDate());
				
				
				// All status filter
				clicks(ps.getAllStatus());
				clicks(ps.getNotPaid());
				Thread.sleep(2000);
				clicks(ps.getPaid());
				clicks(ps.getDispute());
				clicks(ps.getFaulty());
				
				clicks(ps.getNotExpired());
				Thread.sleep(2000);
				clicks(ps.getExpired());
				Thread.sleep(2000);
				escape();
				clicks(ps.getRemoveStatus());
				
				// All regions
				clicks(ps.getAllRegions());
				clicks(ps.getNorth());
//				clicks(ps.getSouth());
//				clicks(ps.getSelectRegion());
				escape();
				clicks(ps.getRemoveRegion());
				
				// All Drivers
				clicks(ps.getAlldrivers());
				sendKeys(ps.getSerchDriver(), "Rohit");
				clear(ps.getSerchDriver());
				clicks(ps.getSelectDriver1());
				clicks(ps.getSelectDriver2());
				escape();
				clicks(ps.getRemoveDriver());
				
				
				// All vehicles
				clicks(ps.getAllVehicles());
				clicks(ps.getNissanB());
				clicks(ps.getHonda());
				clicks(ps.getToyota());
				escape();
				clicks(ps.getRemoveVehicle());
				
				// Sort By
				clicks(ps.getSortBy());
				clicks(ps.getTitle());
				
				
				// Download Job Data to Excel
				clicks(ps.getDownloadJobData());
				
				// Download Paid Invoices
				clicks(ps.getDownloadPaidInvoices());
				
			}
	
	@Given("Search the job {string}, click on the job, click on the payment details, close payment details block and send message to driver {string}")
	public void search_the_job_click_on_the_job_click_on_the_payment_details_close_payment_details_block_and_send_message_to_driver(String job, String message) throws Exception {
		ps = new PastJob();
		sendKeys(ps.getSearchJob(), job);
		sendKeys(ps.getSearchJob(), Keys.CONTROL + "a" + Keys.BACK_SPACE);
		
		clicks(ps.getSelectJob());
		clicks(ps.getPaymentDetails());
		escape();
		sendKeys(ps.getChatbox(), message + Keys.ENTER);
		
	}
	
	
	@Given("Select any Past job, start a dispute and stop a dispue")
	public void select_any_past_job_start_a_dispute_and_stop_a_dispue() throws InterruptedException {
		ps = new PastJob();
		clicks(ps.getSelectJob());
		clicks(ps.getStartDispute());
		Thread.sleep(7000);
		clicks(ps.getCloseDispute());

	}
	
	@Given("Click on the Rate Driver button, selete the rating, enter the review {string} and click on the Save Review button")
	public void click_on_the_rate_driver_button_selete_the_rating_enter_the_review_and_click_on_the_save_review_button(String review) {
		ps = new PastJob();
		clicks(ps.getSelectJob());
		clicks(ps.getRateDriver());
		clicks(ps.getCloseReview());
		clicks(ps.getRateDriver());
		clicks(ps.getRating5());
		sendKeys(ps.getReview(), review);
		clicks(ps.getSaveReview());
		refresh();
	}
	
	
	@Given("Click on the next page button, previous page button and page number")
	public void click_on_the_next_page_button_previous_page_button_and_page_number() {
		ps = new PastJob();
		clicks(ps.getNextPage());
		clicks(ps.getPreviousPage());
		clicks(ps.getGotoPage());
	}
	
	@Given("Select a past job and click on the confirm button")
	public void select_a_past_job_and_click_on_the_confirm_button() {
		ps = new PastJob();
		clicks(ps.getJobToConfirm());
		clicks(ps.getConfirmButton());
		back();
		refresh();
	}
	
	@Given("Select a ready to pay ststus job, click on the Ready to pay button, Pay button, another CC, enter card name {string}, card number {string}, expiry date {string}, CVC {string} and click on the Make payment")
	public void select_a_ready_to_pay_ststus_job_click_on_the_ready_to_pay_button_pay_button_another_cc_enter_card_name_card_number_expiry_date_cvc_and_click_on_the_make_payment(String cname, String cnumber, String expirydate, String cvc) {
		ps = new PastJob();
		
		clicks(ps.getJobReadyToPay());
		clicks(ps.getConfirmButton());
		clicks(ps.getReadyToPayButton());
		clicks(ps.getPay());
//		clicks(ps.getAnotherCC());
//		sendKeys(ps.getCname(), cname);
//		sendKeys(ps.getCnumber(), cnumber);
//		sendKeys(ps.getExpDate(), expirydate);
//		sendKeys(ps.getCvc(), cvc);
		clicks(ps.getMakePayment());
		
	}
	
	@Given("Select a paid job, click on the payment details, download the Invoice and close payment deatils box")
	public void select_a_paid_job_click_on_the_payment_details_download_the_invoice_and_close_payment_deatils_box() {
		ps = new PastJob();
		clicks(ps.getJobpaid());
		clicks(ps.getPaymentDetails());
		clicks(ps.getDownloadInvoice());
		clicks(ps.getClosePaymentBox());
	}


	
}



