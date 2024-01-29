package icm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
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

public class icmcommunityarabic {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver2.exe");
			
		   ChromeOptions options = new ChromeOptions();
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
			Thread.sleep(45000);
			
			driver.findElement(By.xpath("//*[text()=' ICM Community']")).click();
			
			Thread.sleep(5000);
			try {
				driver.switchTo().alert().accept();
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("no alet is there");
			}
			
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//*[text()='Arabic']")).click();
			try {
				driver.switchTo().alert().accept();
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("no alet is there");
			}
			
			Thread.sleep(20000);
//			
//			
//			
////			//newlocation
////			
////			
////			
////			
//			driver.findElement(By.xpath("//*[text()='إضافة مقر']")).click();
//			try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("no alet is there");
//			}
//			
//
//			WebElement ele3=driver.findElement(By.xpath("//*[text()='اسم المقر بالإنقليزي']//parent::div//descendant::input"));
//			ele3.click();
//			ele3.sendKeys("testarun29.4");
//			Thread.sleep(5000);
//			
//			WebElement ele2=driver.findElement(By.xpath("//*[text()='اسم المقر بالعربي']//parent::div//descendant::input"));
//			ele2.click();
//			ele2.sendKeys("29ar");
//			Thread.sleep(8000);
//			driver.findElement(By.xpath("//*[text()='تسجيل']")).click();
//			
//			Thread.sleep(12000);
//			
//			try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("no alet is there");
//			}
//			Thread.sleep(5000);
////			
//			try {
//				driver.findElement(By.xpath("//*[text()='OK']")).click();
//				Thread.sleep(5000);
//			}
//			catch(Exception e)
//			{
//				System.out.println("new location submit button not working");
//				driver.findElement(By.xpath("(//*[text()='إضافة مقر'])[2]//following-sibling::button")).click();		
//				
//			}
//			Thread.sleep(9000);
////			
////			
////			
////			
////			
////			
////			
////			
////			
////			
////			//edit location
////		
////		
////		
////			
////			
////		
////			
//			try {
//				
//				driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")).click();
//				}
//				catch(Exception e)
//				{
//					js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")));	
//				}
//		
//			Thread.sleep(9000);
//			try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("no alet is there");
//			}
//			Thread.sleep(5000);
//		
//			WebElement ele4=driver.findElement(By.xpath("//*[text()='اسم المقر بالإنقليزي']//parent::div//descendant::input"));
//			ele4.click();
//			ele4.clear();
//			ele4.sendKeys("testarun29.4");
//			Thread.sleep(5000);
////			
//			WebElement ele5=driver.findElement(By.xpath("//*[text()='اسم المقر بالعربي']//parent::div//descendant::input"));
//			ele5.click();
//			ele5.clear();
//			ele5.sendKeys("ar29");
//			Thread.sleep(8000);
//			driver.findElement(By.xpath("//*[text()='تسجيل']")).click();
//			
//			Thread.sleep(12000);
//			try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("no alet is there");
//			}
//			Thread.sleep(5000);
//			
//			try {
//				driver.findElement(By.xpath("//*[text()='OK']")).click();
//				Thread.sleep(5000);
//			}
//			catch(Exception e)
//			{
//				System.out.println("new location submit button not working");
//				driver.findElement(By.xpath("//*[text()='تعديل']//following-sibling::button")).click();		
//				
//			}
//			
//			
//			
//			
//			//departments
//			
//			
//			
//			Thread.sleep(7000);
//			
//	        driver.findElement(By.xpath(" //*[text()=' الوحدات التنظيمية']")).click();
//			Thread.sleep(5000);
//			try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("no alet is there");
//			}
//			Thread.sleep(5000);
//			
//			driver.findElement(By.xpath("//*[text()='إضافة وحدة تنظيمية']")).click();
//			
//			Thread.sleep(5000);
//			
//			WebElement ele6=driver.findElement(By.xpath("//*[text()='اسم الوحدة التنظيمية بالإنقليزي']//parent::div//descendant::input"));
//			ele6.click();
//			ele6.sendKeys("testarun29.4");
//			
//			Thread.sleep(5000);
//		    WebElement ele7=driver.findElement(By.xpath("//*[text()='اسم الوحدة التنظيمية بالعربي ']//parent::div//descendant::input"));
//			ele7.click();
//			ele7.sendKeys("test29");
//			
//			Thread.sleep(8000);
//			driver.findElement(By.xpath("//*[text()='تسجيل']")).click();
//            Thread.sleep(12000);
//        	try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("no alet is there");
//			}
//			Thread.sleep(5000);
//			
//			try {
//				driver.findElement(By.xpath("//*[text()='OK']")).click();
//				Thread.sleep(8000);
//			}
//			catch(Exception e)
//			{
//				System.out.println("new location submit button not working");
//				driver.findElement(By.xpath("(//*[text()='إضافة وحدة تنظيمية'])[2]//following-sibling::button")).click();		
//				
//			}
////			
////			
////			
////			
////			
////           Thread.sleep(12000);
////			
////			
////			
////			
////			
////		
////			
////			//edit department
//		
//		
//		
//			
//           try {
//				
//				driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")).click();
//				}
//				catch(Exception e)
//				{
//					js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")));	
//				}
//		
//			Thread.sleep(9000);
//			try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("no alet is there");
//			}
//			Thread.sleep(5000);
//
//			WebElement ele8=driver.findElement(By.xpath("//*[text()='اسم الوحدة التنظيمية بالإنقليزي']//parent::div//descendant::input"));
//			ele8.click();
//			ele8.clear();
//			ele8.sendKeys("testarun25.1");
//			
//			Thread.sleep(5000);
//		    WebElement ele9=driver.findElement(By.xpath("//*[text()='اسم الوحدة التنظيمية بالعربي ']//parent::div//descendant::input"));
//			ele9.click();
//			ele9.clear();
//			ele9.sendKeys("ar25.1");
//			Thread.sleep(8000);
//			driver.findElement(By.xpath("//*[text()='تسجيل']")).click();
//            Thread.sleep(12000);
//        	try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("no alet is there");
//			}
//			Thread.sleep(5000);
//			
//			try {
//				driver.findElement(By.xpath("//*[text()='OK']")).click();
//				Thread.sleep(5000);
//			}
//			catch(Exception e)
//			{
//				System.out.println("new location submit button not working");
//				driver.findElement(By.xpath("(//*[text()='إضافة وحدة تنظيمية'])[2]//following-sibling::button")).click();		
//				
//			}
////			
////			
////			
////			
////			// new roles
////			
//			
//			
//			
//            Thread.sleep(12000);
//			
//	        driver.findElement(By.xpath("//*[text()=' المنصب الإداري']")).click();
//			Thread.sleep(5000);
//			
//			try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("no alet is there");
//			}
//			Thread.sleep(5000);
//			
//			driver.findElement(By.xpath("//*[text()='إضافة منصب إداري']")).click();
//			
//			Thread.sleep(5000);
//			
//			//WebElement ele10=driver.findElement(By.xpath("//*[text()='اسم المنصب الإداري بالإنقليزي']//parent::div//descendant::input"));
//			WebElement ele10=driver.findElement(By.xpath("//*[text()='Role Name in English']//parent::div//descendant::input"));
//			ele10.click();
//			ele10.sendKeys("testarun29.4");
//			
//			Thread.sleep(5000);
//		    //WebElement ele11=driver.findElement(By.xpath("//*[text()='اسم المنصب الإداري بالعربي']//parent::div//descendant::input"));
//			WebElement ele11=driver.findElement(By.xpath("//*[text()='Role Name in Arabic']//parent::div//descendant::input"));
//		    ele11.click();
//			ele11.sendKeys("test25");
//			
//			Thread.sleep(5000);
//			WebElement ele12=driver.findElement(By.xpath("(//*[text()='مستوى المنصب'])[2]//following-sibling::select"));
//			ele12.click();
//			Thread.sleep(5000);
//			
//			WebElement ele13=driver.findElement(By.xpath("//option[text()='3']"));
//			ele13.click();
//			
//			Thread.sleep(8000);
//			driver.findElement(By.xpath("//*[text()='تسجيل']")).click();
//            Thread.sleep(12000);
//        	try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("no alet is there");
//			}
//			Thread.sleep(5000);
//            
//            try {
//				driver.findElement(By.xpath("//*[text()='OK']")).click();
//				Thread.sleep(5000);
//			}
//			catch(Exception e)
//			{
//				System.out.println("new location submit button not working");
//				driver.findElement(By.xpath("(//*[text()='إضافة منصب إداري'])[2]//following-sibling::button")).click();		
//				
//			}	
//            
//            Thread.sleep(12000);
////			
//			
//            
//            
//			
//			//edit roles
//			
//            
//            
//            
//            try {
//				
//				driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")).click();
//				}
//				catch(Exception e)
//				{
//					js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")));	
//				}
//				
//            
//           Thread.sleep(5000);
//       	try {
//			driver.switchTo().alert().accept();
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("no alet is there");
//		}
//		Thread.sleep(5000);
//			
//			//WebElement ele14=driver.findElement(By.xpath("//*[text()='اسم المنصب الإداري بالإنقليزي']//parent::div//descendant::input"));
//			WebElement ele14=driver.findElement(By.xpath("//*[text()='Role Name in English']//parent::div//descendant::input"));
//			ele14.click();
//			ele14.clear();
//			ele14.sendKeys("testarun29.1");
//			
//			Thread.sleep(5000);
//		    //WebElement ele15=driver.findElement(By.xpath("//*[text()='اسم المنصب الإداري بالعربي']//parent::div//descendant::input"));
//		    WebElement ele15=driver.findElement(By.xpath("//*[text()='Role Name in Arabic']//parent::div//descendant::input"));
//			ele15.click();
//			ele15.clear();
//			ele15.sendKeys("test25.1");
//			
//			
//			Thread.sleep(5000);
//			WebElement ele17=driver.findElement(By.xpath("(//*[text()='مستوى المنصب'])[2]//following-sibling::select"));
//			ele17.click();
//			Thread.sleep(5000);
//			
//			WebElement ele18=driver.findElement(By.xpath("//option[text()='3']"));
//			ele18.click();
//			
//			Thread.sleep(8000);
//			driver.findElement(By.xpath("//*[text()='تسجيل']")).click();
//            Thread.sleep(12000);
//        	try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("no alet is there");
//			}
//			Thread.sleep(5000);
//            
//            try {
//				driver.findElement(By.xpath("//*[text()='OK']")).click();
//				Thread.sleep(5000);
//			}
//			catch(Exception e)
//			{
//				System.out.println("new location submit button not working");
//				driver.findElement(By.xpath("(//*[text()='تعديل'])//following-sibling::button")).click();		
//				
//			}	
//            
//            Thread.sleep(8000);
            
           
            
            
          //employees
			
			
			
			
			Thread.sleep(5000);
		
		    driver.findElement(By.xpath(" //*[text()=' اندماج الموظفين مع بعضهم']")).click();
			Thread.sleep(7000);
			try {
				driver.switchTo().alert().accept();
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("no alet is there");
			}
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(" //*[text()='إضافة موظف']")).click();
			
			Thread.sleep(7000);
			
			
			//WebElement ele20=driver.findElement(By.xpath("//*[text()='الاسم الأول بالإنقليزي']//parent::div//descendant::input"));
			WebElement ele20=driver.findElement(By.xpath("//*[text()='First Name in English']//parent::div//descendant::input"));
			ele20.click();
			ele20.sendKeys("testarun29.7");
			Thread.sleep(7000);
			
			WebElement ele21=driver.findElement(By.xpath("//*[text()='الاسم الأول بالعربي']//parent::div//descendant::input"));
			ele21.click();
			ele21.sendKeys("testarun29");
			
          Thread.sleep(7000);
			
			//WebElement ele22=driver.findElement(By.xpath("//*[text()='الاسم الأخير بالإنقليزي']//parent::div//descendant::input"));
			WebElement ele22=driver.findElement(By.xpath("//*[text()='Last Name in English']//parent::div//descendant::input"));
			ele22.click();
			ele22.sendKeys("testarun29");
			
			 Thread.sleep(7000);
				
				WebElement ele23=driver.findElement(By.xpath("//*[text()='الإسم الأخير بالعربي']//parent::div//descendant::input"));
				ele23.click();
				ele23.sendKeys("testarun29");
				
				//DATE
				 
				 Thread.sleep(5000);
		
				 WebElement ele24=driver.findElement(By.xpath("//*[text()='تاريخ الإنضمام']//following-sibling::input"));
				 ele24.click();
			
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
			        
			       ele24.sendKeys(previousDateString3); 
			       
			       Thread.sleep(5000);
			       
			       driver.findElement(By.xpath("//*[text()='الجنس']//following-sibling::select")).click();  
			       
			       Thread.sleep(5000);
			       
			       driver.findElement(By.xpath("//option[text()='موظف']")).click();
			        
                   Thread.sleep(5000);
                   
				//region
                   
                   driver.findElement(By.xpath("//*[text()='اختر المقر']//following-sibling::ng-select")).click();
                   Thread.sleep(5000);
			       
                   driver.findElement(By.xpath("//span[text()='test28.1']")).click();
                   
                   
                  Thread.sleep(5000);
                  
                  //sector
                  
                  driver.findElement(By.xpath("//*[text()='اختر الوحدة التنظيمية']//following-sibling::ng-select")).click();
                  Thread.sleep(5000);
			       
                  driver.findElement(By.xpath("//span[text()='test28']")).click();
                  Thread.sleep(5000);
                  
                  //role
                  
                  driver.findElement(By.xpath("//*[text()='اختر المنصب الإداري ']//following-sibling::ng-select")).click();
                  Thread.sleep(8000);
                  
                  
                  driver.findElement(By.xpath("//span[text()='test27']")).click();
                  Thread.sleep(5000);
			       
				
                  //UPLOAD EMPLOYYE PHOTO
					
					WebElement element=driver.findElement(By.xpath("//*[text()='صورة الموظف']//preceding-sibling::h5//child::img"));
					
					element.click();
					
					Thread.sleep(5000);
					
					StringSelection s1=new StringSelection("E:\\IMAGES\\docter.png");
					
					
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
					
					Robot rb =new Robot();
					
					rb.keyPress(KeyEvent.VK_CONTROL);
					rb.keyPress(KeyEvent.VK_V);
					rb.keyRelease(KeyEvent.VK_V);
					rb.keyRelease(KeyEvent.VK_CONTROL);
					
					Thread.sleep(3000);
					
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyRelease(KeyEvent.VK_ENTER);
                 
					Thread.sleep(7000);
				       
                    WebElement ele25= driver.findElement(By.xpath("//*[text()='رقم الجوال ']//following-sibling::input"));
                    Thread.sleep(5000);
                    ele25.sendKeys("3534254187");
                    Thread.sleep(5000);
                    
                    WebElement ele26= driver.findElement(By.xpath("//*[text()='الايميل ']//following-sibling::input"));
                    Thread.sleep(5000);
                    ele26.sendKeys("hthivyan@gmail.com");
			
                    Thread.sleep(5000);
                    
                    try {
                        
                        driver.findElement(By.xpath("//*[text()=' تمكين الوصول إلى بوابة الويب ']//preceding-sibling::input")).click();
                        Thread.sleep(5000);
                        }
                        
                        catch  (Exception e){
                        	System.out.println("no checkbox is there");
                        	
                        }
                   
                    Thread.sleep(7000);
                    
                
                    
                    driver.findElement(By.xpath("//button[text()='تسجيل']")).click();
                    
                    Thread.sleep(12000);
                	try {
        				driver.switchTo().alert().accept();
        			}
        			catch (Exception e) {
        				// TODO: handle exception
        				System.out.println("no alet is there");
        			}
        			Thread.sleep(5000);
					
					try {
						driver.findElement(By.xpath("//*[text()='OK']")).click();
						Thread.sleep(5000);
					}
					catch(Exception e)
					{
						System.out.println("edit location submit button not working");
						driver.findElement(By.xpath("//*[text()='إضافة موظف']//following-sibling::button")).click();								
					}
					
					Thread.sleep(7000);
					
					
					
					//EDIT EMPLOYEE
					
					
					
					  try {
							
							driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")).click();
							}
							catch(Exception e)
							{
								js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")));	
							}
					  
					  Thread.sleep(7000);	
						try {
							driver.switchTo().alert().accept();
						}
						catch (Exception e) {
							// TODO: handle exception
							System.out.println("no alet is there");
						}
						Thread.sleep(5000);
					 // WebElement ele27=driver.findElement(By.xpath("//*[text()='الاسم الأول بالإنقليزي']//parent::div//descendant::input"));
					  WebElement ele27=driver.findElement(By.xpath("//*[text()='First Name in English']//parent::div//descendant::input"));
					  ele27.click();
						ele27.clear();
						ele27.sendKeys("testarun29.1");
						Thread.sleep(7000);
						
						WebElement ele28=driver.findElement(By.xpath("//*[text()='الاسم الأول بالعربي']//parent::div//descendant::input"));
						ele28.click();
						ele28.clear();
						ele28.sendKeys("testarun25.3");
						
						 Thread.sleep(7000);
							
						//WebElement ele29=driver.findElement(By.xpath("//*[text()='الاسم الأخير بالإنقليزي']//parent::div//descendant::input"));
						WebElement ele29=driver.findElement(By.xpath("//*[text()='Last Name in English']//parent::div//descendant::input"));
						ele29.click();
						ele29.clear();
						ele29.sendKeys("testarun25.3");
							
						Thread.sleep(7000);
								
						WebElement ele30=driver.findElement(By.xpath("//*[text()='الإسم الأخير بالعربي']//parent::div//descendant::input"));
						ele30.click();
						ele30.clear();
						ele30.sendKeys("testarun25.3");
						//DATE
						 
						 Thread.sleep(5000);
				
						 WebElement ele31=driver.findElement(By.xpath("//*[text()='تاريخ الإنضمام']//following-sibling::input"));
						 ele31.click();
					
						 Thread.sleep(5000);
						 
						 
						 //Date currentDate = new Date();
					       Calendar calendar4 = Calendar.getInstance();
					       // calendar.setTime(currentDate);
					       calendar4.add(Calendar.DAY_OF_MONTH, +1);
					        
					       Date previousDate4 = calendar4.getTime();
					        
					       SimpleDateFormat dateFormat4 = new SimpleDateFormat("dd-MM-yyyy");
					        
					       String previousDateString4 = dateFormat4.format(previousDate4);
					       System.out.println(previousDateString4);
					       Thread.sleep(20000);
					        
					       ele31.sendKeys(previousDateString4); 
					       
					       Thread.sleep(5000);
					       
					     //region
		                   
		                   driver.findElement(By.xpath("//*[text()='اختر المقر']//following-sibling::ng-select")).click();
		                   Thread.sleep(12000);
					       
		                   driver.findElement(By.xpath("//span[text()='testarun22.0']")).click();
		                   
		                   
		                  Thread.sleep(5000);
		                  
		                  //sector
		                  
		                  driver.findElement(By.xpath("//*[text()='اختر الوحدة التنظيمية']//following-sibling::ng-select")).click();
		                  Thread.sleep(12000);
					       
		                  driver.findElement(By.xpath("//span[text()='testarun25.1']")).click();
		                  Thread.sleep(5000);
		                  
		                  //role
		                  
		                  
		                  
		                  driver.findElement(By.xpath("//*[text()='اختر المنصب الإداري ']//following-sibling::ng-select")).click();
		                  Thread.sleep(15000);
		                  
		                  
		                  driver.findElement(By.xpath("//span[text()='testarun25.2']")).click();
		                  Thread.sleep(5000);
		                  
		                  //UPLOAD EMPLOYYE PHOTO
							
							WebElement element1=driver.findElement(By.xpath("//*[@ngprojectas='ngx-dropzone-preview']"));
							
							element1.click();
							
							Thread.sleep(5000);
							
							StringSelection s2=new StringSelection("E:\\IMAGES\\docter.png");
							
							
							Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2, null);
							
							Robot rb1 =new Robot();
							
							rb1.keyPress(KeyEvent.VK_CONTROL);
							rb1.keyPress(KeyEvent.VK_V);
							rb1.keyRelease(KeyEvent.VK_V);
							rb1.keyRelease(KeyEvent.VK_CONTROL);
							
							Thread.sleep(3000);
							
							rb1.keyPress(KeyEvent.VK_ENTER);
							rb1.keyRelease(KeyEvent.VK_ENTER);
		                 
							Thread.sleep(7000);
							
							 WebElement ele32= driver.findElement(By.xpath("//*[text()='رقم الجوال ']//following-sibling::input"));
			                 ele32.click();
			                 ele32.clear();
			                 ele32.sendKeys("282777474383");
			                 Thread.sleep(7000);
			                    
			                 WebElement ele33= driver.findElement(By.xpath("//*[text()='الايميل ']//following-sibling::input"));

                            ele33.click();
                            ele33.clear();
			                ele33.sendKeys("siothivvyyanna@gmail.com");
						
			                 Thread.sleep(5000);
			                 
			                 try {
			                        
			                        driver.findElement(By.xpath("//*[text()=' تمكين الوصول إلى بوابة الويب ']//preceding-sibling::input")).click();
			                        Thread.sleep(5000);
			                        }
			                        
			                        catch  (Exception e){
			                        	System.out.println("no checkbox is there");
			                        	
			                        }
			                   
			                    Thread.sleep(7000);
			                 
			                
			                    
			                 driver.findElement(By.xpath("//button[text()='تسجيل']")).click();
			                    
			                 Thread.sleep(12000);
			             	try {
			    				driver.switchTo().alert().accept();
			    			}
			    			catch (Exception e) {
			    				// TODO: handle exception
			    				System.out.println("no alet is there");
			    			}
			    			Thread.sleep(5000);
			                 
			                 try {
									driver.findElement(By.xpath("//*[text()='OK']")).click();
									Thread.sleep(5000);
								}
								catch(Exception e)
								{
									System.out.println("edit location submit button not working");
									driver.findElement(By.xpath("//*[text()='تعديل']//following-sibling::button")).click();								
								}
								
								
					       
}
}