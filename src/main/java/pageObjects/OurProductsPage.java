package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OurProductsPage 
{
	   
	   @FindBy(className="promotions-categ")
	   private WebElement ourProduct;
	   
	   @FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[1]/div/div[2]/div/div[1]/a/img")
	   private WebElement shopBoxPopularImg;
	   
	   @FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[1]/div/div[2]/div/div[2]/a/img")
	   private WebElement shopBoxPrivateImg;
  
	   @FindBy(id="back-to-top")
	   private WebElement scrollUpButton;
      
	   @FindBy(xpath="//*[@id='swatch_1']") 
	   private WebElement wieghtDropDown;
       
	   @FindBy(id="menu1")
	   private WebElement moreCategoriesDrop;
	   
	   @FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[1]/div/div[4]/div/div/div/div/div/div/div/div[1]/ol/li[97]/div/span[2]/span/img")
	   private WebElement enlargeImg;
       
	   
	   public OurProductsPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void clickOurProduct()
	   {
		   ourProduct.click();
	   }
       
       public void clickShopBoxPopularImg()
       {
    	   shopBoxPopularImg.click();
       }
      
	   public void clickShopBoxPrivateImg()
	   {
		   shopBoxPrivateImg.click();
	   }
       
	   public void clickScrollUpButton()
	   {
		   scrollUpButton.click();
	   }
       
       public void clickMoreCategoriesDrop()
       {
    	   moreCategoriesDrop.click();
       }

       public void clickWieghtDropDown(int i)
       {
    	  Select cwd=new Select(wieghtDropDown);
    	  cwd.selectByIndex(i);
    	   
       }

       public void clickOnImg()
        {
    	   enlargeImg.click();
        }
     
       public void VerifyUrl(String s)
        {
    	
    	   if(s.equals("http://myshopboxtest.in/instant/shopbox-products?&brands=Shopbox%20Premium"))
   	     {
   	     	System.out.println("Private Img is PASS");
   	     }
   	    
   	     else if(s.equals("http://myshopboxtest.in/instant/shopbox-products?&brands=Shopbox%20Popular"))
   	     {
   	    	System.out.println("Popular Img is PASS");
   	     }
           
   	     else
   	     {
   	    	 System.out.println("FAIL");
   	     }
        }
        
       public void VerifyFilterPopular(int x,WebDriver driver,String r) throws InterruptedException
    	   					
    	   {   String s="//*[@id='maincontent']/div[3]/div/div[1]/div/div[4]/div/div/div/div/div/div/div/div[1]/ol/li[x]/div/div/div[1]/strong";
        	   String l="";
        	   if(x<=5)
         	  {  
         		  String c=String.valueOf(x);
         		  l=s.replace("x", c);
         	  }
        	   else if(x==6)
            	   
        	   {  x=x+1;
        		   String c=String.valueOf(x);
          		  l=s.replace("x", c);
        	   }
        	   
        	   else if(x>=7&&x<=10)
        	   {
        		   x=x+4;
        		   String c=String.valueOf(x);
           		  l=s.replace("x", c);
        		   
        	   }
        	  
    		   WebElement m=driver.findElement(By.xpath(l));
    		   String s1= m.getText();
    			if(s1.equals(r))	
    			{
    				System.out.println(s1+"Filter is PASS");
    			}
    			else
    			{
    				System.out.println(s1+"Filter is FAIL");
    			}
    	         
    	   }                                           
    	   												  
  	   public void clickFilterButton(int x,WebDriver driver)
           
           {           
        	   String s="//*[@id='maincontent'] /div[3]/div/div[1]/div/div[4]/div/div/ul/li[x]/a";
        	   String r="";  
         	  
        	   String c=String.valueOf(x);
         	   r=s.replace("x", c);
         	  
        	  
        	  WebElement allProducts = driver.findElement(By.xpath(r));
              allProducts.click();
                        	  
           }
          
  	   public void clickFilterButtonPrivate(int x,WebDriver driver)
           
           {           
        	   String s="//*[@id=\"maincontent\"]/div[3]/div/div[1]/div/div[4]/div/div/ul/li[9]/ul/li[x]/a";
        	   String r="";  
         	  
        	   String c=String.valueOf(x);
         	   r=s.replace("x", c);
         	  
        	  
        	  WebElement allProducts = driver.findElement(By.xpath(r));
              allProducts.click();
                        	  
           }

  	   public void VerifyFilterPrivate(int x,WebDriver driver,String r) throws InterruptedException
				
    	   {             //*[@id="maincontent"]/div[3]/div/div[1]/div/div[4]/div/div/div/div/div/div/div/div[1]/ol/li[6]/div/div/div[1]/strong
    		   String s="//*[@id='maincontent']/div[3]/div/div[1]/div/div[4]/div/div/div/div/div/div/div/div[1]/ol/li[x]/div/div/div[1]/strong";
        	   String l="";//*[@id="maincontent"]/div[3]/div/div[1]/div/div[4]/div/div/div/div/div/div/div/div[1]/ol/li[4]/div/div/div[1]/strong
        	   if(x<=4)    //*[@id="maincontent"]/div[3]/div/div[1]/div/div[4]/div/div/div/div/div/div/div/div[1]/ol/li[4]/div/div/div[1]/strong
         	  {  
         		  String c=String.valueOf(x);
         		  l=s.replace("x", c);
         	  }
        	   else if(x==5)
            	   
        	   {  x=x+1;
        		   String c=String.valueOf(x);
          		  l=s.replace("x", c);
        	   }
        	   
        	   else if(x==6)
        	   {
        		   x=x+10;
        		   String c=String.valueOf(x);
           		  l=s.replace("x", c);
        		   
        	   }
        	   else
        	   {
        		   x=x+12;
        		   String c=String.valueOf(x);
           		  l=s.replace("x", c);

        		   
        	   }
        	  
    		   WebElement m=driver.findElement(By.xpath(l));
    		   String s1= m.getText();
    			if(s1.equals(r))	
    			{   
    				
    				System.out.println(s1+"Filter is PASS");
    			}
    			else
    			{
    				System.out.println(s1+"Filter is FAIL");
    			}
    	         
    	   }                                           




}
