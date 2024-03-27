
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.*;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Finsall {
	


	public static void main(String[] args) throws Throwable {

		DataFormatter dataFormatter = new DataFormatter();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://finsall.co.in/portal/#/onboard/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("3333333333");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1");
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-block btn-lg']")).click();
		String userHome = System.getProperty("user.home");

	    String filePath = userHome + File.separator + "Downloads" + File.separator + "testData.xlsx";

		FileInputStream fis=new FileInputStream(filePath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		 int totalRows = sh.getLastRowNum();	
		 
		for (int rowIndex = 1; rowIndex <= totalRows; rowIndex++) {
            processRow(driver, wait, sh.getRow(rowIndex), dataFormatter,sh);
        }
	}

	private static void processRow(WebDriver driver, WebDriverWait wait, Row row, DataFormatter dataFormatter,Sheet sh) throws InterruptedException {
		Random random = new Random();
		int no = random.nextInt(9000)+1000;
		WebElement cnd=driver.findElement(By.xpath("//h4[text()='Enter Agent Details']"));
		wait.until(ExpectedConditions.visibilityOf(cnd));
		WebElement title = driver.findElement(By.xpath("//select[@name='title']"));
		String Title=dataFormatter.formatCellValue(row.getCell(0));
		//title.click();
		Select sc=new Select(title);
		sc.selectByValue(Title);

		String Fname =dataFormatter.formatCellValue(row.getCell(1));
		System.out.println(Fname);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Fname);

		String Lname = dataFormatter.formatCellValue(row.getCell(2));
		System.out.println(Lname);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(Lname);

		String mob=dataFormatter.formatCellValue(row.getCell(3));
		System.out.println(mob);
		driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys(mob);

		String role = dataFormatter.formatCellValue(row.getCell(4));
		WebElement Role = driver.findElement(By.xpath("//select[@name='genericParam']"));	
		Role.click();
		Select sc1=new Select(Role);
		sc1.selectByVisibleText(role);

		String agentType = dataFormatter.formatCellValue(row.getCell(5)).toUpperCase();
		WebElement Agent = driver.findElement(By.xpath("//select[@name='uniqueIdentifierId']"));
		Agent.click();
		Select sc2=new Select (Agent);
		Thread.sleep(2000);
		sc2.selectByVisibleText(agentType);

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		Thread.sleep(2000);
		String Email = dataFormatter.formatCellValue(row.getCell(6));
		System.out.println(no+""+Email);
		driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys(no+""+Email);

		String Add1 = dataFormatter.formatCellValue(row.getCell(7));
		System.out.println(Add1);
		driver.findElement(By.name("addressLine1")).sendKeys(Add1);

		String Add2 =  dataFormatter.formatCellValue(row.getCell(8));
		System.out.println(Add2);
		driver.findElement(By.name("addressLine2")).sendKeys(Add2);

		String PIN=dataFormatter.formatCellValue(row.getCell(9));
		System.out.println(PIN);
		driver.findElement(By.name("pinCode")).sendKeys(PIN);

		String State =  dataFormatter.formatCellValue(row.getCell(10));
		WebElement state = driver.findElement(By.name("state"));
		state.click();
		Select sc3=new Select(state);
		sc3.selectByVisibleText(State);

		String Cname =dataFormatter.formatCellValue(row.getCell(11));
		char[] cha = Cname.toCharArray();
		System.out.println(Cname);
		WebElement Cityname = driver.findElement(By.name("city"));
		Cityname.click();
		Thread.sleep(1000);
		for (int i =0; i <cha.length/2; i++) {
			Thread.sleep(1000);
			Cityname.sendKeys(""+Cname.charAt(i));
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space(.)='"+Cname+"']")).click();


		String panm = dataFormatter.formatCellValue(row.getCell(12));
		System.out.println(panm);
		driver.findElement(By.name("pan")).sendKeys(panm);

		String Agentid = dataFormatter.formatCellValue(row.getCell(13));
		System.out.println(Agentid+""+no);
		driver.findElement(By.name("userName")).sendKeys(Agentid+""+no);

		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		WebElement popup=driver.findElement(By.xpath("//h2[text()='Submitted']"));
		wait.until(ExpectedConditions.visibilityOf(popup));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(3000);
	}
}