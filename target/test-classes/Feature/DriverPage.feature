
#Author: susant@roadninja.co.nz
#Keywords Summary : Driver Page End to End Testing

Feature: Driver Jobs Page Testing

 @login
  Scenario: Login to Road Ninja Application and Navigate to Driver Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
    
 
 @Filters
  Scenario: Select the filters
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Clicks on the Filters and select favourite drivers, worked with us before, and verified Road Ninja  
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
  
  @Search @DriverProfile
  Scenario: Search the driver and navigate to their profile
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Search the driver "<searchDriver>", select the driver, play the driver video pitch and click on the avaibility, workload and Review
     Examples: 
      | url  																 | email 											 | password    | searchDriver |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Susant       |
          
  @SortBy 
  Scenario: Selcet the sort by
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Clicks on the Sort By, select the No. of the jobs, hourly rate, name and city
     Examples: 
      | url  																 | email 											 | password    | 
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | 
                  
  @Pagination   
  Scenario: Select the pagination
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Click on the next page button, previous page button and page number 
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |        
     
  @PerPage   
  Scenario: Select the per page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Click on the Per Page listBox and select 25 by per page and 50 by per page
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |        
        
   
  @DeleteCurrentRequest 
  Scenario: Delect the current request
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Navigate to the current request, click on the manu and click on the delete request
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |        
      
     
  @DeleteExpiredRequest 
  Scenario: Dlecet the expired request
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Navigate to the expired, click on the manu and click on the delete request
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |        
          
   
  @DeleteDraft 
  Scenario: Delect the draft
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Navigate to the draft, click on the manu and click on the delete draft
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |        
          
  @OpenDraft 
  Scenario: Open the draft
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Navigate to the draft, click on the Open Draft, Enter the job title "<title>", description "<description>", select the vehicle, tick the tickbox, click on the next button Add a Additional terms "<terms>", tick the tickbox, select the assignment criteria and click on the send request button
     Examples: 
      | url  																 | email 											 | password    | title | description | terms |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Hello | Hello Hello | Hello |
              
     
            