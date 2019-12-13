package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
   @FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/div[2]/li[1]/a[1]/img")
   private WebElement androidSymbol;
  
   @FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/div[2]/li[1]/a[2]/img")
   private WebElement appleSymbol;
   
   @FindBy(className="logo")
   private WebElement shopboxLogo;
       
   @FindBy(className="android-app")
   private WebElement playStroeSymbol;
   
   @FindBy(className="ios-app")
   private WebElement appleStoreSymbol;
   
   @FindBy(xpath="/html/body/div[2]/footer/div/div/div/div/div[2]/div[2]/ul/li[2]/a")
   private WebElement  privacyPolicyLink;
   
   @FindBy(className="icon-caret-right")
   private WebElement contactUSLink;
   
   @FindBy(xpath="/html/body/div[2]/header/div[2]/div/div[1]/a/span[2]")
   private WebElement cartSymbolHome;
   
   @FindBy(className="tocart")  
   private WebElement addToCartButton;
   
   @FindBy(xpath="//*[@id=\"incart_22827\"]/div/div/input[3]")
   private WebElement plusSymbol;
   
   @FindBy(xpath="//*[@id=\"incart_22827\"]/div/div/input[1]")
   private WebElement minusSymbol;
   
   @FindBy(xpath="//*[@id=\"incart_22827\"]")
   private WebElement qtyField;  
   
   @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div/div[3]/div/div[2]/h3/a")
   private WebElement viewProducts;
   
   @FindBy(className="flex-active")
   private WebElement buttons;
   
   

   @FindBy(xpath="/html/body/div[2]/footer/div/div/div/div/div[1]/div/ul[1]/li[1]/a")
   private WebElement groceryAndStaples;
   
   @FindBy(xpath="/html/body/div[2]/footer/div/div/div/div/div[1]/div/ul[1]/li[2]/a")
   private WebElement beveragesAndHealthDrinkLink;
   
   @FindBy(xpath="/html/body/div[2]/footer/div/div/div/div/div[1]/div[2]/ul[1]/li[3]/a")
   private WebElement foodsAndSnackLink;
   
   @FindBy(xpath="/html/body/div[2]/footer/div/div/div/div/div[1]/div[2]/ul[2]/li[1]/a")
   private WebElement fruitsAndVegitablesLink;
   
   @FindBy(xpath="/html/body/div[2]/footer/div/div/div/div/div[1]/div[2]/ul[2]/li[2]/a")
   private WebElement personalCareLink;
   
   @FindBy(xpath="/html/body/div[2]/footer/div/div/div/div/div[1]/div[2]/ul[2]/li[3]/a")
   private WebElement houseHoldLinks;
   
   @FindBy(xpath="/html/body/div[2]/footer/div/div/div/div/div[1]/div[2]/ul[3]/li[1]/a")
   private WebElement othersLinks;
   
   @FindBy(xpath="/html/body/div[2]/footer/div/div/div/div/div[1]/div[2]/ul[3]/li[2]/a")
   private WebElement topSellingLinks;
   
   
   public HomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   
   
   public void clickAndoidSymbol()
   {
	   androidSymbol.click();
   }
   
   
   public void clickAppleSymbol()
   {
	   appleSymbol.click();
   }
   
   
   public void clickPlayStoreSymbol()
   {
	   playStroeSymbol.click();
   }

  
   public void clickAppleStoreSymbol()
   {
	   appleStoreSymbol.click();
   }

   public void clickAddToCart()
   {
	   addToCartButton.click();
   }

   public void clickPlusSymbol()
   {
	   plusSymbol.click();
   }
   
   public void clickMinusSymbol()
   {
	   minusSymbol.click();
   }

   public void clickPrivacyPolicyLink()
   {
	   privacyPolicyLink.click();
   }
    
   public void clickContactUS()
   {
	   contactUSLink.click();
   }
   
   public void clickViewMore()
   {
	   viewProducts.click();
   }
 
   
   public void  clickGroceryAndStaplesLink()
   {
	   groceryAndStaples.click();
   }
   
   public void  clickBeveragesAndHealthDrinkLink()
   {
	   beveragesAndHealthDrinkLink.click();
   }
   
   
   public void  clickFoodsAndSnackLink()
   {
	   foodsAndSnackLink.click();
   }
   
   public void  clickFruitsAndVegitablesLink()
   {
	   fruitsAndVegitablesLink.click();
   }
   
   public void  clickPersonalCareLink()
   {

	   personalCareLink.click();
      
    }
   
   public void  clickHouseHoldLinks()
   {
	   houseHoldLinks.click();
   }
   
   public void  clickOthers()
   {
	   othersLinks.click();
   }
   
   
   public void clickTopSellingProduct()
   {
	   topSellingLinks.click();
   }

   
   public void clickShopBoxLogo()
   {
	   shopboxLogo.click();
   }
   
   public String getValueCartSymbol() throws InterruptedException
   {
	   Thread.sleep(3000);
	 String  s= cartSymbolHome.getAttribute("getCartParam");           
	 return s;   
   }
  
   
   public String getValueQtyFieldValue()
   {
	   String s= qtyField.getText();
	    return s;
   }
   
   
   
   
   //   public void clickAllLinks(String i, WebDriver driver)
//   {
//	   driver.findElement(By.className(i)).click();
//	   
//   }
//   



}

