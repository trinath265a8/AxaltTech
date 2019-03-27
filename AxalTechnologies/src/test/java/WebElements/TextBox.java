package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBox {

	/**
	 * 1. How to Type in text box using Selenium Web Driver 2. How to get a Text Box
	 * value using Selenium Web Driver 3. How to read the placeholder value of a
	 * Text Box using getAttribute() method 4. Deleting/clear text from the Text Box
	 * 5. Check if Text Box is enabled/disabled
	 * 
	 * @throws InterruptedException
	 */

	@Test
	public void TextBox1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qamagnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("trinath5a8@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("8121510785");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Employee")).click();
		driver.findElement(By.linkText("Create")).click();

		

		WebElement ele = driver.findElement(By.id("FirstName"));
		ele.sendKeys("Trinath");

		System.out.println(ele.getAttribute("value"));
		
		System.out.println(ele.getAttribute("placeholder"));
		
		ele.clear();
				
		if(ele.isEnabled()) {
			System.out.println("It is working");
		}
		else
			System.out.println("It is not working");

	}

}
