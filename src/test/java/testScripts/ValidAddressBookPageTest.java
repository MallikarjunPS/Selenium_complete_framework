package testScripts;

import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.AddressBookPage;
import pageObjects.LoginPage;
import pageObjects.MyDashBoardPage;
import pageObjects.PincodePage;
import resources.BaseTest;

public class ValidAddressBookPageTest extends BaseTest
{
	@Test
	public void testAddressBookPage() throws InterruptedException
	{
		PincodePage p=new PincodePage(driver);
		LoginPage l=new LoginPage(driver);
		MyDashBoardPage m=new MyDashBoardPage(driver);
		AddressBookPage a=new AddressBookPage(driver);
		
		
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
		
		a.clickOnAddressBooklink();
		a.clickOnBillingAddress();
		a.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/address/edit/");
		a.clickOnSaveAddress();
		Thread.sleep(3000);
		a.verifySuccessfulmsg();
		
	
		a.clickOnShipingAddress();
		a.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/address/edit/");
		a.clickOnSaveAddress();
		Thread.sleep(3000);
		a.verifySuccessfulmsg();
		
		
		
		a.clickOnEditAddress();
		a.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/address/edit/");
		a.clickOnSaveAddress();
		Thread.sleep(3000);
		a.verifySuccessfulmsg();
		
		
		a.clickOnAddNewAddress();
		a.verifyAllLinks(driver, "http://myshopboxtest.in/instant/customer/address/new/");
		a.clickOnAddressBooklink();
		
		
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(3000);
			a.clickOnBillingAddress();
			fillForm(a,i);
		    a.clickOnSaveAddress();
		    Thread.sleep(3000);
			a.clickOnShipingAddress();
			fillForm(a,i);
		    a.clickOnSaveAddress();
		    Thread.sleep(3000);
			a.clickOnEditAddress();
			fillForm(a,i);
			a.clickOnCheckBoxBillingAddess();
			a.clickOnCheckBoxShippingAddress();
			a.clickOnSaveAddress();
			Thread.sleep(3000);
			a.clickOnAddNewAddress();
			fillForm(a,i);
			a.clickOnCheckBoxBillingAddess();
			a.clickOnCheckBoxShippingAddress();
			a.clickOnSaveAddress();
		}
	}
	
	public void fillForm(AddressBookPage a,int j) throws InterruptedException
	{   
	    
		a.clearFirstNameTextBox();
		a.clearLastNameTextBox();
		a.clearMobileTextBox();
		a.clearStreetAddress();
		a.clearLandmarkTextBox();
		String nm=Excel.getCellValue("./testdata/ValidAddressBookPage.xlsx", "Sheet1", j, 0);
		a.setFirstNameTextBox(nm);
		nm=Excel.getCellValue("./testdata/ValidAddressBookPage.xlsx", "Sheet1", j, 1);
		a.setLastNameTextBox(nm);
		nm=Excel.getCellValue("./testdata/ValidAddressBookPage.xlsx", "Sheet1", j, 2);
		a.setmobileTextBox(nm);
		nm=Excel.getCellValue("./testdata/ValidAddressBookPage.xlsx", "Sheet1", j, 3);
		a.setStreetAddress(nm);
		a.selectPincodeDropBox(j);
		Thread.sleep(3000);
	    a.selectAreaDropBox(j);
	    nm=Excel.getCellValue("./testdata/ValidAddressBookPage.xlsx", "Sheet1", j, 4);
	    a.setLandmarkTetxBox(nm);
		return;
	}

}
