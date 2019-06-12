

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exam_sample {
   	

	    // Method 1: Open Brower say Firefox			
	    @Test()	
	    public void openBrowser() {				
	        System.out.println("0");			
	    }		

	    // Method 2: Launch Google.com			
	    @Test(priority=1)		
	    public void launchGoogle() {				
	       System.out.println("1");						
	    }		
        
	    // Method 3: Perform a search using "Facebook"			
	    @Test(priority=3)		
	    public void peformSeachAndClick1stLink() {				
	        System.out.println("3");								
	    }		

	    // Method 4: Verify Google search page title.			
	    @Test(priority=2)		
	    public void FaceBookPageTitleVerification() throws Exception {				
	       	System.out.println("2");			
	    }		

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("###this is the before class");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("#####this is the after class");
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.out.println("@@@@@@@this is the before method");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        System.out.println("@@@@@@@this is the after method");
    }
}
