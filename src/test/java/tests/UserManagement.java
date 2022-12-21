package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.DashboradPage;
import pages.LoginPage;
import utils.Driver;
import utils.TestDataReader;

public class UserManagement {
	
	
	  @Test
	  public void validLogin() {
		  /*
		   * Scenario: Successful log in
	         Given user is on the login page
	         When user enters valid username and password
	         And click login button
	         Then user should be on the dashboard page
		   */
		  
		  Driver.getDriver().get(TestDataReader.getProperty("craterUrl"));
		  LoginPage loginpage = new LoginPage();
		 
		  loginpage.useremail.sendKeys(TestDataReader.getProperty("craterValidUserEmail"));
		  loginpage.password.sendKeys(TestDataReader.getProperty("craterValidPassword"));
		  loginpage.loginButton.click();
		  
		  // verify the amount due element display
		 DashboradPage dashboardPage = new DashboradPage ();
		  Assert.assertTrue(dashboardPage.amountDueText.isDisplayed()); 
		  
		  // verify that the url contains dashboard
		  
		  String dashboardUrl = Driver.getDriver().getCurrentUrl();
		  Assert.assertTrue(dashboardUrl.contains("dashboard"));
	  }
	  
	  @BeforeMethod
	  public void setup() {
		  Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }

	  @AfterMethod
	  public void tearDown() {
		  Driver.quitDriver();
	  }

}
