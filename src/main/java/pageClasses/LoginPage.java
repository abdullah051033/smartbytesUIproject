package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CustomDriver;

public class LoginPage {
	
	private WebDriver driver;
	private CustomDriver cd;
	
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 cd = new CustomDriver(driver);
	}
	
		
	//wevelements
	@FindBy(name = "email") private WebElement emailAddressBox;	
	@FindBy(name = "password") private WebElement passwordBox;	
	@FindBy(xpath = "//input[@type='submit']") private WebElement loginBtn;
	
		
	public void loginIntoAccount() {
		emailAddressBox.sendKeys("abdullah051033@gmail.com");
		passwordBox.sendKeys("smartbytespasswd01");
		cd.elementClick(loginBtn, "loginbtn");
		
	}
	
	
	
	

}
