package TestingPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Open {
@Test	
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalu\\eclipse-workspace\\ExampleProject\\Reference\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}

}
