package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;
import base.CustomDriver;

public class HomePage extends BasePage{

	public WebDriver driver;
	public CustomDriver cd;
	public LoginPage Logp;
	
    public HomePage(WebDriver driver){
    	super(driver);                  //we are inheriting from Base Page to use common method from 
    	this.driver = driver;          // that class that is why need to pass the driver using super ()
    	PageFactory.initElements(driver, this); 	
    	cd = new CustomDriver(driver);
    	Logp = new LoginPage(driver);   	
    }
    
    
    @FindBy(linkText ="About Us")  private WebElement aboutUS;  
    @FindBy(linkText = "login")  private WebElement loginLnk;   
    @FindBy(xpath = "//*[@id=\"container\"]/div[4]" )  private WebElement warning;
    
    
    public String loginIntoAccount() {
    	cd.elementClick(loginLnk, "loginLink");
    	HomePage hP = Logp.loginIntoAccount();
     	String warn = hP.warning.getText();
     	return warn;
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
