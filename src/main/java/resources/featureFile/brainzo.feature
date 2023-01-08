
Feature: To validate Functionality Brainzo application

Scenario: Validate the Signup functioanlity
Given User have to launch the brainzo application through chrome browser using localhost:300
When  User Successfully Navigate to Home page
And  Click the Signup button 
And Enter the Valid EmailAddress in Text field
And Click the Submit button
And Enter the OTP that has been sent to Registerd Email Address
And Click verify OTP button

When User Successfully Entered their OTP for verifciation
And User have to give their First name and Last name in corressponding Text field
And user have to Enter the Phone number in Phone number Text Box
And user have to Enter the Password in Password and Confirm Password Text field
And User have to Click the Signup button
Then User Successfully navigate to Login page


Scenario: Validate the Signup functioanlity for Mentor
Given User have to launch the brainzo application through chrome browser using localhost:300
When  User get Successfully Navigate to Home page
And  Click the Sign-up button
And Enter the Valid Email-Address in Text field
And Click the Submit  button
And Enter the OTP that has been sent to Registerd Email-Address
And Click verify OTP  button

When User Successfully Entered their OTP for  verifciation
And User have to give their First-name and Last-name in corressponding Text field
And user have to Enter the Phone number in Number Text Box
And user have to Enter the Password in Password and Confirm Password Text field.
And User have to Click the Signup button.
Then User Successfully navigate to Login page.


Scenario: Validate the working of Login Functionality of Mentor
Given User have to launch the brainzo application through chrome browser via using localhost:300
When User have to  click the login button
And User  enter valid username and valid password
And Click login button once again
Then User should be navigate to Add course page

Scenario: Validate the Add course functionality
Given User have to launch the brainzo application through chrome browser via using localhost:300
When User successfully get login as mentor
And User has navigate to add course page 
And User have to fill the course details in corresponding text field
Then Click Addcourse button



Scenario: To validate Login functionality by giving valid credentials
    Given User have to Launch the Brainzo application through chrome browser via using localhost:3000
    When User click the login button
    And User have to enter valid username and valid password
    And Click login button again
    Then User should be in a valid credential page
    
Scenario: To validate the working of Search functionality
   Given User have to Launch the Brainzo application through chrome browser via using localhost:3000
    
    When Enter in to the valid page by using valid credentials
    And  Enter the course name which you want to learn
    And Click search icon to search that course
    Then User should navigate to particular course page
    
Scenario: To Validate the working of Enroll functionality
   Given User have to Launch the Brainzo application through chrome browser via using localhost:3000
    
    When User Select the particular Course
    And User have to click enroll button  
    And click Show QR from payment dialogbox
    Then User is Enrolled with selected course
 
Scenario: Validate the working of Start Learning functionality
   Given User have to Launch the Brainzo application through chrome browser via using localhost:3000

    When User have to login in to application
    And Select the course by click on the course which user wants
    And Click Start Learning button
    And Click on the Video player button
    And Add some comments if your user want to share their feedback
    And Click send Button
    Then Comment is Added
    
Scenario: Validate the My courses functionality
Given User have to launch the brainzo application through chrome browser via using localhost:300
When Login as learner by providing valid credentials
And click the dropdown menu option
And select the my courses
Then courses which are enrolled by learner is displayed    
    
    
    
Scenario: Validate the working of Logout functionality
   Given User have to Launch the Brainzo application through chrome browser via using localhost:3000
    When user have to click the three dots in top right corner of course page
    And click logout option from that dropdown
    Then User successfully logged out
         
      
