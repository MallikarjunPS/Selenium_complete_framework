package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBoxPage 
{
	   @FindBy(id="search")
	   private WebElement searchBox;

	   @FindBy(xpath="//*[@id=\"search_mini_form\"]/div[1]/div/div[3]/div[2]/div[2]/a/span")
	   private WebElement showAllResult;
	   
	   @FindBy(xpath="//*[@id=\"notcart_22118\"]/div/div[2]/div/button")
	   private WebElement addtoCartButtonSearch;
	   
	   @FindBy(id="qtypl")
	   private WebElement plusSysmbolSearch;
	   
	   @FindBy(id="qtymin")
	   private WebElement minusSymbolSearch;
	   
	   @FindBy(id="qty_")
	   private WebElement qtyTextFieldSearch;
	   
	   @FindBy(xpath="//*[@id=\"notcart_22124\"]/div/div[2]/div/button")  //*[@id="notcart_22124"]/div/div[2]/button/span
	   private WebElement addtoCartButtonSearchPage;
	   
	   @FindBy(className="qtyplus")
	   private WebElement plusSysmbolSearchPage;
	   
	   @FindBy(className="qtyminus")
	   private WebElement minusSymbolSearchPage;
	   
	   @FindBy(name="qty")
	   private WebElement qtyTextFieldSearchPage;
	   
	   public SearchBoxPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   
	   
	   public void setSearchBox(String s)
	   {
		   searchBox.sendKeys(s);
		   searchBox.sendKeys(Keys.ENTER);
	   }
	    
	   public void  clickShowAllResult()
	   {
		   showAllResult.sendKeys(Keys.ENTER);
	   }

	  
	   public void visibleShowAllResult()
	   {
		   showAllResult.isDisplayed();
	   }
	   
	   public void clickAddToCartSearch()
	   {
		   addtoCartButtonSearch.click();
	   }

       public void clickAddToCartSearchPage()
       {
    	   addtoCartButtonSearchPage.click();
       }
       
       public void clickPlusSymbolSearch()
       {
    	   plusSysmbolSearch.click();
       }
       
       public void clickPlusSymbolSearchPage()
       {
    	   plusSysmbolSearchPage.click();
       }
       
       public void clickMinusSymbolSearch()
       {
    	   minusSymbolSearch.click();
       }
       
       public void clickMinusSymbolSearchPage()

       {
    	   minusSymbolSearchPage.click();
       }
       
       
       public void clearSearchBox()
       {
    	   searchBox.clear();
       }
       
       
       public void verifySearchPage(WebDriver driver,String s)
       {
    	   if(driver.getCurrentUrl().equals("http://myshopboxtest.in/instant/catalogsearch/result/?q=s"))
    	   {
    		   System.out.println("Search Page PASS for "+s);
    	   }
    	   
    	   else
    	   {
    		   System.out.println("Search page is FAIL for"+s);
    	   }
       }
       
}
