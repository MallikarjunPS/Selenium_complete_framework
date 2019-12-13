package testScripts;


import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.*;

public class ValidMyCartPageTest extends BaseTest
{
	
	@Test
	public void testMyCartPage() throws InterruptedException
	{
	
	MyCartPage mc=new MyCartPage(driver);
	PincodePage p=new PincodePage(driver);
	LoginPage l=new LoginPage(driver);
	HomePage h=new HomePage(driver);
	CheckOutPage c= new CheckOutPage(driver);
	
	driver.manage().window().maximize();
	p.setStroreCode("4");
  	p.clickProceedStore();
    Thread.sleep(3000);
    l.clickLoginPop();
    Thread.sleep(1000);
    l.setMobileNumber("9035362206");
    l.setPassword("Arjun@199");
    l.clickLoginButton();
	Thread.sleep(4000);
	mc.clickOnMyCartButton();
    mc.verifyNoItemMessage();
    h.clickAddToCart();
    Thread.sleep(3000);
    mc.clickOnMyCartButton();
    mc.clickOnGotoCartSymbol();
    Thread.sleep(3000);
    c.clickOnProceedToCheckOut();
    mc.verifyAll(driver, "http://myshopboxtest.in/instant/checkout/");
    driver.navigate().back();
   	Thread.sleep(3000);
   	mc.clickOnUpdateShoppingCart();
   	
   	int nr1= Excel.getRowCount("./testdata/ValidMyCartPage.xlsx", "Sheet2");
    
    
    for(int i=1;i<=nr1;i++)
    {
    	Thread.sleep(3000);
    	String s=Excel.getCellValue("./testdata/ValidMyCartPage.xlsx", "Sheet2", i, 0);
    	mc.clickOnApplyDiscountCode();
    	mc.setCoupnCode(s);
    	mc.clickOnApplyDiscountButton();
    	mc.verifyCouponSuccessfullMsg(driver, "You used coupon code \"off10\".");
    	mc.clickOnApplyDiscountCode();
    	mc.setCoupnCode(s);
    	mc.clickOnCancelCouponButton();
    	mc.verifyCouponSuccessfullMsg(driver, "You canceled the coupon code.");
    }
    
   		mc.clickOnDleleteIconMyCartPage();
   		mc.verifyMsg();
   		mc.verifyClickHere(driver);
    
    
	}
	

}
