package testClasses;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pageClasses.AboutUS;
import pageClasses.HomePage;


public class TestClass extends BaseTest{

   private static final Logger logger = LogManager.getLogger(TestClass.class.getName());       //(LoggingFile.class.getName());   
   public HomePage homeP;
	
	
   @Test (priority = 2 , enabled = true, groups = {"smoke","regression"})
   public void verifyAboutUSpage(){	    	    	
	   System.out.println("veryAboutUsPage test started ..........successfully...............");   
	   homeP = new HomePage(driver);   
	   AboutUS abtUs = homeP.aboutUsVerify();
	   abtUs.aboutUsPageLinksVarification();
	   String aboutUsFlagText= abtUs.aboutUsFlagValidation();
   
	   if(aboutUsFlagText.contains("About U")) {
		   System.out.println("Expected flag :: " +aboutUsFlagText +" found in the page");
		   logger.info("about us flag verify pass....................................");
	   }else Assert.fail();
		   System.out.println("not found !!!!!"); 		
	   System.out.println("veryAboutUsPage test ended .......................................");     
   } 
   
   
   
   @Test(priority = 1, groups = {"smoke", "regression"})
   public void loginVerify() {
	   logger.info("Login varify Test Started......................................");
	   homeP = new HomePage(driver);
	   String warning= homeP.loginIntoAccount();
	   if(warning.contains("Warning: No match for E-Mail Address and/or Password.")) {
		   logger.info("login verify fail ");
		   Assert.assertEquals(warning, "");	   
	   }else logger.info("Login varify Test Passed ......................................");
	   
   }

   
   @Test(priority = 3, groups = {"regression"})
   public void regressionTest1() {
	   logger.info("regression Test1 Started......................................");
	   logger.info("regression Test1 end..........................................");
   }
   
   
   
   
   @Test(priority = 4, enabled = true, groups = {"regression"})
   public void regressionTest2() {
	   logger.info("regression Test2 Started......................................");
	   logger.info("regression Test2 end..........................................");
   }
   

	
	
}
