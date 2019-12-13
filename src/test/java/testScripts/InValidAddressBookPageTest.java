package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.AddressBookPage;
import pageObjects.LoginPage;
import pageObjects.MyDashBoardPage;
import pageObjects.PincodePage;

public class InValidAddressBookPageTest extends BaseTest
{
	@Test
	public void  testInValidAddressBookPage() throws InterruptedException
	{

		PincodePage p=new PincodePage(driver);
		LoginPage l=new LoginPage(driver);
		MyDashBoardPage m=new MyDashBoardPage(driver);
		AddressBookPage a=new AddressBookPage(driver);
		
		
		p.setStroreCode("4");
		p.clickProceedStore();
		Thread.sleep(4000);
		l.clickLoginPop();
		Thread.sleep(3000);
		l.setMobileNumber("9035362206");
		l.setPassword("Arjun@199");
		l.clickLoginButton();
		Thread.sleep(3000);
		m.clickOnMyAccountPop();
		a.clickOnAddressBooklink();
		
		Thread.sleep(3000);
		a.clickOnBillingAddress();
		clearForm(a);
		

	    Thread.sleep(3000);
		a.clickOnShipingAddress();
		clearForm(a);
		

	    Thread.sleep(3000);
		a.clickOnEditAddress();
		clearForm(a);
		

		Thread.sleep(3000);
		a.clickOnAddNewAddress();
		clearForm(a);
		

		
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(3000);
			a.clickOnBillingAddress();
			inValidData(a,i);
	
		    Thread.sleep(3000);
			a.clickOnShipingAddress();
			inValidData(a,i);
	
		    Thread.sleep(3000);
			a.clickOnEditAddress();
			inValidData(a,i);

			Thread.sleep(3000);
			a.clickOnAddNewAddress();
			inValidData(a,i);

		}
		
	}

	public void clearForm(AddressBookPage a) throws InterruptedException
	{
		
		a.clearFirstNameTextBox();
		a.clearLastNameTextBox();
		a.clearMobileTextBox();
		a.clearStreetAddress();
		a.clearLandmarkTextBox();
		a.selectPincodeDropBox(0);
		a.clickOnSaveAddress();
		Thread.sleep(3000);
		a.verifyFirstNameErrorMsg();
		a.verifyLastNameErrorMsg();
		a.verifyMobileErrorMsg();
		a.verifyStreetErrorMsg();
		a.verifyPinCodeErrorMsg();
		a.verifyAreaErrorMsg();
		a.clickOnAddressBooklink();
		
		
	}
	
	public void inValidData(AddressBookPage a,int j)
	{
		String nm=Excel.getCellValue("./testdata/InValidAddressBookPage.xlsx", "Sheet1", j, 0);
		a.clearMobileTextBox();
		a.setmobileTextBox(nm);
		a.clickOnSaveAddress();
		a.verifyMobileErrorMsg();
		a.clickOnAddressBooklink();
	}

}
