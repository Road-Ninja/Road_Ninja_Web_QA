#Author: susant@roadninja.co.nz
#Keywords Summary : Future Jobs Page End to End Testing

Feature: Future Jobs page Testing
 
  @login
  Scenario: Login to Road Ninja Application and Navigate to Future Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to Jobs Page
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
      
  @Allfilter
  Scenario: Applied the filters
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to Jobs Page
  And Select the date from the All dates, regions from the All regions, driver from the all drivers, vehicle from the all vehicle and select the sort by 
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
      
  @SearchJob @SendMessage
  Scenario: Search the job and send message to the driver
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to Jobs Page
  And Search the job "<SearchJob>", click on the job, click on the payment details, close payment details block and send message to driver "<message>"
     Examples: 
      | url  																 | email 											 | password    | SearchJob | message 						 |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Test		 | Hello, How are You? |
 
   
  @EditJob
  Scenario: Edit Future Job 
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to Jobs Page
  And Click on the three dots and then edit job button, edit the job title "<Job title>" and desc "<Desc>", select the vehicle and click on save button
  Examples: 
      | url  																 | email 											 | password    | Job title 					 | Desc |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Testing Edit | Auckland to Wellington |
             
      
      
      