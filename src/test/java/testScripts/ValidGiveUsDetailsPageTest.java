package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.GiveUsYourDetailsPage;

public class ValidGiveUsDetailsPageTest extends BaseTest
{
	
	@Test
	public void testGiveUsDetailsPage() throws InterruptedException
	{
	int	nr=Excel.getRowCount("./testdata/ValidGivesYourDetails.xlsx", "sheet1");
	
	 GiveUsYourDetailsPage g= new GiveUsYourDetailsPage(driver);
	
	 driver.manage().window().maximize();
	 driver.navigate().refresh();
	 	for(int j=1;j<=nr;j++)
	 	{        
		    
		     Thread.sleep(3000);
		     g.clickGiveUsYour();
	         String s= Excel.getCellValue("./testdata/validGivesYourDetails.xlsx","sheet1",j,0);  
             g.setPincodeText(s);
	         String s1=Excel.getCellValue("./testdata/validGivesYourDetails.xlsx","sheet1",j,1);  
	         g.setPhoneText(s1);
	         Thread.sleep(3000);
	         g.clickSubmitButton();
	         Thread.sleep(3000);
	         System.out.println(driver.switchTo().alert().getText());
	         driver.switchTo().alert().accept();
	         
	 	}

	}


}
