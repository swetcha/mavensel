package TC;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TC1 {
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
	}
	

}
