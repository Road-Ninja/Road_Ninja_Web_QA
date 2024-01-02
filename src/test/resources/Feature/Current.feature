#Author: susant@roadninja.co.nz
#Keywords Summary : Current Jobs Page End to End Testing

Feature: Current Jobs Page Testing

 @login
  Scenario: Login to Road Ninja Application and Navigate to Future Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to current job page
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |
     
  @Allfilter
  Scenario: Current Job Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to Jobs Page
  And Select the regions from the All regions, search driver "<searchDriver>" and select driver from the all drivers , vehicle from the all vehicle and select the sort by 
     Examples: 
      | url  																 | email 											 | password    | searchDriver |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ | Rohit  			|
  
  @SearchJob @SendMessage
  Scenario: Current Job Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to Jobs Page
  And Search the job "<SearchJob>", click on the job, click on the payment details, close payment details block and send message to driver "<message>"
     Examples: 
      | url  																 | email 											 | password    | SearchJob | message 						 |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ | ATest		 | Hello, How are You? |
     
     
     
     
     
     
     
     
      