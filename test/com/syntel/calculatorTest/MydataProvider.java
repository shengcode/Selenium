

package com.syntel.calculatorTest;

import org.testng.annotations.DataProvider;
public class MydataProvider {
    
   @DataProvider(name="SearchProvider")
   public static Object[][] getDataFromDataProvider(){
       return new Object[][]{
           {"Samuel","Spring FrameWork"},
           {"Manuella","ReactJS"},
           {"Derek","Selenium"}
       };
   }
}
