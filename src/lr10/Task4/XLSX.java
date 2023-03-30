package lr10.Task4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
public class XLSX {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Tovari");
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Tovar");
        headerRow.createCell(1).setCellValue("Haracteristiki");
        headerRow.createCell(2).setCellValue("Stoimost");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Kniga");
        dataRow1.createCell(1).setCellValue("Janr: Fantastika, Avtor: Ivanov I.I.");
        dataRow1.createCell(2).setCellValue(500);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Computer");
        dataRow2.createCell(1).setCellValue("Processor: Intel Core i5, Operativnaya pamyat: 8 Gb");
        dataRow2.createCell(2).setCellValue(25000.0);

        String filePath = "src/lr10/Task4/XLSX.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Dannie zapisani v file: " + filePath);

    }
}
