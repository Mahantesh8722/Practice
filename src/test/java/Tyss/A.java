package Tyss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A {

	public static void main(String[] args) throws FileNotFoundException {
	WebDriver driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.manage().window().maximize();
//	driver.get("https://demoqa.com/browser-windows");
//	driver.findElement(By.xpath("//button[text()='New Window']")).click();
//	Set<String> allwh = driver.getWindowHandles();
//	int count = allwh.size();
//	System.out.println(count);
//	for(String wh : allwh) {
//	driver.switchTo().window(wh);
//	driver.close();
//	}
	
	FileInputStream fis = new FileInputStream("./data/commondata.property");
	Property p = new Property();

	}
	}
