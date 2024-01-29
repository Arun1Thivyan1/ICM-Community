package icm;

import java.util.Scanner;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.xeustechnologies.googleapi.spelling.SpellChecker;
import org.xeustechnologies.googleapi.spelling.SpellCorrection;
import org.xeustechnologies.googleapi.spelling.SpellResponse;





public class spellcheck {
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
			
			Thread.sleep(45000);
			
			SoftAssert sf= new SoftAssert();
			
			String actual= driver.findElement(By.xpath("//*[text()='Here is whats happening in ANNZ']")).getText();
			//System.out.println(actual);
			
			//String expected= "Here is whats happening in ANN";
			
			sf.assertEquals(actual, "here is whats happening in ANNZ");
			System.out.println("jjjjjjj");
			
			sf.assertAll();
			
//			
//			Assert.assertEquals(actual, expected);
//			
//			SpellChecker checker = new SpellChecker();
//			
//			SpellResponse sr= checker.check( "aaa" );
//			
//			
//			for( SpellCorrection sp : sr.getCorrections() )
//			
//			System.out.println( sp.getValue() );
		
			
			
			
			
			
			
			
			
			
	}

}
