@simple 
Feature: Open the Google 
@application 
Scenario: online shopping scenario description 
	Given Go to automation pratice for shopping 
	And User enter valid credentails 
		| username                   | password     |
		| arvin__sam__1995@gmail.com | sam&aravind  | 
	Then click login button 
	
@application1 
Scenario: T-shirt section scenario description 
	Given  click tshirt option 
	When  click quick view t shirts 
	And  faded tshirt size 
	And  click add a cart 
	And  Proceed checkout all 
	And  shippig section to clear 
	Then  click payements 
