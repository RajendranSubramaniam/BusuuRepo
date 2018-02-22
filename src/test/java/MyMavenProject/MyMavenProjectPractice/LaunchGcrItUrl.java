package MyMavenProject.MyMavenProjectPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchGcrItUrl {
	public static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//driver.get("www.gcrit.com/build3/admin/login.php");
		//driver.get("https://www.google.co.uk");
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/admin/index.php")){
		System.out.println("Log in is successful - Passed");
	    }
		else
		{
		System.out.println("Log in is Unsuccessful - Failed");	
		}	
		
	}
	}
