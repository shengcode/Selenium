package selenium_testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
String driverPath = "C:\\Examples\\SeleniumJars and Drivers\\BrowserDrivers\\";
         System.out.println("launching IE browser");
        System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
         InternetExplorerDriver  driver = new InternetExplorerDriver();
*/

public class CheckLinks {
    static int linkCount=0;
    public static void main(String[] a){
        System.setProperty("webdriver.chrome.driver", "C:\\Examples\\SeleniumJars\\chromedriver75.exe");
        WebDriver driver =new ChromeDriver();
         //Open URL
        driver.get("http://www.seleniumpoint.com");
        //Get links in for each loop
        for(WebElement links : driver.findElements(By.tagName("a"))){
            System.out.println(links.getText());
            linkCount++;
        }
        //Print Link Count
        System.out.println("Total Links on Page : "+linkCount);
    }
}
 

