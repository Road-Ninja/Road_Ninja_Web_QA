#Author: susant@roadninja.co.nz
#Keywords Summary : Past Jobs Page End to End Testing

Feature: Past Jobs Page Testing

 @login
  Scenario: Login to Road Ninja Application and Navigate to Past Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |
    
    
  @Allfilter
  Scenario: Past Job Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to Jobs Page
  And Select the Select the date from the All dates, job ststus from all status, regions from the All regions, search driver "<searchDriver>" and select driver from the all drivers , vehicle from the all vehicle and select the sort by 
     Examples: 
      | url  																 | email 											 | password    | searchDriver |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ | Rohit  			|
     
  @SearchJob @SendMessage
  Scenario: Past Job Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to Jobs Page
  And Search the job "<SearchJob>", click on the job, click on the payment details, close payment details block and send message to driver "<message>"
     Examples: 
      | url  																 | email 											 | password    | SearchJob | message 						 |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ | BTest		 | Hello, How are You? |
    
   
  @Dispute   
  Scenario: Login to Road Ninja Application and Navigate to Past Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Select any Past job, start a dispute and stop a dispue   
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |
       
     
  @RateDriver   
  Scenario: Login to Road Ninja Application and Navigate to Past Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Click on the Rate Driver button, selete the rating, enter the review "<review>" and click on the Save Review button
     Examples: 
      | url  																 | email 											 | password    | review 	   |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ | Good Driver |
        
        
  @Pagination   
  Scenario: Login to Road Ninja Application and Navigate to Past Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Click on the next page button, previous page button and page number  
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |
               
               
               
  @ConfirmJob   
  Scenario: Login to Road Ninja Application and Navigate to Past Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Select a past job and click on the confirm button
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |
                    
  
  @Payment   
  Scenario: Login to Road Ninja Application and Navigate to Past Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Select a ready to pay ststus job, click on the Ready to pay button, Pay button, another CC, enter card name "<Cname>", card number "<Cnum>", expiry date "<date>", CVC "<CVC>" and click on the Make payment
    Examples: 
      | url  																 | email 											 | password    | Cname   | Cnum 						   | date | CVC |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ | Pooja B | 4242 4242 4242 4242 | 1234  | 567 |
 
  @PaidJob   
  Scenario: Login to Road Ninja Application and Navigate to Past Jobs Page
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button, click on the jobs at navigation and navigate to past job page
  And Select a paid job, click on the payment details, download the Invoice and close payment deatils box
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |   
    
    
                                    
                           