package onee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
        //for incognito mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
	
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.manage().window().maximize();
		//get url
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		
		/*WebElement ele2=driver.findElement(By.xpath("//span[text()='Sign in']"));
		act.moveToElement(ele2);
		act.build().perform();
		
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9361537648");
		
		
		driver.findElement(By.xpath("//div[@class='_1D1L_j']//child::span[text()='CONTINUE']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='_1k3JO2']//child::button[text()='Request OTP']")).click();
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//span[text()='Signup']")).click();;
		//div[@class='_1D1L_j']//child::span[text()='CONTINUE']*/
		
		WebElement elect=driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		System.out.println(elect.getText());
		elect.click();
		Thread.sleep(2000);
		
		
		WebElement ele= driver.findElement(By.linkText("Computer Peripherals"));
		System.out.println(ele.getText());
		act.moveToElement(ele);
		act.build().perform();
		
		WebElement ele1=driver.findElement(By.linkText("Receipt Printers"));
		System.out.println(ele1.getText());
		act.moveToElement(ele1);
		act.click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
	}

}
