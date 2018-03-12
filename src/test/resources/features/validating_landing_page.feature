Feature: Validating Landing Page 
	As a Admin User for the Pet Clinic
	I want to make sure the landing page contains appropriate information
	So that we can present a professional image for our shop
	
@validating_landing_page 
Scenario: Validating website contians appropriate text 
	Make sure it has the word DevSecOps
	
	Given I am at the landing page "http://localhost:8080/petclinic/" 
	When I view the main heading text 
	Then I should see the word "DevSecOps" 
	
	