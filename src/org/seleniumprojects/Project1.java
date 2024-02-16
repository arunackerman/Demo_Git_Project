package org.seleniumprojects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		String pageSoure = driver.getPageSource();
//		System.err.println(pageSoure);
//		driver.getTitle();
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
//		int hashCode = driver.hashCode();
//		System.out.println("The hashcode is " + hashCode);
//		//driver.close();
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]"));
		searchBox.sendKeys("aniwatch.to" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[text() = \"TV Series Anime\"]")).click();
		WebElement searchingBox = driver.findElement(By.xpath("//i[@class=\"fa fa-search\"]"));
		searchingBox.click();
		driver.findElement(By.xpath("//input[@name=\"keyword\"]")).sendKeys("Attack on Titan " + Keys.ENTER);
		
		
	}

}
