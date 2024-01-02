package org.Pages;

import org.RNBase.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CompanyProfile extends UserBaseClass{
	
	public CompanyProfile() {
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
			@FindBy(how = How.XPATH, using = "//a[@href='/company']")
			private WebElement companyprofile;

			public WebElement getCompanyprofile() {
				return companyprofile;
			}
			
			// Add manager
			
			
			@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add')]")
			private WebElement addmanager;
			
			@FindBy(how = How.XPATH, using = "//input[@name='managers[0].firstName']")
			private WebElement firstname1;
			
			@FindBy(how = How.XPATH, using = "//input[@name='managers[0].lastName']")
			private WebElement lastname1;
	
			@FindBy(how = How.XPATH, using = "//input[@name='managers[0].email']")
			private WebElement email1;
			
			@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add more')]")
			private WebElement addmore;
			
			@FindBy(how = How.XPATH, using = "(//button[@aria-label='Close'])[3]")
			private WebElement CloseManger2;
			
			@FindBy(how = How.XPATH, using = "(//button[@aria-label='Close'])[1]")
			private WebElement Closemodel;
			
			@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Save')])")
			private WebElement saveManger;

			

			public WebElement getAddmanager() {
				return addmanager;
			}

			public WebElement getFirstname1() {
				return firstname1;
			}

			public WebElement getLastname1() {
				return lastname1;
			}

			public WebElement getEmail1() {
				return email1;
			}

			public WebElement getAddmore() {
				return addmore;
			}

			public WebElement getCloseManger2() {
				return CloseManger2;
			}

			public WebElement getClosemodel() {
				return Closemodel;
			}

			public WebElement getSaveManger() {
				return saveManger;
			}
			
			// Delete manager
			@FindBy(how = How.XPATH, using = "(//p[contains(text(),'Pooja Adhikari')]//parent::div//preceding::button[1])")
			private WebElement threeDot;
			
			@FindBy(how = How.XPATH, using = "(//li[contains(text(),'Delete')])")
			private WebElement deletemanager;

			public WebElement getThreeDot() {
				return threeDot;
			}

			public WebElement getDeletemanager() {
				return deletemanager;
			}
			
			// Edit Company Profile
			@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Edit')])")
			private WebElement editCP;
			
			@FindBy(how = How.XPATH, using = "(//input[@name='title'])")
			private WebElement compTitle;
			
			@FindBy(how = How.XPATH, using = "(//input[@name='registeredName'])")
			private WebElement regName;
			
			@FindBy(how = How.XPATH, using = "(//input[@name='tradingName'])")
			private WebElement tradName;
			
			@FindBy(how=How.XPATH,using="(//div[@id='mui-component-select-region'])")
			private WebElement yardlocations;
			
			@FindBy(how=How.XPATH,using="(//p[contains(text(),'Bay of Plenty')])")
			private WebElement selectlocations;
			
			@FindBy(how=How.XPATH,using="//input[@name='phone']")
			private WebElement phoneNo;
			
			@FindBy(how=How.XPATH,using="//div[@id='mui-component-select-numberOfVehicles']")
			private WebElement totalvehicle;
			
			@FindBy(how=How.XPATH,using="//p[contains(text(),'16-35')]")
			private WebElement selecttvehicle;
			
			@FindBy(how=How.XPATH,using="//textarea[@name='description']")
			private WebElement desc;
			
			@FindBy(how=How.XPATH,using="(//button[@type='submit'])")
			private WebElement saveCP;

			public WebElement getEditCP() {
				return editCP;
			}

			public WebElement getCompTitle() {
				return compTitle;
			}

			public WebElement getRegName() {
				return regName;
			}

			public WebElement getTradName() {
				return tradName;
			}

			public WebElement getYardlocations() {
				return yardlocations;
			}

			public WebElement getSelectlocations() {
				return selectlocations;
			}

			public WebElement getPhoneNo() {
				return phoneNo;
			}

			public WebElement getTotalvehicle() {
				return totalvehicle;
			}

			public WebElement getSelecttvehicle() {
				return selecttvehicle;
			}

			public WebElement getSaveCP() {
				return saveCP;
			}

			public WebElement getDesc() {
				return desc;
			}
			

			// Payment
			@FindBy(how=How.XPATH,using="//span[contains(text(),'View payments to pay')]")
			private WebElement payment;
			
			@FindBy(how=How.XPATH,using="//table//tbody//tr[1]//td[1]")
			private WebElement job1;
			
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

			public WebElement getPayment() {
				return payment;
			}

			public WebElement getJob1() {
				return job1;
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
			
			// Reviews
			@FindBy(how=How.XPATH,using="//span[contains(text(),'Reviews')]")
			private WebElement reviews;
			
			public WebElement getReviews() {
				return reviews;
			}
			
			// Add Credit Cards
			@FindBy(how=How.XPATH,using="//span[contains(text(),'Credit cards')]")
			private WebElement creditCards;
			
			@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add')]")
			private WebElement addCC;
			
			@FindBy(how=How.XPATH,using="//span[contains(text(),'Save credit card')]")
			private WebElement saveCC;

			public WebElement getCreditCards() {
				return creditCards;
			}

			public WebElement getAddCC() {
				return addCC;
			}

			public WebElement getSaveCC() {
				return saveCC;
			}
			
			// Delete Credit Cards
			@FindBy(how=How.XPATH,using="(//ul)[3]//child::li[2]//child::div//child::button")
			private WebElement editCC;
			
			@FindBy(how=How.XPATH,using="//li[contains(text(),'Delete')]")
			private WebElement deleteCC;

			public WebElement getEditCC() {
				return editCC;
			}

			public WebElement getDeleteCC() {
				return deleteCC;
			}
			
			
			
			
			
			
}
