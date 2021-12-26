Feature: TechFios Login functionality validation 

Scenario: 1 User should be able to login with valid credentials 
	Given User is on the Techfios login page   
	When User enters username as "demo@techfios.com"    
	When User enters password as "abc123"
	And User clicks on signin button
	Then User should land on dashboard page
	
	

	
	Given User clicks on Bank and Cash
	When User clicks on New Account
	When User enters Account Title as "learncucumber"
	When User enters Description as "ghghghsdhghgj" 
	When User enters Initial Balance "56677884" 
	When User enters Account Number "74867984"
	When User enters Contact Person "danhjg"      
	When User enters Phone "637487678"   
	When User enters Internet Banking URL "www.ghgjhhhj.com"       
	And User clicks on submit button
	Then User should land on Accounts page  
	
	
#Scenario: 2 User should not be able to login with invalid password
#	Given User is on the Techfios login page  
#	When User enters username as "demo@techfios.com"    
#	When User enters password as "abc124"
#	And User clicks on signin button
#	Then User should land on dashboard page
	
#Scenario: 3 User should not be able to login with invalid username
#	Given User is on the Techfios login page  
#	When User enters username as "demo4@techfios.com"    
#	When User enters password as "abc124"
#	And User clicks on signin button
#	Then User should land on dashboard page
	