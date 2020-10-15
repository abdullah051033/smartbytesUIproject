package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.CustomDriver;

public class HomePage {

	
	public WebDriver driver;
	public CustomDriver cd;
	public LoginPage Logp;
	
    public HomePage(WebDriver driver){
    	this.driver = driver;
    	PageFactory.initElements(driver, this); 	
    	cd = new CustomDriver(driver);
    	Logp = new LoginPage(driver);
    }
    
    
    @FindBy(linkText ="About Us")
    private WebElement aboutUS;
    
    @FindBy(linkText = "login") private WebElement loginLnk;
    
    
    
    public void loginIntoAccount() {
    	cd.elementClick(loginLnk, "loginLink");
    	Logp.loginIntoAccount();
    	
    }

    
    
    public AboutUS aboutUsVerify() {
    	cd.elementClick(aboutUS, "aboutUS");
    	aboutUS.click();
    	cd.getTitle();
    	cd.getTxt(aboutUS, "about US button");
    	cd.getURL();   	
    	System.out.println("product option clicked from -- HomePage ->aboutUsVerify method ");
    	return new AboutUS(driver);
    }
    
    
    
    
    
    
    
    

}
