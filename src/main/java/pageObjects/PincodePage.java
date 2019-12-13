package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PincodePage {

		@FindBy(id="sb-store-id")
	    private WebElement storeCode;

	    @FindBy(xpath="//*[@id=\"form-storesel-1\"]/button")
	    private WebElement proceedStoreCode;
	    
	    @FindBy(id="my-pincodes")
	    private WebElement pinCode;
	    
	    @FindBy(id="areas")
	    private WebElement selectArea;
	    
	    @FindBy(xpath="//*[@id=\"form-pincode\"]/div[2]/button")
	    private WebElement proceedPinCode;
	    
	    @FindBy(id="my-pincodes")
	    private WebElement pinCodeDrop;
	    
	    
	    @FindBy(id="areas")
	    private WebElement areasDrop;

	    
	    @FindBy(xpath="//*[@id=\"form-pincode\"]/div[2]/button")
	    private WebElement proceedDrop;
	    
	   
	    @FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/div[1]/div[2]/div/div/p[2]/a")
	    private WebElement change;
	    
	    public PincodePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	    
	    public void setStroreCode(String sc)
	    {
	    	storeCode.sendKeys(sc);
	    }
	    
	    public void clickProceedStore()
	    {
	    	proceedStoreCode.click();
	    	
	    }
	    
	    public void clearStoreCode()
	    {
	    	storeCode.clear();
	    }


	    public void clickChange()
	    {
	        change.click();
	    }
	      
	    public void selectPincodeDrop(int i)
	    {   
	    	Select pcd=new Select(pinCodeDrop);
	    	pcd.selectByIndex(i);
	    }
	    
	    public void selectAreasDrop(int i)
	    {    Select ad=new Select(areasDrop);
	    	ad.selectByIndex(i);
	    }
	    
	    public void clickProceedDrop()
	    {
	    	proceedDrop.click();
	    }
	    
	    
	   

	   
	}
	    
