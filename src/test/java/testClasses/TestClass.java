package testClasses;

import org.testng.annotations.Test;

import base.BaseTest;
import pageClasses.AboutUS;
import pageClasses.HomePage;


public class TestClass extends BaseTest{

   public HomePage homeP;
	
	
   @Test (priority = 2 , enabled = false)
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
   
   
   
   @Test(priority = 1, groups = {"smoke"})
   public void loginVerify() {
	   System.out.println("Login varify Test Started......................................");
	   homeP = new HomePage(driver);
	   homeP.loginIntoAccount();
	   System.out.println("Login varify Test Ended ......................................");
   }

   
   @Test(priority = 3, groups = {"smoke"})
   public void regressionTest1() {
	   System.out.println("regression test1 ran..........");
	   System.out.println("regression test1 end..........");
   }
   
   
   
   
   @Test(priority = 4, enabled = false, groups = {"smoke"})
   public void regressionTest2() {
	   System.out.println("regression test2 ran..........");
	   System.out.println("regression test2 end..........");
   }
   

	
	
}
