package org.Pages;

import org.RNBase.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUp extends UserBaseClass{
	
	public SignUp() {
		PageFactory.initElements(driver, this);
	}
	
	// First Step 
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Log in')]")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Terms & Conditions')]")
	private WebElement terms;
	
	public WebElement getTerms() {
		return terms;
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Privacy Policy')]")
	private WebElement privacy;

	public WebElement getPrivacy() {
		return privacy;
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'App Store')]")
	private WebElement appIOS;

	public WebElement getAppIOS() {
		return appIOS;
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Google Play')]")
	private WebElement appArd;
	

	public WebElement getAppArd() {
		return appArd;
	}

	@FindBy(how=How.XPATH,using="//a[@id='sign-up']")
	private WebElement signUpbutton;
	
	public WebElement getSignUpbutton() {
		return signUpbutton;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='name']")
	private WebElement fullname;

	public WebElement getFullname() {
		return fullname;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	private WebElement phone;

	public WebElement getPhone() {
		return phone;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='terms']")
	private WebElement tickbox;

	public WebElement getTickbox() {
		return tickbox;
	}
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement next;

	public WebElement getNext() {
		return next;
	}
	
	// Register company
	@FindBy(how=How.XPATH,using="//div[contains(text(),'The email address you have entered is already registered')]")
	private WebElement regEmail;
	
	public WebElement getRegEmail() {
		return regEmail;
	}
	
	// Invalid Password
	@FindBy(how=How.XPATH,using="//div[contains(text(),'The password format is invalid.')]")
	private WebElement invalidPass;
	
	public WebElement getInvalidPass() {
		return invalidPass;
	}
	
	// Last Name Empty
	@FindBy(how=How.XPATH,using="//div[contains(text(),'The last name field is required.')]")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	
	// Cross symbol //a[@aria-label='Close']
	@FindBy(how=How.XPATH,using="//a[@aria-label='Close']")
	private WebElement close;
	
	public WebElement getClose() {
		return close;
	}
	
	// Second Step

	@FindBy(how=How.XPATH,using="//input[@name='title']")
	private WebElement companyname;
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	private WebElement companynumber;
	
	@FindBy(how=How.XPATH,using="(//div[@id='mui-component-select-regions'])")
	private WebElement yardlocations;
	
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[3]")
	private WebElement selectlocation1;
	
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[16]")
	private WebElement selectlocation2;
	
	@FindBy(how=How.XPATH,using="//input[@name='companyPosition']")
	private WebElement position;
	
	@FindBy(how=How.XPATH,using="//div[@id='mui-component-select-numberOfVehicles']")
	private WebElement totalvehicle;
	
	@FindBy(how=How.XPATH,using="//li[@data-value='16-35']") //(//ul)[4]//li[2]]
	private WebElement vehicleNo;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'App Store')]")
	private WebElement appstore;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Google Play')]")
	private WebElement goggleplay;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement next2;


	public WebElement getSelectlocation1() {
		return selectlocation1;
	}

	public WebElement getSelectlocation2() {
		return selectlocation2;
	}


	public WebElement getVehicleNo() {
		return vehicleNo;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getCompanynumber() {
		return companynumber;
	}

	public WebElement getYardlocations() {
		return yardlocations;
	}

	public WebElement getPosition() {
		return position;
	}

	public WebElement getTotalvehicle() {
		return totalvehicle;
	}

	public WebElement getAppstore() {
		return appstore;
	}

	public WebElement getGoggleplay() {
		return goggleplay;
	}

	public WebElement getNext2() {
		return next2;
	}
	
	// Last Step
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement signUp;
	
	@FindBy(how=How.XPATH,using="//input[@name='emailNotification']")
	private WebElement emailNotification;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Clear all')]")
	private WebElement clearAll;

	public WebElement getSignUp() {
		return signUp;
	}

	public WebElement getEmailNotification() {
		return emailNotification;
	}

	public WebElement getClearAll() {
		return clearAll;
	}
	
	
	// Regions
	
	@FindBy(how=How.XPATH,using="//h3[contains(text(),'Region')]'")
	private WebElement regions;
	
	@FindBy(how = How.XPATH, using = "//input[@name='auckland']")
	private WebElement auckland;
	
	@FindBy(how = How.XPATH, using = "//input[@name='bay-of-plenty']")
	private WebElement bay_of_Plenty;
	
	@FindBy(how = How.XPATH, using = "//input[@name='southland']")
	private WebElement southland;
	
	@FindBy(how = How.XPATH, using = "//input[@name='nelson']")
	private WebElement nelson;

	public WebElement getRegions() {
		return regions;
	}

	public WebElement getAuckland() {
		return auckland;
	}

	public WebElement getBay_of_Plenty() {
		return bay_of_Plenty;
	}

	public WebElement getSouthland() {
		return southland;
	}

	public WebElement getNelson() {
		return nelson;
	}
	
	// Licence Class
	
	@FindBy(how=How.XPATH,using="//h3[contains(text(),'Licence class')]")
	private WebElement licenceClass;
	
	@FindBy(how = How.XPATH, using = "//input[@name='1']")
	private WebElement class1;
	
	@FindBy(how = How.XPATH, using = "//input[@name='2']")
	private WebElement class2;
	
	@FindBy(how = How.XPATH, using = "//input[@name='2']")
	private WebElement class3;
	
	@FindBy(how = How.XPATH, using = "//input[@name='4']")
	private WebElement class4;
	
	@FindBy(how = How.XPATH, using = "//input[@name='5']")
	private WebElement class5;

	public WebElement getLicenceClass() {
		return licenceClass;
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
	
	// Type of Driving
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Type of driving')]")
	private WebElement typeOfDriving;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Tours & commentary')]")
	private WebElement tours;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Curtainsiders')]")
	private WebElement curtainsiders;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Flat decks')]")
	private WebElement flat_decks;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Tractor units')]")
	private WebElement tractor_units;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Container')]")
	private WebElement container;

	public WebElement getTypeOfDriving() {
		return typeOfDriving;
	}

	public WebElement getTours() {
		return tours;
	}

	public WebElement getCurtainsiders() {
		return curtainsiders;
	}

	public WebElement getFlat_decks() {
		return flat_decks;
	}

	public WebElement getTractor_units() {
		return tractor_units;
	}

	public WebElement getContainer() {
		return container;
	}
	
	
	// Endorsement
	
	@FindBy(how=How.XPATH,using="//h3[contains(text(),'Endorsement')]")
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
	
	
	@FindBy(how=How.XPATH,using="//h3[contains(text(),'Gearbox experience')]")
	private WebElement gearboxExp;
	
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

	public WebElement getGearboxExp() {
		return gearboxExp;
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
	@FindBy(how=How.XPATH,using="//h3[contains(text(),'Vehicle combination')]")
	private WebElement vehicleCombination;
	
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

	public WebElement getVehicleCombination() {
		return vehicleCombination;
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
	
	// Busy Season
	@FindBy(how=How.XPATH,using="//h3[contains(text(),'Busy season')]")
	private WebElement busySeason;

	@FindBy(how = How.XPATH, using = "//input[@name='May']")
	private WebElement may;
	
	@FindBy(how = How.XPATH, using = "//input[@name='July']")
	private WebElement july;
	
	@FindBy(how = How.XPATH, using = "//input[@name='August']")
	private WebElement august;
	
	@FindBy(how = How.XPATH, using = "//input[@name='September']")
	private WebElement september;
	
	@FindBy(how = How.XPATH, using = "//input[@name='October']")
	private WebElement october;

	public WebElement getBusySeason() {
		return busySeason;
	}

	public WebElement getMay() {
		return may;
	}

	public WebElement getJuly() {
		return july;
	}

	public WebElement getAugust() {
		return august;
	}

	public WebElement getSeptember() {
		return september;
	}

	public WebElement getOctober() {
		return october;
	}
	
	// login
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	private WebElement emailLogin;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	private WebElement passwordLogin;

	

	public WebElement getEmailLogin() {
		return emailLogin;
	}

	public WebElement getPasswordLogin() {
		return passwordLogin;
	}

	
	
	
}
