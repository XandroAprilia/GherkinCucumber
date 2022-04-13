@ButtonDashboardClickAbley
Feature: All Menu on Dashboard

	#TC1
  Scenario: Logo Stockbit at the Left is Clickable
    Given Go to Website
    When Logo Stockbit is Click
    Then Direct to Dashboard Website
    
  #TC2
  Scenario: Btn Investing is Clickable
    Given Go to Website
    When Btn Investing is Click
    Then Direct to DashBoard
    
  #TC3
  Scenario: Btn Pro Tools is Clickable
    Given Go to Website
    When Btn Pro Tools is Click
    Then Direct to Pro Tools Board
    
  #TC4
  Scenario: Btn Academy is Clickable
    Given Go to Website
    When Btn Academy is Click
    Then Direct to Academy Link
    
  #TC5
  Scenario: Btn About Us is Clickable
    Given Go to Website
    When Btn About Us is Click
    Then Direct to AboutUs Board
    
  #TC6
  Scenario: Btn Blog is Clickable
    Given Go to Website
    When Btn Blog is Click
    Then Direct to Blog Board
    
  #TC7
  Scenario: Btn Help is Clickable
    Given Go to Website
    When Btn Help is Click
    Then Direct to Help Board
    
  #TC8
  Scenario: Btn SignUp is Clickable
    Given Go to Website
    When Btn SignUp is Click
    Then Direct to SignUp Board
    
  #TC9
  Scenario: Btn LogIn is Clickable
    Given Go to Website
    When Btn Help is Click
    Then Direct to Login Board
    
  #TC10
  Scenario: Btn BukaRekeningAnda is Clickable
    Given Go to Website
    And Scroll to Btn BukaRekeningAnda
    When Btn Btn BukaRekeningAnda is Click
    Then Direct to Register Board
    
