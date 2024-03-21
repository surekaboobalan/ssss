Feature: Adoctin feature

Scenario: login functionality

Given launch to the browser
When user enter the user name as "surekaboobalan" 
And user enter the password as "7F9ML3"
And user click the login button
Then user should navigate to the search hotel page

Scenario: search hotel

Given select location
When select hotel
When select romm type
When select room nos
When select check in date
When select checkout date
And select adults per room
And select childrens per room
And click search button
Then navigate to the next page 

Scenario: selecthotel

Given user  to click radio_button
When user  to click continue button 
Then navigate to the book a hotel page

Scenario: Book a hotel

Given user to enter the first name & last name 
When user has to enter the adreess
When user has to enter the card no
And select card type,expiry date ,year,& cvv
And click book now button
Then  user has to navigate to the next page


Scenario: cancel hotel 

Given scroll down 
When click the iteracy button
Then navigate to the next page 
# https://adactinhotelapp.com/BookedItinerary.php

Scenario: cancel button1

Given click the check box button which is to be cancelled
When scrooll down 
When click cancel button 
When click ok in alert popup 
Then click logout
 
