package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {
	WebDriver driver; 
	 public LoginPage(WebDriver driver) {
	  this.driver = driver;
	 }
	 // Element Library
	 @FindBy(how = How.XPATH, using = "//input[@id='username']")
	 WebElement UserName;
	 @FindBy(how = How.XPATH, using = "//input[@id='password']")
	 WebElement Password;
	 @FindBy(how = How.XPATH, using = "//button[@name='login']")
	 WebElement SignInButton;
	 @FindBy(how = How.LINK_TEXT, using = "Bank & Cash")
	 WebElement BankandCash;
	 @FindBy(how = How.LINK_TEXT, using = "New Account")
	 WebElement NewAccount;
	 @FindBy(how = How.ID, using = "account")
	 WebElement Account;
	 @FindBy(how = How.ID, using = "description")
	 WebElement Description;
	 @FindBy(how = How.ID, using = "balance")
	 WebElement Balance;
	 @FindBy(how = How.ID, using = "account_number")
	 WebElement AccountNumber;
	 @FindBy(how = How.ID, using = "contact_person")		 
	 WebElement ContactPerson;
	 @FindBy(how = How.ID, using = "contact_phone")
	 WebElement ContactPhone;
	 @FindBy(how = How.ID, using = "ib_url")
	 WebElement Url;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	 WebElement SubmitButton;		
	 
	 public static int generateRandomNum(int i) {
			Random rand = new Random();
			int generatedNum = rand.nextInt(999);
			return generatedNum;
		}
	 
	 
	 // Methods to interact with the elements
	 public void enterUserName(String userName) {
	  UserName.sendKeys(userName);
	 }
	 public void enterPassword(String password) {
	  Password.sendKeys(password);
	 }
	 public void clickSignInButton() {
	  SignInButton.click();
	 }
	 public String getPageTitle() {
	  return driver.getTitle();
	 }
	 public void clickOnBankandCashElement() {
		 BankandCash.click(); 
	 }
	 public void clickOnNewAccount () {
		 NewAccount.click();
	 }
	 public void enterAccount (String accountTitle) {
		 String accountname = accountTitle + generateRandomNum(999);
		 Account.sendKeys(accountname);
	 }
	 public void enterDescription (String description){
		 String accountdescription = description + generateRandomNum(999);
		 Description.sendKeys(accountdescription);
	 }
	 public void enterBalance (String balance) {
		 String accountbalance = balance + generateRandomNum(999);
		 Balance.sendKeys(accountbalance);
	 }
	 public void enterAccountNumber (String accountNumber) {
		 String accountNum = accountNumber + generateRandomNum(999);
		 AccountNumber.sendKeys(accountNum);
	 }
	 public void enterContactPerson (String contactPerson) {
		 String contactname = contactPerson + generateRandomNum(999);
		 ContactPerson.sendKeys(contactname);
	 }
	 public void enterContactPhone (String contactPhone) {
		 String contactTel = contactPhone + generateRandomNum(999);
		 ContactPhone.sendKeys(contactTel);
     }
	 public void enterUrl (String url) {
		 String accounturl = url + generateRandomNum(999);
		 Url.sendKeys(accounturl);
	 }
	 public void clickOnSubmitButton() {
		 SubmitButton.click();
	 }
	
}
