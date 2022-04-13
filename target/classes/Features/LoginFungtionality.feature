@LoginFungtionality
Feature: Verify Login Fungtionality on Website Stokbit 
     
  #TC_1  
  Scenario: Login successful with valid Username and valid Password
    Given User is on login page Website  
    When User enter valid userName
    	And User enter valid password
    	And User click button Login
    Then User redirected to dashboard
    
  #TC_2  
  Scenario: Cannot Login with invalid Username and valid Password
    Given User is on login page Website  
    When User enter invalid userName
    	And User enter valid password
    	And User click button Login
    Then Get invalid user Message
    
  #TC_3  
  Scenario: Cannot Login with valid Username and invalid Password
    Given User is on login page Website  
    When User enter valid userName
    	And User enter invalid password
    	And User click button Login
    Then Get wrong password message
    
  #TC_4  
  Scenario: Cannot Login with invalid Username and invalid Password
    Given User is on login page Website  
    When User enter invalid userName
    	And User enter invalid password
    	And User click button Login
    Then Get invalid user Message