package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.AccountInformationPage;
import pageObjects.LoginPage;
import pageObjects.MyDashBoardPage;
import pageObjects.PincodePage;

public class InValidAccountInformationPageTest extends BaseTest
{

	@Test
	public void testAccountInformationPage() throws InterruptedException
	{
		 AccountInformationPage a= new AccountInformationPage(driver);
		   MyDashBoardPage m= new MyDashBoardPage(driver);
		   PincodePage p=new PincodePage(driver);
		   LoginPage l=new LoginPage(driver);
		   
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
		   a.ClickOnAccountInformationLink();
		   a.selectChangePasswordCheckBox();
		   a.clearFirstNameTextBox();
		   a.clearLastNameTextBox();
		   a.clickOnSaveButton();
		   a.verifyFirstNameErrorMsg();
		   a.verifyLastNameErrorMsg();
		   a.verifyCurrentPasswordErrorMsg();
		   a.verifyNewPasswordErrorMsg();
		   a.verifyConfirmPasswordErrorMsg();
		   a.setFirstNameTextBox("Mallikarjun");
		   a.setLastNameTextBox("Salimath");
		   int nr= Excel.getRowCount("./testdata/InValidAccountInformationPage.xlsx", "Sheet1");
		   System.out.println("Loop Enters");
		   for(int i=1;i<=nr;i++)
		   { 
			   Thread.sleep(3000);
			   a.clearCurrentPasswordTextBox();
		       a.clearPasswordTextBox();
		       a.clearConfirmationPasswordTextBox();
			   String cp=Excel.getCellValue("./testdata/InValidAccountInformationPage.xlsx", "Sheet1", i, 0);
			   a.setCurrentPasswordTextBox(cp);
		       	   
			   String np=Excel.getCellValue("./testdata/InValidAccountInformationPage.xlsx", "Sheet1", i, 1);
			   a.setNewPasswordTextBox(np);
			   a.verifyNewPasswordErrorMsg();
			   String cnp= Excel.getCellValue("./testdata/InValidAccountInformationPage.xlsx", "Sheet1", i, 2);
			   a.setConfirmationPasswordText(cnp);
			   a.verifyConfirmPasswordErrorMsg();
			   a.clickOnSaveButton();
		
			   
		   }
		    
//		   Thread.sleep(3000);
//		   a.verifyCurrentPasswordErrorMsg();
//		   
	}
	
}
