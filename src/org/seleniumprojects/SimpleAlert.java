package org.seleniumprojects;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement searchBox = driver.findElement(By.xpath("//div//textarea[@jsname=\"yZiJbe\" or class=\"gLFyf\"]"));
		searchBox.sendKeys("https://demo.automationtesting.in/Alerts.html" + Keys.ENTER);
		driver.findElement(By.xpath("(//h3[@class=\"LC20lb MBeuO DKV0Md\"])[1]")).click();
		//driver.findElement(By.xpath("(//a[@data-toggle=\"tab\" or class=\"analystic\"])[1]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(2000);
	    simpleAlert.accept();
	    driver.findElement(By.xpath("(//li//a[@class=\"analystic\"])[2]")).click();//conformation alert
	    driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
	    Alert confirmAlert = driver.switchTo().alert();
	    System.out.println(confirmAlert.getText()); 
	    Thread.sleep(2000);
	    confirmAlert.accept();
	    driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
	    driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
	    Alert promptAlert = driver.switchTo().alert();
	    promptAlert.sendKeys("Arun Kumar Manivannan");
	    System.out.println(promptAlert.getText());
	    Thread.sleep(2000);
	    promptAlert.accept();
		
		

	}

}
