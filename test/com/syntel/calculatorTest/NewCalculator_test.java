
package com.syntel.calculatorTest;

import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import selenium_testng.Calculator;


public class NewCalculator_test {
    
    public NewCalculator_test() {
    }

    @Parameters({"num1","num2","sum"})
    @Test
    public void testAdd(int num1, int num2, int sum) {
        Calculator c=new Calculator();
        Assert.assertEquals(c.addValues(num1, num2), sum);
    }
    
    @Parameters({"num1","num2","difference"})
    @Test
    public void testSub(int num1, int num2, int difference) {
        Calculator c=new Calculator();
         Assert.assertEquals(c.subtractValues(num1, num2), difference);
    }
    
   @Parameters({"num1","num2","multiply"})
    @Test
    public void testMulti(int num1, int num2, int multiply) {
        Calculator c=new Calculator();
         Assert.assertEquals(c.multiply(num1, num2), multiply);
    }
    
    @Parameters({"num1","num2","divide"})
    @Test
    public void testDivid(int num1, int num2, int divide) {
        Calculator c=new Calculator();
         Assert.assertEquals(c.divide(num1, num2), divide);
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
