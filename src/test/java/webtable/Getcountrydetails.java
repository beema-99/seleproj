package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getcountrydetails {

	public static WebDriver driver;
	public static int indexofTotalCases;
	public static int indexOfTotalRecovered, indexOfTotalDeaths;

	public static void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
	}

	public static void getdata() {

		List<WebElement> allheader = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int i = 0; i < allheader.size(); i++) {

			String Header = allheader.get(i).getText();
			String headerText = Header.replaceAll("\n", " ");

			if (headerText.equalsIgnoreCase("Total Cases")) {
				
				indexofTotalCases = i;
				System.out.println(indexofTotalCases );
			} else if (headerText.contains("Total Deaths")) {
				indexOfTotalDeaths = i;
				System.out.println(indexOfTotalDeaths );

			} else if (headerText.contains("Total Recovered")) {
				indexOfTotalRecovered = i;
				System.out.println(indexOfTotalRecovered );
			}
		}
	}

	public static void getmycountry(String Countryname) {

		List<WebElement> headdata = driver
				.findElements(By.xpath("//table[@id=\"main_table_countries_today\"]/tbody/tr"));
		System.out.println(headdata.size());
		for (int i = 0; i < headdata.size(); i++) {
			List<WebElement> coldata = headdata.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < coldata.size(); j++) {
				if (coldata.get(j).getText().equalsIgnoreCase(Countryname)) {

					System.out.println("Total cases: " + Countryname + "=" + coldata.get(indexofTotalCases).getText());
					System.out.println("Total death:" + Countryname + "=" + coldata.get(indexOfTotalDeaths).getText());
					System.out.println(
							"Total recovered " + Countryname + "=" + coldata.get(indexOfTotalRecovered).getText());
					System.exit(0);

				}
			}
		}

	}

	public static void main(String[] args) {
		browser();
		getdata();
		getmycountry("iraq");
	}

}
