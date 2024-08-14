
#Author: susant@roadninja.co.nz
#Keywords Summary : Driver Page End to End Testing

Feature: Driver Jobs Page Testing

 @login
  Scenario: Login to Road Ninja Application 
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
      
 
 @Payments
  Scenario: Payment Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and payment button of dashboard page.
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |     
  
 @CreateRequest
  Scenario: Create Request Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and Create Request button of dashboard page.
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |    
      
      
 @ChartMenu
  Scenario: Chart Menu Display
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And click on the chart menu (In total) and selete the options of chart.
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
 
 
 @JobRequest
  Scenario: Job Request Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And Click on the Job request of dashboard page.
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
 
 @FutureJobs
  Scenario: Future Jobs page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And Click on the future jobs of dashboard page.
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
            
 @PastJobs
  Scenario: Past Jobs page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And Click on the past jobs of dashboard page.
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
   
   
 @Drivers
  Scenario: Drivers, Worked with last time and Frequently
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And Click on the Drivers, worked with and select the options: Last time or Frequently.
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
        
        
 @VehicleList
  Scenario: Top Vechicle lists
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And click on the top job vehicles and selete the options of top vehicle list.
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
        

 @AllVehicles
  Scenario: Vehicle page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And click on the view all vehicles
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |        
        
 
 @Vehicles
  Scenario: Vehicle
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And click on the first, second and third vehicle from the vehicle grid
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |        
     
 
 @Ratings
  Scenario: Company Rating Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And click on the view all ratings
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |        
                
 
 @Company
  Scenario: Company Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And click on the view company profile
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |        
                                  
 @CurrentJob
  Scenario: Current Job page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And click on the current job
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |        
                                    
                    
 @NextCurrentJob
  Scenario: Pagination of Current Jobs
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>" and click on the next button
  And click on the next pagination of current job
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |        
                                     
                                               