
package com.syntel.calculatorTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Browser_test {
    WebDriver driver;
    
    public Browser_test() {      
    
    }
  
   @BeforeTest
   public void setUp(){
       //System.setProperties("webdriver.chrome.driver", "C:\\Users\\syntel\\Downloads\\chromedriver_win32\\chromedriver.exe");
       System.setProperty("webdriver.chrome.driver", "C:\\Examples\\SeleniumJars\\chromedriver75.exe");
       driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.google.com");
   }
   
   //dataProviderClass=DataProvider_test_class.class
   //, dataProviderClass = DataProvider.class dataProviderClass = 
    @Test(dataProvider="SearchProvider", dataProviderClass =MydataProvider.class)
    public void testMethod(String author, String searchKey) throws InterruptedException {
        WebElement searchText=driver.findElement(By.name("q"));
        searchText.sendKeys(searchKey);
        System.out.println("Welcome-->"+author+ " Your search key is---> "+ searchKey);
        Thread.sleep(3000);
        String testValue=searchText.getAttribute("value");
        System.out.println(testValue + "::::"+ searchKey);
       searchText.clear();
       Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
    }
   /*@DataProvider(name="SearchProvider")
   public Object[][] getDataFromDataProvider(){
       return new Object[][]{
           {"Samuel","Spring FrameWork"},
           {"Manuella","ReactJS"},
           {"Derek","Selenium"}
       };
   }*/
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
