package iSource.Utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ExcelReader {

    public String path;
    public FileInputStream fis = null;
    public FileOutputStream fileOut =null;
    private XSSFWorkbook workbook = null;
    private XSSFSheet sheet = null;
    private XSSFRow row =null;
    private XSSFCell cell = null;


    public ExcelReader(String path,String sheetName){

        try {
            fis=new FileInputStream(path);
            workbook=new XSSFWorkbook(fis);
            sheet=workbook.getSheet(sheetName);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getTotlaRows(){
        return sheet.getLastRowNum();
    }

    public int getTotalCollums(){
        return sheet.getRow(1).getLastCellNum();
    }

    public String[][] data(){

        String[][] data=null;
        Iterator<Row> rowIteratore=sheet.rowIterator();
        data=new String[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()];

        int i=0;
        while (rowIteratore.hasNext())
        {

            Row row=rowIteratore.next();
            Iterator<Cell> cellIterator=row.cellIterator();

            int j=0;
            while (cellIterator.hasNext())
            {
                Cell cell=cellIterator.next();

               if (cell.getCellType()== CellType.STRING)
               {
                    data[i][j]=cell.getStringCellValue();

               }
               else if (cell.getCellType()==CellType.NUMERIC || cell.getCellType()==CellType.FORMULA)
               {
                   data[i][j]=String.valueOf(cell.getNumericCellValue());
               }
               else if (cell.getCellType()==CellType.BLANK){
                   data[i][j]="";
               }
               j++;

            }
            i++;

        }
        return  data;


    }




}
