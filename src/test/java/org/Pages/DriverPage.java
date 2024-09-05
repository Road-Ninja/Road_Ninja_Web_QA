package org.Pages;

import org.RNBase.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DriverPage extends UserBaseClass{

	public DriverPage() {
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
	@FindBy(how = How.XPATH, using = "//a[@href='/drivers']")
	private WebElement driverPage;

	public WebElement getDriverPage() {
		return driverPage;
	}

	// select date from calendar
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'When')]")
	private WebElement when;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add new period')]")
	private WebElement addnewperiod;

	@FindBy(how = How.XPATH, using = "//button[@class='rdrNextPrevButton rdrPprevButton']")
	private WebElement previousb;

	@FindBy(how = How.XPATH, using = "//button[@class='rdrNextPrevButton rdrNextButton']")
	private WebElement nextb;

	@FindBy(how = How.XPATH, using = "//div[@class='rdrDays']//child::button[23]")
	private WebElement date1;

	@FindBy(how = How.XPATH, using = "//div[@class='rdrDays']//child::button[24]")
	private WebElement date2;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add')]")
	private WebElement add;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Close')]")
	private WebElement close;

	public WebElement getWhen() {
		return when;
	}

	public WebElement getAddnewperiod() {
		return addnewperiod;
	}

	public WebElement getPreviousb() {
		return previousb;
	}

	public WebElement getNextb() {
		return nextb;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getClose() {
		return close;
	}

	// Select the regions

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Where')]")
	private WebElement where;

	@FindBy(how = How.XPATH, using = "//input[@name='N']")
	private WebElement north;

	@FindBy(how = How.XPATH, using = "//input[@name='S']")
	private WebElement south;

	@FindBy(how = How.XPATH, using = "//input[@name='auckland']")
	private WebElement auckland;

	public WebElement getWhere() {
		return where;
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

	// Skills
	// Licence class

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'What skills')]")
	private WebElement skills;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Licence class')]")
	private WebElement licenceclass;

	@FindBy(how = How.XPATH, using = "//ul[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1']")
	private WebElement selectlicence;

	@FindBy(how = How.XPATH, using = "//input[@name='1']")
	private WebElement class1;

	@FindBy(how = How.XPATH, using = "//input[@name='2']")
	private WebElement class2;

	@FindBy(how = How.XPATH, using = "//input[@name='3']")
	private WebElement class3;

	@FindBy(how = How.XPATH, using = "//input[@name='4']")
	private WebElement class4;

	@FindBy(how = How.XPATH, using = "//input[@name='5']")
	private WebElement class5;

	@FindBy(how = How.XPATH, using = "//input[@name='6']")
	private WebElement class6;

	public WebElement getSkills() {
		return skills;
	}

	public WebElement getLicenceclass() {
		return licenceclass;
	}

	public WebElement getSelectlicence() {
		return selectlicence;
	}

	public WebElement getClass1() {
		return class1;
	}

	public WebElement getClass2() {
		return class2;
	}

	public WebElement getClass3() {
		return class3;
	}

	public WebElement getClass4() {
		return class4;
	}

	public WebElement getClass5() {
		return class5;
	}

	public WebElement getClass6() {
		return class6;
	}

	// Types of Driving

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Type of driving')]")
	private WebElement typeofdriving;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Taxi')]")
	private WebElement vehicle;

	public WebElement getTypeofdriving() {
		return typeofdriving;
	}

	public WebElement getVehicle() {
		return vehicle;
	}

	// Search

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement jobsearch;

	public WebElement getJobsearch() {
		return jobsearch;
	}
	// Filters
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Filters')]")
	private WebElement filters; 

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Favourite drivers')]")
	private WebElement favouriteDrivers; 

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Worked with us before')]")
	private WebElement workedWithUsBefore; 

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Verified Road Ninja')]")
	private WebElement VerifiedRoadNinja;

	public WebElement getFilters() {
		return filters;
	}

	public WebElement getFavouriteDrivers() {
		return favouriteDrivers;
	}

	public WebElement getWorkedWithUsBefore() {
		return workedWithUsBefore;
	}

	public WebElement getVerifiedRoadNinja() {
		return VerifiedRoadNinja;
	} 

	// Search Driver

	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	private WebElement search;

	@FindBy(how = How.XPATH, using = "//body//table//tbody//tr[1]//td[3]")
	private WebElement selectDriver;

	@FindBy(how = How.XPATH, using = "//video[@preload='metadata']")
	private WebElement playVideoPitch;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Availability')]")
	private WebElement availability;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Workload')]")
	private WebElement workload;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reviews')]")
	private WebElement reviews;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSelectDriver() {
		return selectDriver;
	}

	public WebElement getPlayVideoPitch() {
		return playVideoPitch;
	}

	public WebElement getAvailability() {
		return availability;
	}

	public WebElement getWorkload() {
		return workload;
	}

	public WebElement getReviews() {
		return reviews;
	}

	// Sort By
	@FindBy(how = How.XPATH, using = "//div[@class='Sort_sortBlock__2AkS2']")
	private WebElement sort;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Sort by ')]")
	private WebElement sortBy;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Number of jobs')]")
	private WebElement numberOfJobs;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Hourly rate')]")
	private WebElement hourlyRate;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Name')]")
	private WebElement name;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'City')]")
	private WebElement city;

	public WebElement getSort() {
		return sort;
	}

	public WebElement getSortBy() {
		return sortBy;
	}

	public WebElement getNumberOfJobs() {
		return numberOfJobs;
	}

	public WebElement getHourlyRate() {
		return hourlyRate;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getCity() {
		return city;
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

	// Per Page
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'10')]")
	private WebElement perPage;

	@FindBy(how = How.XPATH, using = "//li[@data-value='25']")
	private WebElement perPage25;

	@FindBy(how = How.XPATH, using = "//li[@data-value='50']")
	private WebElement perPage50;

	public WebElement getPerPage() {
		return perPage;
	}

	public WebElement getPerPage25() {
		return perPage25;
	}

	public WebElement getPerPage50() {
		return perPage50;
	}

	// Current Request
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Current Request')]")
	private WebElement currentRequest;

	@FindBy(how = How.XPATH, using = "(//ul)[2]//child::li[1]//button[@aria-label='Open menu']")
	private WebElement menu;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Delete request')]")
	private WebElement deleteRequest;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Edit request')]")
	private WebElement editRequest;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Delete')]")
	private WebElement deleteButton;

	public WebElement getCurrentRequest() {
		return currentRequest;
	}

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getDeleteRequest() {
		return deleteRequest;
	}

	public WebElement getEditRequest() {
		return editRequest;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	// Expired Job
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Expired')]")
	private WebElement expiredJobs;

	public WebElement getExpiredJobs() {
		return expiredJobs;
	}

	// Delete Draft Jobs
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Draft')]")
	private WebElement draftJobs;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Delete draft')]")
	private WebElement deleteDraft;

	public WebElement getDraftJobs() {
		return draftJobs;
	}

	public WebElement getDeleteDraft() {
		return deleteDraft;
	}

	// Open Draft Job

	@FindBy(how = How.XPATH, using = "(//ul)[2]//child::li[1]//child::div//child::div//child::button//span[contains(text(),'Open draft')]")
	private WebElement oprnDraft;

	public WebElement getOprnDraft() {
		return oprnDraft;
	}

	// Details Page

	@FindBy(how = How.XPATH, using = "//input[@name='title']")
	private WebElement jobtitle;

	@FindBy(how = How.XPATH, using = "//textarea[@name='description']")
	private WebElement description;

	@FindBy(how = How.XPATH, using = "//div[@id='mui-component-select-vehicle']")
	private WebElement selectvehicle;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Honda Grace')]")
	private WebElement honda;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Nissan BlueBird')]")
	private WebElement nissanBB;

	@FindBy(how = How.XPATH, using = "//input[@name='autoApprove']")
	private WebElement autoapprove;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save as a draft')]")
	private WebElement addtodraft;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement submit;

	public WebElement getJobtitle() {
		return jobtitle;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getSelectvehicle() {
		return selectvehicle;
	}

	public WebElement getHonda() {
		return honda;
	}

	public WebElement getNissanBB() {
		return nissanBB;
	}

	public WebElement getAutoapprove() {
		return autoapprove;
	}

	public WebElement getAddtodraft() {
		return addtodraft;
	}

	public WebElement getSubmit() {
		return submit;
	}

	// Itinerary page

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Skip')]")
	private WebElement itinerary;

	public WebElement getItinerary() {
		return itinerary;
	}

	// Assignment Criteria page

	@FindBy(how = How.XPATH, using = "//textarea[@name='additionalTerms']")
	private WebElement addterms;

	@FindBy(how = How.XPATH, using = "//input[@name='acceptedICATerms']")
	private WebElement acceptICA;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Drug & Alcohol test')]")
	private WebElement drugalctest;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Health & Safety sign')]")
	private WebElement healthsafetysign;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Site induction')]")
	private WebElement siteinduction;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'First Aid certificate')]")
	private WebElement firstaid;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Dress code')]")
	private WebElement dresscode;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Medical examination')]")
	private WebElement medical;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Public Liability Insurance')]")
	private WebElement publiclibrary;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Company policy sign')]")
	private WebElement companypolicy;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Physical fitness')]")
	private WebElement physical;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Computer skills')]")
	private WebElement computerskills;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Port card ID')]")
	private WebElement portandID;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Appropriate PPE')]")
	private WebElement appropriatePPE;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Other')]")
	private WebElement other;

	@FindBy(how = How.XPATH, using = "//input[@name='other']")
	private WebElement enterother;

	@FindBy(how = How.XPATH, using = "//input[@name='drug-and-alcohol-test']")
	private WebElement drugalclink;

	@FindBy(how = How.XPATH, using = "//input[@name='health-and-safety-sign']")
	private WebElement healthsafetylink;

	@FindBy(how = How.XPATH, using = "//input[@name='company-policy-sign']")
	private WebElement companypolicylink;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save as a draft')]")
	private WebElement savetodraft;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement sendrequest;

	public WebElement getAddterms() {
		return addterms;
	}

	public WebElement getAcceptICA() {
		return acceptICA;
	}

	public WebElement getDrugalctest() {
		return drugalctest;
	}

	public WebElement getHealthsafetysign() {
		return healthsafetysign;
	}

	public WebElement getSiteinduction() {
		return siteinduction;
	}

	public WebElement getFirstaid() {
		return firstaid;
	}

	public WebElement getDresscode() {
		return dresscode;
	}

	public WebElement getMedical() {
		return medical;
	}

	public WebElement getPubliclibrary() {
		return publiclibrary;
	}

	public WebElement getCompanypolicy() {
		return companypolicy;
	}

	public WebElement getPhysical() {
		return physical;
	}

	public WebElement getComputerskills() {
		return computerskills;
	}

	public WebElement getPortandID() {
		return portandID;
	}

	public WebElement getAppropriatePPE() {
		return appropriatePPE;
	}

	public WebElement getOther() {
		return other;
	}

	public WebElement getEnterother() {
		return enterother;
	}

	public WebElement getDrugalclink() {
		return drugalclink;
	}

	public WebElement getHealthsafetylink() {
		return healthsafetylink;
	}

	public WebElement getCompanypolicylink() {
		return companypolicylink;
	}

	public WebElement getSavetodraft() {
		return savetodraft;
	}

	public WebElement getSendrequest() {
		return sendrequest;
	}
	
	// chat expired and current
	
	@FindBy(how = How.XPATH, using = "(//ul)[3]/button[1]")
	private WebElement jobchat;	
	
	@FindBy(how = How.XPATH, using = "//input[@type='text']")
	private WebElement chatbox;

	public WebElement getChatbox() {
		return chatbox;
	}

	public WebElement getJobchat() {
		return jobchat;
	}
	
	








}
