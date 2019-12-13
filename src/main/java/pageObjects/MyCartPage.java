package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyCartPage 
{  
	@CacheLookup
 	@FindBy(className="showcart")
	private WebElement myCartButton;
	
	@FindBy(xpath="//*[@id=\"cart-item-141-qty\"]") 
	private WebElement qty;
	
	@FindBy(xpath="//*[@id=\"mini-cart\"]/li[1]/div/div/div[3]/div[2]/a")
	private WebElement deleteIcon;
	
	@FindBy(xpath="//*[@id=\"minicart-content-wrapper\"]/div[2]/div[2]/div[3]/div/a")
	private WebElement goToCartSymbol;
	
	@FindBy(xpath="//*[@id=\"minicart-content-wrapper\"]/div[2]/div[1]/strong")
	private WebElement noItemMessage;
	
	@FindBy(xpath="//*[@id=\"block-discount-heading\"]")
	private WebElement applyDiscountCodeButton;
	
	@FindBy(xpath="//*[@id=\"discount-coupon-form\"]/div/div[2]/div/button")
	private WebElement cancelCouponCodeButton;
	
	@FindBy(id="coupon_code")
	private WebElement couponCodeTextBox;
	
	@FindBy(xpath="//*[@id=\"discount-coupon-form\"]/div/div[2]/div/button")
	private WebElement applyDiscountButton;
	
	@FindBy(id="empty_cart_button")
	private WebElement clearShoppingCartButton;
	
	@FindBy(className="update")
	private WebElement updateShoppingCartButton;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[2]/div[1]/div")
	private WebElement coupnCodeMsg;
   
	@FindBy(className="control qty")
	private WebElement qtyTextField;
	
	@FindBy(xpath="//*[@id=\"mini-cart\"]/li/div/div/div[3]/div[2]/a")
	private WebElement deleteIconMiniCart;
	
	@FindBy(xpath="/html/body/div[3]/aside[3]/div[2]/footer/button[2]")
	private WebElement clickOnOkButtonOnPop;
	
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr/td[7]/div/a[3]")
	private WebElement deleteIconMycartPage;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[3]/p[1]")
	private WebElement msg;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[3]/p[2]/a")
	private WebElement clickHere;
	
	public MyCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
    public void clickOnMyCartButton()
    {
    	myCartButton.click();
    }
    
    public void clickOnGotoCartSymbol()
    {
    	goToCartSymbol.click();
    }
    
    public void clickOnApplyDiscountCode()
    {
    	applyDiscountCodeButton.click();
    }
    
    public void clickOnClearShoppingCartButton()
    {
      clearShoppingCartButton.click();
    }
    public void clickOnUpdateShoppingCart()
    {
    	updateShoppingCartButton.click();
    }
    
    
    public void clickOnApplyDiscountButton()
    {
    	applyDiscountButton.click();
    }
    
    public void setCoupnCode(String s)
    {
    	couponCodeTextBox.sendKeys(s);
    }
    
    public void clickOnCancelCouponButton()
    {
    	cancelCouponCodeButton.click();
    
    }
    
    public void clickOnDeleteIconMiniCart()
    {
    	deleteIconMiniCart.click();
    }
    
    public void clickOnOkButtonOnMiniCart()
    {
    	clickOnOkButtonOnPop.click();
    }
    
    
    public void clickOnDleleteIconMyCartPage()
    {
    	deleteIconMycartPage.click();
    }
    
    
    
    public void setQtyTextField(String s)
    {
    	qtyTextField.sendKeys(s);
    }
    
    public void verifyUpdateShoppingCart(String s)
    {
    	if(qtyTextField.getText().equals(s))
    	{
    	 System.out.println("UpdateShoppingCart is successful");
    	}
    	
      	else
      	{
    	 System.out.println("Update Shopping Cart is UnSuccessful");
      	}
    }
    
   
    
    public void verifyAll(WebDriver driver,String s)
    {
    	if(driver.getCurrentUrl().contains(s))
    	{
    		System.out.println(driver.getTitle()+" is PASS");
    	}
    	
    	else
    	{
    		System.out.println(driver.getTitle()+" is FAIL");
    	}
    }
    
    public void verifyCouponErrorMsg()
    {
    	String s=coupnCodeMsg.getText();
    	
    	if(s.contains("is not valid."))
    	{
    		System.out.println("Error message CoupnCode is PASS"+"  "+s);
    	}
    	
    	else
    	{
    		System.out.println("Error Message CoupnCode is FAIL"+"  "+s);
    	}
    }
    
    public void verifyCouponSuccessfullMsg(WebDriver driver,String s)
    {
    	if(s.equals(coupnCodeMsg.getText()))
    	{
    		System.out.println("CoupnCodeMsg is SuccessFull");
    	}
    	
    	else
    	{
    		System.out.println("CoupnCodeMsg is FAIL");
    	}
    }
    
    public void verifyNoItemMessage()
    {
    	if( noItemMessage.isDisplayed())
    	{   
       	   System.out.println("Message Box Is PASS ");
    	   if(noItemMessage.getText().equals("You have no items in your shopping cart."))
    	   {
    		  System.out.println("Message displayed is PASS");
    	   }
    	   else
    	   {
    		   System.out.println("Message displayed is FAIL");
    	   }
    	}
    	
    	else 
    	{
    		System.out.println("Messsage Box Is FAIL");
    	}
    	
    	
    }
    
    public void verifyMsg()
    {
    	if(msg.equals("You have no items in your shopping cart."))
    	{
  	  		System.out.println("Message is displayed ");
  	  	}
    	
    	else
    	{
    		System.out.println("Message is not displayed");
    	}
    	
    }
    
    public void verifyClickHere(WebDriver driver)
    {
    	if(clickHere.isDisplayed())
        {
      	  System.out.println("Click Here is displayed");
      	  clickHere.click();
      	  if(driver.getCurrentUrl().equals("http://myshopboxtest.in/instant/"))
      	  	{
      		System.out.println("Click Here is PASS");
      	  	}
      	  else
      	  	{
      		System.out.println("Click Here is FAIL");
      	  	}
      	}

        
        else
          {
      	  System.out.println("Click Here is not displayed");
          }
    }
	
}
