package onee;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.InvalidArgumentException;

public class DoctorspaceelementnotclickableDemo
{
   public static void main(String[] args) throws InterruptedException, AWTException {
		
		
   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
   ChromeOptions options = new ChromeOptions();
   options.addArguments("--incognito");
			
				
   WebDriver driver = new ChromeDriver(options);
				
   //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
				
	driver.manage().window().maximize();
	driver.get("https://adminportal.annztech.com/#/dashboard");
				
	driver.findElement(By.id("email")).sendKeys("ds@gmail.com");
	driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Ds@2023");
	driver.findElement(By.xpath("//button[text()='Log In']")).click();
				
			   
				
				
				//CLICKING STAFF
				Thread.sleep(15000);
				
				WebElement ele=driver.findElement(By.xpath("//*[text()=' Staff']"));
				System.out.println(ele.getText());
				ele.click();
				
				//CLICKING NEW STAFF
				
				
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(35000);
				WebElement ele1=driver.findElement(By.xpath("//*[text()='New Staff']"));
				System.out.println(ele1.getText());
				ele1.click();
				
				
				Thread.sleep(8000);
				
				
				
				
				//SELECTCLINIC
				
				
				
				WebElement ele2=driver.findElement(By.xpath("//label[text()='Select Clinic']//following-sibling::ng-select"));
				System.out.println(ele2.getText());
				ele2.click();
				
				Thread.sleep(8000);
					
				WebElement ele4=driver.findElement(By.xpath("//span[text()='TestThar']"));
				System.out.println(ele4.getText());
				ele4.click();
				
				//SHORT BIOGRAPHY
				
		        Thread.sleep(10000);
					
					try {
						driver.findElement(By.xpath("//label[text()='Short Biography']//following-sibling::textarea")).click();
					}
					catch(Exception e)
					{
						JavascriptExecutor js=(JavascriptExecutor) driver;
						js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()='Short Biography']//following-sibling::textarea")));
						Thread.sleep(5000);
						driver.findElement(By.xpath("//label[text()='Short Biography']//following-sibling::textarea")).click();
					}
					Thread.sleep(3000);
					WebElement ele29=driver.findElement(By.xpath("//label[text()='Short Biography']//following-sibling::textarea"));
					Thread.sleep(5000);
					ele29.sendKeys("Bio");
			    //SHORT BIOGRAPHY IN ARABIC
					Thread.sleep(5000);
					WebElement ele30=driver.findElement(By.xpath("//label[text()='Short Biography in Arabic']//following-sibling::textarea"));
					System.out.println(ele30.getText());
					ele30.click();
					
					ele30.sendKeys("Bio AR");
					
					 Thread.sleep(10000);
					 
				/*try {	 
               driver.findElement(By.xpath("//*[text()='Upload Attachments']//following-sibling::input[@type='file']"));
				}
				catch(InvalidArgumentException e){
					JavascriptExecutor s=(JavascriptExecutor) driver;
					s.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[text()='Upload Attachments']//following-sibling::input[@type='file']")));
					Thread.sleep(5000);
					
					driver.findElement(By.xpath("//*[text()='Upload Attachments']//following-sibling::input[@type='file']"));
				}*/
				
					 
					 JavascriptExecutor js2=(JavascriptExecutor) driver;
						js2.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()=' Active ']//preceding-sibling::input"))); 
					 
					 
					 
					/* try {
							driver.findElement(By.xpath("//label[text()=' Active ']//preceding-sibling::input"));
						}
						catch(Exception e)
						{
							JavascriptExecutor js=(JavascriptExecutor) driver;
							js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()=' Active ']//preceding-sibling::input")));
							//Thread.sleep(5000);
							//driver.findElement(By.xpath("//label[text()=' Active ']//preceding-sibling::input")).click();

						}	*/
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 Thread.sleep(10000);
				
					 
					 JavascriptExecutor js=(JavascriptExecutor) driver;
					js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id='1572-selectable']")));
					 
					 
					 
					 
					 
				
					/* try {
							driver.findElement(By.xpath("//*[@id='1572-selectable']")).click();
						}
					 
						catch(Exception e)
						{
							JavascriptExecutor js1=(JavascriptExecutor) driver;
							js1.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id='1572-selectable']")));
							//Thread.sleep(5000);
							//driver.findElement(By.xpath("//*[@id='1572-selectable']")).click();
							
						}	*/
				
				
				
				
				

}
}