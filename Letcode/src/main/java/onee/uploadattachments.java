package onee;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class uploadattachments {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
						
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--incognito");
					
						
		   WebDriver driver = new ChromeDriver(options);
						
		   //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
						
			driver.manage().window().maximize();
			driver.get("https://adminportal.annztech.com/#/dashboard");
						
			driver.findElement(By.id("email")).sendKeys("ds@gmail.com");
driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Ds@2023");
			driver.findElement(By.xpath("//button[text()='Log In']")).click();
			JavascriptExecutor js=(JavascriptExecutor) driver;	
			Actions act=new Actions(driver);
					   
						
						
//CLICKING STAFF
						Thread.sleep(15000);
						
						WebElement ele=driver.findElement(By.xpath("//*[text()=' Staff']"));
						System.out.println(ele.getText());
						ele.click();
						
//CLICKING NEW STAFF
						
						
						
						Thread.sleep(35000);
						WebElement ele1=driver.findElement(By.xpath("//*[text()='New Staff']"));
						System.out.println(ele1.getText());
						ele1.click();
						
						
						Thread.sleep(10000);
						
						
						
						
//SELECTCLINIC
						
						
					
WebElement ele2=driver.findElement(By.xpath("//label[text()='Select Clinic']//following-sibling::ng-select"));
						System.out.println(ele2.getText());
						ele2.click();
						
						Thread.sleep(8000);
							
						WebElement ele4=driver.findElement(By.xpath("//span[text()='TestThar']"));
						System.out.println(ele4.getText());
						ele4.click();
						
						Thread.sleep(20000);
						
						//*[text()='Upload Attachments']//following-sibling::input
						
				try {
					driver.findElement(By.xpath("(//div[@class='mb-4'])[21]")).click();
				}
						
				catch(Exception e) {
					js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//div[@class='mb-4'])[21]")));
					//Thread.sleep(20000);
					//driver.findElement(By.xpath("(//div[@class='mb-4'])[21]")).click();
				}
				
				Thread.sleep(20000);
				WebElement element=driver.findElement(By.xpath("(//div[@class='mb-4'])[21]"));
				act.moveToElement(element).moveByOffset(15, 15).click().build().perform();
						
				//WebElement eleme9=driver.findElement(By.xpath("(//label[text()='Start Date']//following-sibling::input)[1]"));
				//act.moveToElement(eleme9).moveByOffset(80, 0).click().perform();		
						

}
}