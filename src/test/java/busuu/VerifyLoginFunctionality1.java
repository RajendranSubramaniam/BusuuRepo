package busuu;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class VerifyLoginFunctionality1 {
public static void main(String[] args) throws BiffException, IOException {
	
File f = new File("C:\\Users\\raju_\\workspacemaven\\MyMavenProjectPractice\\TestData.xls");
Workbook w = Workbook.getWorkbook(f);
Sheet s = w.getSheet("Sheet1");
String userName = s.getCell(0,1).getContents();//0 is column, 1 is row
String password = s.getCell(1,1).getContents();//1 is column, 1 is row
WebDriver driver = new FirefoxDriver();
driver.get("https://www.busuu.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("Log in")).click();

/*driver.findElement(By.id("login-form-email")).sendKeys("sand_rajusss@yahoo.co.in");
driver.findElement(By.id("login-form-password")).sendKeys("raj123");*/

driver.findElement(By.id("login-form-email")).sendKeys(userName);
driver.findElement(By.id("login-form-password")).sendKeys(password);
driver.findElement(By.id("login-form-submit")).click();

driver.findElement(By.xpath("//a[@href='#' and @class='icon modal-promotion__close']")).click();
String URL = "https://www.busuu.com/dashboard#/timeline/regular/a1";
String URL1 = driver.getCurrentUrl();
if (URL.equals(URL1)) {
System.out.println("Default landing page is successfully displayed - Passed");
}
else 
{
System.out.println("Default landing page is NOT displayed - Failed");
}
driver.close();
}
}
