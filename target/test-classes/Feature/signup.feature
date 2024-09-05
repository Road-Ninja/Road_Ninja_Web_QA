#Author: susant@roadninja.co.nz
#Keywords Summary : Sign up page End to End testing

Feature: Onboarding Steps
  @First_Step
  Scenario Outline: First Step of Onboarding
  Given Launch the URL "<url>" 
  And Enter Full name "<Full name>", email "<Email>", phone number "<Phone Number>", password "<Password>", tick the box and click on the next button
    Examples: 
  		| url  																			 | Full name 			| Email									 | Phone Number | Password |
  		|https://uat-app.roadninja.co.nz/sign-up | Susant Bhandari | susant+TEST@roadninja.co.nz | 212693802    | Tester123@ |
	
	@Invali_Password 
	Scenario Outline: First Step of Onboarding
  Given Launch the URL "<url>" 
  And Enter Full name "<Full name>", email "<Email>", phone number "<Phone Number>", invalid password "<Password>", tick the box and click on the next button
    Examples: 
  		| url  																			 | Full name 			| Email									 | Phone Number | Password |
  		|https://uat-app.roadninja.co.nz/sign-up | Susant Bhandari | susant+UAT01@roadninja.co.nz | 212693802    | Tester@ |
	
	@Last_Name 
	Scenario Outline: First Step of Onboarding
  Given Launch the URL "<url>" 
  And Enter First name "<First name>", email "<Email>", phone number "<Phone Number>", password "<Password>", tick the box and click on the next button
    Examples: 
  		| url  																			 | First name 			| Email									 | Phone Number | Password |
  		|https://uat-app.roadninja.co.nz/sign-up | Susant  | susant+UAT01@roadninja.co.nz | 212693802    | Tester123@ |
	
	@Reg_Email 
	Scenario Outline: First Step of Onboarding
  Given Launch the URL "<url>" 
  And Enter Full name "<Full name>", registered email "<Email>", phone number "<Phone Number>", password "<Password>", tick the box and click on the next button
    Examples: 
  		| url  																			 | Full name 			| Email									 | Phone Number | Password |
  		|https://uat-app.roadninja.co.nz/sign-up | Susant Bhandari | susant+UAT@roadninja.co.nz | 212693802    | Tester123@ |
  		
	@Less_Ph_Number 
	Scenario Outline: First Step of Onboarding
  Given Launch the URL "<url>" 
  And Enter Full name "<Full name>", registered email "<Email>", less phone number "<Phone Number>", password "<Password>", tick the box and click on the next button
    Examples: 
  		| url  																			 | Full name 			| Email									 | Phone Number | Password |
  		|https://uat-app.roadninja.co.nz/sign-up | Susant Bhandari | susant+UAT@roadninja.co.nz | 212693    | Tester123@ |
	
	
  @Second_Step
  Scenario Outline: Second Step of Onboarding
  Given Launch the URL "<url>" 
  And Enter Full name "<Full name>", email "<Email>", phone number "<Phone Number>", password "<Password>", tick the box and click on the next button
  And Enter Company name "<Company name>", Company phone number "<Company number>", select yard locations , Enter position "<Position>", select total number of vehicle  and click on the app links and Sign Up
    Examples: 
  		| url  																			 | Full name 			| Email									 | Phone Number | Password | Company name | Company number |  Position | 
  		|https://uat-app.roadninja.co.nz/sign-up | Susant Bhandari | susant+UAT02@roadninja.co.nz  | 212693802    | Tester123@ | Transport		| 0277623437		 | Manager  | 
  
  @LoginToSecondStep @Company_Less_Phone
  Scenario: Login to Road Ninja Application 
  Given Launch the URL "<url>"
  And Click on the Log in button, Enter email "<email>", password "<password>" and click on the next button
  And Enter Company name "<Company name>", Company less phone number "<Company number>", select yard locations , Enter position "<Position>" and click on next button
    Examples: 
      | url  																 | email 											 | password  | Company name | Company number |  Position | 
      | https://uat-app.roadninja.co.nz/sign-up | susant+TEST@roadninja.co.nz | Tester123@ | Off the Pill		| 027762		 | Manager  | 
      
      
  @Last_Step
  Scenario Outline: Second Step of Onboarding
  Given Launch the URL "<url>" 
  And Enter Full name "<Full name>", email "<Email>", phone number "<Phone Number>", password "<Password>", tick the box and click on the next button
  And Enter Company name "<Company name>", Company phone number "<Company number>", select yard locations , Enter position "<Position>", select total number of vehicle  and click on the app links and Sign Up
  And Select the categories you want to see on drivers
    Examples: 
  		| url  																			 | Full name 			| Email									 | Phone Number | Password | Company name | Company number |  Position | 
  		|https://uat-app.roadninja.co.nz/sign-up | Susant Bhandari | susant+UAT03@roadninja.co.nz  | 212693802    | Tester123@ | Transport		| 0277623437		 | Manager  | 
  
	
 
  