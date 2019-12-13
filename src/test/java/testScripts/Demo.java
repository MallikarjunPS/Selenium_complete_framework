package testScripts;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;


public class Demo 
{
     public static void main(String[]args) throws EncryptedDocumentException, InvalidFormatException, IOException
     {
    	 FileInputStream fis = new FileInputStream("C:/Users/admin/Documents/book13.xlsx"); 
    	 Workbook wb = WorkbookFactory.create(fis);
    	int rc=wb.getSheet("sheet1").getLastRowNum();
    	 
    	 System.out.println(rc);
    	 
    	
    	 
    	 for(int j=1;j<=rc;j++)
    	 {
    	Cell c =  wb.getSheet("Sheet1").getRow(j).getCell(0);
    	
    	  if(c.getCellTypeEnum()==CellType.STRING)
    	  {
    		  System.out.println(c+" "); 
    	  }
    	  else
    	  {    
    		  long v=(long)c.getNumericCellValue();
    		  
    		  System.out.println(v+" ");
    	  }
    	 
    	 }
    	 System.out.println();
    	 
     }
}

     
     









































