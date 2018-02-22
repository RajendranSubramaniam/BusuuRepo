package MyMavenProject.MyMavenProjectPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyBeforeClassAfterClass1 {

public WebDriver driver;

@BeforeClass
public void launchBrowser(){
driver = new FirefoxDriver();
}

@Test (priority = 1)
public void verifyTitle1(){
driver.get("https://www.gmail.com");
String pageTitle = driver.getTitle();
Assert.assertEquals("Gmail", pageTitle);
}

@Test (priority = 2)
public void verifyTitle2(){
driver.get("https://www.yahoo.com");
String pageTitle = driver.getTitle();
Assert.assertEquals("Yahoo", pageTitle);
}

@AfterClass
public void closeBrowser(){
driver.close();
}

}

