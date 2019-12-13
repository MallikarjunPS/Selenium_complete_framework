package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage 
{
	@FindBy(xpath="//*[@id=\"top-cart-btn-checkout\"]")
	private WebElement checkOutButton;
	
	@FindBy(xpath="//*[@id='maincontent']/div[3]/div/div[3]/div[1]/ul/li[1]/button")
	private WebElement proceedToCheckOutButton;
	
	@FindBy(id="label_method_pickup_instant")	
    private WebElement radioButtonPickup;
	
	@FindBy(id="label_method_delivery_instant")
	private WebElement  radioButtonDelivery;
	
	@FindBy(xpath="//*[@id=\"checkout-step-shipping\"]/button")
	private WebElement  newAddressButton;
	
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/div/button")
	private WebElement nextButton;
	
	@FindBy(xpath="//*[@id=\"checkout\"]/ul/li[1]/span")
	private WebElement shippingLink;
	
	@FindBy(xpath="//*[@id=\"checkout-payment-method-load\"]/div/div[1]/div[2]/div[4]/div/button")
    private WebElement placeOrderButton;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/a")
	private WebElement orderNumber;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div/div/a")
	private WebElement continueShopingButton;
	
	@FindBy(className="action-select-shipping-item")
    private WebElement shipherebutton;
	
	@FindBy(className="action-dismiss")
	private WebElement cancelDeliveyChargePopup;
	
	@FindBy(className="action-accept")
	private WebElement okDeliveryChargePopup;
	
	@FindBy(className="action-close")
	private WebElement closeSymbolDeliveryCharge;
	
	@FindBy(className="label")
	private WebElement radioCashOnDelivery;
	
    public CheckOutPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }


	public void clickOnProceedToCheckOut()
    {
    	proceedToCheckOutButton.click();
    }
     
	public void clickOnCheckOutButton()
	{
		checkOutButton.click();
	}
	
	public void clickOnRadioButtonPickUp()
	{
		radioButtonPickup.click();
	}
	
	public void clickOnRadioButtonDelivery()
	{
		radioButtonDelivery.click(); 
	}
	
	public void clickOnNewAddressButton()
	{
		newAddressButton.click();
	}
	
	public void clickOnNextButton()
	{
		nextButton.click();
	}
	
	public void clickOnShippingLink()
	{
		shippingLink.click();
	}
	
	public void clickOnPlaceOrderButton()
	{
		placeOrderButton.click();
	}
	
	public void clickOnOrderNumber()
	{
		orderNumber.click();
	}
	
	public void clickOnShoppingOrder()
	{
		continueShopingButton.click();
	}
	
	public void clickOnSheepHereButton()
	{
		shipherebutton.click();
	}
	
	public void clickOnOkDeliveyChargePopup()
	{
		okDeliveryChargePopup.click();
	}
	
	public void clickOnCancelDeliveryChargePopup()
	{
		cancelDeliveyChargePopup.click();
		
	}
	
	public void clickOnCancelSymbolDeliveryChangePopup()
	{
		closeSymbolDeliveryCharge.click();
	}
	
	public void clickOnRadioCashOnDelivery()
	{
		radioCashOnDelivery.click();
	}
	
	
	
	public void verifySheepHereButton(WebDriver driver)
	{
		if(shipherebutton.isDisplayed())
		{
			System.out.println("Ship Here Button is FAIL");
		}
		
		else
		{
			System.out.println("Ship Here Button is PASS");
		}
	}
	
	 public void verifyNewAddressButton(WebDriver driver)
	    {
	    	if (driver.getCurrentUrl().equals("http://myshopboxtest.in/instant/customer/address/new/?page=checkout"))
	    	{
	    		System.out.println("NewAddressButton in CheckOutPage is PASS");
	    	}
	    	
	    	else
	    	{
	    		System.out.println("NewAddressButton in CheckOutPage  is FAIL");
	    	}
	    }
	 
	  public void verifyNextButton(WebDriver driver)
	    {
	    	if (driver.getCurrentUrl().equals("http://myshopboxtest.in/instant/checkout/#payment"))
	    	{
	    		System.out.println("NextButton in CheckOutPage is PASS");
	    	}
	    	
	    	else
	    	{
	    		System.out.println("NextButton in CheckOutPage  is FAIL");
	    	}
	    }
	  
	  public void verifyPlaceButton(WebDriver driver)
	    {
	    	if (driver.getCurrentUrl().equals("http://myshopboxtest.in/instant/checkout/onepage/success/"))
	    	{
	    		System.out.println("PlaceOrderButton in CheckOutPage is PASS");
	    	}
	    	
	    	else
	    	{
	    		System.out.println("PlaceOrderButton in CheckOutPage  is FAIL");
	    	}
	    }
	 
	  public void verifyContinueButton(WebDriver driver)
	    {
	    	if (driver.getCurrentUrl().equals("http://myshopboxtest.in/instant/checkout/onepage/success/"))
	    	{
	    		System.out.println("PlaceOrderButton in CheckOutPage is PASS");
	    	}
	    	
	    	else
	    	{
	    		System.out.println("PlaceOrderButton in CheckOutPage  is FAIL");
	    	}
	    }
	  
	  
	

	 public void verifyCheckOut(WebDriver driver)
	    {
	    	if (driver.getCurrentUrl().equals("http://myshopboxtest.in/instant/checkout/"))
	    	{
	    		System.out.println("CheckOutButton is PASS");
	    	}
	    	
	    	else
	    	{
	    		System.out.println("CheckOutButton is FAIL");
	    	}
	    }
	
	 public void verifyOrderNumber(WebDriver driver)
	    {
	    	if (driver.getCurrentUrl().contains("http://myshopboxtest.in/instant/sales/order/view/order_id/"))
	    	{
	    		System.out.println("Order Number  is PASS");
	    	}
	    	
	    	else
	    	{
	    		System.out.println("Order Number   is FAIL");
	    	}
	    }
	 
	
	 
	 
	 public void verifyRadioButton()
	 {
		 if(radioButtonDelivery.isSelected())
		 {
			 System.out.println("Delivery radio button is PASS");
		 }
		 
		 else if(radioButtonPickup.isSelected())
		 {
			 System.out.println("Pickup radio button is PASS");
		 }
		 
		 else
		 {
			 System.out.println("Radio button is FAIL");
		 }
	 }
	
}
