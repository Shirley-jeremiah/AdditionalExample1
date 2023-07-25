package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectUsername {
	
	@Test
	@Parameters({"username","password"})
	public void logindetails(String uname,String pword) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement loginBtn =driver.findElement(By.xpath("//input[@name='username']"));
		loginBtn.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys(pword);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
			
	}

}
