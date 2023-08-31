
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownHandle {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {

		System.setProperty("WebDriver.Driver.ChromeDriver",
				"C:\\Users\\Shiv\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/bus-tickets/");
		Thread.sleep(2000);
	}

	@Test
	public void ClickOnUserName() throws InterruptedException {

		// Click on UserName
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).click();
	}

	@Test
	public void EnterUserName() throws InterruptedException {

		// Enter UserName
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("8888888888");
	}

	@Test
	public void ClickOnContinue() throws InterruptedException {
		// Click on Continue
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]")).click();
		Thread.sleep(2000);
	}

	@AfterTest
	public void tarminateBrowser() {
		driver.close();
	}
}
