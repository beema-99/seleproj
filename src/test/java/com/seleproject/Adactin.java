package com.seleproject;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
	public static void adactinLogin() throws InterruptedException, Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Beema.M\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		WebElement userid = driver.findElement(By.name("username"));
		userid.sendKeys("beemsiraj");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("qwertyuiop");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		WebElement locations = driver.findElement(By.name("location"));
		Select location =new Select(locations);
		location.selectByValue("London");
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select room=new Select(hotel);
		room.selectByValue("Hotel Sunshine");
		WebElement types = driver.findElement(By.name("room_type"));
		Select range =new Select(types);
		range.selectByValue("Double");
		WebElement count = driver.findElement(By.name("room_nos"));
		Select num =new Select(count);
		num.selectByValue("6");
		
		
		WebElement erase = driver.findElement(By.name("datepick_in"));
		erase.clear();
		WebElement checkin = driver.findElement(By.name("datepick_in"));
		checkin.sendKeys("17/11/2022");
		
		WebElement eras= driver.findElement(By.name("datepick_out"));
		eras.clear();
		WebElement checkout = driver.findElement(By.name("datepick_out"));
		checkout.sendKeys("20/11/2022");
		
		WebElement adults = driver.findElement(By.name("adult_room"));
		Select size =new Select(adults);
		size.selectByValue("3");
		WebElement childs = driver.findElement(By.name("child_room"));
		Select kid =new Select(childs);
		kid.selectByValue("1");
		WebElement button = driver.findElement(By.id("Submit"));
		button.click();
		Thread.sleep(2000);
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("beemsiraj");
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("beemsiraj");
		WebElement addrs = driver.findElement(By.name("address"));
		addrs.sendKeys("12a indranagar america");
		WebElement ccnum = driver.findElement(By.name("cc_num"));
		ccnum.sendKeys("1234 1234 1234 1234");
		Thread.sleep(2000);
		WebElement cctype = driver.findElement(By.name("cc_type"));
		Select ccardtype= new Select(cctype);
		ccardtype.selectByValue("VISA");
		
		WebElement expmonth = driver.findElement(By.name("cc_exp_month"));
		Select expire= new Select(expmonth);
		expire.selectByValue("6");
		WebElement expyear = driver.findElement(By.name("cc_exp_year"));
		Select year= new Select(expyear);
		year.selectByValue("2022");
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("588");
		Thread.sleep(2000);
		
		driver.findElement(By.name("book_now")).click();
		Thread.sleep(7000);

		TakesScreenshot source=(TakesScreenshot) driver;
		File source1=source.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Beema.M\\eclipse-workspace\\seleproject\\screens\\img1.png");
		FileUtils.copyFile(source1,dest);
		
		
		Thread.sleep(5000);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException, Throwable {
		
		adactinLogin();
		
		
	}
	
	
	
	
	
	

}
