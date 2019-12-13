package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressBookPage 
{
   @FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[3]/a")
   private WebElement addressBookLink;
   
   @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a")
   private WebElement changeBillingAddressLink;
   
   @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/a")
   private WebElement changeShippingAddressLink;
   
   @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/ol/li/div/a")
   private WebElement editAddressLink;
   
   @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[5]/div[1]/button")
   private WebElement addNewAddressButton;
   
   @FindBy(id="firstname")
   private WebElement firstNameTextBox;
   
   @FindBy(id="lastname")
   private WebElement lastNameTextBox;
   
   @FindBy(id="telephone")
   private WebElement mobileTextBox;
   
   @FindBy(id="street_1")
   private WebElement streetAddress;
   
   @FindBy(id="zip")
   private WebElement  pincodeDropBox;
   
   @FindBy(id="area")
   private WebElement areaDropBox;
   
   @FindBy(id="landmark")
   private WebElement landmarktextbox;
   
   @FindBy(id="city")
   private WebElement cityTextBox;
   
   @FindBy(id="country")
   private WebElement contryDropBox;
   
   @FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/div")
   private WebElement successfulMsg;
   
   @FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button/span")
   private WebElement saveAddressButton;
   
   @FindBy(id="primary_billing") 
   private WebElement checkBoxBillingAddress;
   
   @FindBy(id="primary_shipping")
   private WebElement checkBoxShippingAddress;

    @FindBy(id="firstname-error")    
    private WebElement firstNameErrorMsg;
    
    @FindBy(id="lastname-error")
    private WebElement lastNameErrorMsg; 
   
    @FindBy(id="telephone-error")
    private WebElement mobileErrorMsg;
    
    @FindBy(id="street_1-error")
    private WebElement streetAddressErrorMsg;
    
    @FindBy(id="zip-error")
    private WebElement pincodeErrorMsg;
    
    @FindBy(id="area-error")
    private WebElement areaCodeErrorMsg;
   
   
   
   
   public AddressBookPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void  clickOnAddressBooklink()
   {
	   addressBookLink.click();
   }
   public void setFirstNameTextBox(String s)
   {
 	  firstNameTextBox.sendKeys(s);
 	  
   }
   
   public void setLastNameTextBox(String s)
   {
 	  lastNameTextBox.sendKeys(s);
   }
   
   
   public void setmobileTextBox(String s)
   {
	   mobileTextBox.sendKeys(s);
   }
   
   public void setStreetAddress(String s)
   {
	   streetAddress.sendKeys(s);
   }
   
   public void selectPincodeDropBox(int i)
   {
	   Select pdb= new Select(pincodeDropBox);
	   pdb.selectByIndex(i);
	   
   }
   
   public void selectAreaDropBox(int i)
   {
	   Select adb=new Select(areaDropBox);
        adb.selectByIndex(i);
   }
   
   public void setLandmarkTetxBox(String s)
   {
	   landmarktextbox.sendKeys(s);
   }
   
   public void setCityTetxBox(String s)
   {
	   cityTextBox.sendKeys(s);
   }
   
   public void selectCountryDropBox(int i)
   {
	   Select cdb=new Select(contryDropBox);
	   cdb.selectByIndex(i);
   }
   
   public void clearFirstNameTextBox()
   {
 	  firstNameTextBox.clear();
   }
   
   public void clearLastNameTextBox()
   {
 	  lastNameTextBox.clear();
   }
   
   public void clearMobileTextBox()
   {
 	  mobileTextBox.clear();
   }
   
   public void clearStreetAddress()
   {
	   streetAddress.clear();
   }
   
   public void clearLandmarkTextBox()
   {
	   landmarktextbox.clear();
   }
   
   
   public void clickOnSaveAddress()
   {
	   saveAddressButton.click();
   }
   
   
   public void clickOnBillingAddress()
   {
	   changeBillingAddressLink.click();
	   
   }
   
   public void clickOnShipingAddress()
   {
	   changeShippingAddressLink.click();
   }
   
   public void clickOnEditAddress()
   {
	   editAddressLink.click();
   }
   
   public void clickOnAddNewAddress()
   {
	   addNewAddressButton.click();
   }
   
   
   public void clickOnCheckBoxBillingAddess()
   {
	   checkBoxBillingAddress.click();
   }
   
   public void clickOnCheckBoxShippingAddress()
   {
	   checkBoxShippingAddress.click();
	   
   }
   
   
   public void verifySuccessfulmsg()
   {
	   if(successfulMsg.getText().equals("You saved the address."))
	   {
		   System.out.println("Successful Message is PASS"+" "+successfulMsg.getText());
		   
	   }
	   
	   else
	   {
		   System.out.println("Successful Message is FAIL"+" "+successfulMsg.getText());
	   }
   }
   
   
   public void verifyFirstNameErrorMsg()
   {
  	 if(firstNameErrorMsg.getText().equals("This is a required field."))
  	 {
  		 System.out.println("FirstName Text Error Msg is PASS");
  		
  	 }
  	 
  	 else
  	 {
  		 System.out.println("FirstName Text Error Msg is FAIL");
  	 }
  	 
   }
   
   public void verifyLastNameErrorMsg()
   {
  	 if(lastNameErrorMsg.getText().equals("This is a required field."))
  	 {
  		 System.out.println("LastName Text Error Msg is PASS");
  		
  	 }
  	 
  	 else
  	 {
  		 System.out.println("LastName Text Error Msg is FAIL");
  	 }
  	 
   }
   
   
   public void verifyMobileErrorMsg()
   {
  	 if(mobileErrorMsg.getText().equals("This is a required field.")||mobileErrorMsg.getText().equals("Please enter at least 10 characters."))
  	 {
  		 System.out.println("Mobile Text Error Msg is PASS"+" "+mobileErrorMsg.getText());
  		
  	 }
  	 
  	 else
  	 {
  		 System.out.println("Mobile Text Error Msg is FAIL");
  	 }
  	 
   }
   
   public void verifyStreetErrorMsg()
   {
  	 if(streetAddressErrorMsg.getText().equals("This is a required field."))
  	 {
  		 System.out.println("Street Text Error Msg is PASS");
  		
  	 }
  	 
  	 else
  	 {
  		 System.out.println("Street Text Error Msg is FAIL");
  	 }
  	 
   }
   
   public void verifyPinCodeErrorMsg()
   {
  	 if(pincodeErrorMsg.getText().equals("This is a required field."))
  	 {
  		 System.out.println("Pincode Drop Error Msg is PASS");
  		
  	 }
  	 
  	 else
  	 {
  		 System.out.println("Pincode Drop Error Msg is FAIL");
  	 }
  	 
   }
   public void verifyAreaErrorMsg()
   {
  	 if(areaCodeErrorMsg.getText().equals("This is a required field."))
  	 {
  		 System.out.println("Area Code error Msg is PASS");
  		
  	 }
  	 
  	 else
  	 {
  		 System.out.println("Area Code Error Msg is FAIL");
  	 }
  	 
   }
   
   
   
   public void verifyAllLinks(WebDriver driver,String s)
	{        
		    
		  
		 if(driver.getCurrentUrl().contains(s))
	    {
			 System.out.println(  driver.getTitle() + " is PASS");
				 
	    }
		 
		 else
		 {
			 System.out.println(driver.getTitle()+" is FAIL");
		 }
	}
}
