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
  And Click on the add vehicle button, select type, Ownership, type of driving "<types>", enter vehicle make "<Make>", vehicle model "<Model>", vehicle fleet number "<Fleetno>", plate number "<Plateno>", year "<year>" and Click on the add vehicle button.
   Examples: 
      | types | Make  | Model | Fleetno | Plateno | year |
      | Taxi  | Mazda | Alexa | BHA456  | PTY161  | 2017 |
  
  @DeleteVehicle
  Scenario: Delete Vehicle or Trailer
  Given Launch the URL
  And Enter email, password, click on the next button and navigate to My Vehicles
  And click on the any vehicle or trailer, upcoming jobs, live jobs, completed jobs, PDC history and delete the vehicle or trailer
  
  
  @Search
  Scenario: Search Vehicle
  Given Launch the URL
  And Enter email, password, click on the next button and navigate to My Vehicles
  And Search the vehicle or trailer 
  
  @EditVehicle
  Scenario: Edit Vehicle and Tralier
  Given Launch the URL
  And Enter email, password, click on the next button and navigate to My Vehicles
  And Click on the any vehicle or tralier, edit button, Ownership, type of driving, enter vehicle make, vehicle model, vehicle fleet number, plate number, year and Click on the add vehicle button.
      
      
  @SortBy
  Scenario: Sortby Vehicle
  Given Launch the URL
  And Enter email, password, click on the next button and navigate to My Vehicles
  And Click on the Sort by plate number and applied the each sort by option  
  
  
  
  
    
  