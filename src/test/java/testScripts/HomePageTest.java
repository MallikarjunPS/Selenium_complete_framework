package testScripts;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.PincodePage;
import resources.BaseTest;

public class HomePageTest extends BaseTest
{
	@Test 
	public void testHomePage() throws InterruptedException
	{    String v=""; 
		HomePage h=new HomePage(driver);
		PincodePage p= new PincodePage(driver);
		
		p.setStroreCode("4");
	    p.clickProceedStore();
	    Thread.sleep(3000);
	    String s[]=new String[12];
	    String a[]= {"http://myshopboxtest.in/instant/privacy-policies","http://myshopboxtest.in/instant/contacts","http://myshopboxtest.in/instant/catalog/category/view/s/grocery-staples/id/6728/","http://myshopboxtest.in/instant/catalog/category/view/s/beverages-health-drinks/id/6684/",
	    		     "http://myshopboxtest.in/instant/catalog/category/view/s/foods-snacks/id/6660/","http://myshopboxtest.in/instant/catalog/category/view/s/fruits-vegetables/id/7130/",
	    		    "http://myshopboxtest.in/instant/catalog/category/view/s/personal-care/id/6666/" ,"http://myshopboxtest.in/instant/catalog/category/view/s/household/id/6672/","http://myshopboxtest.in/instant/catalog/category/view/s/others/id/7102/",
	    		    "http://myshopboxtest.in/instant/catalog/category/view/s/top-selling-products/id/7418/","http://myshopboxtest.in/instant/" ,"http://myshopboxtest.in/instant/catalog/category/view/s/top-selling-products/id/7418/"};
	    
	 
       driver.manage().window().maximize();	   
	    Thread.sleep(3000);
	    h.clickPrivacyPolicyLink();
	    s[0]= driver.getCurrentUrl();
	    h.clickContactUS();
	    s[1]=driver.getCurrentUrl();
	    h.clickGroceryAndStaplesLink();
	    s[2]= driver.getCurrentUrl();
	    h.clickBeveragesAndHealthDrinkLink();
	    s[3]= driver.getCurrentUrl();
	    h.clickFoodsAndSnackLink();
	    s[4]= driver.getCurrentUrl();
	    h.clickFruitsAndVegitablesLink();
	    s[5]= driver.getCurrentUrl();
	    h.clickPersonalCareLink();
	    s[6]= driver.getCurrentUrl();
	    h.clickHouseHoldLinks();
	    s[7]= driver.getCurrentUrl();
	    h.clickOthers();
	    s[8]= driver.getCurrentUrl();
	    h.clickTopSellingProduct();
	    s[9]= driver.getCurrentUrl();
	    h.clickShopBoxLogo();
	    s[10]=driver.getCurrentUrl();
	   //  h.clickViewMore();
	   // s[11]=driver.getCurrentUrl();
	    
	    
	    
	    for(int i=0;i<=a.length-1;i++)
	    {
	    	if(a[i].equals(s[i]))
	    	{
	    		System.out.println("Lnik Passed:"+" "+s[i]);
	    	}
	    	
	    	else
	    	{
	    		System.out.println("Link Failed:"+ " " +s[i]);
	    	}
	    }
	    
	    h.clickShopBoxLogo();
	    Thread.sleep(3000);
	    h.clickAddToCart();
	    Thread.sleep(3000);
	    h.clickPlusSymbol();
	    Thread.sleep(3000);
	    v = h.getValueQtyFieldValue();
	    if(v.contains("2"))
	    {
		   System.out.println("Plus Symbol is Pass");
		   System.out.println(v);
	    }
	    else
	    {
		   System.out.println("Plus Symbol is Failed");
		   System.out.println(v);
	    }
	    Thread.sleep(3000);
	    h.clickMinusSymbol();
	    Thread.sleep(3000);
	    v = h.getValueQtyFieldValue();
	    if(v.contains("1"))
	    {
		   System.out.println("Minus Symbol is Pass");
		   System.out.println("Add to Cart and cart symbol is Pass");
		   System.out.println(v);
	    }
	    else
	    {
		   System.out.println("Minus Symbol is Failed");
	    }
	    
	    Thread.sleep(3000);
	    h.clickShopBoxLogo();
	    Thread.sleep(3000);
	   
	    String parentWindow=driver.getWindowHandle();
	    String childWindow=parentWindow;
	    String childWindow1=childWindow;
	    String childWindow2=childWindow1;
	    String childWindow3=childWindow2;
        h.clickAndoidSymbol();
        
       
        for (String handle: driver.getWindowHandles())
	    {
        	if (!childWindow.equals(handle))
            {
                childWindow = handle;
                driver.switchTo().window(childWindow);
                Thread.sleep(3000);
                v= driver.getCurrentUrl(); 
       	        Thread.sleep(3000);
       	      if(v.equals("https://play.google.com/store/apps/details?id=com.flex.shopbox&hl=en"))
       	       {
       	    	 System.out.println("Android Symbol Pass:"+" "+v);
       	       }
       	    }     
	    }
	
        driver.switchTo().window(parentWindow);
        h.clickAppleSymbol();

        for (String handle: driver.getWindowHandles())
	    {
        	if (!childWindow1.equals(handle))
            {
                childWindow1 = handle;
                driver.switchTo().window(childWindow1);
                Thread.sleep(3000);
                v= driver.getCurrentUrl(); 
       	        Thread.sleep(3000);
       	      if(v.equals("https://itunes.apple.com/in/app/shopbox/id1123030988?mt=8"))
       	       {
       	    	 System.out.println("Apple Symbol Pass:"+" "+v);
       	       }
       	      
            }
    	 
	     }
	
         
        driver.switchTo().window(parentWindow);
        h.clickPlayStoreSymbol();
        for (String handle: driver.getWindowHandles())
	    {
      	 if (!childWindow.equals(handle))
          {
              childWindow = handle;
              driver.switchTo().window(childWindow);
              Thread.sleep(3000);
              v= driver.getCurrentUrl(); 
     	        Thread.sleep(3000);
     	      if(v.equals("https://play.google.com/store/apps/details?id=com.flex.shopbox&hl=en"))
     	       {
     	    	 System.out.println("Android Symbol Pass:"+" "+v);
     	       }
     	     }
	    }
      	driver.switchTo().window(parentWindow);
      	h.clickAppleStoreSymbol();
	     
      	for (String handle: driver.getWindowHandles())
	    {
        	if (!childWindow3.equals(handle))
            {
                childWindow3 = handle;
                driver.switchTo().window(childWindow3);
                Thread.sleep(3000);
                v= driver.getCurrentUrl(); 
       	        Thread.sleep(3000);
       	      if(v.equals("https://itunes.apple.com/in/app/shopbox/id1123030988?mt=8"))
       	       {
       	    	 System.out.println("Apple Symbol Pass:"+" "+v);
       	       }
       	    }
    	 }
      	driver.switchTo().window(parentWindow);
	}

	

}
