package org.MyVehiclesPageStepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.Pages.myvehicles;
import org.RNBase.UserBaseClass;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;

public class MVPStepDefinition extends UserBaseClass{
	
	
	myvehicles mv;
	@Given("Launch the URL")
	public void launch_the_url() throws Exception {
	  urlLaunch(excelRead(1, 1));
	  maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	@Given("Enter email, password, click on the next button and navigate to My Vehicles")
	public void enter_email_password_click_on_the_next_button_and_navigate_to_my_vehicles() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		mv = new myvehicles();
		sendKeys(mv.getEmail(), excelRead(1, 2));
		sendKeys(mv.getPassword(), excelRead(1, 3));
		clicks(mv.getNext());
		clicks(mv.getMyvehiclespage());
		
	}
	
	@Given("Click on the add vehicle button, select type, Ownership, type of driving, enter vehicle make, vehicle model, vehicle fleet number, plate number, year and Click on the add vehicle button.")
	public void click_on_the_add_vehicle_button_select_type_ownership_type_of_driving_enter_vehicle_make_vehicle_model_vehicle_fleet_number_plate_number_year_and_click_on_the_add_vehicle_button() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		mv = new myvehicles();
		clicks(mv.getAddvehicle());
		clicks(mv.getType());
//		clicks(mv.getVehicle());
		clicks(mv.getTrailer());
		clicks(mv.getOwnership());
		clicks(mv.getOwned());
//		clicks(mv.getLeased());
		sendKeys(mv.getTypeofDriving(), excelRead(6, 3)+ Keys.ARROW_DOWN + Keys.ENTER);
		sendKeys(mv.getVehicleMake(), excelRead(6, 4));
		sendKeys(mv.getVehicleModel(), excelRead(6, 5));
		sendKeys(mv.getVehiclefleetNumber(), excelRead(6, 6));
		sendKeys(mv.getPlateNumber(), excelRead(6, 7));
		sendKeys(mv.getYear(), excelRead(6, 8));
		clicks(mv.getAdd());
	}
	
	
	@Given("click on the any vehicle or trailer, upcoming jobs, live jobs, completed jobs, PDC history and delete the vehicle or trailer")
	public void click_on_the_any_vehicle_or_trailer_upcoming_jobs_live_jobs_completed_jobs_pdc_history_and_delete_the_vehicle_or_trailer() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		mv = new myvehicles();
		clicks(mv.getSelectvehicle());
		back();
		clicks(mv.getSelectvehicle());
		clicks(mv.getUpcomingJobs());
		clicks(mv.getLiveJobs());
		clicks(mv.getCompletedJobs());
		clicks(mv.getPdchistory());
		clicks(mv.getThreeDots());
		clicks(mv.getDelete());
		clicks(mv.getDeletevehicle());
	}

	@Given("Search the vehicle or trailer")
	public void search_the_vehicle_or_trailer() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		mv = new myvehicles();
		sendKeys(mv.getSearch(), "Nissan" + Keys.ENTER);
		sendKeys(mv.getSearch(), Keys.CONTROL + "a" + Keys.BACK_SPACE);
		
	}
	

	@Given("Click on the add vehicle button, select type, Ownership, type of driving {string}, enter vehicle make {string}, vehicle model {string}, vehicle fleet number {string}, plate number {string}, year {string} and Click on the add vehicle button.")
	public void click_on_the_add_vehicle_button_select_type_ownership_type_of_driving_enter_vehicle_make_vehicle_model_vehicle_fleet_number_plate_number_year_and_click_on_the_add_vehicle_button(String type, String make, String model, String fleet, String plate, String year) {
		mv = new myvehicles();
		clicks(mv.getSelectvehicle());
		clicks(mv.getThreeDots());
		clicks(mv.getEdit());
		clicks(mv.getOwnership());
		clicks(mv.getOwned());
//		clicks(mv.getLeased());
		sendKeys(mv.getTypeofDriving(), type + Keys.ARROW_DOWN + Keys.ENTER);
		
		sendKeys(mv.getVehicleMake(), Keys.CONTROL + "a");
		sendKeys(mv.getVehicleMake(), make);
		
		sendKeys(mv.getVehicleModel(), Keys.CONTROL + "a");
		sendKeys(mv.getVehicleModel(), model);
		
		sendKeys(mv.getVehiclefleetNumber(), Keys.CONTROL + "a");
		sendKeys(mv.getVehiclefleetNumber(), fleet);
		
		sendKeys(mv.getPlateNumber(), Keys.CONTROL + "a");
		sendKeys(mv.getPlateNumber(), plate);
		
		sendKeys(mv.getYear(), Keys.CONTROL + "a");
		sendKeys(mv.getYear(), year);
		
		clicks(mv.getAdd());
		refresh();
	}


	

}
