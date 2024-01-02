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
	
	// Second Step
	
	@FindBy(how=How.XPATH,using="//input[@name='title']")
	private WebElement companyname;
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	private WebElement companynumber;
	
	@FindBy(how=How.XPATH,using="//div[@id='mui-component-select-region']")
	private WebElement yardlocations;
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Auckland')]")
	private WebElement selectlocations;
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Bay of Plenty')]")
	private WebElement selectlocations1;
	
	@FindBy(how=How.XPATH,using="//input[@name='companyPosition']")
	private WebElement position;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='mui-component-select-numberOfVehicles']")
	private WebElement totalvehicle;
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'36+')]")
	private WebElement selecttvehicle;

	public WebElement getSelectlocations() {
		return selectlocations;
	}

	public WebElement getSelectlocations1() {
		return selectlocations1;
	}

	public WebElement getSelecttvehicle() {
		return selecttvehicle;
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'App Store')]")
	private WebElement appstore;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Google Play')]")
	private WebElement goggleplay;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement signup;

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

	public WebElement getSignup() {
		return signup;
	}
}
