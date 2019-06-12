import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest {
    WebDriver driver;
    public LoginTest() {    }

    @Test
    public void testLogin() throws InterruptedException {
       String loginSuccessTitle= "my Atos Syntel - My Atos Syntel - Login";
       String loginFailTitle= "my Atos Syntel - Login";
       System.setProperty("webdriver.chrome.driver", "C:\\Examples\\SeleniumJars\\chromedriver75.exe");
       driver=new ChromeDriver();
       driver.get("https://www.myatos-syntel.net/web/guest/test?p_p_id=com_liferay_login_web_portlet_LoginPortlet&p_p_lifecycle=0&_com_liferay_login_web_portlet_LoginPortlet_redirect=%2F");
       System.out.println("the old title is");
       System.out.println(driver.getTitle());       
       WebElement userIdInput=driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_kpoUserName"));
       userIdInput.sendKeys("SL5060487");
       WebElement passwordInput=driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_kpoPassword"));
       String correctPassword="correct password"; //if provide my correct password login will success
       passwordInput.sendKeys(correctPassword);
       WebElement signInButton=driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_btn1" ));    
       signInButton.click();
       Thread.sleep(5000);
       String actualTitle=driver.getTitle();
       Assert.assertEquals(actualTitle, loginSuccessTitle);
    }
    

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
