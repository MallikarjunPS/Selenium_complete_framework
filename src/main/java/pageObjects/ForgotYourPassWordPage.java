package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotYourPassWordPage 
{
  @FindBy(xpath="//*[@id=\"login-form\"]/fieldset/div[3]/div/div[2]/a/span")	
   private WebElement forgotYourPassWord;
  
  @FindBy(id="fsbphnumber")
  private WebElement mobileText;
  
  @FindBy(id="fverify")
  private WebElement getCodeButton;
  
  @FindBy(id="ivcode")
  private WebElement verificationCodeText;
  
  @FindBy(id="password")
  private WebElement passWordText;
  
  @FindBy(id="password_confirmation")
  private WebElement passWordConfirmationText;
  
  @FindBy(className="action submit primary")
  private WebElement submitButton;
  
  @FindBy(id="password-wrongs")
  private WebElement passWordErrorMsg;
  
  @FindBy(className="action-close")
  private WebElement closeSymbol;
  
  @FindBy(className="restart")
  private WebElement didYouEnterWrongNum;
  
  @FindBy(xpath="/html/body/div[3]/aside[5]/div[2]/header/button")
  private WebElement forgotCloseSymbol;
  
  
  public ForgotYourPassWordPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  
  public void clickFrogotYourPassWord()
  {
	forgotYourPassWord.click();  
  }
  
  public void setMobileText(String s)
  {
	mobileText.sendKeys(s);  
  }
  
  public void clickGetCode()
  {
	 getCodeButton.click();
  }
  
  public void clickDidyouEnterWrongNum()
  {
	  didYouEnterWrongNum.click();
  }

  public void setPasswordText(String s)
  {
 	passWordText.sendKeys(s);
  }
  
  public void setpPassWordConfirmationText(String s)
  {
	  passWordConfirmationText.sendKeys(s);
  }

  public void clickSubmitButton()
  {
	 submitButton.click();
  }
  
  public void visiblePassWordText()
  {
	  passWordText.isDisplayed();
  }


  public void enablePassWordConfirmationText()
  {
	  passWordConfirmationText.isEnabled();
  }

  public void enableSubmitButton()
  {
	 submitButton.isEnabled();
  }
 
  public void clickCloseSymbol()
  {
	  closeSymbol.click();
  }

  public void clickForgotCloseSymbol()
  {
	  forgotCloseSymbol.click();
	  
  }
  
}
