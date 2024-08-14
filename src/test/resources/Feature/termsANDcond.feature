#Author: susant@roadninja.co.nz
#Keywords Summary : Terms and conditions End to End Testing


Feature: Terms and conditions Testing

  @login
  Scenario: Login to Road Ninja Application and Navigate to Terms and conditions
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the terms and conditions
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |

 @Terms
  Scenario: Navigate to the Terms
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the terms and conditions
  And Click on the hyperlink of the Road Ninja App present under the website terms of use
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
      
      
 @PrivacyPolicy
  Scenario: Navigate to the Privacy Policy
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the terms and conditions
  And Click on all the hyperlink present under the Privacy Policy.
     Examples: 
      | url  																 | email 											 | password    |
      | https://uat-app.roadninja.co.nz/ | susant+staging1@roadninja.co.nz | Tester123@ |
      