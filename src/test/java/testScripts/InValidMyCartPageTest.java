package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MyCartPage;
import pageObjects.PincodePage;

public class InValidMyCartPageTest extends BaseTest
{
	
	@Test
	public void testInValidMyCartPage() throws InterruptedException
	{
	MyCartPage mc=new MyCartPage(driver);
	PincodePage p=new PincodePage(driver);
	LoginPage l=new LoginPage(driver);
	

	
	driver.manage().window().maximize();
	p.setStroreCode("4");
  	p.clickProceedStore();
    Thread.sleep(3000);
    l.clickLoginPop();
    Thread.sleep(1000);
    l.setMobileNumber("9035362206");
    l.setPassword("Arjun@199");
    l.clickLoginButton();
    Thread.sleep(3000);
    mc.clickOnMyCartButton();
    Thread.sleep(2000);
    mc.clickOnGotoCartSymbol();
	
	int nr1= Excel.getRowCount("./testdata/InValidMyCartPage.xlsx", "Sheet2");
    
    
    for(int i=1;i<=nr1;i++)
    {
    	Thread.sleep(3000);
    	String s=Excel.getCellValue("./testdata/InValidMyCartPage.xlsx", "Sheet2", i, 0);
    	mc.clickOnApplyDiscountCode();
    	mc.setCoupnCode(s);
    	mc.clickOnApplyDiscountButton();
    	Thread.sleep(3000);
        mc.verifyCouponErrorMsg();

    	
    }
      
	}

}
