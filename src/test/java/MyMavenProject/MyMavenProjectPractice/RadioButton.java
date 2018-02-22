package MyMavenProject.MyMavenProjectPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("http://seleniumpractise.blogspot.co.uk/2016/08/how-to-automate-radio-button-in.html");
List<WebElement>radios = driver.findElements(By.xpath("//input[@type='radio' and @name='lang']"));
System.out.println("Total Radio buttons are" + radios.size());

for(int i=0; i<radios.size(); i++){
WebElement local_radio = radios.get(i);
String value = local_radio.getAttribute("value");
if(value.equalsIgnoreCase("PYTHON")){
local_radio.click();
 }
 }
}
}

