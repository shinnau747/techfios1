package steps;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDef extends TestBase {
	
	LoginPage loginPage;
	
	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);	
	}
	
	@Given("^User is on the Techfios login page$")
	public void user_is_on_the_techfios_login_page() throws Throwable{
		driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable{
		loginPage.enterUserName(username);
		Thread.sleep(3000);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginPage.enterPassword(password);
		Thread.sleep(3000);
	}

	@And("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		loginPage.clickSignInButton();
		Thread.sleep(3000);
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
		String actualTitle = loginPage.getPageTitle();
		String expectedTitle = "Dashboard- iBilling";
		Assert.assertEquals("Page titles not matching!",expectedTitle, actualTitle);
		takeScreenshot(driver);
		Thread.sleep(3000);
	}
	
	@Given("^User clicks on Bank and Cash$")
	public void user_clicks_on_bank_and_cash() throws Throwable {
		loginPage.clickOnBankandCashElement();
		Thread.sleep(3000);
	}
	
	@When("^User clicks on New Account$")
	public void user_clicks_on_new_account() throws Throwable {
		loginPage.clickOnNewAccount();
		Thread.sleep(3000);
	}
	
	@When("^User enters Account Title as \"([^\"]*)\"$") 
	public void user_enters_account_title_as(String accountTitle) throws Throwable {
		loginPage.enterAccount(accountTitle);
		Thread.sleep(1000);
	} 
	
	@When("^User enters Description as \"([^\"]*)\"$")
	public void user_enters_description_as(String description) throws Throwable {
		loginPage.enterDescription(description);
		Thread.sleep(1000);
		
	}
	
	@When("^User enters Initial Balance \"([^\"]*)\"$")
	public void user_enters_Initial_Balance(String balance) throws Throwable {
		loginPage.enterBalance(balance); 
		Thread.sleep(1000);
	}

	@When("^User enters Account Number \"([^\"]*)\"$")
	public void user_enters_Account_Number(String accountnumber) throws Throwable {
		loginPage.enterAccountNumber(accountnumber);
		Thread.sleep(1000);
	}

	@When("^User enters Contact Person \"([^\"]*)\"$")
	public void user_enters_Contact_Person(String contactperson) throws Throwable {
		loginPage.enterContactPerson(contactperson);
		Thread.sleep(1000);
	}

	@When("^User enters Phone \"([^\"]*)\"$")
	public void user_enters_Phone(String phonenum) throws Throwable {
		loginPage.enterContactPhone(phonenum);
		Thread.sleep(1000);
	}

	@When("^User enters Internet Banking URL \"([^\"]*)\"$")
	public void user_enters_internet_banking_url(String url) throws Throwable {
		loginPage.enterUrl(url);
		Thread.sleep(1000);
	}

	@And("^User clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable	{
		loginPage.clickOnSubmitButton();
		Thread.sleep(1000);
	}
	
	@Then("^User should land on Accounts page$")
	public void user_should_land_on_accounts_page () throws Throwable{
		String actualTitle = loginPage.getPageTitle();
		String expectedTitle = "Accounts- iBilling";
		Assert.assertEquals("Page titles not matching!",expectedTitle, actualTitle);
		takeScreenshot(driver);
		Thread.sleep(3000);
	}
	
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
