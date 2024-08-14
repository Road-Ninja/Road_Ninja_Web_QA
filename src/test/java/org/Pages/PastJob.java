package org.Pages;

import org.RNBase.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PastJob extends UserBaseClass {
	public PastJob() {
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
			
			@FindBy(how = How.XPATH, using = "//span[contains(text(),'past')]")
			private WebElement pastJobPage;

			public WebElement getJobsPage() {
				return jobsPage;
			}

			public WebElement getPastJobPage() {
				return pastJobPage;
			}
			
			// Filter option
			// All dates

			@FindBy(how = How.XPATH, using = "//span[contains(text(),'All dates')]")
			private WebElement allDates;

			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Today')]")
			private WebElement today;

			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Current month')]")
			private WebElement currentMonth;

			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Last 7 days')]")
			private WebElement last7Days;

			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Last month')]")
			private WebElement lastMonth;

			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Custom')]")
			private WebElement custom;

			@FindBy(how = How.XPATH, using = "(//div[@class='MuiPickersCalendar-week'])[4]//child::div[2]")
			private WebElement date1;

			@FindBy(how = How.XPATH, using = "(//div[@class='MuiPickersCalendar-week'])[4]//child::div[2]")
			private WebElement date2;

			@FindBy(how = How.XPATH, using = "//div[@class='DatesFilter_custom__F4cIM DatesFilter_custom_active__zsoBL']//child::a[1]")
			private WebElement selectDate1;

			@FindBy(how = How.XPATH, using = "//div[@class='DatesFilter_custom__F4cIM DatesFilter_custom_active__zsoBL']//child::a[2]")
			private WebElement selectDate2;

			@FindBy(how = How.XPATH, using = "//div[@class='MuiPickersCalendarHeader-switchHeader']//child::button[1]")
			private WebElement previousb;

			@FindBy(how = How.XPATH, using = "//div[@class='MuiPickersCalendarHeader-switchHeader']//child::button[2]")
			private WebElement nextb;

			public WebElement getAllDates() {
				return allDates;
			}

			public WebElement getToday() {
				return today;
			}

			public WebElement getCurrentMonth() {
				return currentMonth;
			}

			public WebElement getLast7Days() {
				return last7Days;
			}

			public WebElement getLastMonth() {
				return lastMonth;
			}

			public WebElement getCustom() {
				return custom;
			}

			public WebElement getDate1() {
				return date1;
			}

			public WebElement getDate2() {
				return date2;
			}

			public WebElement getSelectDate1() {
				return selectDate1;
			}

			public WebElement getSelectDate2() {
				return selectDate2;
			}

			public WebElement getPreviousb() {
				return previousb;
			}

			public WebElement getNextb() {
				return nextb;
			}
			
			// All Status
			@FindBy(how = How.XPATH, using = "//span[contains(text(),'All statuses')]")
			private WebElement allStatus;
			
			@FindBy(how = How.XPATH, using = "//div[contains(text(),'Not paid')]")
			private WebElement notPaid;
			
			@FindBy(how = How.XPATH, using = "//div[contains(text(),'Paid')]")
			private WebElement paid;
			
			@FindBy(how = How.XPATH, using = "//div[contains(text(),'Dispute')]")
			private WebElement dispute;
			
			@FindBy(how = How.XPATH, using = "//div[contains(text(),'Faulty')]")
			private WebElement faulty;
			
			@FindBy(how = How.XPATH, using = "//div[contains(text(),'Not expired')]")
			private WebElement notExpired;
			
			@FindBy(how = How.XPATH, using = "//div[contains(text(),'Expired')]")
			private WebElement expired;

			public WebElement getAllStatus() {
				return allStatus;
			}

			public WebElement getNotPaid() {
				return notPaid;
			}

			public WebElement getPaid() {
				return paid;
			}

			public WebElement getDispute() {
				return dispute;
			}

			public WebElement getFaulty() {
				return faulty;
			}

			public WebElement getNotExpired() {
				return notExpired;
			}

			public WebElement getExpired() {
				return expired;
			}
			
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
			private WebElement removeDate;
			
			@FindBy(how = How.XPATH, using = "//div[@class='FiltersPanel_filters__jiSB2']//child::div[2]//child::button[2]")
			private WebElement removeStatus;
			
			@FindBy(how = How.XPATH, using = "//div[@class='FiltersPanel_filters__jiSB2']//child::div[3]//child::button[2]")
			private WebElement removeRegion;
			
			@FindBy(how = How.XPATH, using = "//div[@class='FiltersPanel_filters__jiSB2']//child::div[4]//child::button[2]")
			private WebElement removeDriver;
			
			@FindBy(how = How.XPATH, using = "//div[@class='FiltersPanel_filters__jiSB2']//child::div[5]//child::button[2]")
			private WebElement removeVehicle;

			public WebElement getRemoveDate() {
				return removeDate;
			}

			public WebElement getRemoveStatus() {
				return removeStatus;
			}

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
			
			// Download Paid Invoices
			@FindBy(how = How.XPATH, using = "//button[contains(text(),'Download paid invoices')]")
			private WebElement downloadPaidInvoices;

			public WebElement getDownloadPaidInvoices() {
				return downloadPaidInvoices;
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
			
			// Start Dispute
			@FindBy(how = How.XPATH, using = "//a[contains(text(),'Dispute')]")
			private WebElement startDispute;
			
			@FindBy(how = How.XPATH, using = "//button[contains(text(),'close the')]")
			private WebElement closeDispute;

			public WebElement getStartDispute() {
				return startDispute;
			}

			public WebElement getCloseDispute() {
				return closeDispute;
			}
			
			// Rate Driver
			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Rate driver')]")
			private WebElement rateDriver;
			
			@FindBy(how = How.XPATH, using = "//label[@for='rating-5']")
			private WebElement rating5;
			
			@FindBy(how = How.XPATH, using = "//textarea[@name='text']")
			private WebElement review;
			
			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save review')]")
			private WebElement saveReview;
			
			@FindBy(how = How.XPATH, using = "//button[@aria-label='Close']")
			private WebElement closeReview;

			public WebElement getRateDriver() {
				return rateDriver;
			}

			public WebElement getRating5() {
				return rating5;
			}

			public WebElement getReview() {
				return review;
			}

			public WebElement getSaveReview() {
				return saveReview;
			}

			public WebElement getCloseReview() {
				return closeReview;
			}
			
			// Pagination
			@FindBy(how = How.XPATH, using = "//button[@aria-label='Go to next page']")
			private WebElement nextPage;
			
			@FindBy(how = How.XPATH, using = "//button[@aria-label='Go to previous page']")
			private WebElement previousPage;
			
			@FindBy(how = How.XPATH, using = "//button[@aria-label='Go to page 4']")
			private WebElement gotoPage;

			public WebElement getNextPage() {
				return nextPage;
			}

			public WebElement getPreviousPage() {
				return previousPage;
			}

			public WebElement getGotoPage() {
				return gotoPage;
			}
			
			// Confirm Job
			
			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Confirm')]")
			private WebElement confirmButton;

			
			public WebElement getConfirmButton() {
				return confirmButton;
			}
			
			// Payment through Ready to pay
			
			@FindBy(how=How.XPATH,using="//div[contains(text(),'Ready to pay')]")
			private WebElement readyToPayButton;
			
			@FindBy(how=How.XPATH,using="//h3[contains(text(),'confirmed payment')]//parent::div//parent::div//child::div[2]//child::button[@type='button']")
			private WebElement pay;
			
			@FindBy(how=How.XPATH,using="//button[contains(text(),'Pay with another credit card')]")
			private WebElement anotherCC;
			
			@FindBy(how=How.XPATH,using="//input[@name='name']")
			private WebElement cname;
			
			@FindBy(how=How.XPATH,using="//input[@name='cardnumber']")
			private WebElement cnumber;
			
			@FindBy(how=How.XPATH,using="//input[@name='exp-date']")
			private WebElement expDate;
			
			@FindBy(how=How.XPATH,using="//input[@name='cvc']")
			private WebElement cvc;
			
			@FindBy(how=How.XPATH,using="//input[@name='save']")
			private WebElement savecard;
			
			@FindBy(how=How.XPATH,using="//span[contains(text(),'Make payment')]")
			private WebElement makePayment;

			

			public WebElement getReadyToPayButton() {
				return readyToPayButton;
			}

			public WebElement getPay() {
				return pay;
			}

			public WebElement getAnotherCC() {
				return anotherCC;
			}

			public WebElement getCname() {
				return cname;
			}

			public WebElement getCnumber() {
				return cnumber;
			}

			public WebElement getExpDate() {
				return expDate;
			}

			public WebElement getCvc() {
				return cvc;
			}

			public WebElement getSavecard() {
				return savecard;
			}

			public WebElement getMakePayment() {
				return makePayment;
			}
			
			// Paid Job
			
			@FindBy(how = How.XPATH, using = "//button[contains(text(),'Download PDF')]")
			private WebElement downloadInvoice;
			
			@FindBy(how = How.XPATH, using = "//button[@aria-label='Close']")
			private WebElement closePaymentBox;

			
			public WebElement getDownloadInvoice() {
				return downloadInvoice;
			}

			public WebElement getClosePaymentBox() {
				return closePaymentBox;
			}

			
}
