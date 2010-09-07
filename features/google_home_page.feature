Feature: Google homepage testing
	
	Scenario: Title of Google homepage
		Given that I am on the browser start page
		When I go to the website www.google.com.br
		Then the title of page should be "Google"