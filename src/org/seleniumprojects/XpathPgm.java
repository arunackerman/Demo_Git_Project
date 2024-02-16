package org.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathPgm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		Thread.sleep(3000);
		email.sendKeys("xyz@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\" and @placeholder=\"Password\"]"));
        Thread.sleep(3000);
		password.sendKeys("12346");
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
        Thread.sleep(3000);
        driver.quit();
	}

}
