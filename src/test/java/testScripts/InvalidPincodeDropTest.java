package testScripts;

import org.testng.annotations.Test;
import pageObjects.PincodePage;
import resources.BaseTest;

public class InvalidPincodeDropTest extends BaseTest
{
  @Test
  public void testInvalidPincodeDrop() throws InterruptedException
  {
	 
	  PincodePage p= new PincodePage(driver);
	 
	  p.clickProceedDrop();
	  driver.switchTo().alert().accept();
	  driver.navigate().refresh();
	  p.selectPincodeDrop(2);
	  Thread.sleep(3000);
	  p.clickProceedDrop();
	  driver.switchTo().alert().accept();
	  

	  
	  
	  
  }


}
