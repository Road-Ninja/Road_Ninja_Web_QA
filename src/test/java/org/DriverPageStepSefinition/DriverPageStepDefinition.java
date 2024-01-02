package org.DriverPageStepSefinition;

import java.time.Duration;

import org.Pages.DriverPage;
import org.RNBase.UserBaseClass;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;

public class DriverPageStepDefinition extends UserBaseClass {
	
	DriverPage dp;
	
	@Given("Launch the URL {string}")
	public void launch_the_url(String url) {
		urlLaunch(url);
	    maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Enter email {string}, password {string}, click on the next button, click on the jobs at navigation and navigate to past job page")
	public void enter_email_password_click_on_the_next_button_click_on_the_jobs_at_navigation_and_navigate_to_past_job_page(String email, String pass) {
		dp = new DriverPage();
	    sendKeys(dp.getEmail(), email);
		sendKeys(dp.getPassword(), pass);
		clicks(dp.getNext());
		
		clicks(dp.getDriverPage());
	}
	
	@Given("Clicks on the Filters and select favourite drivers, worked with us before, and verified Road Ninja")
	public void clicks_on_the_filters_and_select_favourite_drivers_worked_with_us_before_and_verified_road_ninja() throws Exception {
		dp = new DriverPage();
		clicks(dp.getFilters());
		clicks(dp.getFavouriteDrivers());
		clicks(dp.getWorkedWithUsBefore());
		clicks(dp.getVerifiedRoadNinja());
		escape();
		
	}
	
	@Given("Search the driver {string}, sellect the driver, play the driver video pitch and click on the avaibility, workload and Review")
	public void search_the_driver_sellect_the_driver_play_the_driver_video_pitch_and_click_on_the_avaibility_workload_and_review(String search) throws Exception {
		dp = new DriverPage();
		sendKeys(dp.getSearch(), search);
		Thread.sleep(2000);
		sendKeys(dp.getSearch(), Keys.CONTROL + "a" + Keys.BACK_SPACE);
		
		clicks(dp.getSelectDriver());
		Thread.sleep(1000);
		clicks(dp.getPlayVideoPitch());
		clicks(dp.getAvailability());
		clicks(dp.getWorkload());
		clicks(dp.getReviews());
		
	}
	
	@Given("Clicks on the Sort By, select the No. of the jobs, hourly rate, name and city")
	public void clicks_on_the_sort_by_select_the_no_of_the_jobs_hourly_rate_name_and_city() {
		dp = new DriverPage();
		
//		clicks(dp.getSort());
		clicks(dp.getSortBy());
//		clicks(dp.getNumberOfJobs());
//		clicks(dp.getHourlyRate());
//		clicks(dp.getName());
		clicks(dp.getCity());
	}
	
	@Given("Click on the next page button, previous page button and page number")
	public void click_on_the_next_page_button_previous_page_button_and_page_number() {
		dp = new DriverPage();
		
		clicks(dp.getNextPage());
		clicks(dp.getPreviousPage());
		clicks(dp.getGotoPage());
	}
	
	@Given("Click on the Per Page listBox and select {int} by per page and {int} by per page")
	public void click_on_the_per_page_list_box_and_select_by_per_page_and_by_per_page(Integer int1, Integer int2) throws Exception {
		dp = new DriverPage();
		Thread.sleep(4000);
		clicks(dp.getPerPage());
	}
	
	@Given("Navigate to the current request, click on the manu and click on the delete request")
	public void navigate_to_the_current_request_click_on_the_manu_and_click_on_the_delete_request() {
		dp = new DriverPage();
		
		clicks(dp.getCurrentRequest());
		clicks(dp.getMenu());
		clicks(dp.getDeleteRequest());
		clicks(dp.getDeleteButton());
	}
	
	@Given("Navigate to the expired, click on the manu and click on the delete request")
	public void navigate_to_the_expired_click_on_the_manu_and_click_on_the_delete_request() throws Exception {
		dp = new DriverPage();
		
		Thread.sleep(2000);
		clicks(dp.getExpiredJobs());
		clicks(dp.getMenu());
		clicks(dp.getDeleteRequest());
		clicks(dp.getDeleteButton());
	}
	
	@Given("Navigate to the draft, click on the manu and click on the delete draft")
	public void navigate_to_the_draft_click_on_the_manu_and_click_on_the_delete_draft() throws Exception {
		dp = new DriverPage();
		
		Thread.sleep(2000);
		clicks(dp.getDraftJobs());
		clicks(dp.getMenu());
		clicks(dp.getDeleteDraft());
		
	}
	
	@Given("Navigate to the draft, click on the Open Draft, Enter the job title {string}, description {string}, select the vehicle, tick the tickbox, click on the next button Add a Additional terms {string}, tick the tickbox, select the assignment criteria and click on the send request button")
	public void navigate_to_the_draft_click_on_the_open_draft_enter_the_job_title_description_select_the_vehicle_tick_the_tickbox_click_on_the_next_button_add_a_additional_terms_tick_the_tickbox_select_the_assignment_criteria_and_click_on_the_send_request_button(String title, String desc, String terms) throws Exception {
		dp = new DriverPage();
		Thread.sleep(2000);
		clicks(dp.getDraftJobs());
		clicks(dp.getOprnDraft());
		
		sendKeys(dp.getJobtitle(), title);
		sendKeys(dp.getDescription(), desc);
		clicks(dp.getSelectvehicle());
		clicks(dp.getNissanBB());
		clicks(dp.getAutoapprove());
//		clicks(dp.getAddtodraft());
		clicks(dp.getSubmit());
		
		clicks(dp.getItinerary());
		
		sendKeys(dp.getAddterms(), terms);
		clicks(dp.getAcceptICA());
		clicks(dp.getHealthsafetysign());
		/*
		clicks(dp.getDrugalctest());
		clicks(dp.getSiteinduction());
		clicks(dp.getFirstaid());
		clicks(dp.getDresscode());
		clicks(dp.getMedical());
		clicks(dp.getPubliclibrary());
		clicks(dp.getCompanypolicy());
		clicks(dp.getPhysical());
		clicks(dp.getComputerskills());
		clicks(dp.getPortandID());
		clicks(dp.getAppropriatePPE());
		clicks(dp.getOther());
		
		sendKeys(dp.getEnterother(), "Others");
		sendKeys(dp.getDrugalclink(), "Drug");
		sendKeys(dp.getHealthsafetylink(), "Health");
		sendKeys(dp.getCompanypolicylink(), "Company");
//		clicks(dp.getSavetodraft());
		 */
		clicks(dp.getSendrequest());
	
	}


	

}
