package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	/**Radio Button / Check Box
1. Selecting the Radio Button by Label Text / value
2. Find out number of elements in a radio group
3. Find out all radio button values
4. How to get the selected radio button label text?
5. Check if Radio Button is selected?
6. Check if Radio Button is enabled or disabled?*/
	@Test
	public void RadioButton1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qamagnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("trinath5a8@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("8121510785");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Employee")).click();
		driver.findElement(By.linkText("Create")).click();

		//1
		WebElement ele=driver.findElement(By.id("rdbFemale"));
		ele.click();
		System.out.println(ele.getAttribute("value"));	
		
		
		//2
		List<WebElement> k=driver.findElements(By.name("rdbGender"));
		System.out.println(k.size());
		
		
		//3
		WebElement s=driver.findElement(By.id("rdbMale"));
		s.click();
		System.out.println(s.getAttribute("value"));		
		
		//4
		String g=driver.findElement(By.id("rdbMale")).getText();
		   System.out.println(g);
		
		
		//5
		WebElement ele1=driver.findElement(By.id("rdbMale"));
		if(ele1.isSelected()) {
			System.out.println("It is selected");
		}
		else {
			System.out.println("It is not selected");
		}
		
		//6
		WebElement ele2=driver.findElement(By.id("rdbMale"));
		if(ele2.isEnabled()) {
			System.out.println("It is Enable");
		}
		else {
			System.out.println("It is Disable");
		}
		
		
		
		
}
}