package org.DashBoardStepDefinition;

import java.time.Duration;

import org.Pages.Dashboard;
import org.RNBase.UserBaseClass;

import io.cucumber.java.en.Given;

public class DashboardStepDefinition extends UserBaseClass {
	
	Dashboard db;
	
	@Given("Launch the URL {string}")
	public void launch_the_url(String url) {
		urlLaunch(url);
	    maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	@Given("Enter email {string}, password {string} and click on the next button")
	public void enter_email_password_and_click_on_the_next_button(String email, String pass) {
	    db = new Dashboard();
	    sendKeys(db.getEmail(), email);
	    sendKeys(db.getPassword(), pass);
	    clicks(db.getNext());
	}
	
	@Given("Enter email {string}, password {string}, click on the next button and payment button of dashboard page.")
	public void enter_email_password_click_on_the_next_button_and_payment_button_of_dashboard_page(String email, String pass) {
		 db = new Dashboard();
		 sendKeys(db.getEmail(), email);
		 sendKeys(db.getPassword(), pass);
		 clicks(db.getNext());
		 clicks(db.getPayments());
	}
	
	@Given("Enter email {string}, password {string}, click on the next button and Create Request button of dashboard page.")
	public void enter_email_password_click_on_the_next_button_and_create_request_button_of_dashboard_page(String email, String pass) {
		 db = new Dashboard();
		 sendKeys(db.getEmail(), email);
		 sendKeys(db.getPassword(), pass);
		 clicks(db.getNext());
		 clicks(db.getCreateRequest());
	}
	
	@Given("click on the chart menu \\(In total) and selete the options of chart.")
	public void click_on_the_chart_menu_in_total_and_selete_the_options_of_chart() throws Exception {
		 db = new Dashboard();
		 Thread.sleep(1000);
		 clicks(db.getChartMenu());
		 Thread.sleep(1000);
		 clicks(db.getInTotal());
		 Thread.sleep(1000);
		 clicks(db.getLastMonth());
		 Thread.sleep(1000);
		 clicks(db.getLast30Days());
		 Thread.sleep(1000);
		 clicks(db.getLast2Months());
	}
	
	@Given("Click on the Job request of dashboard page.")
	public void click_on_the_job_request_of_dashboard_page() {
		db = new Dashboard();
		clicks(db.getJobRequest());
	}
	
	@Given("Click on the future jobs of dashboard page.")
	public void click_on_the_future_jobs_of_dashboard_page() {
		db = new Dashboard();
		clicks(db.getFutureJobs());
		
	}
	
	@Given("Click on the past jobs of dashboard page.")
	public void click_on_the_past_jobs_of_dashboard_page() {
		db = new Dashboard();
		clicks(db.getPastJobs());
	}
	
	@Given("Click on the Drivers, worked with and select the options: Last time or Frequently.")
	public void click_on_the_drivers_worked_with_and_select_the_options_last_time_or_frequently() throws Exception {
		db = new Dashboard();
		clicks(db.getDrivers());
		clicks(db.getFrequently());
	}
	
	@Given("click on the top job vehicles and selete the options of top vehicle list.")
	public void click_on_the_top_job_vehicles_and_selete_the_options_of_top_vehicle_list() {
		db = new Dashboard();
		clicks(db.getTopvehiclelist());
		clicks(db.getJobsVehicles());
//		clicks(db.getHoursVehicles());
//		clicks(db.getLessfaultsvehicles());
	}
	
	@Given("click on the view all vehicles")
	public void click_on_the_view_all_vehicles() {
		db = new Dashboard();
		clicks(db.getViewAllVehicles());
	}
	
	@Given("click on the first, second and third vehicle from the vehicle grid")
	public void click_on_the_first_second_and_third_vehicle_from_the_vehicle_grid() {
		db = new Dashboard();
		clicks(db.getFirstVehicle());
		back();
		clicks(db.getSecondVehicle());
		back();
		clicks(db.getThirdVehicle());
		back();
	}
	
	@Given("click on the view all ratings")
	public void click_on_the_view_all_ratings() {
		db = new Dashboard();
		clicks(db.getReviews());
	}
	
	@Given("click on the view company profile")
	public void click_on_the_view_company_profile() {
		db = new Dashboard();
		clicks(db.getCompany());
	}
	
	@Given("click on the current job")
	public void click_on_the_current_job() {
		db = new Dashboard();
		clicks(db.getCurrentJob());
	}
	
	@Given("click on the next pagination of current job")
	public void click_on_the_next_pagination_of_current_job() throws Exception {
		db = new Dashboard();
		clicks(db.getNextPagination());
		Thread.sleep(2000);
		clicks(db.getNextPagination());
	}

	
	


}
