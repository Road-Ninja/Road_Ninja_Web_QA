#Author: susant@roadninja.co.nz
#Keywords Summary : Current Jobs Page End to End Testing

Feature: Current Jobs Page Testing

 @login
  Scenario: Login to Road Ninja Application and Navigate to Current Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to current job page
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
     
  @Allfilter
  Scenario: Applied filters
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to current job page
  And Select the regions from the All regions, search driver "<searchDriver>" and select driver from the all drivers , vehicle from the all vehicle and select the sort by 
     Examples: 
      | url  																 | email 											 | password    | searchDriver |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Sharma  			|
  
  @SearchJob @SendMessage
  Scenario: Search Job and send message
  Given Launch the URL "<url>"
 And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to current job page
  And Search the job "<SearchJob>", click on the job, click on the payment details, close payment details block and send message to driver "<message>"
     Examples: 
      | url  																 | email 											 | password    | SearchJob | message 						 |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Test		 | Hello, How are You? |
  
  @EditJob
  Scenario: Edit Current Job 
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to current job page   
  And Click on the three dots and then edit job button, edit the job title "<Job title>" and desc "<Desc>", select the vehicle and click on save button
  Examples: 
      | url  																 | email 											 | password    | Job title 					 | Desc |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Heavy Vehicle job | Auckland to Tauranga |
     
     
     
     
     
     
      