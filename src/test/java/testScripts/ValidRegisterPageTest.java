package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.PincodePage;
import pageObjects.RegisterPage;

public class ValidRegisterPageTest extends BaseTest
{
	@Test
	public void testValidRegisterPageTest() throws InterruptedException
	{
		RegisterPage r=new RegisterPage(driver);
		PincodePage p=new PincodePage(driver);
		driver.manage().window().maximize();
		p.setStroreCode("4");
		p.clickProceedStore();
		Thread.sleep(5000);
		r.clickOnRegisterHome();
		Thread.sleep(3000);
		r.setRegisterMobileText("9035362206");
		r.clickOnGetcodeButton();
	    Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	    int nr=Excel.getRowCount("./testdata/ValidRegisterPage.xlsx","Sheet1");
	    Thread.sleep(40000);

	    for(int i=1;i<nr;i++)
	    {
	     
	     String s=Excel.getCellValue("./testdata/ValidRegisterPage.xlsx", "Sheet1", i, 0);
	       Thread.sleep(3000); 
	        r.setPassWordText(s);
	    	Thread.sleep(3000);
	    	r.setConfirmPassWordText(s);
	    	Thread.sleep(3000);
	    	r.isEnableRegister();
	    	Thread.sleep(3000);
	    	r.clickRegisterButton();
	    }
	    
	    
		
	}
	


}
