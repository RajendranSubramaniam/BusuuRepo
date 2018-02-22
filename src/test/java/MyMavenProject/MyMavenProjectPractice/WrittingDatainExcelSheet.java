package MyMavenProject.MyMavenProjectPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class WrittingDatainExcelSheet {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		File f = new File("C:\\Users\\raju_\\workspace\\seleniumProject\\Datasheet\\WriteTestData.xls");
		
		WritableWorkbook w = Workbook.createWorkbook(f);
		WritableSheet s = w.createSheet("First Sheet", 2);
		Label label = new Label(5,8, "I am Hemalatha");
		s.addCell(label);
		
		Label label1 = new Label(8,8, "12.1245");
		s.addCell(label1);
		
		Label label2 = new Label(10,10, "12/Dec/2017");
		s.addCell(label2);
		
		
		w.write();
		w.close();
		

	}

}
