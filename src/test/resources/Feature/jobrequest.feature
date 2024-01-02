#Author: susant@roadninja.co.nz
#Keywords Summary : Job Request Testing End To End


Feature: JOb Request Testing
	
	@login
  Scenario Outline: Login to Road Ninja Application
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |
     
     
  @Navigation
	Scenario Outline: Navigations to Road Ninja Application
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |
      
      
   @Date&Time   
   Scenario Outline: Select date and time 
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
     Examples: 
      | url  																 | email 											 | password    | 
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ | 
      
  
  @Regions
   Scenario Outline: Select date and time 
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
    And Select Regions
     Examples: 
      | url  																 | email 											 | password    | 
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |    
      
     
   @Skills
   Scenario Outline: Select date and time 
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
    And Select Regions
    And Select Licence class, type of vehicle, endorsement, gearbox experience and vehicle combination
     Examples: 
      | url  																 | email 											 | password    | 
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |    
       
      
   @Search
   Scenario Outline: Select date and time 
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
    And Select Regions
    And Select Licence class, type of vehicle, endorsement, gearbox experience and vehicle combination
    And Enter the fixed price "<rate>" and click on the search
     Examples: 
      | url  																 | email 											 | password    | rate |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |  500 |  
       
      
      
  @SelectDriver    
   Scenario Outline: Select date and time 
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
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |  500 |  
          
      
  @DetailsPage
   Scenario Outline: Select date and time 
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
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |  500 | Hello | Hello Hello |
              
      
   @SendRequest   
   Scenario Outline: Select date and time 
    Given Launch the URL "<url>"
    And Enter email "<email>", password "<password>" and click on the next button
    And Navigate to Driver
    And Select date and time
    And Select Regions
    And Select Licence class, type of vehicle, endorsement, gearbox experience and vehicle combination
    And Enter the fixed price "<rate>" and click on the search
    And Select the driver and click on the Next button
    And Enter the job title "<title>", description "<description>", select the vehicle, tick the tickbox and click on the next button
    And Add a Additional terms "<terms>", tick the tickbox, select the assignment criteria and click on the send request button
     Examples: 
      | url  																 | email 											 | password    | rate | title | description | terms |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |  500 | Hello | Hello Hello | Hello |
                 
      