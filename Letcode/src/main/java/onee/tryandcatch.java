package onee;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class tryandcatch {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);

		// WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.manage().window().maximize();
		driver.get("https://adminportal.annztech.com/#/dashboard");

		driver.findElement(By.id("email")).sendKeys("ds@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']"))
				.sendKeys("Ds@2023");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);

		// CLICKING STAFF
		Thread.sleep(15000);

		WebElement ele = driver.findElement(By.xpath("//*[text()=' Staff']"));
		System.out.println(ele.getText());
		ele.click();

		// CLICKING NEW STAFF

		Thread.sleep(35000);
		WebElement ele1 = driver.findElement(By.xpath("//*[text()='New Staff']"));
		System.out.println(ele1.getText());
		ele1.click();

		Thread.sleep(10000);
		
		
		
		
		
		try
		{
			driver.findElement(By.xpath("//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div")).click();
		}
		catch(Exception e) {
			
       js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div")));
       driver.findElement(By.xpath("//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div")).click();
		}
		//Thread.sleep(10000);

		//WebElement elem5=driver.findElement(By.xpath("//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div"));
		//elem5.click();
		Thread.sleep(10000);
		
		WebElement elem8=driver.findElement(By.xpath("//span[text()='11:00']"));
		elem8.click();
		
		
		Thread.sleep(7000);
		
		
		
		
		

		// SERVICE TYPE
		//WebElement ele41 = driver.findElement(By.xpath("//*[text()='Medical Licence Expiry']//following-sibling::input"));
		WebElement ele41=driver.findElement(By.xpath("(//label[text()='Start Date']//following-sibling::input)[1]"));
		ele41.click();
		//act.moveToElement(ele41).moveByOffset(95, 0).click().build().perform();
		
		
		
		
		
		//WebElement eleme40 =driver.findElement(By.xpath("(//label[text()='Start Date']//following-sibling::input)[1]"));
		//act.moveToElement(eleme40).moveByOffset(80, 0).click().build().perform();
		
		
		
		
		
		Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date previousDate = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String previousDateString = dateFormat.format(previousDate);
        
        ele41.sendKeys(previousDateString);
        
		try {
			
			 driver.findElement(By.xpath("//input[@id='teleconsultationCheck']")).click();
			
		}

		catch (ElementClickInterceptedException e) {

			js.executeScript("arguments[0].click();",
					driver.findElement(By.xpath("//input[@id='teleconsultationCheck']")));

		}
		
		
		
	        
	        

//		Thread.sleep(10000);

		// UPLOAD ATTACHMENTS

		try {
			driver.findElement(By.xpath("(//div[@class='mb-4'])[21]")).click();
			
//			//*[@formcontrolname='careGiverAttachment']
		}

		catch (Exception e) {
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//div[@class='mb-4'])[21]")));
//e.printStackTrace();
			
		}

		Thread.sleep(10000);
		WebElement ele31 = driver.findElement(By.xpath("(//div[@class='mb-4'])[21]"));
		act.moveToElement(ele31).moveByOffset(15, 15).click().build().perform();

		Thread.sleep(3000);

		StringSelection s2 = new StringSelection("E:\\IMAGES\\docter.png");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2, null);

		Robot rb1 = new Robot();

		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);
		rb1.keyRelease(KeyEvent.VK_V);
		rb1.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);

	}
}
