package mavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {

	@Parameters("Browser")
	@Test
	public void startBrowser(String browserName)
	
	{
		System.out.println("Parameter name is" +browserName);

		System.out.println("WEBHOOK ADDED");
		
		WebDriver driver = null;
		if (browserName.contains("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
	
		 else if(browserName.contains("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		 }
		 //	WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Assert.assertTrue(driver.getTitle().contains("Orange"), "Title does not match");
		System.out.println("This Maven Jenkins");

		int y = 30;
		driver.quit();
	}
}
