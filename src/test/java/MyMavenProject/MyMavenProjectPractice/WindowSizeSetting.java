package MyMavenProject.MyMavenProjectPractice;

import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowSizeSetting {

    @Test
    public void verifyTitle() throws Exception {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.gmail.com");
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	
	Dimension n = new Dimension(360,592);
	driver.manage().window().setSize(n);
	String pageTitle = driver.getTitle();
	
	Assert.assertEquals(pageTitle, "Gmail");
	
	
	}
	}

