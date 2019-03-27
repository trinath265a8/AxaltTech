package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

	/**Dropdown/List Box/Combo Box
1. Print all the options available in the dropdown
2. Print first selected option from a dropdown
3. Select an option by value from a dropdown
4. Select an option by visible text from a dropdown
5. Select an option by index from a dropdown*/
	@Test
	public void DropDown() throws InterruptedException {

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
		Select Country=new Select(driver.findElement(By.name("CountryId")));
		List<WebElement> list=Country.getOptions();				
		for(int i=0;i<list.size();i++) {			
		System.out.println(list.get(i).getText());
		}
		
		/*for (WebElement i: list) {
			System.out.println(i.getText());
		}*/
		
		//2
		Select city1=new Select(driver.findElement(By.name("CountryId")));
		System.out.println(city1.getFirstSelectedOption().getText());
		
		
		
		//345
		Select city2=new Select(driver.findElement(By.name("CountryId")));
		city2.selectByValue("6");//It will select Canada  	
		
		city2.selectByVisibleText("Japan");
		System.out.println(city2);
		city2.selectByIndex(1);//It will select Bangladesh
		
		
	}

	

}
