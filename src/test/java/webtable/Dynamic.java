package webtable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Dynamic {

	public static WebDriver driver;
	public static int indexOfPopulation,indexofTotalCases;
	public static int indexOfCountry;

	public static void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");

	}
	
	
	
	
	public static  void rowwisedata() {
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/td"));
		for (int i = 0; i < row.size(); i++) {
			List<WebElement> rowwise = row.get(i).findElements(By.tagName("td"));
			
			for (int j = 0; j < rowwise.size(); j++) {
				if (rowwise.get(j).getText().equalsIgnoreCase("india")) 
				{
					
				}
				
			}
			
		}
		
		
		
		
		
		
	}
	public static void getonedata() {
		//Map<Integer, String> getallhead=new LinkedHashMap<Integer, String>();
				
						List<WebElement> allheader = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
				for (int i = 0; i < allheader.size(); i++) {
					
					String Header= allheader.get(i).getText();
					String headerText = Header.replaceAll("\n", " ");
					//getallhead.put(i,Header);
					
					if (headerText.contains("Population")) {
						indexOfPopulation=i;
						System.out.println("num of count: " + indexOfPopulation);
					}else if (headerText.contains("Country")) { 
						indexOfCountry=i;
					
						 
						}else if (headerText.contains("Total Cases")) {
							indexofTotalCases=i;
							System.out.println("index of totalcases is" + indexofTotalCases);
							
						}
					
						 
				} 
						
			
				
					

	}



					
				
				
				
			
			
		
		
		
		

		
		
		
		
		
	

	public static void main(String[] args) {
		browser();
		getonedata();
		
	}}
	

