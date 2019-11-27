package Test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.ConfigurationReader;

import javax.security.auth.login.Configuration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        File file=new File("");
        System.out.println(file.exists());
        //opening reding file
        FileInputStream inputStream=new FileInputStream(file);
       //loading into the class
        XSSFWorkbook workbook= new XSSFWorkbook(inputStream);
// Passing worksheet&name
        XSSFSheet worksheet= workbook.getSheet("Employees");
        System.out.println(worksheet.getRow(3).getCell(1));
        int usedRows =worksheet.getPhysicalNumberOfRows();
        System.out.println("PhysicalNumberOfRows: "+usedRows);
        int lastUsedRow=worksheet.getLastRowNum();
        System.out.println("LastRowNum: " + lastUsedRow);

       for (int rowNum=0; rowNum<=usedRows; rowNum++){
           if (worksheet.getRow(rowNum).getCell(0).toString().equals("Nancy")){
               System.out.println("Nancy's job: "+worksheet.getRow(rowNum).getCell(2));
           break;
           }
       }
       //TODO: if last name is matching, print out all the infornation for that person
        //TODO: first name,lastname,job
        //Get the last name from Configuration

        String lastName= ConfigurationReader.getProperty("lastName");

        for (int i=1; i<=usedRows; i++){
            if (worksheet.getRow(i).getCell(1).toString().equals(lastName)){
                System.out.println("Information Employee: "+lastName+"FirstName=>"+
                        worksheet.getRow(i).getCell(0)+","+worksheet.getRow(i).getCell(2));
            }
            break;
        }






workbook.close();
       inputStream.close();










    }

}
