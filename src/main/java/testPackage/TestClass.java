package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import base.CustomDriver;

import pageClasses.HomePage;

public class TestClass {

	public static void main(String[] args) {
		
		WebDriver driver;
	    HomePage hp;
	    CustomDriver cd;
	    String baseURL ="https://smartbytes.v-logics.com/ocart/index.php?route=common/home";
	   // String baseURL ="https://letskodeit.com/automationpractice/";
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\suman\\eclipse-workspace\\smartbytesUIproject\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(baseURL);

	    WebElement aboutUs = driver.findElement(By.linkText("About Us"));
	    aboutUs.click();
	     

	}

}
