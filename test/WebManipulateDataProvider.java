


import org.testng.annotations.DataProvider;

public class WebManipulateDataProvider {
    @DataProvider(name="WebManipulate_dataProvider")
   public static Object[][] getDataFromDataProvider(){
       return new Object[][]{
           {"01/01/2017","04/27/2017","84 Business Days Difference*\n" +"\n" +"*Holidays are NOT excluded from the calculation."},
           {"04/25/2019","06/14/2019","lalal"},
           {"08/09/2017","12/31/2017","lalal"}
       };
   }
}
