Feature: Deploy an existing web app to openshift
	As a DevSecOps practitioner,
	I want to deploy an existing web application to openshift
	So that I can scale it easily

Background:
	Given a
Scenario: Deploy a Java application to openshift
	Given a Java Web App called "petclinic" located here: "https://github.com/drtran/forked-spring-petclinic.git"
	And it was built, deployed and working correctly on a local Wildfly 10.1 server "http://localhost:8080"
	When it is built as a uniquely identified binary image
	And the image is deployed successfully on the openshift
	Then I should be able to use the application the same way as before.