#Author: susant@roadninja.co.nz
#Keywords Summary : Past Jobs Page End to End Testing

Feature: Past Jobs Page Testing

 @login
  Scenario: Login to Road Ninja Application and Navigate to Past Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
       Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
    
    
  @Allfilter
  Scenario: Applied filters
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Select the Select the date from the All dates, job ststus from all status, regions from the All regions, search driver "<searchDriver>" and select driver from the all drivers , vehicle from the all vehicle and select the sort by 
     Examples: 
      | url  																 | email 											 | password    | searchDriver |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Susant  			|
     
  @SearchJob @SendMessage
  Scenario: Search the job and send the message to the driver
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Search the job "<SearchJob>", click on the job, click on the payment details, close payment details block and send message to driver "<message>"
     Examples: 
      | url  																 | email 											 | password    | SearchJob | message 						 |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Test		 | Hello, How are You? |
    
   
  @Dispute   
  Scenario: Start and end the disput 
  Given Launch the URL "<url>"
 And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Select any Past job, start a dispute and stop a dispue   
     Examples: 
      | url  																 | email 											 | password    |
     | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
       
     
  @RateDriver   
  Scenario: Rate and review the driver
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Click on the Rate Driver button, selete the rating, enter the review "<review>" and click on the Save Review button
     Examples: 
      | url  																 | email 											 | password    | review 	   |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Perfect Driver |
        
        
  @Pagination   
  Scenario: select the pagination
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Click on the next page button, previous page button and page number  
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
               
               
               
  @ConfirmJob   
  Scenario: Confirmed the job
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Select a past job and click on the confirm button
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
                    
  
  @Payment   
  Scenario: Payyment through past job tab
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Select a ready to pay status job, click on the Ready to pay button, Pay button, another CC, enter card name "<Cname>", card number "<Cnum>", expiry date "<date>", CVC "<CVC>" and click on the Make payment
    Examples: 
      | url  																 | email 											 | password    | Cname   | Cnum 						   | date | CVC |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Pooja B | 4242424242424242 | 1234  | 567 |
 
  @PaidJob   
  Scenario: Download the Invoice of the paid job
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Select a paid job, click on the payment details, download the Invoice and close payment deatils box
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |   
    
    
                                    
                           