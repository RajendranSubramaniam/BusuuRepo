package MyMavenProject.MyMavenProjectPractice;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyGmailTitle {

    @Test 
    public void abc() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.gmail.com");
	String pageTitle = driver.getTitle();
	
	Assert.assertEquals(pageTitle, "Gmail");
	}
	
	@Test 
	public void bcd() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();

		Assert.assertEquals(pageTitle, "Gmail");
	}
	

	@Test 
	public void cde() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();

		Assert.assertEquals(pageTitle, "Gmail");
	}
}

