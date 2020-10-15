package pageClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CustomDriver;

public class AboutUS {

	WebDriver driver;
	CustomDriver cd;
	
	public AboutUS(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		cd = new CustomDriver(driver);
	}
	
	
	@FindBy(linkText  = "About Us")
	private WebElement aboutUsLnk;
	
	@FindBy(tagName = "a")
	private List <WebElement> links;
	
	@FindBy(xpath = "//*[@id='content']/h1")
	private WebElement aboutUsFlag;
	
	
	
	public void aboutUsPageLinksVarification() {
		for(int i=0; i< links.size(); i++) {
			System.out.println("Links found :" +i+ " :> " +links.get(i).getAttribute("href"));
		}
	}
	
	
	public String aboutUsFlagValidation() {
		return cd.getTxt(aboutUsFlag, "Abdout US flag");
	}
	
	
	
}
