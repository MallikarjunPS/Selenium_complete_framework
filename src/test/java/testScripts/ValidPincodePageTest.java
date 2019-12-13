package testScripts;


import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.PincodePage;

public class ValidPincodePageTest extends BaseTest
{
	

	@Test
    public void testValidPincodePage() throws InterruptedException
   {   
		int nr=Excel.getRowCount("./testdata/ValidPincode.xlsx", "sheet1");
		PincodePage p= new PincodePage(driver);
		driver.manage().window().maximize();
		
	 
			for(int j=1;j<=nr;j++)
			{
				String s = Excel.getCellValue("./testdata/ValidPincode.xlsx", "Sheet1", j, 0);
				
				Thread.sleep(3000);
			    p.setStroreCode(s);
			    p.clickProceedStore();
			    Thread.sleep(3000);
			    p.clickChange();
			    driver.navigate().refresh();
			}
  
		

   
   	}
}