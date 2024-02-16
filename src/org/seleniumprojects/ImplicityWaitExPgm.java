package org.seleniumprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicityWaitExPgm {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]"));
		searchBox.sendKeys("aniwatch.to" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[text() = \"TV Series Anime\"]")).click();
		WebElement searchingBox = driver.findElement(By.xpath("//i[@class=\"fa fa-search\"]"));
		//driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		searchingBox.click();
		//searchingBox.sendKeys("Attack on Titan" + Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		searchingBox.sendKeys("Attack on Titan" + Keys.ENTER);
	}

}
