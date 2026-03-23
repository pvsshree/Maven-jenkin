package gettingStarted;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.justdial.com/");
	System.out.println("Hey");
	System.out.println("URL is " + driver.getCurrentUrl());
	
	
	
	//Search
	 driver.findElement(By.xpath("//input[@id = 'main-auto']")).sendKeys("Laptop" + Keys.ENTER);
	System.err.println("good");
	
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id = 'main-auto']")));
	List<WebElement> searchresult = driver.findElements(By.xpath("//input[@id = 'main-auto']"));
	System.err.println("Dear");
	System.out.println("Size: " + searchresult.size());
	for(WebElement t : searchresult)
	{
		System.err.println("Danger");
		System.out.println("URL is " + driver.getCurrentUrl());
	System.out.println(t.getSize());
	}
	
	
	
	
	
	//driver.quit();

	
	
	} 

}
