package MyMavenProject.MyMavenProjectPractice;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyGmailTitleUsingDependsOnMethod {

    @Test
    public void abc() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.gmail.com");
	String pageTitle = driver.getTitle();
	
	Assert.assertEquals(pageTitle, "Gmail");
	}
	
	@Test (dependsOnMethods = {"cde"})
	public void bcd() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();

		Assert.assertEquals(pageTitle, "Gmail");
	}
	

	@Test (dependsOnMethods = {"abc"})
	public void cde() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();

		Assert.assertEquals(pageTitle, "Gmail");
	}
}

