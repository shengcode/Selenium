
package selenium_testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Switch_tab{
     public static void main(String[] a) throws InterruptedException{
         /*String driverPath = "C:\\Examples\\SeleniumDrivers\\";
         System.out.println("launching IE browser");
	 System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
        InternetExplorerDriver  driver = new InternetExplorerDriver(); */
         System.setProperty("webdriver.chrome.driver", "C:\\Examples\\SeleniumJars\\chromedriver75.exe");
         WebDriver driver =new ChromeDriver();
        //open URL
                driver.get("http://www.seleniumpoint.com/testwebsite.php");

                //maximize the window
                driver.manage().window().maximize();

                //login to test web site
                driver.findElement(By.id("remail")).sendKeys("test@seleniumpoint.com ");
                driver.findElement(By.id("rpassword")).sendKeys("test@123");
                driver.findElement(By.id("rsubmit")).click();

                Thread.sleep(4000);

                //First Get parent window,means current window handle
                String parentWindow=driver.getWindowHandle();
                System.out.println("Parent Window Title "+driver.getTitle());

                //click on View link of second product to open window: Bag
                driver.findElement(By.xpath("//div[@class='product2View']/a")).click();

                //Now here is the New Tab handling code

                //Get All Tabs or Window handles and iterate using for each loop
                for(String handle:driver.getWindowHandles())
                {
                System.out.println(handle);
                driver.switchTo().window(handle);

            }

            //Click on Cart Button
            driver.findElement(By.xpath("//button")).click();

            //Go back to Parent window
            driver.switchTo().window(parentWindow);
        }

    }
            
