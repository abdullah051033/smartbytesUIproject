package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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
    
    
    //BrowserStack code
  public static final String USERNAME = "mamunm1";
  public static final String AUTOMATE_KEY = "D1VxNCnbsxzoNJsYM9Kx";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
      
    @BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
    public void commonSetUp(String browser) throws IOException{
//    	FileInputStream fis= new FileInputStream(Constants.PROPERTIES_FILE_PATH);
//    	prop= new Properties();
//    	prop.load(fis);  	
//        driver = WebDriverFactory.getInstance().getDriver(browser);
//        driver.get(prop.getProperty("baseURL"));
        
        //to run in grid node please uncomment following lines 
//        String baseUrl="https://smartbytes.v-logics.com/ocart/index.php?route=common/home";
//        String nodeURL = "http://192.168.1.110:5555/wd/hub";
//        DesiredCapabilities caps= DesiredCapabilities.firefox();
//        caps.setBrowserName("firefox");
//        caps.setPlatform(Platform.LINUX);
//        driver = new RemoteWebDriver(new URL(nodeURL), caps);
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        
    	//to run in BrowserStack uncomment the following code . BrowserStack is cloud platform to run Selenium Grid
    	DesiredCapabilities caps = new DesiredCapabilities();      
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "76.0");
              
        driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("https://smartbytes.v-logics.com/ocart/index.php?route=common/home");
    } 	


    @AfterClass(alwaysRun = true)
    public void commonTearDown(){
    	//driver.quit();
       // WebDriverFactory.getInstance().quitDriver();
    }
}
