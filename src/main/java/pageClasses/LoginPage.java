package pageClasses;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;
import base.CustomDriver;
import utilities.Constants;


public class LoginPage extends BasePage{
	private static final Logger logger = LogManager.getLogger(LoginPage.class.getName());
	private WebDriver driver;
	private CustomDriver cd;
	
	
	//constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 cd = new CustomDriver(driver);
	}
	
		
	//wevelements
	@FindBy(name = "email") private WebElement emailAddressBox;	
	@FindBy(name = "password") private WebElement passwordBox;	
	@FindBy(xpath = "//input[@type='submit']") private WebElement loginBtn;
	@FindBy(id = "notification" ) private WebElement warning;
		
	public HomePage loginIntoAccount() {
		logger.info("Loggin into account ............................");
		emailAddressBox.sendKeys(Constants.USER_NAME);
		passwordBox.sendKeys(Constants.PASSWORD);
		cd.elementClick(loginBtn, "loginbtn");
		logger.info("Loged in into Account............................");
		return new HomePage(driver);
		
	}
	
	
	
	

}
