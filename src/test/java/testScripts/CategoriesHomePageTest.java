package testScripts;

import resources.BaseTest;
import resources.Excel;
import org.testng.annotations.Test;
import pageObjects.CategoriesOfHomePage;
import pageObjects.HomePage;
import pageObjects.PincodePage;


public class CategoriesHomePageTest extends BaseTest
{
   @Test
   public void testCategoriesHomePage() throws InterruptedException
   {   driver.manage().window().maximize();
	   PincodePage p=new PincodePage(driver);
	   CategoriesOfHomePage c=new CategoriesOfHomePage(driver);
	   HomePage h=new HomePage(driver);
	   int nr=Excel.getRowCount("./testdata/AllCategoriesHomePageLinks.xlsx", "Sheet1");
	
	   String ml="/html/body/div[2]/header/div[2]/div/div[3]/div/div/div[1]/div/ul/li[x]"; 
	   String sl="//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[x]/a"; 
	   String bn="//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[x]/a";
	   String pr="//*[@id=\"narrow-by-list\"]/div[3]/div[2]/ol/li[x]/a";	
	   int k=1;
	   int j=0;
	   int l=1;
	   int q=1;
	   p.setStroreCode("4");
	   p.clickProceedStore();
	   
	   
	   for(int i=1;i<=nr;i++)
	   {
		   String s=Excel.getCellValue("./testdata/AllCategoriesHomePageLinks.xlsx", "Sheet1", i, 0);
		   Thread.sleep(3000);
	      c.checkAllLinks(ml,driver,i );
	      c.verifyALLlinks(driver, s);
	    for( j=1;j<=7;)
	     {  int n=1;  
		   String s1=Excel.getCellValue("./testdata/AllSubCategoriesHomePageLinks.xlsx", "Sheet1", k, 0);
		    if(i==4)
 		   {
		    c.checkAllLinks(sl, driver, n);
 		    c.verifyALLlinks(driver, s1);
 		   c.ClickOnClearButton(); 
 		     n++;
	         k++;
	         j=j+4;
	       }
		    else if(i>=7)
		    {
		    	j=8;
		    	
		    }
	   else
	       {
		   c.checkAllLinks(sl, driver, j);
		   c.verifyALLlinks(driver, s1);
		   c.ClickOnClearButton(); 
		   k++;
	 	   j=j+1;
	       }
		     
		   
	      }
         for(int b=1;b<=50;)
         {   int n=1;
         String s1=Excel.getCellValue("./testdata/AllBrandCategoriesHomePageLinks.xlsx", "Sheet1", l, 0);
        	 if(i==4)
             { 
       	   c.checkAllLinks(bn, driver, n);
               c.verifyALLlinks(driver, s1);
               c.ClickOnClearButton();
               n++;
               l++;
              b=51;
             }
        	 else
        	 {
        		 c.checkAllLinks(bn, driver, b);
        		 c.verifyALLlinks(driver, s1);
        		 c.ClickOnClearButton();
        		 l++;
        		 b++;
        	 }
         }
	   
         for(int g=1;g<=2;)
         {
//        	 String s2=Excel.getCellValue("./testdata/AllPriceCategoriesHomePageLinks.xlsx", "Sheet1", q, 0);
//        	 
        	 if(i==4)
        	 {
        		 g=3;
             }
        	 
        	 else
        	 {
        		 c.checkAllLinks(pr, driver, g);
//        		 c.verifyALLlinks(driver, s2);
        		 q++;
        		 g++;
        	 }
         }
         
         
	     h.clickShopBoxLogo();
	    
	    }
	   
	   
   }
	
}
