package testScripts;

import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MyDashBoardPage;
import pageObjects.MyOrdersPage;
import pageObjects.PincodePage;
import resources.BaseTest;

public class MyOrdersPageTest  extends BaseTest
{
	@Test
	public void testMyOrdersPage() throws InterruptedException
	{
		PincodePage p= new PincodePage(driver);
		LoginPage l=new LoginPage(driver);
		MyDashBoardPage m= new MyDashBoardPage(driver);
		MyOrdersPage mo= new MyOrdersPage(driver);
		
		driver.manage().window().maximize();
		p.setStroreCode("4");
		p.clickProceedStore();
		Thread.sleep(3000);
		l.clickLoginPop();
		Thread.sleep(3000);
		l.setMobileNumber("9035362206");
		l.setPassword("Arjun@199");
		l.clickLoginButton();
		Thread.sleep(3000);
		m.clickOnMyAccountPop();
		mo.clickOnMyOrdersLink();
		mo.clickOnViewOrderMyOrder();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/sales/order/view/order_id/");
		mo.clickOnReorderViewOrder();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/checkout/cart/");
		driver.navigate().back();
		
		String parentWindow=driver.getWindowHandle();
	
		
		for(String handle:driver.getWindowHandles())
		{
			if(!parentWindow.equals(handle))
			{
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/sales/order/print/order_id/");
			}
			
		}
		
		driver.switchTo().window(parentWindow);
		mo.clickOnMyOrdersLink();
		mo.clickOnReoderMyOrder();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/checkout/cart/");
		
	}

}
