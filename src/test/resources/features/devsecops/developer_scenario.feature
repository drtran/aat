Feature: Complete my user story and tag my release
	As a Developer, 
	I want to be be able to push my code to a source repo and tag it
	So that I can selectively release features my customer needs.
	
Scenario: check in and tag for my release
	Given I complete a user story
	# i ran all unit tests and nothing is broken
	# my code has appropriate level of unit test
	# the code coverage is the same or better when I first worked on it.
	# automated tests are completed for the user story
	# i ran all the automated tests against my personal built and nothing is broken
	# i pair-programmed or had someone else review my code.
	When I check in and tag my changes with a unique tag id
	# I pull & merge with other changes
	# I then push it up to the central source repository
	# I tag with a unique tag id.
	Then I should be able to pull back the code in the future based on that unique id.
	# I can clone with a --branch flag pointing to that particular unique tag id.
	
	
Scenario: Build an image with a unique tag
	Given I was informed a that a tag "6.7.3" is potentially shippable product increment
	When I use OpenShift docker image creation pointing to the branch tagged by "6.7.3"
	Then I should be able to have a docker image that can be deployed in an OpenShift platform
	