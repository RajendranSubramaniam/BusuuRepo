package MyMavenProject.MyMavenProjectPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {
	
	public static WebDriver driver;
	public static int browser;
	public static String browsername;
	
	
	public static void main(String[] args) throws InterruptedException {
	

		
	/*WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	
	String pageTitle = driver.getTitle();
	
	if(pageTitle.equals("Google")){
		System.out.println("Google Application launched - Passed");
	}
	else {
		System.out.println("Google Application Not launched - Failed");
	}
	driver.close();*/
		
/*	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	String pageTitle = driver.getTitle();
	
	if(pageTitle.equals("Google")){
		System.out.println("Google Application launched - Passed");
	}
	else {
		System.out.println("Google Application Not launched - Failed");
	}
	driver.close();*/
		
    
	for (browser = 1; browser <=3; browser++){
		if(browser==1) {
			driver = new FirefoxDriver();
			browsername = "Mozilla FireFox Browser: ";
			}
		
		else if (browser==2){
			System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			browsername = "Chrome Browser: ";
		    }
		
		else if (browser==3){
			System.setProperty("webdriver.ie.driver", "C:\\BrowserDrivers\\IE\\IEDriverServer64.exe");
			driver = new InternetExplorerDriver();
			browsername = "IE Browser: ";
		    }
				
		driver.get("https://www.google.com");
		
		String pageTitle = driver.getTitle();
		
		if(pageTitle.equals("Google")){
			System.out.println(browsername + " - Google Application launched - Passed");
		}
		else {
			System.out.println(browsername + " - Google Application Not launched - Failed");
		}
		driver.close();
	    }
    
}
}
