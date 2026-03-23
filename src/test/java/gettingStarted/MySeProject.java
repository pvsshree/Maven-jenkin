package gettingStarted;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySeProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\vsoma\\OneDrive\\Desktop\\MySeProject\\login.html");
		driver.findElement(By.xpath("//input [@id = 'username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input [@id = 'password']")).sendKeys("1234");
		
			System.out.println("Hiu");
	}

}
