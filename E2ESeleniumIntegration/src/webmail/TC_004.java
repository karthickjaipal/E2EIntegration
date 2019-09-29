package webmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_004 {
	
	@Test
	public void loginWebMail()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webmail.thbs.com/a/index.php");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("Helloo");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hellopwd");
		driver.quit();
	}

}
