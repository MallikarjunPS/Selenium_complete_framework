package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.PincodePage;
import pageObjects.SearchBoxPage;

import java.util.concurrent.TimeUnit;

public class SearchBoxPageTest extends BaseTest
{
	@Test
	public void testSearchBoxPage() throws InterruptedException
	{   driver.manage().window().maximize(); 
		SearchBoxPage s=new SearchBoxPage(driver);
		PincodePage  p= new PincodePage(driver);
		
		p.setStroreCode("4");
		p.clickProceedStore();
		Thread.sleep(3000);
		int nr=Excel.getRowCount("./testdata/SearchBox.xlsx", "Sheet1");
		for(int i=1;i<=nr;i++)
		{   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String v=Excel.getCellValue("./testdata/SearchBox.xlsx", "Sheet1", i, 0);
			  s.setSearchBox(v);
			  Thread.sleep(4000);
			  s.clearSearchBox();
			  s.verifySearchPage(driver, v);
			
		}
	}

}
