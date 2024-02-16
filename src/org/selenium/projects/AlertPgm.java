package org.selenium.projects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPgm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement simpleAlert = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[1]"));
		simpleAlert.click();
		WebElement alertOk = driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		alertOk.click();  
		Thread.sleep(3000);
		Alert alerts = driver.switchTo().alert();
		alerts.accept();
	
		

	}

}
