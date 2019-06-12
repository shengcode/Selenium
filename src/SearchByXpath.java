
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SearchByXpath {
 
     public static void main(String[] a){    
         //String driverPath = "C:\\Examples\\SeleniumJars\\BrowserDrivers\\BrowserDrivers\\";
         
         System.setProperty("webdriver.chrome.driver", "C:\\Examples\\SeleniumJars\\chromedriver75.exe");
         //System.out.println("launching IE browser");
         //System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
         //InternetExplorerDriver  driver = new InternetExplorerDriver();
         WebDriver driver =new ChromeDriver();
         driver.get("http://www.calculatorsoup.com/calculators/time/date-difference-calculator.php");
        driver.findElement(By.xpath("//*[@id='d_0']")).clear();
        driver.findElement(By.xpath("//*[@id='d_0']")).sendKeys("01/01/2017");
        driver.findElement(By.xpath("//*[@id='d_1']")).clear();
        driver.findElement(By.xpath("//*[@id='d_1']")).sendKeys("04/27/2017");
        driver.findElement(By.xpath("//*[@id='business']")).click();
        driver.findElement(By.xpath("//*[@id='actionCalculate']/input")).click();
        System.out.println("Answer: "+driver.findElement(By.xpath("//*[@id='answer']")).getText());        
 }
}

