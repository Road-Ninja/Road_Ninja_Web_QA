package org.Pages;

import org.RNBase.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class JobRequest extends UserBaseClass {

	public JobRequest() {
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
	private WebElement driverpage;

	public WebElement getDriverpage() {
		return driverpage;
	}
	
	// Select date and time
	 // select date from calendar
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'When')]")
	private WebElement when;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add new period')]")
	private WebElement addnewperiod;
	
	@FindBy(how = How.XPATH, using = "//button[@class='rdrNextPrevButton rdrPprevButton']")
	private WebElement previousb;
	
	@FindBy(how = How.XPATH, using = "//button[@class='rdrNextPrevButton rdrNextButton']")
	private WebElement nextb;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='rdrDays']//child::button[4]")
	private WebElement date1;
	
	@FindBy(how = How.XPATH, using = "//div[@class='rdrDays']//child::button[8]")
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
	
	// Select Time
	
	@FindBy(how = How.XPATH, using = "//input[@value='08:00 am']")
	private WebElement time1;
	
	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'AM')]")
	private WebElement am;
	
	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'PM')]")
	private WebElement pm;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[6]/div[3]/div/div[2]/div/div/span[2]")
	private WebElement starttime;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[6]/div[3]/div/div[2]/div/div/span[2]")
	private WebElement starttimemin;
	
	@FindBy(how = How.XPATH, using = "//input[@value='06:00 pm']")
	private WebElement time2;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[6]/div[3]/div/div[2]/div/div/span[4]")
	private WebElement endtime;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[6]/div[3]/div/div[2]/div/div/span[2]")
	private WebElement endtimemin;
	
	
	// Select Regions
	
	public WebElement getTime1() {
		return time1;
	}

	public WebElement getAm() {
		return am;
	}

	public WebElement getPm() {
		return pm;
	}

	public WebElement getStarttime() {
		return starttime;
	}

	public WebElement getStarttimemin() {
		return starttimemin;
	}

	public WebElement getTime2() {
		return time2;
	}

	public WebElement getEndtime() {
		return endtime;
	}

	public WebElement getEndtimemin() {
		return endtimemin;
	}

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
	
		// Endorsement
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Endorsement')]")
	private WebElement endorsement;
	
	@FindBy(how = How.XPATH, using = "//input[@name='D']")
	private WebElement d;
	
	@FindBy(how = How.XPATH, using = "//input[@name='F']")
	private WebElement f;
	
	@FindBy(how = How.XPATH, using = "//input[@name='I']")
	private WebElement i;
	
	@FindBy(how = How.XPATH, using = "//input[@name='O']")
	private WebElement o;
	
	@FindBy(how = How.XPATH, using = "//input[@name='P']")
	private WebElement p;
	
	@FindBy(how = How.XPATH, using = "//input[@name='R']")
	private WebElement r;
	
	@FindBy(how = How.XPATH, using = "//input[@name='T']")
	private WebElement t;
	
	@FindBy(how = How.XPATH, using = "//input[@name='V']")
	private WebElement v;
	
	@FindBy(how = How.XPATH, using = "//input[@name='W']")
	private WebElement w;

	public WebElement getEndorsement() {
		return endorsement;
	}

	public WebElement getD() {
		return d;
	}

	public WebElement getF() {
		return f;
	}

	public WebElement getI() {
		return i;
	}

	public WebElement getO() {
		return o;
	}

	public WebElement getP() {
		return p;
	}

	public WebElement getR() {
		return r;
	}

	public WebElement getT() {
		return t;
	}

	public WebElement getV() {
		return v;
	}

	public WebElement getW() {
		return w;
	}
	
		// Gearbox Experience
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Gearbox experience')]")
	private WebElement gearbox;
	
	@FindBy(how = How.XPATH, using = "//input[@name='auto-manual']")
	private WebElement automanual;
	
	@FindBy(how = How.XPATH, using = "//input[@name='automatic']")
	private WebElement automatic;
	
	@FindBy(how = How.XPATH, using = "//input[@name='manual-sync']")
	private WebElement sync;
	
	@FindBy(how = How.XPATH, using = "//input[@name='manual-non-sync']")
	private WebElement nonsync;
	
	@FindBy(how = How.XPATH, using = "//input[@name='road-ranger']")
	private WebElement roadranger;
	
	@FindBy(how = How.XPATH, using = "//input[@name='split-shift-manual']")
	private WebElement split;

	public WebElement getGearbox() {
		return gearbox;
	}

	public WebElement getAutomanual() {
		return automanual;
	}

	public WebElement getAutomatic() {
		return automatic;
	}

	public WebElement getSync() {
		return sync;
	}

	public WebElement getNonsync() {
		return nonsync;
	}

	public WebElement getRoadranger() {
		return roadranger;
	}

	public WebElement getSplit() {
		return split;
	}
 
		// Vehicle Combination
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Vehicle combination')]")
	private WebElement vehiclecombination;
	
	@FindBy(how = How.XPATH, using = "//input[@name='a-train']")
	private WebElement atrain;
	
	@FindBy(how = How.XPATH, using = "//input[@name='b-train']")
	private WebElement btrain;
	
	@FindBy(how = How.XPATH, using = "//input[@name='semi']")
	private WebElement semi;
	
	@FindBy(how = How.XPATH, using = "//input[@name='truck-and-trailer']")
	private WebElement truck;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Clear all')]")
	private WebElement clearall;

	public WebElement getClearall() {
		return clearall;
	}

	public WebElement getVehiclecombination() {
		return vehiclecombination;
	}

	public WebElement getAtrain() {
		return atrain;
	}

	public WebElement getBtrain() {
		return btrain;
	}

	public WebElement getSemi() {
		return semi;
	}

	public WebElement getTruck() {
		return truck;
	}
	
	// Payment and Search
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Payment')]")
	private WebElement payment;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Fix price offer')]")
	private WebElement fixedprice;
	
	@FindBy(how = How.XPATH, using = "//input[@inputmode='numeric']")
	private WebElement rate;
	
	

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getFixedprice() {
		return fixedprice;
	}

	public WebElement getRate() {
		return rate;
	}
	
	// Search
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	// Select Driver
	
	@FindBy(how = How.XPATH, using = "//table//tbody//tr//td[3]//child::p//child::a[contains(text(),'Susant')]//parent::p//parent::td//following-sibling::td[7]")
	private WebElement selectdriver;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
	private WebElement nextpage;

	public WebElement getSelectdriver() {
		return selectdriver;
	}

	public WebElement getNextpage() {
		return nextpage;
	}
	
	// Details Page
	
	@FindBy(how = How.XPATH, using = "//input[@name='title']")
	private WebElement jobtitle;
	
	@FindBy(how = How.XPATH, using = "//textarea[@name='description']")
	private WebElement description;
	
	@FindBy(how = How.XPATH, using = "//div[@id='mui-component-select-vehicle']")
	private WebElement selectvehicle;
	
	@FindBy(how = How.XPATH, using = "(//ul)[4]//li[1]")
	private WebElement honda;
	
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
