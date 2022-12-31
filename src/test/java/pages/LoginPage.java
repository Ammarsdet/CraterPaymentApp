package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (css = "#loginForm > div:nth-child(1) > div > div > input")
	public WebElement useremail;
	
	@FindBy (xpath= "//*[@id=\"loginForm\"]/div[2]/div/div/input")
	public WebElement password;
	
	@FindBy (linkText = "Forgot Password?")
	public WebElement forgotPasswordLink;
	
	@FindBy (xpath = "//button[text()='Login']")
	public WebElement loginButton;
	
	@FindBy (xpath = "//p[contains(text(), 'Copyright @')]")
	public WebElement copyRightText;
	
	@FindBy (xpath = "//h1[contains(text(), 'Simple Invoicing for')]")
	public WebElement businessTagline;
	
	@FindBy (xpath = "//p[contains(text(), 'Crater helps you track expenses')]")
	public WebElement businessSubtext;
	
	@FindBy (xpath = "//p[contains(text(), 'These credentials do not match our records.')]")
	public WebElement invalidUserErrorMessage;
	
	
}
