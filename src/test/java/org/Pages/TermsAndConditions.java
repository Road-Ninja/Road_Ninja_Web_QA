package org.Pages;

import org.RNBase.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TermsAndConditions extends UserBaseClass {
	
	public TermsAndConditions() {
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
				private WebElement sideBar;
				
				@FindBy(how = How.XPATH, using = "//a[@href='/terms']")
				private WebElement termsAndCond;
				
				@FindBy(how = How.XPATH, using = "//a[@href='/support']")
				private WebElement support;

				public WebElement getSideBar() {
					return sideBar;
				}

				public WebElement getTermsAndCond() {
					return termsAndCond;
				}

				public WebElement getSupport() {
					return support;
				}
				
				// Terms and Conditions Page
				@FindBy(how = How.XPATH, using = "//a[contains(text(),'app.roadninja')]")
				private WebElement roadNinjaApp;
				
				@FindBy(how = How.XPATH, using = "//a[@href='https://roadninja.co.nz/']")
				private WebElement roadNinjaWebsite;
				
				@FindBy(how = How.XPATH, using = "//a[contains(text(),'https://roadninja.co.nz/privacy.html')]")
				private WebElement roadNinjaPP;

				public WebElement getRoadNinjaApp() {
					return roadNinjaApp;
				}
				
				public WebElement getRoadNinjaWebsite() {
					return roadNinjaWebsite;
				}

				public WebElement getRoadNinjaPP() {
					return roadNinjaPP;
				}
				// Privacy Policy Page
				@FindBy(how = How.XPATH, using = "//span[contains(text(),'Privacy Policy')]")
				private WebElement privacyPolicy;
				
				@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Terms of Use')])[1]")
				private WebElement termsOfUse1;
				
				@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Terms of Use')])[2]")
				private WebElement termsOfUse2;
				
				@FindBy(how = How.XPATH, using = "//a[contains(text(),'app.roadninja')]")
				private WebElement app;
				
				@FindBy(how = How.XPATH, using = "//a[contains(text(),'https://roadninja.co.nz/')]")
				private WebElement web;
				
				@FindBy(how = How.XPATH, using = "//a[contains(text(),'https://stripe.com/nz/privacy')]")
				private WebElement strip;
				
				@FindBy(how = How.XPATH, using = "//a[contains(text(),'www.aboutcookies.org')]")
				private WebElement cookies;
				
				@FindBy(how = How.XPATH, using = "//a[contains(text(),'support@roadninja.co.nz')]")
				private WebElement supportemail;

				public WebElement getPrivacyPolicy() {
					return privacyPolicy;
				}

				public WebElement getTermsOfUse1() {
					return termsOfUse1;
				}

				public WebElement getTermsOfUse2() {
					return termsOfUse2;
				}

				public WebElement getApp() {
					return app;
				}

				public WebElement getWeb() {
					return web;
				}

				public WebElement getStrip() {
					return strip;
				}

				public WebElement getCookies() {
					return cookies;
				}

				public WebElement getSupportemail() {
					return supportemail;
				}
				

				
		
	

}
