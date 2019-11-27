package Test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook;
        XSSFSheet worksheet;
        XSSFRow row;
        XSSFCell cell;

        String path="src/SampleData.xlsx";
        File file=new File(path);
        FileInputStream inputStream=new FileInputStream(file);

        workbook=new XSSFWorkbook(inputStream);
        worksheet= workbook.getSheet("employees");
        row=worksheet.getRow(4);
        cell=row.getCell(0);
        System.out.println(cell.toString());

        XSSFCell adamCell= worksheet.getRow(5).getCell(0);
        System.out.println("Before:"+ adamCell);
        adamCell.setCellValue("Trump");
        FileOutputStream outputStream= new FileOutputStream(path);
        workbook.write(outputStream);
        System.out.println("After: "+adamCell);



        //TODO Change Job ID For Trump to President,Dynamically
        for (int i=0; i<worksheet.getPhysicalNumberOfRows(); i++){
            if (worksheet.getRow(i).getCell(0).equals("Trump")){
                System.out.println("Before Election: "+worksheet.getRow(i).getCell(2));

                worksheet.getRow(i).getCell(2).setCellValue("Actor");
                System.out.println("After Election: "+worksheet.getRow(i).getCell(2));

            }
        }
        outputStream.close();
        inputStream.close();
        workbook.close();


















    }
}
