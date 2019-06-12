
import com.syntel.calculatorTest.MydataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author syntel
 */
public class WebManipulateTest {
    static WebDriver driver;
    
    public WebManipulateTest() {
    }

    

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Examples\\SeleniumJars\\chromedriver75.exe");
         driver =new ChromeDriver();
         driver.get("http://www.calculatorsoup.com/calculators/time/date-difference-calculator.php");
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
    /*
    @Test
    public void test1() {
        driver.findElement(By.xpath("//*[@id='d_0']")).clear();
        driver.findElement(By.xpath("//*[@id='d_0']")).sendKeys("01/01/2017");
        driver.findElement(By.xpath("//*[@id='d_1']")).clear();
        driver.findElement(By.xpath("//*[@id='d_1']")).sendKeys("04/27/2017");
        driver.findElement(By.xpath("//*[@id='business']")).click();
        driver.findElement(By.xpath("//*[@id='actionCalculate']/input")).click();
        String actual=driver.findElement(By.xpath("//*[@id='answer']")).getText();
        String expected="84 Business Days Difference*\n" +"\n" +"*Holidays are NOT excluded from the calculation.";
        Assert.assertEquals(expected,actual);
    
    }*/
    
    
    
    @Test(dataProvider="WebManipulate_dataProvider", dataProviderClass =WebManipulateDataProvider.class)
    public void test_dataProvider(String date_one, String date_two, String expected) {
        driver.findElement(By.xpath("//*[@id='d_0']")).clear();
        //driver.findElement(By.xpath("//*[@id='d_0']")).sendKeys("01/01/2017");
        driver.findElement(By.xpath("//*[@id='d_0']")).sendKeys(date_one);
        driver.findElement(By.xpath("//*[@id='d_1']")).clear();
        //driver.findElement(By.xpath("//*[@id='d_1']")).sendKeys("04/27/2017");
        driver.findElement(By.xpath("//*[@id='d_1']")).sendKeys(date_two);
        driver.findElement(By.xpath("//*[@id='business']")).click();
        driver.findElement(By.xpath("//*[@id='actionCalculate']/input")).click();
        String actual=driver.findElement(By.xpath("//*[@id='answer']")).getText();
        System.out.println(actual);
        //String expected="84 Business Days Difference*\n" +"\n" +"*Holidays are NOT excluded from the calculation.";
        Assert.assertEquals(expected,actual);
    
    }
}
