package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	@FindBy(id="log-popups")
	@CacheLookup
    private WebElement loginPopup;
	
	@FindBy(id="mobile")
	private WebElement mobileNumber;
	
	@FindBy(id="pass")
    private WebElement passWord;
	
	@FindBy(id="send2")
	private WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"login-form\"]/fieldset/div[3]/div/div[2]/a/span")
	private WebElement forgotYour;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/div[2]/li[4]/a") 
	private WebElement logOutButton;
	
   
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}


	public void setMobileNumber(String mn)
	{
		mobileNumber.sendKeys(mn);
	}



	public void setPassword(String pw)
	{
	    passWord.sendKeys(pw);	
	}
	
	public void clickLoginButton() throws InterruptedException
	{   
		
		
		loginButton.click();
	  
	}


	public void clickForgotYour()
	{
		forgotYour.click();
	}
		
	
	public void clearMobileNumber()
	{
		mobileNumber.clear();
	}

	
	public void clearPassword()
	{
		passWord.clear();
	}
		
   
	public void clickLogOutButton()
	{
		logOutButton.click();
	}
	
    public void clickLoginPop()
    {
    	loginPopup.click();
    }


}










