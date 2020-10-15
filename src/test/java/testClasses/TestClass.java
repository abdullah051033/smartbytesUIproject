package testClasses;

import org.testng.annotations.Test;

import base.BaseTest;
import pageClasses.AboutUS;
import pageClasses.HomePage;


public class TestClass extends BaseTest{

   public HomePage homeP;
	
	
   @Test (priority = 2)
   public void verifyAboutUSpage(){	    	    	
   System.out.println("veryAboutUsPage test started ..........successfully...............");   
   homeP = new HomePage(driver);   
   AboutUS abtUs = homeP.aboutUsVerify();
   abtUs.aboutUsPageLinksVarification();
   String aboutUsFlagText= abtUs.aboutUsFlagValidation();
   
   if(aboutUsFlagText.equalsIgnoreCase("About Us")) {
	   System.out.println("Expected flag :: " +aboutUsFlagText +" found in the page");
   }else System.out.println("not found !!!!!");
   		
   System.out.println("veryAboutUsPage test ended .......................................");   
   
   } 
   
   
   
   @Test(priority = 1)
   public void loginVerify() {
	   System.out.println("Login varify Test Started......................................");
	   homeP = new HomePage(driver);
	   homeP.loginIntoAccount();
	   System.out.println("Login varify Test Ended ......................................");
   }


	
	
	
}
