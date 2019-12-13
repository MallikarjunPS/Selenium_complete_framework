package testScripts;

import org.testng.annotations.Test;
import pageObjects.PincodePage;
import resources.BaseTest;

public class ValidPincodeDropTest extends BaseTest
{
	
	@Test
	public void  testValidPincodeDrop() throws InterruptedException
	{
		PincodePage p= new PincodePage(driver);
		
		for(int i=1;i<=3;i++)
		{	
		p.selectPincodeDrop(i);
		Thread.sleep(3000);
	    p.selectAreasDrop(i);
	    p.clickProceedDrop();
	    p.clickChange();
	    Thread.sleep(3000);
	    driver.navigate().refresh();
		}	
	}
}
