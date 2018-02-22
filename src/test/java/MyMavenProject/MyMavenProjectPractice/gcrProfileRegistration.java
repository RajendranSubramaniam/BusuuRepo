package MyMavenProject.MyMavenProjectPractice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class gcrProfileRegistration {

@Test
public void gcrProfileregistration1() throws BiffException, IOException{
//public static void main(String[] args) throws Exception, Exception {
		
		File f = new File("C:\\Users\\raju_\\workspace\\seleniumProject\\Datasheet\\TestData.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		String firstname = s.getCell(0,9).getContents();
		String lastname = s.getCell(0,10).getContents();
		String dateofbirth = s.getCell(0,11).getContents();
		String emailaddress = s.getCell(0,12).getContents();
		String company = s.getCell(0,13).getContents();
		String streetaddress = s.getCell(0,14).getContents();
		String suburb = s.getCell(0,15).getContents();
		String postcode = s.getCell(0,16).getContents();
		String city = s.getCell(0,17).getContents();
		String state = s.getCell(0,18).getContents();
		String telephonenumber = s.getCell(0,19).getContents();
		String fax = s.getCell(0,20).getContents();
		String password = s.getCell(0,21).getContents();
		String pwconfirmation = s.getCell(0,22).getContents();

		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='tdb4']/span[2]")).click();
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.id("dob")).sendKeys(dateofbirth);
		driver.findElement(By.name("email_address")).sendKeys(emailaddress);
		driver.findElement(By.name("company")).sendKeys(company);
		driver.findElement(By.name("street_address")).sendKeys(streetaddress);
		driver.findElement(By.name("suburb")).sendKeys(suburb);
		driver.findElement(By.name("postcode")).sendKeys(postcode);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		
		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByIndex(3);
		
		
		driver.findElement(By.name("telephone")).sendKeys(telephonenumber);
		driver.findElement(By.name("fax")).sendKeys(fax);
		driver.findElement(By.name("newsletter")).click();
		
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmation")).sendKeys(pwconfirmation);
		
		driver.findElement(By.id("tdb4")).click();
		
		driver.close();
		
		
	}

}
