package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPage 
{
   @FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[4]/a")
   private WebElement myOrdersLink;
   
   @FindBy(xpath="//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/a[1]")
   private WebElement viewOrderMyOrder;
   
   @FindBy(xpath="//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/a[2]") 
   private WebElement reorderMyOrder;
   
   @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/div[2]/div/a[1]")
   private WebElement reorderViewOrder;
   
   @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/div[2]/div/a[2]")
   private WebElement printOrder;
   
   public MyOrdersPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void clickOnMyOrdersLink()
   {
	   myOrdersLink.click();
   }
   
   public void clickOnViewOrderMyOrder()
   {
	   viewOrderMyOrder.click();
   }
   
   public void clickOnReoderMyOrder()
   {
	   reorderMyOrder.click();
   }
   
   public void clickOnPrintOrder()
   {
	   printOrder.click();
   }

   
   public void clickOnReorderViewOrder()
   {
	   reorderViewOrder.click();
   }
}
