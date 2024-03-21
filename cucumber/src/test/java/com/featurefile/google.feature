
  Feature: google search functionality
  
  Scenario Outline: google search
       Given  go to the google home page
        When  I want to search a step with as "<search>  "
        Then navigate to the appropriate page
        
    Examples: 
    
      | search  |
      | amazon  |   
      |flipkart | 
      | myntra  |   
