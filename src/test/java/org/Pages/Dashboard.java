package org.Pages;

import org.RNBase.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends UserBaseClass{
	
	public Dashboard() {
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
				
	// Payments
				@FindBy(how = How.XPATH, using = "//a[@href='/payments']//parent::div")
				private WebElement payments;

				public WebElement getPayments() {
					return payments;
				}	

				
	// Create request
				@FindBy(how = How.XPATH, using = "//span[contains(text(),'Create request')]")
				private WebElement createRequest;

				public WebElement getCreateRequest() {
					return createRequest;
				}
				
	// Chart Menu
				@FindBy(how = How.XPATH, using = "(//span[@class='MuiButton-label'])[3]")
				private WebElement chartMenu;
				
				@FindBy(how = How.XPATH, using = "//li[contains(text(),'In total')]")
				private WebElement inTotal;
				
				
				@FindBy(how = How.XPATH, using = "//li[contains(text(),'Last month')]")
				private WebElement lastMonth;
				
				@FindBy(how = How.XPATH, using = "//li[contains(text(),'Last 30 days')]")
				private WebElement last30Days;
				
				@FindBy(how = How.XPATH, using = "//li[contains(text(),'Last 2 months')]")
				private WebElement last2Months;

				public WebElement getChartMenu() {
					return chartMenu;
				}

				public WebElement getInTotal() {
					return inTotal;
				}

				public WebElement getLastMonth() {
					return lastMonth;
				}

				public WebElement getLast30Days() {
					return last30Days;
				}

				public WebElement getLast2Months() {
					return last2Months;
				}
				
	// Job request
				@FindBy(how = How.XPATH, using = "//a[@href='/drivers/current']")
				private WebElement jobRequest;

				public WebElement getJobRequest() {
					return jobRequest;
				}
				
				
	// Future Jobs
				@FindBy(how = How.XPATH, using = "//a[@href='/jobs/upcoming']")
				private WebElement futureJobs;

				public WebElement getFutureJobs() {
					return futureJobs;
				}
				
	// Past Jobs
				@FindBy(how = How.XPATH, using = "//a[@href='/jobs/completed']")
				private WebElement pastJobs;

				public WebElement getPastJobs() {
					return pastJobs;
				}
				
	// Drivers, worked with
				@FindBy(how = How.XPATH, using = "//span[contains(text(),'Drivers, worked with  ')]")
				private WebElement drivers;
				
				@FindBy(how = How.XPATH, using = "//li[contains(text(),'Frequently')]")
				private WebElement frequently;
				
				@FindBy(how = How.XPATH, using = "//li[contains(text(),'Last time')]")
				private WebElement lastTime;

				public WebElement getDrivers() {
					return drivers;
				}

				public WebElement getFrequently() {
					return frequently;
				}

				public WebElement getLastTime() {
					return lastTime;
				}
				
	// Top Vehicles list 
				@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/div/div/section[6]/div[1]/h2/button")
				private WebElement topvehiclelist;
				
				@FindBy(how = How.XPATH, using = "//li[contains(text(),'Top jobs vehicles')]")
				private WebElement jobsVehicles;
				
				@FindBy(how = How.XPATH, using = "//li[contains(text(),'Top hours vehicles')]")
				private WebElement hoursVehicles;
				
				@FindBy(how = How.XPATH, using = "//li[contains(text(),'Less faults vehicles')]")
				private WebElement lessfaultsvehicles;

				public WebElement getTopvehiclelist() {
					return topvehiclelist;
				}

				public WebElement getJobsVehicles() {
					return jobsVehicles;
				}

				public WebElement getHoursVehicles() {
					return hoursVehicles;
				}

				public WebElement getLessfaultsvehicles() {
					return lessfaultsvehicles;
				}
				
	// View all Vehicles
				@FindBy(how = How.XPATH, using = "//a[contains(text(),'View all vehicles')]")
				private WebElement viewAllVehicles;

				public WebElement getViewAllVehicles() {
					return viewAllVehicles;
				}	
				
	// Vehicle
				@FindBy(how = How.XPATH, using = "//section[@class='DashboardVehicles_root__6zQ6t']/div[2]/a[1]")
				private WebElement firstVehicle;
				
				@FindBy(how = How.XPATH, using = "//section[@class='DashboardVehicles_root__6zQ6t']/div[2]/a[1]")
				private WebElement secondVehicle;
				
				@FindBy(how = How.XPATH, using = "//section[@class='DashboardVehicles_root__6zQ6t']/div[2]/a[1]")
				private WebElement thirdVehicle;

				public WebElement getFirstVehicle() {
					return firstVehicle;
				}

				public WebElement getSecondVehicle() {
					return secondVehicle;
				}

				public WebElement getThirdVehicle() {
					return thirdVehicle;
				}
				
	// Ratings
				@FindBy(how = How.XPATH, using = "//a[@href='/company/reviews']")
				private WebElement reviews;

				public WebElement getReviews() {
					return reviews;
				}
				
	// Company Profile
				@FindBy(how = How.XPATH, using = "//a[contains(text(),'View company profile')]")
				private WebElement company;

				public WebElement getCompany() {
					return company;
				}
				
	// Current Job
				@FindBy(how = How.XPATH, using = "//li[@class='swiper-slide swiper-slide-active']")
				private WebElement currentJob;

				public WebElement getCurrentJob() {
					return currentJob;
				}
				
	// Next pagination of current job
				@FindBy(how = How.XPATH, using = "//span[@class='swiper-pagination-bullet']")
				private WebElement nextPagination;
				
				@FindBy(how = How.XPATH, using = "//span[@class='swiper-pagination-bullet swiper-pagination-bullet-active']")
				private WebElement activePagination;

				public WebElement getNextPagination() {
					return nextPagination;
				}

				public WebElement getActivePagination() {
					return activePagination;
				}
				
	// Notification
				@FindBy(how = How.XPATH, using = "(//ul)[12]/li[1]")
				private WebElement notification1;

				public WebElement getNotification1() {
					return notification1;
				}
				
	// Top rated drivers
				@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/div/div/section[5]/div[1]/div/h2/button/span[1]")
				private WebElement driverOpt;
				
				@FindBy(how = How.XPATH, using = "//li[contains(text(),'Top rated drivers')]")
				private WebElement ratedDrivers;
				
				@FindBy(how = How.XPATH, using = "//li[contains(text(),'Most popular drivers')]")
				private WebElement popularDrivers;
				
				public WebElement getDriverOpt() {
					return driverOpt;
				}

				public WebElement getRatedDrivers() {
					return ratedDrivers;
				}

				public WebElement getPopularDrivers() {
					return popularDrivers;
				}
				
				
				
	 // Regions
				@FindBy(how = How.XPATH, using = "//span[contains(text(),'All regions')]")
				private WebElement allRegions;
				
				@FindBy(how = How.XPATH, using = "//input[@name='N']")
				private WebElement north;
				
				@FindBy(how = How.XPATH, using = "//input[@name='S']")
				private WebElement south;
				
				@FindBy(how = How.XPATH, using = "//div[contains(text(),'Auckland')]")
				private WebElement auckland;
				
				@FindBy(how = How.XPATH, using = "//div[@class='DashboardTopDrivers_panel__WGuve']/div/div//button[2]")
				private WebElement cross;
				
				public WebElement getCross() {
					return cross;
				}

				public WebElement getAllRegions() {
					return allRegions;
				}

				public WebElement getNorth() {
					return north;
				}

				public WebElement getSouth() {
					return south;
				}

				public WebElement getAuckland() {
					return auckland;
				}
				
	// All vehicle types
				
				@FindBy(how = How.XPATH, using = "//span[contains(text(),'All vehicle types')]")
				private WebElement allVehicles;
				
				@FindBy(how = How.XPATH, using = "//button[contains(text(),'View full list')]")
				private WebElement fillList;
				
				@FindBy(how = How.XPATH, using = "//button[contains(text(),'Curtainsiders')]")
				private WebElement vehicle;

				public WebElement getAllVehicles() {
					return allVehicles;
				}

				public WebElement getFillList() {
					return fillList;
				}

				public WebElement getVehicle() {
					return vehicle;
				}
				
				
				
				
}
