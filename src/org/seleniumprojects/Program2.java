package org.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.get("https://www.irctc.co.in/nget");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		WebElement search = driver.findElement(By.className("gLFyf"));
		search.sendKeys("aniwatch.to" + Keys.ENTER);
		String titleOfAniwatch = driver.getTitle();
		String urlOfAniWatch = driver.getCurrentUrl();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().to(currentUrl);
		driver.navigate().to(urlOfAniWatch);
		driver.navigate().refresh();
		driver.quit();
		

	}

}
