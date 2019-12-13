package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.GiveUsYourDetailsPage;

public class InvalidGiveUsDetailsPageTest extends BaseTest
{
	@Test
	public void testInvalidGiveUsDetailsPage() throws InterruptedException
	{
		  GiveUsYourDetailsPage g= new GiveUsYourDetailsPage(driver);
		  int nr=Excel.getRowCount("./testdata/InValidGivesYourDetails.xlsx", "Sheet1");
		   driver.manage().window().maximize();
	       driver.navigate().refresh();
		   g.clickGiveUsYour();		   
		 
		 
		 for(int i=1;i<=nr;i++)
		 {     Thread.sleep(3000);
			  	 String pc=Excel.getCellValue("./testdata/InValidGivesYourDetails.xlsx", "Sheet1", i, 0);
			     g.setPincodeText(pc);
			   
			   
			     String pn=Excel.getCellValue("./testdata/InValidGivesYourDetails.xlsx", "Sheet1", i, 1);
			     g.setPhoneText(pn);
			   
			     g.clickSubmitButton();
	
			     g.verifyPinCodeErrorMsg();
			     g.verifyPinCodePhoneErrorMsg();
			   
			     g.clearPincodeText();
			     g.clearPhoneText();
			   
			   
			  
			   
		 }
		
		
	}


}
