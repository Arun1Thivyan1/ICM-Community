package icm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class actionplannerarabic {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver2.exe");
			
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--incognito");
		
		  
						
		   WebDriver driver = new ChromeDriver(options);
						
		   //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
						
			driver.manage().window().maximize();
			driver.get("https://icmspro.annztech.com/");
			Thread.sleep(10000);
			
			
			driver.findElement(By.id("email")).sendKeys("annz@icms.live");
			
			
			Thread.sleep(5000);
			
			
			WebElement ele1=driver.findElement(By.xpath("(//div[@class='mb-4']//child::input)[2]"));
			ele1.click();
			ele1.sendKeys("Annz@2023");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[text()='Log In']")).click();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;	
			
			//WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(50));
			Thread.sleep(50000);
			
			driver.findElement(By.xpath("//*[text()=' Action Planner']")).click();
	        Thread.sleep(8000);
			
			driver.findElement(By.xpath("//*[text()='Arabic']")).click();
			
			 Thread.sleep(10000);
			 
			 Thread.sleep(5000);
				
				driver.findElement(By.xpath("//*[text()=' المشاريع ']")).click();
				
	            Thread.sleep(9000);
	            
	            
	            
	        	//new bucket
	            
	            
	            
				driver.findElement(By.xpath("//*[text()=' مبادرة جديدة ']")).click();
				
				 Thread.sleep(5000);
				 
				 WebElement ele2=driver.findElement(By.xpath("//*[text()='العنوان']//following-sibling::input"));
					ele2.click();
					/////////////////////////
					ele2.sendKeys("test12.5");
					/////////////////////////
					Thread.sleep(3000);
					WebElement ele3=driver.findElement(By.xpath("//*[text()='الوصف']//following-sibling::textarea"));
					ele3.click();
					ele3.sendKeys("testtest");
					
					Thread.sleep(3000);
					WebElement ele4=driver.findElement(By.xpath("//*[@id='searchEmployeeField']"));
					ele4.click();
					ele4.sendKeys("a");
					Thread.sleep(3000);
					WebElement ele5=driver.findElement(By.xpath("//*[text()='بحث']"));
					ele5.click();
					
			 
	}
}
