package icm;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionplanner {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver2.exe");
			
		   ChromeOptions options = new ChromeOptions();
		   
		   options.setBinary("C:\\Program Files\\Chrome\\Application\\chrome.exe");
		   options.addArguments("--incognito");
		
		  
						
		   WebDriver driver = new ChromeDriver(options);
						
		   //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
						
			driver.manage().window().maximize();
			driver.get("https://icmspro.live/#/appointments/list");
			Thread.sleep(10000);
			
			
			driver.findElement(By.id("email")).sendKeys("aw@icms.live");
			
			
			Thread.sleep(5000);
			
			
			WebElement ele1=driver.findElement(By.xpath("(//div[@class='mb-4']//child::input)[2]"));
			ele1.click();
			ele1.sendKeys("Survey@123");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[text()='Log In']")).click();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;	
			
			//WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(50));
			Thread.sleep(30000);
			
			driver.findElement(By.xpath("//*[text()=' Action Planner']")).click();
			
			Thread.sleep(15000);
			
			driver.findElement(By.xpath("//span[text()='Arabic']")).click();
			
			Thread.sleep(25000);
			
			driver.findElement(By.xpath("//span[text()='اللغة الإنجليزية']")).click();
			Thread.sleep(25000);
			
			driver.findElement(By.xpath("//*[text()=' Task Buckets ']")).click();
			
            Thread.sleep(9000);
            
            
            
            
            
            
            
            
			//new bucket
            
            
            
            
            
            
            
            
            
			driver.findElement(By.xpath("//*[text()=' New Bucket ']")).click();
			
			 Thread.sleep(5000);
				
			WebElement ele2=driver.findElement(By.xpath("//*[text()='Title ']//following-sibling::input"));
			ele2.click();
			/////////////////////////
			ele2.sendKeys("test23.4-01");
			/////////////////////////
			Thread.sleep(3000);
			WebElement ele3=driver.findElement(By.xpath("//*[text()='Description ']//following-sibling::textarea"));
			ele3.click();
			ele3.sendKeys("test29ar");
			
			
			Thread.sleep(3000);
			WebElement ele4=driver.findElement(By.xpath("//*[@id='searchEmployeeField']"));
			ele4.click();
			ele4.sendKeys("test");
			
			Thread.sleep(3000);
			WebElement ele5=driver.findElement(By.xpath("//*[text()='Search']"));
			ele5.click();
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("(//*[text()='testarun a']//following-sibling::td)[2]//child::button")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[text()='Submit']")).click();
			
			Thread.sleep(9000);
			
			
			
			
			try {
				driver.findElement(By.xpath("//*[text()='OK']")).click();
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println("new location submit button not working");
				driver.findElement(By.xpath("(//*[text()='Add New Bucket'])//following-sibling::button")).click();		
				
			}
			
			
			
			
			
			
			//Edit bucket
			
			
			
			
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("(//*[@class='fa fa-edit text-muted mx-2'])[1]")).click();
			
			Thread.sleep(4000);
			try {
				driver.findElement(By.xpath("//*[text()='OK']")).click();
				
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("no bug");
			}
			
			
			
			
			
			
			
			
			 Thread.sleep(5000);
				
			WebElement ele80=driver.findElement(By.xpath("//*[text()='Title ']//following-sibling::input"));
			
			ele80.click();
			ele80.clear();
			ele80.sendKeys("test10.3");
			
			Thread.sleep(3000);
			WebElement ele28=driver.findElement(By.xpath("//*[text()='Description ']//following-sibling::textarea"));
			ele28.click();
			ele28.clear();
			ele28.sendKeys("test12.1");
			
			
			
			
			
			Thread.sleep(3000);
			WebElement ele7=driver.findElement(By.xpath("//*[@id='searchEmployeeField']"));
			ele7.click();
			ele7.sendKeys("test");
			
			Thread.sleep(3000);
			WebElement ele8=driver.findElement(By.xpath("//*[text()='Search']"));
			ele8.click();
			
	
			Thread.sleep(10000);

			driver.findElement(By.xpath("//*[text()='Update']")).click();
			
			Thread.sleep(10000);
			
		
			try {
				driver.findElement(By.xpath("//*[text()='OK']")).click();
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println("edit location submit button not working");
				driver.findElement(By.xpath("(//*[text()='Edit Bucket'])//following-sibling::button")).click();		
				
			}
			
			Thread.sleep(12000);
			
			
			//Add new task
			
			
			
           //searchfield
			
			WebElement eel2=driver.findElement(By.xpath("//*[text()='Search:']//child::input"));
			eel2.click();
			Thread.sleep(10000);
			eel2.sendKeys("test27.1");
			
			
			
			driver.findElement(By.xpath("(//*[@class='fa fa-eye text-muted mx-2'])")).click();
			
			
			
			
			Thread.sleep(5000);
			driver.findElement(By.xpath(" //*[text()='New Task ']")).click();
			
			
			
			Thread.sleep(5000);
			WebElement ele9=driver.findElement(By.xpath("//*[@id='taskname']"));
			ele9.click();
			ele9.sendKeys("test11");
			
			Thread.sleep(5000);
			WebElement ele10=driver.findElement(By.xpath("//*[@placeholder='Enter Task Description']"));
			ele10.click();
			ele10.sendKeys("des");
			//priority
			Thread.sleep(5000);
			WebElement ele11=driver.findElement(By.xpath("//*[text()='Priority ']//parent::div//descendant::div"));
			ele11.click();
			
			Thread.sleep(5000);
			WebElement ele12=driver.findElement(By.xpath("//*[text()='High']"));
			ele12.click();
			
			Thread.sleep(3000);
			
			WebElement ele13=driver.findElement(By.xpath("//*[text()='Due Date ']"));
			ele13.click();
			
			
			
			
			//DATE
			 
			 Thread.sleep(5000);
	
			 WebElement ele15=driver.findElement(By.xpath("//input[@type='date']"));
			 ele15.click();
		
			 Thread.sleep(5000);
			 
			 //Date currentDate = new Date();
		       Calendar calendar3 = Calendar.getInstance();
		       // calendar.setTime(currentDate);
		       calendar3.add(Calendar.DAY_OF_MONTH, +1);
		        
		       Date previousDate3 = calendar3.getTime();
		        
		       SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd-MM-yyyy");
		        
		       String previousDateString3 = dateFormat3.format(previousDate3);
		       System.out.println(previousDateString3);
		       Thread.sleep(10000);
		        
		       ele15.sendKeys(previousDateString3); 
		       
		     //choose assignee  
		       Thread.sleep(5000);
				WebElement ele17=driver.findElement(By.xpath("//*[text()='Choose Assignee ']//parent::div//descendant::div"));
				ele17.click();
				
				Thread.sleep(5000);
				
				//addedname
				
				
				WebElement ele16=driver.findElement(By.xpath("//*[text()='testtest']"));
				ele16.click();
	
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[text()='Submit']")).click();
				
				Thread.sleep(8000);
				
				
				try {
					driver.findElement(By.xpath("//*[text()='OK']")).click();
					Thread.sleep(5000);
				}
				catch(Exception e)
				{
					System.out.println("edit location submit button not working");
					driver.findElement(By.xpath("(//*[text()='Add New Task'])//following-sibling::button")).click();		
					
				}
				
				
				
				//newsubtask
				
				
				

				
				Thread.sleep(8000);
				
				try {
					driver.findElement(By.xpath("(//*[text()='New Subtask'])")).click();
				}
				catch(Exception e)
				{
					
					js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[text()='New Subtask'])")));
					
				}
				
				Thread.sleep(5000);
				WebElement ele44=driver.findElement(By.xpath("//*[@id='taskname']"));
				ele44.click();
				ele44.sendKeys("test12");
				
				Thread.sleep(5000);
				WebElement ele18=driver.findElement(By.xpath("//*[@placeholder='Enter Subtask Description']"));
				ele18.click();
				ele18.sendKeys("des");
				
				Thread.sleep(5000);
				WebElement ele19=driver.findElement(By.xpath("//*[text()='Priority ']//parent::div//descendant::div"));
				ele19.click();
				
				Thread.sleep(5000);
				WebElement ele20=driver.findElement(By.xpath("//*[text()='High']"));
				ele20.click();
				
				Thread.sleep(7000);

				
				//DATE
				 
				 Thread.sleep(5000);
		
				 WebElement ele22=driver.findElement(By.xpath("//input[@type='date']"));
				 ele22.click();
			
				 Thread.sleep(5000);
				 
				 //Date currentDate = new Date();
			       Calendar calendar4 = Calendar.getInstance();
			       // calendar.setTime(currentDate);
			       calendar4.add(Calendar.DAY_OF_MONTH, +1);
			        
			       Date previousDate4 = calendar4.getTime();
			        
			       SimpleDateFormat dateFormat4 = new SimpleDateFormat("dd-MM-yyyy");
			        
			       String previousDateString4 = dateFormat4.format(previousDate4);
			       System.out.println(previousDateString4);
			       Thread.sleep(10000);
			        
			       ele22.sendKeys(previousDateString3); 
			       
			     //choose assignee  
			       Thread.sleep(5000);
					WebElement ele23=driver.findElement(By.xpath("//*[text()='Choose Assignee ']//parent::div//descendant::div"));
					ele23.click();
					
					Thread.sleep(5000);
					WebElement ele24=driver.findElement(By.xpath("//*[text()='testtest']"));
					ele24.click();
					
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[text()='Submit']")).click();
					
					Thread.sleep(8000);
					driver.findElement(By.xpath("//*[text()='OK']")).click();
					
					
					
					
					
					//edit task
					
					
					
					
					
					Thread.sleep(5000);
					driver.findElement(By.xpath(" (//*[text()=' Completed '])//following-sibling::i")).click();
					
					Thread.sleep(7000);
					WebElement ele25=driver.findElement(By.xpath("//*[@id='taskname']"));
					
					ele25.click();
					ele25.clear();
					ele25.sendKeys("task12.2");
					
					
					Thread.sleep(5000);
					WebElement ele26=driver.findElement(By.xpath("//*[@placeholder='Enter Task Description']"));
					ele26.click();
					ele26.clear();
					ele26.sendKeys("des.1");
					
					Thread.sleep(5000);
					WebElement ele30=driver.findElement(By.xpath("//*[text()='Priority ']//parent::div//descendant::div"));
					ele30.click();
					
					Thread.sleep(5000);
					WebElement ele31=driver.findElement(By.xpath("//*[text()='High']"));
					ele31.click();
					
					
					
					Thread.sleep(7000);
//					
//					WebElement ele32=driver.findElement(By.xpath("//*[@placeholder='Enter Tasks Description']"));
//					ele32.click();
//					ele32.clear();
//					ele32.sendKeys("des");
					
					
					
					
					//DATE
					 
					 Thread.sleep(5000);
			
					 WebElement ele33=driver.findElement(By.xpath("//input[@type='date']"));
					 ele33.click();
				
					 Thread.sleep(5000);
					 
					 //Date currentDate = new Date();
				       Calendar calendar5 = Calendar.getInstance();
				       // calendar.setTime(currentDate);
				       calendar5.add(Calendar.DAY_OF_MONTH, +1);
				        
				       Date previousDate5 = calendar5.getTime();
				        
				       SimpleDateFormat dateFormat5 = new SimpleDateFormat("dd-MM-yyyy");
				        
				       String previousDateString5 = dateFormat5.format(previousDate5);
				       System.out.println(previousDateString5);
				       Thread.sleep(10000);
				        
				       ele33.sendKeys(previousDateString3); 
				       
				     //choose assignee  
				       Thread.sleep(5000);
						WebElement ele34=driver.findElement(By.xpath("//*[text()='Choose Assignee ']//parent::div//descendant::div"));
						ele34.click();
						
						Thread.sleep(5000);
						WebElement ele35=driver.findElement(By.xpath("//*[text()='testtest']"));
						ele35.click();
			
					
					
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[text()='Submit']")).click();
					
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[text()='OK']")).click();
					
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//*[@class='float-end'])")).click();
					
					
					
					
					
					
					
					//edit sub task
					
					
					
					
					
					Thread.sleep(8000);
					driver.findElement(By.xpath("(//*[@class='fa fa-edit mx-2'])")).click();
					
					Thread.sleep(5000);
					WebElement ele36=driver.findElement(By.xpath("//*[@id='taskname']"));
					ele36.clear();
					ele36.click();
					ele36.sendKeys("task12.2");
					
					
					
					
					
					
					Thread.sleep(5000);
					WebElement ele37=driver.findElement(By.xpath("//*[@placeholder='Enter Task Description ']"));
					ele37.click();
					ele37.clear();
					ele37.sendKeys("des");
					
					Thread.sleep(5000);
					WebElement ele38=driver.findElement(By.xpath("//*[text()='Priority']//parent::div//descendant::div"));
					ele38.click();
					
					Thread.sleep(5000);
					WebElement ele39=driver.findElement(By.xpath("//*[text()='High']"));
					ele39.click();
					
					
					
					Thread.sleep(7000);
					
					WebElement ele40=driver.findElement(By.xpath("//*[@placeholder='Enter Task Description']"));
					ele40.click();
					ele40.clear();
					ele40.sendKeys("dess");
					
					
					
					//DATE
					 
					 Thread.sleep(5000);
			
					 WebElement ele41=driver.findElement(By.xpath("//input[@type='date']"));
					 ele41.click();
				
					 Thread.sleep(5000);
					 
					 //Date currentDate = new Date();
				       Calendar calendar6 = Calendar.getInstance();
				       // calendar.setTime(currentDate);
				       calendar6.add(Calendar.DAY_OF_MONTH, +1);
				        
				       Date previousDate6 = calendar6.getTime();
				        
				       SimpleDateFormat dateFormat6 = new SimpleDateFormat("dd-MM-yyyy");
				        
				       String previousDateString6 = dateFormat6.format(previousDate6);
				       System.out.println(previousDateString6);
				       Thread.sleep(10000);
				        
				       ele41.sendKeys(previousDateString3); 
				       
				     //choose assignee  
				       Thread.sleep(5000);
						WebElement ele42=driver.findElement(By.xpath("//*[text()='Choose Assignee ']//parent::div//descendant::div"));
						ele42.click();
						
						Thread.sleep(5000);
						WebElement ele43=driver.findElement(By.xpath("//*[text()='testtest']"));
						ele43.click();
					
					
					
					
					
					
					
					
					
					
					
					
					

					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[text()='Submit']")).click();
					
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[text()='OK']")).click();
			
			//*[text()='Search:']//child::input
			
			//js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//*[text()='test sele']//following-sibling::td)[2]//child::button")));	
			
}
}