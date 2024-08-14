#Author: susant@roadninja.co.nz
#Keywords Summary : Company Profile page End to End Testing

Feature: Company Profile Testing

  @login
  Scenario: Login to Road Ninja Application and Navigate to Company Profile
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the company profile page
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
      
      
   @AddManager   
  Scenario: Add Manager
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the company profile page
  And Click on the Add, enter first name "<first name>", last name "<last name>", email "<emailadd>" and click on the save button   
     Examples: 
      | url  																 | email 											 | password    | first name | last name | emailadd						|
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Susant      | Bhad  | susant+1@roadninja.co.nz | 
        
     
  @DeleteManager     
  Scenario: Delete Manager
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the company profile page
  And Click on the three dot on mamager profile, and delete the mamager    
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | 
   
  
  @EditComPfl
  Scenario: Edit Company Profile
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the company profile page    
  And Click on the edit, enter company title "<title>", reg name "<regName>", trading name "<tradingName>", select loctions, enter phone number "<number>", select no. of vehicle, enter description "<dec>" and click on the save    
  Examples: 
      | url  																 | email 											 | password    | title | regName | tradingName | number 		| dec 									|
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Heal the Pain  | Heal the Pain   | Heal the Pain       | 0212693802 | Welcome to my Profile |         
    
 
  @Payment
  Scenario: Payment
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the company profile page      
  And click on the View payment, select the jobs, click on the pay button, another CC, enter card name "<Cname>", card number "<Cnum>", expiry date "<date>", CVC "<CVC>" and click on the Make payment
    Examples: 
      | url  																 | email 											 | password    | Cname   | Cnum 						   | date | CVC |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Sunil B | 4242 4242 4242 4242 | 1234  | 567 |
  
  @Reviews
  Scenario: Reviews
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the company profile page      
  And click on the reviews  
  Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
      
  @AddCC
  Scenario: Add credit card details
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the company profile page      
  And Click on the Credit cards and add CC, enter card name "<Cname>", card number "<Cnum>", expiry date "<date>", CVC "<CVC>" and click on the save CC
    Examples: 
      | url  																 | email 											 | password    | Cname   | Cnum 						   | date | CVC |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ | Sunil B | 4242 4242 4242 4242 | 1234  | 567 |
   
  @DeleteCC
  Scenario: Delect Credit Card details
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the company profile page      
  And Click on the Credit cards, three vertical dot and delete the card 
  Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
           
      
      