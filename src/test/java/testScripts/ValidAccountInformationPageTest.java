package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.AccountInformationPage;
import pageObjects.LoginPage;
import pageObjects.MyDashBoardPage;
import pageObjects.PincodePage;

public class ValidAccountInformationPageTest  extends BaseTest
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
	   int nr= Excel.getRowCount("./testdata/ValidAccountInformationPage.xlsx", "Sheet1");
	   
	   for(int i=1;i<=nr;i++)
	   {
		   String cp=Excel.getCellValue("./testdata/ValidAccountInformationPage.xlsx", "Sheet1", i, 0);
		   a.setCurrentPasswordTextBox(cp);
		   
		   String np=Excel.getCellValue("./testdata/ValidAccountInformationPage.xlsx", "Sheet1", i, 1);
		   a.setNewPasswordTextBox(np);
		   
		   String cnp= Excel.getCellValue("./testdata/ValidAccountInformationPage.xlsx", "Sheet1", i, 2);
		   a.setConfirmationPasswordText(cnp);
		   a.clickOnSaveButton();
		   Thread.sleep(3000);
		   a.verifySuccessfullMsg();
		   
	   }
	 
	   	   
   }


}
