package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.PincodePage;

public class InValidLoginPageTest extends BaseTest

{   
	@Test
		public void testInValidLoginPage () throws InterruptedException
		{
			LoginPage l= new LoginPage(driver);
			PincodePage p=new PincodePage(driver);
		    
			driver.manage().window().maximize();
			p.setStroreCode("4");
			p.clickProceedStore();
			Thread.sleep(3000);
			l.clickLoginPop();
			Thread.sleep(3000);
		    l.clickLoginButton();
		    Thread.sleep(3000);
		    driver.switchTo().alert().accept();
		    
		    int nr=Excel.getRowCount("./testdata/InValidLoginPage.xlsx", "Sheet1");
		    	for(int i=1;i<=nr;i++)
			    {
			    	String mn=Excel.getCellValue("./testdata/InValidLoginPage.xlsx", "Sheet1", i, 0);
			    	l.setMobileNumber(mn);
			    	String pw=Excel.getCellValue("./testdata/InValidLoginPage.xlsx", "Sheet1", i, 1);  
			    	l.setPassword(pw);
			    	l.clickLoginButton();
			    	Thread.sleep(3000);
			    	System.out.println(driver.switchTo().alert().getText()+":" +"PASS");
			    	driver.switchTo().alert().accept();
			    	l.clearMobileNumber();
			    	l.clearPassword();
				}
		}
}
