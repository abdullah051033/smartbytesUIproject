package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pageClasses.HomePage;
import utilities.Constants;



public class BaseTest {

	public WebDriver driver;
    protected HomePage hp;
    public CustomDriver cd;
    public static Properties prop;
    
    
    
    @BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
    public void commonSetUp(String browser) throws IOException{
    	FileInputStream fis= new FileInputStream(Constants.PROPERTIES_FILE_PATH);
    	prop= new Properties();
    	prop.load(fis);  	
        driver = WebDriverFactory.getInstance().getDriver(browser);
        driver.get(prop.getProperty("baseURL"));
    } 



    @AfterClass(alwaysRun = true)
    public void commonTearDown(){
        WebDriverFactory.getInstance().quitDriver();
    }
}
