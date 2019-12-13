package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.PincodePage;

public class InvalidPincodePageTest extends BaseTest
{
  @Test
 public void testInvalidPincodePage() throws InterruptedException
 {
	PincodePage p= new PincodePage(driver);
	int nr=Excel.getRowCount("./testdata/InValidPincode.xlsx","sheet1");
	
	
		for(int j=1;j<=nr;j++)
		{
		   String s= Excel.getCellValue("./testdata/InValidPincode.xlsx", "sheet1", j,0);
		   p.setStroreCode(s);
		   p.clickProceedStore();
		   Thread.sleep(3000);
		   driver.switchTo().alert().accept();
		   p.clearStoreCode();
		 
		  
		}
	}
	
	
 }




