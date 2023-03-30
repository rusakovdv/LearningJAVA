package lr10.Task4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class XLSX2 {
    public static void main(String[] args) throws IOException {
        java.io.File dir1 = new java.io.File (".");
        System.out.println ("Current dir : " + dir1.getCanonicalPath());
        String filePath = null;
        try{
            filePath = "src/lr10/Task4/XLSX.xlsx";
            FileInputStream inputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        FileInputStream inputStream = new FileInputStream(filePath);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheet("Tovari");

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.println(cell.toString() + "\t");
            }
        }


    }
}
