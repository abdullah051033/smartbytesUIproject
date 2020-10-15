package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pageClasses.HomePage;


public class BaseTest {

	public WebDriver driver;
    protected HomePage hp;
    public CustomDriver cd;
    protected String baseURL ="https://smartbytes.v-logics.com/ocart/index.php?route=common/home";
    //protected String baseURL ="https://letskodeit.com/automationpractice/";
    
    
    @BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
    public void commonSetUp(String browser){
        driver = WebDriverFactory.getInstance().getDriver(browser);
        driver.get(baseURL);
    } 



    @AfterClass(alwaysRun = true)
    public void commonTearDown(){
        WebDriverFactory.getInstance().quitDriver();
    }
}
