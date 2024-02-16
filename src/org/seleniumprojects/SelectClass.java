package org.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement optionAll = driver.findElement(By.xpath("//select[@aria-describedby=\"searchDropdownDescription\"]"));
		Select options = new Select(optionAll);
		options.selectByIndex(1);
		Thread.sleep(2000);
		options.selectByVisibleText("Baby"); // Baby option
		Thread.sleep(2000);
		options.selectByValue("search-alias=amazon-devices"); //Amazon divices
	}
	
}

