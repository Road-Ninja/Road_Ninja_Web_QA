#Author: susant@roadninja.co.nz
#Keywords Summary : Sign up page End to End testing

Feature: Onboarding Steps
  @First_Step
  Scenario Outline: First Step of Onboarding
  Given Launch the URL "<url>" and click on the Sign Up button
  And Enter Full name "<Full name>", email "<Email>", phone number "<Phone Number>", password "<Password>", tick the box and click on the next button
    Examples: 
  		| url  																			 | Full name 			| Email									 | Phone Number | Password |
  		|https://staging-app.roadninja.co.nz/sign-up | Susant Bhandari | susant@roadninja.co.nz | 212693802    | Hello123 |

  @Second_Step
  Scenario Outline: Second Step of Onboarding
  Given Launch the URL "<url>" and click on the Sign Up button
  And Enter Full name "<Full name>", email "<Email>", phone number "<Phone Number>", password "<Password>", tick the box and click on the next button
  And Enter Company name "<Company name>", Company phone number "<Company number>", yard locations "<Yard locations>", Position "<Position>", Total number of vehicle "<Total vehicle>" and click on the app links and Sign Up
    Examples: 
  		| url  																			 | Full name 			| Email									 | Phone Number | Password | Company name | Company number | Yard locations 		| Position | Total vehicle |
  		|https://staging-app.roadninja.co.nz/sign-up | Susant Bhandari | susant28@roadninja.co.nz | 212693802    | Hello123 | Transport		| 0277623437		 | Auckland 					| Manager  | 36+					 |
  
	
 
  