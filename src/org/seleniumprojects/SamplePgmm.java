package org.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SamplePgmm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        WebElement name= driver.findElement(By.xpath("//input[@type=\"text\"]"));
        name.sendKeys("dhanatg11");        
        WebElement pswd=driver.findElement(By.xpath("//input[@type=\"password\"]"));
        pswd.sendKeys("Dhanam@11"); 
        driver.findElement(By.xpath("//input[@type=\"Submit\"]")).click();

	}

}
