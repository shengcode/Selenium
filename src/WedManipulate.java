
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class WedManipulate {
     public static void main(String[] a){
        //System.setProperty("webdriver.gecko.driver", "C:\\Examples\\SeleniumJars\\BrowserDrivers\\BrowserDrivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Examples\\SeleniumJars\\chromedriver75.exe");
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.calculator.net");
        driver.findElement(By.linkText("Loan Calculator")).click();
        driver.findElement(By.id("cloanamount")).clear();
        driver.findElement(By.id("cloanamount")).sendKeys("238300");
        driver.findElement(By.xpath("//*[@id='cloanterm']")).clear();
        driver.findElement(By.xpath("//*[@id='cloanterm']")).sendKeys("7");
        driver.findElement(By.id("cloantermmonth")).clear();
        driver.findElement(By.id("cloantermmonth")).sendKeys("2");
        driver.findElement(By.id("cinterestrate")).clear();
        driver.findElement(By.id("cinterestrate")).sendKeys("4");
        Select dropdown1= new Select (driver.findElement(By.id("ccompound")));
        dropdown1.selectByVisibleText("Weekly");
        Select dropdown2= new Select (driver.findElement(By.id("cpayback")));
        dropdown2.selectByIndex(1);
        driver.findElement(By.xpath("//*[@id='calinputtable']/tbody/tr[7]/td/input")).click();
        String payment= driver.findElement
(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/b")).getText();
        System.out.println("payment: "+payment);
        System.out.println("total intrest: "+ driver.findElement
(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/b")).getText());
        driver.quit();
    }


}
