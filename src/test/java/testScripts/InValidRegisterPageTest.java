package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.PincodePage;
import pageObjects.RegisterPage;

public class InValidRegisterPageTest extends BaseTest
{
	@Test
	public void testInValidRegister() throws InterruptedException
	{
		RegisterPage r=new RegisterPage(driver);
		PincodePage p=new PincodePage(driver);
		driver.manage().window().maximize();
		
		p.setStroreCode("4");
		p.clickProceedStore();
		Thread.sleep(4000);
//		LoginPage l=new LoginPage(driver);
//		l.clickLoginPop();
//		Thread.sleep(3000);
//		r.clickOnRegisterLogin();
//		Thread.sleep(3000);
//		r.clickOnCloseSymbolLog();
//		driver.navigate().refresh();
//		
		r.clickOnRegisterHome();
		Thread.sleep(3000);
		r.clickOnGetcodeButton();
		driver.switchTo().alert().accept();
	    
		int nr=Excel.getRowCount("./testdata/InValidRegisterMobileNo.xlsx", "Sheet1");
	    for(int i=1;i<=nr;i++)
	    {
	    String s=Excel.getCellValue("./testdata/InValidRegisterMobileNo.xlsx", "Sheet1", i,0 );
		
		r.setRegisterMobileText(s);
		r.clickOnGetcodeButton();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText()+" : "+"PASS");
		driver.switchTo().alert().accept();
		r.clearRegisterMobileText();
	    }
	  
	    r.setRegisterMobileText("9035362206");
	    r.clickOnGetcodeButton();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    
	    
	    int nr1=Excel.getRowCount("./testdata/InValidRegisterEmail.xlsx","Sheet1");
	    Thread.sleep(10000);
	    
	    for(int i=0;i<nr1;i++)
	    {
	     
	     String s=Excel.getCellValue("./testdata/InValidRegisterEmail.xlsx", "Sheet1", i, 0);
	     Thread.sleep(3000);
	     r.setEmailText(s);
	     Thread.sleep(5000);
	     
	     r.verifyEmailErrorMsg();
	     r.clearEmailText();
	    }
	    
	    int nr2=Excel.getRowCount("./testdata/InValidRegisterPassword.xlsx","Sheet1");
	    
	    for(int i=0;i<nr2;i++)
	    {
	    	String s=Excel.getCellValue("./testdata/InValidRegisterPassword.xlsx", "Sheet1", i, 0);
	    	
	    	r.setPassWordText(s);
	    	Thread.sleep(3000);
	    	r.verifyPassWordErrorMsg();
	    	r.clearPassWordText();
	    	
	    }
	    
	    r.isNotEnableRegister();
	    
		
	}

}
