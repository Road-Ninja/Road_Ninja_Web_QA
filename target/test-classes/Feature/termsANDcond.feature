#Author: susant@roadninja.co.nz
#Keywords Summary : Terms and conditions End to End Testing


Feature: Terms and conditions Testing

  @login
  Scenario: Login to Road Ninja Application and Navigate to Terms and conditions
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the terms and conditions
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |

 @Terms
  Scenario: Login to Road Ninja Application and Navigate to Company Profile
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the terms and conditions
  And Click on the hyperlink of the Road Ninja App present under the website terms of use
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |
      
      
 @PrivacyPolicy
  Scenario: Login to Road Ninja Application and Navigate to Company Profile
  Given Launch the URL "<url>"
  And Enter email "<email>", password "<password>", click on the next button and navigate to the terms and conditions
  And Click on all the hyperlink present under the Privacy Policy.
     Examples: 
      | url  																 | email 											 | password    |
      | https://staging-app.roadninja.co.nz/ | susant+TEST@roadninja.co.nz | December06@ |   
      