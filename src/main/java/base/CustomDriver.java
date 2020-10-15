package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomDriver {

	 public WebDriver driver;


	    public CustomDriver(WebDriver driver){
	        this.driver = driver;
	    }


	    public String getTxt(WebElement element, String info){
	        System.out.println("getting text for Element : " +info);

	        String text = null;
	        text = element.getText();
	        if (text.length() == 0) {
	            text = element.getAttribute("innerText");  //getAttribute("innerHTML")
	        }
	        if (!text.isEmpty()) {
	            System.out.println(" The text is : " + text);
	        } else {
	            text = "NOT_FOUND";
	        }
	        return text.trim();

	    }

	    public String getTitle(){
	        String title = driver.getTitle();
	        if(title != null){
	            System.out.println("title found for this Page :"  +title);
	        }
	        return  title;
	    }


	    /**
	     * @return Current Browser URL
	     */
	    public String getURL() {
	        String url = driver.getCurrentUrl();
	        System.out.println("Current URL is :: " + url);
	        return url;
	    }



	    public void elementClick(WebElement element, String info){
	        element.click();
	        System.out.println("clicked in element " +element);
	    }



	    /**
	     * Click element with information about element and
	     * time to wait in seconds after click
	     *
	     * @param element - WebElement to perform Click operation
	     * @param info    - information about element
	     */
//	    public void elementClick(WebElement element, String info, long timeToWait) {
//	        try {
//	            element.click();
//	            if (timeToWait == 0) {
//	                System.out.println("Clicked On :: " + info);
//	            } else {
//	                Util.sleep(timeToWait, "Clicked on :: " + info);
//	            }
//	        } catch (Exception e) {
//	            System.out.println("Cannot click on :: " + info);
//	            //takeScreenshot("Click ERROR", "");
//	        }
//	    }

}
