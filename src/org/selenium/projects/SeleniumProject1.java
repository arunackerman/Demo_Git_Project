package org.selenium.projects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumProject1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//EdgeDriver driver1 = new EdgeDriver();
		driver.get("https://www.google.com");
		String getCuttentUrl = driver.getCurrentUrl();
		TakesScreenshot screenShot = (TakesScreenshot)driver; //converting webdriver interface into screenshot interface
		
		
	}

}
