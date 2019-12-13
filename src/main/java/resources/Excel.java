package resources;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class Excel
{

    public static  String getCellValue(String xlPath,String sheet,int row, int cell)
    {
        String v="";

        try
        {
            FileInputStream fs=new FileInputStream(xlPath);
            Workbook wb= WorkbookFactory.create(fs);
            Cell  c=wb.getSheet(sheet).getRow(row).getCell(cell);

                if(c.getCellTypeEnum()==CellType.STRING)
                {
                    v= c.toString();
                }

                else
                {
                    long n=(long)c.getNumericCellValue();
                    v=String.valueOf(n);
                }
        }

        catch (Exception e)
        {

            e.printStackTrace();
        }

        return v;
   }


    public static int getRowCount(String xlPath,String sheet)
    {
        int rc=0;
        try
        {
            FileInputStream fs = new FileInputStream(xlPath);
            Workbook wb=WorkbookFactory.create(fs);
            rc=wb.getSheet(sheet).getLastRowNum();
        }

        catch (Exception e)
        {

            e.printStackTrace();
        }
        return rc;
    }


}
   
   
   


