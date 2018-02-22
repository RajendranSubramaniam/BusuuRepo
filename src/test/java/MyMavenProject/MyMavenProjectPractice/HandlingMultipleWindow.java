package MyMavenProject.MyMavenProjectPractice;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleWindow {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.co.uk/2017/");
	String parent_window = driver.getWindowHandle();
	driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
	Set<String> all_windows = driver.getWindowHandles();
	
	for(String child:all_windows){
	if(!parent_window.equalsIgnoreCase(child)){
		driver.switchTo().window(child);
		System.out.println("Child window name is " + child);
		driver.findElement(By.name("q")).sendKeys("Rajendran Subramaniam");
		//driver.findElement(By.xpath("//input[@id = 'lst-ib' and class='gsfi']")).sendKeys("Rajendran Subramaniam");
		}
	
	}
		
	}

}
