package com.syntel.calculatorTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array_of_parameters_test {
    
    @DataProvider (name="LoginData")
    public static Object[][]loginData(){
        return new Object[][]{{"user1","pass1"},{"user2","pass2"}};
    }
    
    @Test (dataProvider="LoginData")
    public void dataProviderTest(String username, String password) {
        System.out.println("Test is started.....");
        System.out.println("Username: "+ username);
        System.out.println("Password: "+ password);
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
