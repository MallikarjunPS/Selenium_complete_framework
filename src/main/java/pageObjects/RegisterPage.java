package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	
  @FindBy(id="create-acc-popups")
  private WebElement registerButtonHome;
	
  @FindBy(id="create-acc-popups2")
  private WebElement registerButtonLogin;
  
  @FindBy(id="reg-sbphnumber1")
  private WebElement registerMoblieText;
  
  @FindBy(id="verify_front")
  private WebElement getCodeButton;
  
  @FindBy(id="firstname")
  private WebElement firstNameText;
  
  @FindBy(id="lastname")
  private WebElement lastNameText;
  
  @FindBy(id="reg-email_address")
  private WebElement emailText;
  
  @FindBy(id="reg-password")
  private WebElement passWordText;
  
  @FindBy(id="reg-password-confirmation")
  private WebElement confirmPassWordText;
  
  @FindBy(xpath="//*[@id=\"register-step3\"]/div[5]/div/button")
  private WebElement registerButton;
  
  @FindBy(xpath="/html/body/div[3]/aside[1]/div[2]/header/button")
  private WebElement closeSymbol;
  
  @FindBy(xpath="//*[@id=\"email-wrongs\"]/span")
  private WebElement mailErrorMsg;
  
  @FindBy(xpath="//*[@id=\"restart\"]")
  private WebElement requestAnother;
  
  @FindBy(id="reg-password-error")
  private WebElement regPassWordErrorMsg;
  
  @FindBy(className="action-close")
  private WebElement closeButton;
	
  
  public RegisterPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void clickOnRegisterHome()
  {
	  registerButtonHome.click();
  }
  
  public void clickOnRegisterLogin()
  {
	  registerButtonLogin.click();
  }
  
  public void setRegisterMobileText(String s)
  {
	  registerMoblieText.sendKeys(s);
  }
  
  public void setFirstNameText(String s)
  {
	  firstNameText.sendKeys(s);
  }
  
  public void setLastNameText(String s)
  {
	  lastNameText.sendKeys(s);
  }
  
  public void setEmailText(String s)
  {
	  emailText.sendKeys(s);
	  emailText.sendKeys(Keys.TAB);
  }
  
  public void setPassWordText(String s)
  {
	  passWordText.sendKeys(s);
	  
  }
  
  public void setConfirmPassWordText(String s)
  {
	  confirmPassWordText.sendKeys(s);
  }
  
  public void clickRegisterButton()
  {
	  registerButton.click();
  }
  
  public void clearRegisterMobileText()
  {
	 registerMoblieText.clear();
  }
  
  
  public void clearFirstName()
  {
	  firstNameText.clear();
  }
  
  public void clearLastName()
  {
	  lastNameText.clear();
  }
  
  public void clearPassWordText()
  {
	  passWordText.clear();
  }
  
  public void clearConifrmPasswordText()
  {
	  confirmPassWordText.clear();
  }
  
  public void clearEmailText()
  {
	  emailText.clear();
  }
  
  public void clickOnCloseSymbol()
  {
	  closeSymbol.click();
  }
  
  public void clickRequestAnother()
  {
	  registerButton.click();
  }
  
  public void clickOnCloseSymbolLog()
  {
	  closeButton.click();
  }
  
  public void clickOnGetcodeButton()
  {
	  getCodeButton.click();
  }
  
  public void verifyEmailErrorMsg()
  {
	  boolean res=mailErrorMsg.isDisplayed();
	  
	  if(res)
	  {
		  System.out.println("Email Message is PASS");
	  }
	  else
	  {
		  System.out.println("Email Message is FAIL");
	  }
	  
  }

  public void verifyPassWordErrorMsg()
  {
	boolean res=  regPassWordErrorMsg.isDisplayed();
	
	if(res)
	{
		System.out.println("Password Error Masseage is PASS");
	}
	else
	{
		System.out.println("Password Error Message is FAIL");
	}
   }
  
  public void isNotEnableRegister()
  {
	  boolean res = registerButton.isEnabled();
	  if(res)
		{
			System.out.println("RegisterButton is FAIL");
		}
		else
		{
			System.out.println("RegisterButton is PASS");
		} 
  }

  public void isEnableRegister()
  {
	  boolean res = registerButton.isEnabled();
	  if(res)
		{
			System.out.println("RegisterButton is PASS");
		}
		else
		{
			System.out.println("RegisterButton is FAIL");
		} 
  }

  
}
