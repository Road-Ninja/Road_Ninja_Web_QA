package org.Pages;

import org.RNBase.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class myvehicles extends UserBaseClass{
	public myvehicles() {
		PageFactory.initElements(driver, this);
	}
	
	// login
		@FindBy(how = How.XPATH, using = "//input[@name='username']")
		private WebElement email;

		@FindBy(how = How.XPATH, using = "//input[@name='password']")
		private WebElement password;

		@FindBy(how = How.XPATH, using = "//button[@type='submit']")
		private WebElement next;

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getNext() {
			return next;
		}
		
		// navigation
		@FindBy(how = How.XPATH, using = "//a[@href='/vehicles']")
		private WebElement myvehiclespage;

		public WebElement getMyvehiclespage() {
			return myvehiclespage;
		}
		
		// Add Vehicle Button
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add vehicle')]")
		private WebElement addvehicle;

		public WebElement getAddvehicle() {
			return addvehicle;
		}
		
		// Add Vehicle box
		@FindBy(how = How.XPATH, using = "//div[@id='mui-component-select-type']")
		private WebElement type;
		
		@FindBy(how = How.XPATH, using = "//p[contains(text(),'Vehicle')]")
		private WebElement vehicle;
		
		@FindBy(how = How.XPATH, using = "//p[contains(text(),'Trailer')]")
		private WebElement trailer;
		
		@FindBy(how = How.XPATH, using = "//div[@id='mui-component-select-ownership']")
		private WebElement ownership;
		
		@FindBy(how = How.XPATH, using = "//p[contains(text(),'Owned')]")
		private WebElement owned;
		
		@FindBy(how = How.XPATH, using = "//p[contains(text(),'Leased')]")
		private WebElement leased;
		
		@FindBy(how = How.XPATH, using = "//input[@spellcheck='false']")
		private WebElement typeofDriving;
		
		@FindBy(how = How.XPATH, using = "//input[@name='make']")
		private WebElement vehicleMake;
		
		@FindBy(how = How.XPATH, using = "//input[@name='model']")
		private WebElement vehicleModel;
		
		@FindBy(how = How.XPATH, using = "//input[@name='fleetNumber']")
		private WebElement vehiclefleetNumber;
		
		@FindBy(how = How.XPATH, using = "//input[@name='plateNumber']")
		private WebElement plateNumber;
		
		@FindBy(how = How.XPATH, using = "//input[@name='year']")
		private WebElement year;
		
		@FindBy(how = How.XPATH, using = "//button[@type='submit']")
		private WebElement Add;
		
		public WebElement getType() {
			return type;
		}

		public WebElement getVehicle() {
			return vehicle;
		}

		public WebElement getTrailer() {
			return trailer;
		}

		public WebElement getOwnership() {
			return ownership;
		}

		public WebElement getOwned() {
			return owned;
		}

		public WebElement getLeased() {
			return leased;
		}

		public WebElement getTypeofDriving() {
			return typeofDriving;
		}

		public WebElement getVehicleMake() {
			return vehicleMake;
		}

		public WebElement getVehicleModel() {
			return vehicleModel;
		}

		public WebElement getVehiclefleetNumber() {
			return vehiclefleetNumber;
		}

		public WebElement getPlateNumber() {
			return plateNumber;
		}

		public WebElement getYear() {
			return year;
		}

		public WebElement getAdd() {
			return Add;
		}
		
		// Delete vehicle
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'trailer')]")
		private WebElement selectvehicle;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'upcoming jobs')]")
		private WebElement upcomingJobs;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'live jobs')]")
		private WebElement liveJobs;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'completed jobs')]")
		private WebElement completedJobs;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Pre-departure check history')]")
		private WebElement pdchistory;
		
		@FindBy(how = How.XPATH, using = "//button[@aria-label='Open menu']")
		private WebElement threeDots;
		
		@FindBy(how = How.XPATH, using = "//li[contains(text(),'Delete')]")
		private WebElement delete;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Delete')]")
		private WebElement deletevehicle;
		
		public WebElement getSelectvehicle() {
			return selectvehicle;
		}

		public WebElement getUpcomingJobs() {
			return upcomingJobs;
		}

		public WebElement getLiveJobs() {
			return liveJobs;
		}

		public WebElement getCompletedJobs() {
			return completedJobs;
		}

		public WebElement getPdchistory() {
			return pdchistory;
		}

		public WebElement getThreeDots() {
			return threeDots;
		}

		public WebElement getDelete() {
			return delete;
		}
		
		public WebElement getDeletevehicle() {
			return deletevehicle;
		}

		// Search vehicle
		@FindBy(how = How.XPATH, using = "// input[@type='search']")
		private WebElement search;

		public WebElement getSearch() {
			return search;
		}
}
