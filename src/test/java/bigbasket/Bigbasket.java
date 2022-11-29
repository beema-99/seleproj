package bigbasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbasket {
	public static WebDriver driver;
	
	public static void browserLaunch() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.bigbasket.com/");
	}
	public static  void typeRice() {

		
	WebElement input = driver.findElement(By.id("input"));
		
		input.sendKeys("rice");
		
	}
	
	
	public static void main(String[] args) {
		browserLaunch();
		typeRice();
	}
	

}
