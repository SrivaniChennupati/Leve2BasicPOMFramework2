package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends ProjectSpecificMethods{
	
	
public LoginPage(ChromeDriver driver)
	
	{
		
		this.driver = driver;
		
	}
	
	    
	     public LoginPage enterUserName(String uname)
	     
	     {
	    	 
	    	 driver.findElementById("username").sendKeys(uname);
	    	 
	    	 return this;
	    	 
	     }
	     
	     
	     public LoginPage enterPassWord(String pwd)
	     {
	    	 
	    	 
	    	 driver.findElementById("password").sendKeys(pwd);
	    	 return this;
	    	 
	
          }
	     
	     public HomePage clickLogin()
	     {
	    	 
	    	 driver.findElementByClassName("decorativeSubmit").click();
	    	 
	    	 return new HomePage(driver);
	    	 
	     }

}
