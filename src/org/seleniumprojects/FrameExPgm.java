package org.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameExPgm {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		WebElement parent = driver.findElement(By.xpath("//input[@name=\"fname\"]"));
		WebElement child = driver.findElement(By.xpath("//iframe[@src=\"innerFrame\"]"));
		driver.switchTo().frame(child);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("xyz@gmail.com");
	    driver.switchTo().parentFrame();
	    driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("Arun Kumar Manivannan");
	    driver.switchTo().frame(child);
	    WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
	    email.clear();
	    email.sendKeys("abc@gmail.com");
		
		

	}

}
