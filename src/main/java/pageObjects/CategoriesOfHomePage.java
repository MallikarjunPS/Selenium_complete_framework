package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesOfHomePage
{
   public void checkAllLinks( String s, WebDriver driver,int x)
   {   
       String n= String.valueOf(x); 
       String r= s.replace("x", n);
       
	   
	   WebElement e=driver.findElement(By.xpath(r));
                     
        e.click();
        
   }

   public void verifyALLlinks(WebDriver driver,String s)
   {
	   if(driver.getCurrentUrl().equals(s))
	   {
		   System.out.println("Categories is PASS"+" "+s);
	   }
	   
	   else
	   {
		   System.out.println("Categories is FAIL"+" "+s);
	   }
   }
   
   @FindBy(xpath="//*[@id=\"layered-filter-block\"]/div[2]/div[2]/a/span")
   private WebElement clearButton;
   
   public CategoriesOfHomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   
   public void ClickOnClearButton()
   {
	   clearButton.click();
   }
  
}
