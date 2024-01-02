#Author: susant@roadninja.co.nz
#Keywords Summary : My vehicle Page End to End Testing


Feature: My Vehicle Page Testing

  @login
  Scenario: Login to Road Ninja Application and navigate to My Vehicles
  Given Launch the URL
  And Enter email, password, click on the next button and navigate to My Vehicles
  
  
  @AddVehicle
  Scenario: Add Vehicle
  Given Launch the URL
  And Enter email, password, click on the next button and navigate to My Vehicles
  And Click on the add vehicle button, select type, Ownership, type of driving, enter vehicle make, vehicle model, vehicle fleet number, plate number, year and Click on the add vehicle button.
  
  
  @DeleteVehicle
  Scenario: Delete Vehicle
  Given Launch the URL
  And Enter email, password, click on the next button and navigate to My Vehicles
  And click on the any vehicle or trailer, upcoming jobs, live jobs, completed jobs, PDC history and delete the vehicle or trailer
  
  
  @Search
  Scenario: Delete Vehicle
  Given Launch the URL
  And Enter email, password, click on the next button and navigate to My Vehicles
  And Search the vehicle or trailer 
  