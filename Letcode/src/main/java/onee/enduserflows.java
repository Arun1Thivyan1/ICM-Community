package onee;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class enduserflows {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver2.exe");
			
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--incognito");
					
						
		   WebDriver driver = new ChromeDriver(options);
						
		   //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
						
			driver.manage().window().maximize();
			driver.get("https://doctorspace.annztech.com/#/home");
			
			JavascriptExecutor js =(JavascriptExecutor) driver;	
			Robot rb=new Robot();
			
			
			
			
			Thread.sleep(5000);
			System.out.println("About to zoom out");
			
			
			
			
			
			
			
			
			Thread.sleep(20000);
			
			
			
			
//			  WebElement ele10=driver.findElement(By.xpath("//*[@class='nav-item ng-star-inserted']//child::*[text()='Login / Signup ']"));
//			  ele10.click();  
//			  WebElement ele10=driver.findElement(By.xpath("//*[@class='nav-item ng-star-inserted']"));
//			  ele10.click();  
			  
			//  js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@class='nav-item ng-star-inserted']")));
			  
			  
			  
			
			
			//Thread.sleep(5000);
				
//			WebElement ele11=driver.findElement(By.xpath("//*[@id='username']"));
//				ele11.click();
//				ele11.sendKeys("543215432");
//				
//				
//				
//				Thread.sleep(5000);
//				
//				WebElement ele12=driver.findElement(By.xpath("//*[text()='SEND OTP']"));
//					ele12.click();
			
			
			
			
			
			
			
			try {
				driver.findElement(By.xpath("(//*[text()='Book Now '])[1]")).click();
			}
			
			catch(Exception e){
				
				js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//*[text()='Book Now '])[1]")));	
				
				// driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input")).click();
			}
			
	
          Thread.sleep(5000);
			
			WebElement ele=driver.findElement(By.xpath("//*[text()='Doctor’s Name']//following-sibling::input"));
			System.out.println(ele.getText());
			ele.click();
			ele.sendKeys("test sa");
			
			 Thread.sleep(5000);
				
			WebElement ele1=driver.findElement(By.xpath("//*[text()='Search']"));
			System.out.println(ele1.getText());
			ele1.click();	
			
			 Thread.sleep(30000);
				
				
			WebElement ele2=driver.findElement(By.xpath("//*[text()='Test sa doc']//ancestor::*[@class='doc-info-left']//following-sibling::div[@class='doc-info-right']//child::div[@class='clinic-booking']"));
			System.out.println(ele2.getText());
			ele2.click();	
			
			
			Thread.sleep(5000);
			System.out.println("About to zoom out");
			
			for (int i = 0; i < 3; i++) 
			{
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_SUBTRACT);
				rb.keyRelease(KeyEvent.VK_SUBTRACT);
				rb.keyRelease(KeyEvent.VK_CONTROL);
			}
			 Thread.sleep(5000);
			 
				
//				WebElement ele3=driver.findElement(By.xpath("//*[text()='Clinic Visit']"));
//				System.out.println(ele3.getText());
//				ele3.click();	
				js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[text()='Clinic Visit']")));
				
				
				            
				WebElement ele4=driver.findElement(By.xpath("//*[text()='Speciality']//parent::div//descendant::select"));
				System.out.println(ele4.getText());
				ele4.click();
				Thread.sleep(5000);
				
				
				WebElement ele5=driver.findElement(By.xpath("(//option[text()=' DENTISTRY '])[1]"));
				System.out.println(ele5.getText());
				ele5.click();
				
				
				Thread.sleep(5000);
				WebElement ele6=driver.findElement(By.xpath("(//*[text()='About Caregiver'])[1]"));
				System.out.println(ele6.getText());
				ele6.click();
				
				
				
				
	       
			       
			       
				
				
				
				
				
			       
					//DATE
					 
					 Thread.sleep(5000);
			
					 WebElement ele23=driver.findElement(By.xpath("//*[text()='Select Date']//following-sibling::input"));
					 ele23.click();
				
					 Thread.sleep(5000);
					 
					 //Date currentDate = new Date();
				       Calendar calendar3 = Calendar.getInstance();
				       // calendar.setTime(currentDate);
				       calendar3.add(Calendar.DAY_OF_MONTH, +1);
				        
				       Date previousDate3 = calendar3.getTime();
				        
				       SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd-MM-yyyy");
				        
				       String previousDateString3 = dateFormat3.format(previousDate3);
				       System.out.println(previousDateString3);
				       Thread.sleep(20000);
				        
				       ele23.sendKeys(previousDateString3); 
				        
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
			       
			       
			       
			       
			       
			       
			       
			       
			       
			       
			       
			       
			       
			       
			      
			       
			       
			       Thread.sleep(20000);
					
				  WebElement ele8=driver.findElement(By.xpath("//*[text()='8:40 AM']"));
				  ele8.click();
			       
				  Thread.sleep(5000);
					
				  WebElement ele9=driver.findElement(By.xpath("//*[text()='Book Appointment']"));
				  ele9.click();  
			       
				  
				  Thread.sleep(5000);
					
				  WebElement ele10=driver.findElement(By.xpath("//button[text()='Ok']"));
				  ele10.click();
				  
				  
				  Thread.sleep(5000);
					
				  WebElement ele11=driver.findElement(By.xpath("//*[@id='username']"));
				  ele11.click();
				  ele11.sendKeys("543215432");
				  
				  Thread.sleep(5000);
					
				  WebElement ele12=driver.findElement(By.xpath("//*[text()='SEND OTP']"));
				  ele12.click();
				 
				  Thread.sleep(5000);
					
				  WebElement ele13=driver.findElement(By.xpath("//*[text()='Ok']"));
				  ele13.click();
				  
				  
				  Thread.sleep(5000);
					
				  WebElement ele14=driver.findElement(By.xpath("//*[@id='otp']"));
				  ele14.click();
				  ele14.sendKeys("1111");
				  
				  
				  Thread.sleep(5000);
				  WebElement ele15=driver.findElement(By.xpath("//*[text()='Login']"));
				 
				  ele15.click();
				  //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				  
				  Thread.sleep(5000);
				  js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[text()='Clinic Visit']")));
					
					
				  Thread.sleep(5000); 
					WebElement ele16=driver.findElement(By.xpath("//*[text()='Speciality']//parent::div//descendant::select"));
					System.out.println(ele16.getText());
					ele16.click();
					Thread.sleep(5000);
					
					
					WebElement ele17=driver.findElement(By.xpath("(//option[text()=' DENTISTRY '])[1]"));
					System.out.println(ele17.getText());
					ele17.click();
					
					
					Thread.sleep(5000);
					WebElement ele18=driver.findElement(By.xpath("(//*[text()='About Caregiver'])[1]"));
					System.out.println(ele18.getText());
					ele18.click();
					
					
					
					
					
					//DATE
						 
					 Thread.sleep(5000);
			
					 WebElement ele19=driver.findElement(By.xpath("//*[text()='Select Date']//following-sibling::input"));
					 ele19.click();
				
					 
					 
					 //Date currentDate = new Date();
				       Calendar calendar2 = Calendar.getInstance();
				       // calendar.setTime(currentDate);
				       calendar2.add(Calendar.DAY_OF_MONTH, +1);
				        
				       Date previousDate2 = calendar2.getTime();
				       
				       
				        
				       SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
				        
				       String previousDateString2 = dateFormat2.format(previousDate2);
				       System.out.println(previousDateString2);
				       Thread.sleep(20000);
				       ele19.sendKeys(previousDateString2); 
				       
				       
				       
				       
				      
				       
				       
				       Thread.sleep(30000);
						
					  WebElement ele20=driver.findElement(By.xpath("//*[text()='8:40 AM']"));
					  ele20.click();
				       
					  Thread.sleep(5000);
						
					  WebElement ele21=driver.findElement(By.xpath("//*[text()='Book Appointment']"));
					  ele21.click();  
				       
			
			
	}}
