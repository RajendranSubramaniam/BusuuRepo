package MyMavenProject.MyMavenProjectPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataFromExcelSheet {
public static void main(String[] args) throws Exception, Exception {

	File f = new File("C:\\Users\\raju_\\workspace\\seleniumProject\\Datasheet\\TestData.xls");
	Workbook w = Workbook.getWorkbook(f);
	Sheet s = w.getSheet("Sheet1");
	String userName = s.getCell(0,1).getContents();//0 is column, 1 is row
	String password = s.getCell(1,1).getContents();//1 is column, 1 is row
		
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.gcrit.com/build3/admin/login.php");
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys(userName);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.id("tdb1")).click();
	
	String url = driver.getCurrentUrl();
	if (url.equals("http://www.gcrit.com/build3/admin/index.php")) {
	System.out.println("Login is successful - Passed");
	}
	else
	{
	System.out.println("Login is Unsuccessful - Failed");
	}
	driver.close();
	
	
	
}
			
}