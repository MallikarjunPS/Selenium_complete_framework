package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.PincodePage;

public class ValidLoginPageTest extends BaseTest
{
   @Test
   	public void testValidLoginPage() throws InterruptedException
   	{
	   	PincodePage p= new PincodePage(driver);
	   	LoginPage l= new LoginPage(driver);
	   
	    driver.manage().window().maximize();
	   	int rc=Excel.getRowCount("./testdata/ValidLoginPage.xlsx", "sheet1");
	   	p.setStroreCode("4");
	   	p.clickProceedStore();
	   
	   		for(int i=1;i<=rc;i++)
	   		{
	   			  
				   Thread.sleep(3000);
				   l.clickLoginPop();
				   String mn=Excel.getCellValue("./testdata/ValidLoginPage.xlsx", "sheet1", i, 0);  
				   l.setMobileNumber(mn);  
				   String pw=Excel.getCellValue("./testdata/ValidloginPage.xlsx", "sheet1", i, 1); 
				   l.setPassword(pw);
				   l.clickLoginButton();
				  
			}
	   }
}
