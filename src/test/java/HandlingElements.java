import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingElements {

public static void main(String[]args) {
	
	WebDriver driver=new EdgeDriver();
	driver.findElement(By.xpath(""));
	driver.close();
	
	Random ran=new Random();
	int rannum = ran.nextInt(10);
    System.out.println(rannum);
    
}
}
