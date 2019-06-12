/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ImplicitWait {
    protected WebDriver dirver;
    public ImplicitWait() {
    }
    @Test
     public void ImplicitWaitTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Examples\\SeleniumJars\\chromedriver75.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        String eTitle="Demo Guru99 Page";
        String aTitle="";
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        aTitle=driver.getTitle();
        System.out.println(aTitle);
        if(aTitle.equals(eTitle)){
            System.out.println("test passed");        
        }else{
            System.out.println("test failed");
        }
        driver.close();
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
