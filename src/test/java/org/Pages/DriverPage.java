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
				@FindBy(how = How.XPATH, using = "//span[contains(text(),'Current Requests')]")
				private WebElement currentRequest;
				
				@FindBy(how = How.XPATH, using = "((//ul)[2]//child::li[1]//button[@aria-label='Open menu']")
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
				
				
				

				
				
				
				
				
}
