package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyDashBoardPage 
{
	 
	@FindBy(className="logged-in")
	 private  WebElement myAccountPop;
	
	@FindBy(xpath=" //*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/div/div[2]/a[1]")
	private WebElement editContactInfo;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/div/div[2]/a[2]")
	private WebElement changePasswordContactInfo;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[5]/div[1]/a")
	private WebElement manageAddressesMyDash;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[5]/div[2]/div[1]/div[2]/a")
	private WebElement editAddressesBillingMyDash;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/a")
	private WebElement editAddressesShipingMyDash;
	
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[1]/a")
	private WebElement accountDashBoardLink;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[1]/a")
    private WebElement viewAllMyDash;
	
	@FindBy(xpath="//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/a[1]")
	private WebElement viewOrderMyDash;
	
	@FindBy(xpath="//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/a[2]")
	private WebElement reoderMyDash;
	
	@FindBy(className="action-accept") 
	private WebElement okButtonPop;
	
	@FindBy(xpath="/html/body/div[3]/aside[1]/div[2]/footer/button[1]")
	private WebElement cancelButtonPop;
	
	
	public  MyDashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMyAccountPop()
	{
		myAccountPop.click();
	}
	
	public void  clickOnEditContactInfo()
	{
		editContactInfo.click();
	}
	
	public void clickOnChangePassWordContactInfo()
	{
		changePasswordContactInfo.click();
	}
	
	public void clickOnManageAddressesMyDash()
	{
		manageAddressesMyDash.click();
	}
	
	public void clickOnEditAddressesBillingMyDash()
	{
		editAddressesBillingMyDash.click();
	}

	public void clickOnEditAddressesShipingMyDash()
	{
		editAddressesShipingMyDash.click();
	}
   
    public void clickOnAccountDashBoardLink()
    {
    	accountDashBoardLink.click();
    }
	
	public void clickOnViewAllMyDash()
	{
		viewAllMyDash.click();
	}
	
	public void clickOnViewOrderMyDash()
	{
		viewOrderMyDash.click();
	}
	
	public void clickOnReorderMyDash()
	{
		reoderMyDash.click();
	}
	
	
	public void clickOnOkButton()
	{
		okButtonPop.click();
	}
	
	public void clickOnCancelButton()
	{
		cancelButtonPop.click();
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
