package testScripts;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageObjects.OurProductsPage;
import pageObjects.PincodePage;
import resources.BaseTest;

public class OurProductsPageTest extends BaseTest
{
   @Test
   public void testOurProductsPage() throws InterruptedException
   {   String v="";
       String r[]= {"Cashew 4 Piece (Kaju)","Green Moong Whole/Sabut","Indian Raisins (Kishmish)","Sona Masoori Raw Rice",
    		   		"Urad Dal (Split)","Channa Brown","Raw Peanuts (Mungaphali)","Sugar","Toor Dal (Arhar)"}; 
	   
       String j[]= {"Black Pepper Whole (Kali Mirch)","Kolam Rice","Californian Almond (Badam)","Sona Masoori Steam Rice",
			   		"Broken Wheat (Dalia)","Cooking Soda","Red Boiled Rice"};
       
	   OurProductsPage o=new OurProductsPage(driver);
	   PincodePage p=new PincodePage(driver);
	    p.setStroreCode("4");
	    p.clickProceedStore();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    o.clickOurProduct();
	    o.clickShopBoxPrivateImg();
	    v=driver.getCurrentUrl();
	    o.VerifyUrl(v);
	    
	    System.out.println("Shopbox Popular Page Filter");
	    o.clickShopBoxPopularImg();
	    v=driver.getCurrentUrl();
	    o.VerifyUrl(v);	    
	    Thread.sleep(5000);
	    
	    for(int i=2;i<=6;i++)
	    { 
	    	 
	       o.clickFilterButton(i,driver);
	      // o.VerifyFilterPopular(i-1,driver,r[i-2]);	  
	    }
	    
	    
	    System.out.println("Shopbox Private Page Filter");

	    o.clickShopBoxPrivateImg();
	    for(int i=2;i<=15;i++)
	    { 
	       if(i<=8)
	       {	   
	       o.clickFilterButton(i,driver);
	      // o.VerifyFilterPrivate(i-1,driver,j[i-2]);
	       }
	       
	       else
	       {   Thread.sleep(3000); 
	    	   o.clickMoreCategoriesDrop();
	    	   o.clickFilterButtonPrivate(i-8,driver);  
	       }
	    }
	      
	    
	    JavascriptExecutor jse= (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,100)","");
	    o.clickScrollUpButton(); 
	    	        
	    

   }

}
