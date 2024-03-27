import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample11 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("amazon");
//		WebDriverWait wait = new WebDriverWait(driver, null);
//		wait.until(ExpectedConditions.titleContains("google"));
		List<WebElement> a = driver.findElements(By.xpath("//span[contains(.,'amazon')"));
		int count =a.size();
		for(int i=0; i<count;i++) {
			if(i==2) {
				a.get(i).click();
			}
		}
		driver.quit();
	}
}
