package resources;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest 
{  
	public WebDriver driver;
    
	
	
	@BeforeClass
	public void pincode()
	{   
		driver=new ChromeDriver();
		driver.get("http://myshopboxtest.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@BeforeTest
	public void browser()
	{

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	
	

    @AfterClass
    public void closeDriver()
    {     
      driver.quit();	
    }

	public void getScreenshot () throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("F://test//screenshot.png"));

	}


}