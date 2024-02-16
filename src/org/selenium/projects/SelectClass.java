package org.selenium.projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement All = driver.findElement(By.xpath("//select[@title=\"Search in\"]"));
		Select select = new Select(All);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		select.selectByIndex(1); //Alexa skills
		select.selectByValue("search-alias=computers"); // Computer
		select.selectByVisibleText("Furniture"); //Furniture
				
	}

}
