import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple {

	@Test()
	public void CreateTest() throws Throwable {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
//		driver.findElement(By.xpath("//button[text()='X']")).click();
//		WebElement sign = driver.findElement(By.xpath("//span[text()='Sign in']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(sign).perform();
		Reporter.log("We");
		driver.close();
		
//		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//		int count=allLinks.size();
//		System.out.println(count);
//		System.out.print(allLinks);
//		driver.close();
	}
}
