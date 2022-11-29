package webtable;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tablecor {

	public static WebDriver driver;

	public static void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");

	}
public static  void getalldata() {
	List<WebElement> getall = driver
			.findElements(By.xpath("//table[@id=\"main_table_countries_today\"]/tbody[1]/tr/td"));
	for (WebElement data : getall) {
		System.out.println(data.getText());}

}
	

	public static void getPartiData() {

		List<WebElement> partiData = driver
				.findElements(By.xpath("//table[@id=\"main_table_countries_today\"]/tbody[1]/tr[14]/td[5]"));
		for (WebElement particular : partiData) {
			System.out.println("the particular value is :"+particular.getText());

		}
	}

	public static void onedata() {

		List<WebElement> oneline = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[15]/td"));
		for (WebElement line : oneline) {

			System.out.println(line.getText());
		}
		
		
	}
	public static  void coloumnwise() {

		List<WebElement>col = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr/td[7]"));
		for (WebElement colwise : col) {

			System.out.println("recovered case: "+colwise.getText());
		}
		
		
	}

	public static void main(String[] args) {
		browser();
		getPartiData();
		onedata();
		coloumnwise();
		getalldata();
		

	}

}
