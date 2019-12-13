package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GiveUsYourDetailsPage 
{
    
	@FindBy(className="pin-details-home")           
	@CacheLookup
	private WebElement giveUsYour;                  

	@FindBy(xpath="/html/body/div[3]/aside[1]/div[2]/footer/button/span")
	private WebElement backButton;
	
	@FindBy(id="get-pincode")
	private WebElement pincodeTextBox;
	
	@FindBy(id="pincode-phone")
	private WebElement phoneTextBox;
	
	@FindBy(id="send2")
	private WebElement submitButton;
	
	@FindBy(id="get-pincode-error")
	private WebElement pinCodeErrorMsg;
	
	@FindBy(id="pincode-phone-error")
	private WebElement PincodePhoneErrorMsg;
	
	public  GiveUsYourDetailsPage(WebDriver driver )
	{
	
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickBackButton()
	{
		backButton.click();
	}
	
	public void setPincodeText(String s)
	{
		pincodeTextBox.sendKeys(s);
	}
	
	
	public void setPhoneText(String s)
	{
		phoneTextBox.sendKeys(s);
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	
	
	public void clickGiveUsYour()
	    {
	    	giveUsYour.click();
	    }

	
	public void verifyPinCodeErrorMsg()
	{
		if(pinCodeErrorMsg.isDisplayed())
		{
			System.out.println("Pincode Error Message is PASS");
		}
		
		else
		{
			System.out.println("Pincode Error Message is FAIL");
		}
	}
	
	public void verifyPinCodePhoneErrorMsg()
	{
		
		if(PincodePhoneErrorMsg.isDisplayed())
		{
			System.out.println("Phone Error Message is PASS");
		}
		
		else
		{
			System.out.println(" Phone Error Message is  FAIL");
		}
	
	
	}
	
	

  public void clearPincodeText()
  {
	  pincodeTextBox.clear();
  }
  
  
  public void clearPhoneText()
  {
	  phoneTextBox.clear();
  }

  

}
  
