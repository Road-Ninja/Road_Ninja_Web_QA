#Author: susant@roadninja.co.nz
#Keywords Summary : Job Request Testing End To End


Feature: JOb Request Testing
	
	@login
  Scenario Outline: Login to Road Ninja Application
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
     
     
  @Navigation
	Scenario Outline: Navigations to Road Ninja Application
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
      
      
   @Date&Time   
   Scenario Outline: Select date and time 
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
     Examples: 
      | url  																 | email 											 | password    | 
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | 
      
  
  @Regions
   Scenario Outline: Select Regions
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
    And Select Regions
     Examples: 
      | url  																 | email 											 | password    | 
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |   
      
     
   @Skills
   Scenario Outline: Select Skills
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
    And Select Regions
    And Select Licence class, type of vehicle, endorsement, gearbox experience and vehicle combination
     Examples: 
      | url  																 | email 											 | password    | 
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |   
       
      
   @Search
   Scenario Outline: Enter fixed price rate
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
    And Select Regions
    And Select Licence class, type of vehicle, endorsement, gearbox experience and vehicle combination
    And Enter the fixed price "<rate>" and click on the search
     Examples: 
      | url  																 | email 											 | password    | rate |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |  500 |  
       
      
      
  @SelectDriver    
   Scenario Outline: Select the driver
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
    And Select Regions
    And Select Licence class, type of vehicle, endorsement, gearbox experience and vehicle combination
    And Enter the fixed price "<rate>" and click on the search
    And Select the driver and click on the Next button
     Examples: 
      | url  																 | email 											 | password    | rate |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |  500 |  
          
      
  @DetailsPage
   Scenario Outline: Enter the details
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
    And Select Regions
    And Select Licence class, type of vehicle, endorsement, gearbox experience and vehicle combination
    And Enter the fixed price "<rate>" and click on the search
    And Select the driver and click on the Next button
    And Enter the job title "<title>", description "<description>", select the vehicle, tick the tickbox and click on the next button
     Examples: 
      | url  																 | email 											 | password    | rate | title | description |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |  500 | Testing | Hello Hello |
              
      
   @SendRequest   
   Scenario Outline: Send Job Request
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
    And Select Regions
    And Select Licence class, type of vehicle, endorsement, gearbox experience and vehicle combination
    And Enter the fixed price "<rate>" and click on the search
    And Select the driver and click on the Next button
    And Enter the job title "<title>", description "<description>", select the vehicle, tick the tickbox and click on the next button
    And Select the assignment criteria and then click on the next button, add a Additional terms "<terms>", tick the tickbox and send request
     Examples: 
      | url  																 | email 											 | password    | rate | title | description | terms |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |  500 | Testing | Hello Hello | Please follw the General Terms |
                 
      