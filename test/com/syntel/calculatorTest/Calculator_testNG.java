package com.syntel.calculatorTest;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium_testng.Calculator;

public class Calculator_testNG {
    
    public Calculator_testNG() {
        
    }
    //private static Calculator c;
    @Test
    public void testAddPositives() {
        Calculator c=new Calculator();
        int expected=30;
        assertEquals(c.addValues(10, 20), expected);
        c=null;
    }
    
    @Test
    public void testAddNegatvie() {
        Calculator c=new Calculator();
        int expected=-30;
        assertEquals(c.addValues(-10, -20), expected);
        c=null;
    }
    
    @Test
    public void testSubPositives() {
        Calculator c=new Calculator();
        int expected=30;
        assertEquals(c.subtractValues(60, 30), expected);
        c=null;
    }
    
    @Test
    public void testSubNegatvie() {
        Calculator c=new Calculator();
        int expected=-30;
        assertEquals(c.subtractValues(-30, 20), expected);
        c=null;
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
       // c=new Calculator();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        //c=null;
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
