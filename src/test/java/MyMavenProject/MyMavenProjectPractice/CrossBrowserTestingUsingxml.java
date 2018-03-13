package MyMavenProject.MyMavenProjectPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingUsingxml {

WebDriver driver;

@Test
@Parameters("browser")
 
public void crossBro(String browser) throws InterruptedException {
 if (browser.equalsIgnoreCase("firefox")){
  driver=new FirefoxDriver();
  }
  
else if (browser.equalsIgnoreCase("chrome")){
System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\Chrome\\chromedriver.exe");
driver=new ChromeDriver();
}
else if (browser.equalsIgnoreCase("ie")){
//System.setProperty("webdriver.ie.driver","C:\\BrowserDrivers\\IE\\IEDriverServer64.exe");
System.setProperty("webdriver.ie.driver","C:\\BrowserDrivers\\IE\\IEDriverServer32.exe");
driver=new InternetExplorerDriver();
}

driver.manage().window().maximize();
driver.get("https://www.facebook.com");
Thread.sleep(4000);
driver.close();
}
}

