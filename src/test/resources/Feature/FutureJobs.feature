#Author: susant@roadninja.co.nz
#Keywords Summary : Future Jobs Page End to End Testing

Feature: Future Jobs page Testing
 
  @login
  Scenario: Login to Road Ninja Application and Navigate to Future Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to Jobs Page
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |
      
  @Allfilter
  Scenario: Future Job Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to Jobs Page
  And Select the date from the All dates, regions from the All regions, driver from the all drivers, vehicle from the all vehicle and select the sort by 
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |
      
  @SearchJob @SendMessage
  Scenario: Future Job Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to Jobs Page
  And Search the job "<SearchJob>", click on the job, click on the payment details, close payment details block and send message to driver "<message>"
     Examples: 
      | url  																 | email 											 | password    | SearchJob | message 						 |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ | Test3		 | Hello, How are You? |
 
          
      
      
      