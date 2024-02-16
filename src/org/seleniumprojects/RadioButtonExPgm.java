package org.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtonExPgm {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		WebElement optionAnyone = driver.findElement(By.xpath("(//label[@class=\"radio\"]//child::input)[1]"));
		boolean optionAnyoneisSelected = optionAnyone.isEnabled();
		System.out.println("Is option anyone selected ? :" + optionAnyoneisSelected);
		boolean optionAnyoneisEnabled = optionAnyone.isEnabled();
		System.out.println("Is option anyone enabled? : " + optionAnyoneisEnabled);
		
	}

}
