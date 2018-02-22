package MyMavenProject.MyMavenProjectPractice;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class totalLinks {

	public static void main(String[] args) throws Exception {
    WebDriver driver = new FirefoxDriver();
    //FirefoxDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    Thread.sleep(3000);
   
    //driver.navigate().to("https://google.com");
    //String x = "Forgotten account?";
    
    //how to count all the links from a web page
    //List <WebElement> link_names = driver.findElements(By.tagName("a"));
    //System.out.println("Total links are " + link_names.size());
    
    //how to display dropdown values in the console
    //WebElement eleDropdown = driver.findElement(By.xpath(".//*[@id='month']"));
    //List <WebElement> listDropdown = eleDropdown.findElements(By.tagName("option"));
    //System.out.println("Total dropdown values  are (another way)" + listDropdown.size());
    
    //OR
    
    //Select eleDropdown = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
    //List <WebElement> listDropdown = eleDropdown.getOptions();
    //System.out.println("Total dropdown values  are " + listDropdown.size());
    
    //for (int i=0; i<listDropdown.size(); i++) {
    //System.out.println(listDropdown.get(i).getText());
    //}
    
    //how to print all the links from a web page and click on one particular link. This will throw error because page is
    //page is getting redirected when it is clicking 'Forgotten account' link. May be this code is suitable for radio or checkbox etc...
    //for(int i=0; i<link_names.size(); i++) {
    //System.out.println(link_names.get(i).getText());//this will print all the links from a web page
    //String url =  link_names.get(i).getAttribute("href");
    //System.out.println(url);
    //if(url.contains("https://www.facebook.com/recover/initiate?lwv=110")){
    //link_names.get(i).click();
    //}
  	
    //}
    //Thread.sleep(5000);
    //how to get width and height of edit field?
    //int width = driver.findElement(By.xpath(".//*[@id='email']")).getSize().getWidth();
    //int height = driver.findElement(By.xpath(".//*[@id='email']")).getSize().getHeight();
   	//System.out.println(width);
   	//System.out.println(height);
   	
    //how to get attribute(image path) of the web element(image)
    //String imgattri = driver.findElement(By.tagName("img")).getAttribute("src");
	//System.out.println(imgattri);
	
	//how to get typed text from edit field?
	//driver.findElement(By.id("email")).sendKeys("Rajendran");
   	//String loginText = driver.findElement(By.id("email")).getAttribute("value");
   	//System.out.println(loginText);
 	    
	//how to click particular link in a web page
   	//driver.findElement(By.linkText("Forgotten account?")).click();//clicks a link
	
	//how to get color and background color of webelement?
    //String color = driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).getCssValue("color");
   	//String backcolor = driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).getCssValue("background-color");
   	//System.out.println(color);
   	//System.out.println(backcolor);
   	
   	
   	//how to capture screenshot when assert.assertEqual() fails?
	//driver.findElement(By.id("email")).sendKeys("Rajendran");
   	//EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
   	//File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
   	//FileUtils.copyFile(srcFile, new File("C:\\Users\\raju_\\Screenshot.png"));
   	////FileUtils.copyFile(srcFile, new File("./Screenshots/facebook.png"));--->This will place screen in project folder
   	//System.out.println("Screenshot taken");
   	  
    //how to get window handler name?
    //String windName = driver.getWindowHandle();
    //System.out.println("Window name is :" + windName);
    
    //how to use try catch method? 
    //try {
    //WebElement eleBtn = driver.findElement(By.name("websubmitdeletethis"));
    //System.out.println("Button found " + eleBtn);
    //}
    //catch (Exception e) {
    //System.out.println("Button NOT found" + e.getMessage());
    //}
    
    
   	//driver.close();
}
}
