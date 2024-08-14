package org.Pages;

import org.RNBase.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CurrentJob extends UserBaseClass{
	public CurrentJob() {
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

		@FindBy(how = How.XPATH, using = "//a[@href='/jobs']")
		private WebElement jobsPage;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'current')]")
		private WebElement currentJobPage;

		public WebElement getJobsPage() {
			return jobsPage;
		}

		public WebElement getCurrentJobPage() {
			return currentJobPage;
		}
		
		// Filter option
		// All Regions
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'All regions')]")
		private WebElement allRegions;

		@FindBy(how = How.XPATH, using = "//input[@name='N']")
		private WebElement north;

		@FindBy(how = How.XPATH, using = "//input[@name='S']")
		private WebElement south;

		@FindBy(how = How.XPATH, using = "//input[@name='auckland']")
		private WebElement selectRegion;

		public WebElement getAllRegions() {
			return allRegions;
		}

		public WebElement getNorth() {
			return north;
		}

		public WebElement getSouth() {
			return south;
		}

		public WebElement getSelectRegion() {
			return selectRegion;
		}

		// All Drivers
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'All drivers')]")
		private WebElement allDrivers;

		@FindBy(how = How.XPATH, using = "//input[@placeholder='Search driver']")
		private WebElement serchDriver;

		@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[1]")
		private WebElement selectDriver1;

		@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[2]")
		private WebElement selectDriver2;

		public WebElement getAlldrivers() {
			return allDrivers;
		}

		public WebElement getAllDrivers() {
			return allDrivers;
		}

		public WebElement getSerchDriver() {
			return serchDriver;
		}

		public WebElement getSelectDriver1() {
			return selectDriver1;
		}

		public WebElement getSelectDriver2() {
			return selectDriver2;
		}

		// All Vehicles
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'All vehicles')]")
		private WebElement allVehicles;

		@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[1]")
		private WebElement vehicle1;

		@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[1]")
		private WebElement vehicle2;

		@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[1]")
		private WebElement vehicle3;

		public WebElement getAllVehicles() {
			return allVehicles;
		}
		
		public WebElement getVehicle1() {
			return vehicle1;
		}

		public WebElement getVehicle2() {
			return vehicle2;
		}

		public WebElement getVehicle3() {
			return vehicle3;
		}

	
		// Remove Cross Button

		@FindBy(how = How.XPATH, using = "//div[@class='FiltersPanel_filters__jiSB2']//child::div[1]//child::button[2]")
		private WebElement removeRegion;
		
		@FindBy(how = How.XPATH, using = "//div[@class='FiltersPanel_filters__jiSB2']//child::div[2]//child::button[2]")
		private WebElement removeDriver;
		
		@FindBy(how = How.XPATH, using = "//div[@class='FiltersPanel_filters__jiSB2']//child::div[3]//child::button[2]")
		private WebElement removeVehicle;

		public WebElement getRemoveRegion() {
			return removeRegion;
		}

		public WebElement getRemoveDriver() {
			return removeDriver;
		}

		public WebElement getRemoveVehicle() {
			return removeVehicle;
		}
		
		
		// Sort By Date Or Time
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Sort by')]")
		private WebElement sortBy;
		
		@FindBy(how = How.XPATH, using = "//li[contains(text(),'Title')]")
		private WebElement title;

		public WebElement getSortBy() {
			return sortBy;
		}

		public WebElement getTitle() {
			return title;
		}
		
		// Download Job Data to Excel
		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Job Data to Excel')]")
		private WebElement downloadJobData;

		public WebElement getDownloadJobData() {
			return downloadJobData;
		}
		
		// Search Job
		@FindBy(how = How.XPATH, using = "//input[@placeholder='Search job']")
		private WebElement searchJob;

		public WebElement getSearchJob() {
			return searchJob;
		}
		
		// Select any Job
		@FindBy(how = How.XPATH, using = "(//ul)[2]//li[1]//a")
		private WebElement selectJob;
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Payment details')]")
		private WebElement PaymentDetails;

		public WebElement getSelectJob() {
			return selectJob;
		}

		public WebElement getPaymentDetails() {
			return PaymentDetails;
		}
		
		// Send Message To driver
		
		@FindBy(how = How.XPATH, using = "//input[@placeholder='Type message here…']")
		private WebElement chatbox;

		public WebElement getChatbox() {
			return chatbox;
		}
		
		// Edit job
		
		@FindBy(how = How.XPATH, using = "//button[@aria-label='Open menu']")
		private WebElement threeDot;
		
		@FindBy(how = How.XPATH, using = "//li[@role='menuitem']")
		private WebElement editButton;
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Edit job')]")
		private WebElement editJob;
		
		@FindBy(how = How.XPATH, using = "//input[@name='title']")
		private WebElement jobTitle;
		
		@FindBy(how = How.XPATH, using = "//textarea[@name='description']")
		private WebElement jobDesc;
		
		@FindBy(how = How.XPATH, using = "//div[@id='mui-component-select-vehicle']")
		private WebElement selectvehicle;
		
		@FindBy(how = How.XPATH, using = "(//ul)[4]//li[3]")
		private WebElement vehicle;
		
		@FindBy(how = How.XPATH, using = "//input[@name='autoApprove']")
		private WebElement autoapprove;
		
		@FindBy(how = How.XPATH, using = "//button[@type='submit']")
		private WebElement save;

		public WebElement getJobTitle() {
			return jobTitle;
		}

		public WebElement getJobDesc() {
			return jobDesc;
		}

		public WebElement getSelectvehicle() {
			return selectvehicle;
		}

		public WebElement getVehicle() {
			return vehicle;
		}

		public WebElement getAutoapprove() {
			return autoapprove;
		}

		public WebElement getSave() {
			return save;
		}

		public WebElement getThreeDot() {
			return threeDot;
		}

		public WebElement getEditButton() {
			return editButton;
		}

		public WebElement getEditJob() {
			return editJob;
		}
		
		
		



}
