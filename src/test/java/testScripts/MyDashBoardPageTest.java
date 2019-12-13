package testScripts;


import org.testng.annotations.Test;
import pageObjects.*;
import resources.BaseTest;

public class MyDashBoardPageTest extends BaseTest
{  
	@Test
	public void testMyDashBoardPage() throws InterruptedException
	{
		PincodePage p= new PincodePage(driver);
		LoginPage l=new LoginPage(driver);
		MyDashBoardPage m= new MyDashBoardPage(driver);
		AccountInformationPage a= new AccountInformationPage(driver);
		AddressBookPage ad=new AddressBookPage(driver);
		MyOrdersPage my=new MyOrdersPage(driver);
		
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
		m.clickOnMyAccountPop();
		a.ClickOnAccountInformationLink();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/account/edit/");
		ad.clickOnAddressBooklink();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/address/");
		my.clickOnMyOrdersLink();
        m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/sales/order/history/");    
		m.clickOnAccountDashBoardLink();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/account/");
		m.clickOnEditContactInfo();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/account/edit/");
		m.clickOnAccountDashBoardLink();
		m.clickOnChangePassWordContactInfo();
		a.changePasswordIsVisible();
		m.clickOnAccountDashBoardLink();
		m.clickOnManageAddressesMyDash();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/address/");
		m.clickOnAccountDashBoardLink();
		m.clickOnEditAddressesBillingMyDash();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/address/edit/");
		m.clickOnAccountDashBoardLink();
		m.clickOnEditAddressesShipingMyDash();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/address/edit/");
		m.clickOnAccountDashBoardLink();
		m.clickOnViewAllMyDash();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/sales/order/history/");
		m.clickOnAccountDashBoardLink();
		m.clickOnViewOrderMyDash();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/sales/order/view/order_id/");
		m.clickOnAccountDashBoardLink();
		m.clickOnReorderMyDash();
		Thread.sleep(4000);
		m.clickOnCancelButton();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/account/");
		Thread.sleep(3000);
		m.clickOnReorderMyDash();
		Thread.sleep(4000);
		m.clickOnOkButton();
		m.verifyAllLinks(driver, "http://myshopboxtest.in/instant/checkout/cart/");
		
		
	}
	

}
