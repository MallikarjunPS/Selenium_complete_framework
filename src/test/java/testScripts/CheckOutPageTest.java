
package testScripts;

import org.testng.annotations.Test;
import pageObjects.CheckOutPage;
import pageObjects.LoginPage;
import pageObjects.MyCartPage;
import pageObjects.PincodePage;
import resources.BaseTest;

public class CheckOutPageTest extends BaseTest
{
	@Test
	public void testCheckOutPage() throws InterruptedException
	{
		PincodePage p=new PincodePage(driver);
		LoginPage   l=new LoginPage(driver);
		MyCartPage m=new MyCartPage(driver);
		CheckOutPage c=new CheckOutPage(driver);
		
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
		m.clickOnMyCartButton();
//		c.clickOnCheckOutButton();
//		c.verifyCheckOut(driver);

		
		m.clickOnGotoCartSymbol();
		Thread.sleep(3000);
		c.clickOnProceedToCheckOut();
		c.verifyCheckOut(driver);
		c.clickOnRadioButtonPickUp();
		Thread.sleep(3000);
		c.verifyRadioButton();
		c.clickOnNewAddressButton();
		c.verifyNewAddressButton(driver);
		driver.navigate().back();
		c.clickOnSheepHereButton();
		c.verifySheepHereButton(driver);
		c.clickOnRadioButtonDelivery();
		c.clickOnNextButton();
		Thread.sleep(3000);
		c.clickOnCancelDeliveryChargePopup();
		Thread.sleep(3000);
		c.clickOnNextButton();
		Thread.sleep(3000);
		c.clickOnOkDeliveyChargePopup();
		Thread.sleep(3000);
		c.verifyNextButton(driver);
//		Thread.sleep(4000);
//		c.clickOnPlaceOrderButton();
//		Thread.sleep(3000);
//		c.verifyPlaceButton(driver);
//		c.clickOnOrderNumber();
//		
	}

}
