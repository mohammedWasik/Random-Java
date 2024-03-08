package Utility;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadXlsxData {

    @DataProvider(name="login-data")
     public String[][] getData(Method method) throws IOException,FileNotFoundException {
        String sheetName=method.getName();
        File f = new File("src/test/resources/test.xlsx");
        FileInputStream fis = new FileInputStream(f);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet_name = wb.getSheet(sheetName);

        int totalRows = sheet_name.getLastRowNum();
        System.out.println(totalRows);
        Row rowCells = sheet_name.getRow(0);
        int totalCol = rowCells.getLastCellNum();
        System.out.println(totalCol);

        DataFormatter dataFormatter = new DataFormatter();
        String testData[][] = new String[totalRows][totalCol];

        for (int i=1;i<=totalRows;i++){
            for(int j=0;j<totalCol;j++){
                testData[i-1][j]=dataFormatter.formatCellValue(sheet_name.getRow(i).getCell(j));
                System.out.println(testData[i-1][j]);
            }
        }
        return testData;

    }
}
