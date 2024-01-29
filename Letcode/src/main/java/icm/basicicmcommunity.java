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

public class basicicmcommunity 
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver4.exe");
			
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
			Thread.sleep(35000);
			
			driver.findElement(By.xpath("//*[text()=' ICM Community']")).click();
			
			Thread.sleep(5000);
			
			
			
			
			try {
				driver.switchTo().alert().accept();
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("no alet is there");
			}
			
			
			
			
			
			
			
			
			
			
			
//			//newlocation
			
			try {
				driver.switchTo().alert().accept();
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("no alet is there");
			}
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[text()='New Location']")).click();
			
           Thread.sleep(5000);
			
			WebElement ele2=driver.findElement(By.xpath("//*[text()='Location Name in English']//parent::div//descendant::input"));
			ele2.click();
			ele2.sendKeys("testarun17");
			Thread.sleep(5000);
			
			
			
			
			WebElement ele3=driver.findElement(By.xpath("//*[text()='Location Name in Arabic']//parent::div//descendant::input"));
			ele3.click();
			ele3.sendKeys("ar");
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[text()='Submit']")).click();
			
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
				System.out.println("new location submit button not working");
				driver.findElement(By.xpath("(//*[text()='New Location'])[2]//following-sibling::button")).click();		
				
			}
	
			
		
		
	
		
		
		
		
		
		
			//edit location
		
		
		
		
		
		
		
		Thread.sleep(9000);
		
		try {
		
		driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")).click();
		}
		catch(Exception e)
		{
			js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")));	
		}
		
		
		Thread.sleep(5000);
		
		try {
			driver.switchTo().alert().accept();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("no alet is there");
		}
		Thread.sleep(5000);
		
		
		WebElement ele5=driver.findElement(By.xpath("//*[text()='Location Name in English']//parent::div//descendant::input"));
		ele5.click();
		ele5.clear();
		ele5.sendKeys("test04.1");
		Thread.sleep(5000);
		
		WebElement ele6=driver.findElement(By.xpath("//*[text()='Location Name in Arabic']//parent::div//descendant::input"));
		ele6.click();
		ele6.clear();
		ele6.sendKeys("test12ar");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		
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
			driver.findElement(By.xpath("//*[text()='Edit Location']//following-sibling::button")).click();		
			
		}
	
		
		
		
		
		
		//newdepartments
		
		
		Thread.sleep(7000);
		
        driver.findElement(By.xpath(" //*[text()=' Departments']")).click();
		Thread.sleep(5000);
		
		try {
			driver.switchTo().alert().accept();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("no alet is there");
		}
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='New Department']")).click();
		
		Thread.sleep(5000);
		try {
			driver.switchTo().alert().accept();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("no alet is there");
		}
		Thread.sleep(5000);
		
		
		WebElement ele7=driver.findElement(By.xpath("//*[text()='Department Name in English']//parent::div//descendant::input"));
		ele7.click();
		ele7.sendKeys("testarun17");
		
		Thread.sleep(5000);
	WebElement ele8=driver.findElement(By.xpath("//*[text()='Department Name in Arabic ']//parent::div//descendant::input"));
		ele8.click();
		ele8.sendKeys("test3.0");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
			
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
			System.out.println("new location submit button not working");
			driver.findElement(By.xpath("(//*[text()='New Department'])[2]//following-sibling::button")).click();		
			
		}	
			
		Thread.sleep(7000);
		
		
		
		
	//edit departments
	

				Thread.sleep(7000);
//				
				try {
					
					driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")).click();
					}
					catch(Exception e)
					{
						js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")));	
					}
//				
//				
				Thread.sleep(5000);
				
				try {
					driver.switchTo().alert().accept();
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("no alet is there");
				}
				Thread.sleep(5000);
				WebElement ele10=driver.findElement(By.xpath("//*[text()='Department Name in English']//parent::div//descendant::input"));
				ele10.click();
				ele10.clear();
				ele10.sendKeys("test04.1");
				Thread.sleep(5000);
				
				WebElement ele11=driver.findElement(By.xpath("//*[text()='Department Name in Arabic ']//parent::div//descendant::input"));
				ele11.click();
				ele11.clear();
				ele11.sendKeys("test12ar");
				Thread.sleep(8000);
				driver.findElement(By.xpath("//*[text()='Submit']")).click();
				
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
					driver.findElement(By.xpath("//*[text()='Edit Department']//following-sibling::button")).click();		
					
				}
//				
//				
//		
//		
//		
//				//newroles
//				
//		
//		
//		
//				
//				
				  driver.findElement(By.xpath(" //*[text()=' Roles']")).click();
					Thread.sleep(5000);
					
					try {
						driver.switchTo().alert().accept();
					}
					catch (Exception e) {
						// TODO: handle exception
						System.out.println("no alet is there");
					}
					Thread.sleep(5000);
					
					driver.findElement(By.xpath("//*[text()='New Roles']")).click();
					
					Thread.sleep(5000);
					
					
					
					WebElement ele12=driver.findElement(By.xpath("//*[text()='Role Name in English']//parent::div//descendant::input"));
					ele12.click();
					ele12.sendKeys("testarun17");
					
					Thread.sleep(5000);
				    WebElement ele13=driver.findElement(By.xpath("//*[text()='Role Name in Arabic']//parent::div//descendant::input"));
					ele13.click();
					ele13.sendKeys("test3.0");
				Thread.sleep(5000);
					WebElement ele14=driver.findElement(By.xpath("(//*[text()='Level'])[2]//following-sibling::select"));
					ele14.click();
					Thread.sleep(5000);
					
					WebElement ele15=driver.findElement(By.xpath("//option[text()='3']"));
					ele15.click();
					
					
					Thread.sleep(8000);
					driver.findElement(By.xpath("//*[text()='Submit']")).click();
						
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
						System.out.println("new location submit button not working");
						driver.findElement(By.xpath("(//*[text()='New Roles'])[2]//following-sibling::button")).click();		
						
					}	
						
//					
				Thread.sleep(8000);
//					
//					
//					
//					//edit roles
//					

							Thread.sleep(7000);
////							
							try {
								
								driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")).click();
								}
								catch(Exception e)
								{
									js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@class='far fa-edit'])[1]")));	
								}
//							
////							
							Thread.sleep(5000);
							try {
								driver.switchTo().alert().accept();
							}
							catch (Exception e) {
								// TODO: handle exception
								System.out.println("no alet is there");
							}
							Thread.sleep(5000);
							WebElement ele18=driver.findElement(By.xpath("//*[text()='Role Name in English']//parent::div//descendant::input"));
							ele18.click();
							ele18.clear();
							ele18.sendKeys("test04.1");
							Thread.sleep(5000);
							
							WebElement ele19=driver.findElement(By.xpath("//*[text()='Role Name in Arabic']//parent::div//descendant::input"));
							ele19.click();
							ele19.clear();
							ele19.sendKeys("testar");
							Thread.sleep(8000);
							
							
						
							WebElement ele30=driver.findElement(By.xpath("(//*[text()='Level'])[2]//following-sibling::select"));
							ele30.click();
							Thread.sleep(5000);
							
							WebElement ele31=driver.findElement(By.xpath("//option[text()='3']"));
							ele31.click();
							Thread.sleep(5000);
							driver.findElement(By.xpath("//*[text()='Submit']")).click();
							
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
								driver.findElement(By.xpath("//*[text()='Edit Department']//following-sibling::button")).click();								
							}
				
					
			
			
			
			
			
					
					//New employees
					
					
						Thread.sleep(9000);
					
					  driver.findElement(By.xpath(" //*[text()=' Employees']")).click();
						Thread.sleep(5000);
						try {
							driver.switchTo().alert().accept();
						}
						catch (Exception e) {
							// TODO: handle exception
							System.out.println("no alet is there");
						}
						Thread.sleep(5000);
						
						driver.findElement(By.xpath(" //*[text()='New Employee']")).click();
						
						Thread.sleep(5000);
						
						WebElement ele20=driver.findElement(By.xpath("//*[text()='First Name in English']//parent::div//descendant::input"));
						ele20.click();
						ele20.sendKeys("testarun17");
						Thread.sleep(5000);
						
						WebElement ele21=driver.findElement(By.xpath("//*[text()='First Name in Arabic']//parent::div//descendant::input"));
						ele21.click();
						ele21.sendKeys("testar");
						
                      Thread.sleep(5000);
						
						WebElement ele22=driver.findElement(By.xpath("//*[text()='Last Name in English']//parent::div//descendant::input"));
						ele22.click();
						ele22.sendKeys("testarun");
						
						 Thread.sleep(5000);
							
							WebElement ele23=driver.findElement(By.xpath("//*[text()='Last Name in Arabic']//parent::div//descendant::input"));
							ele23.click();
							ele23.sendKeys("testar");
							
							
							
							
							
							
							
							
							
							
							//DATE
							 
							 Thread.sleep(5000);
					
							 WebElement ele24=driver.findElement(By.xpath("//*[text()='Date of Joining']//following-sibling::input"));
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
						       
						       driver.findElement(By.xpath("//*[text()='Gender']//following-sibling::select")).click();  
						       
						       Thread.sleep(5000);
						       
						       driver.findElement(By.xpath("//option[text()='Male']")).click();
						        
                               Thread.sleep(5000);
						       //region
						       driver.findElement(By.xpath("//*[text()='Choose Region']//following-sibling::ng-select")).click();
                               Thread.sleep(5000);
						       
                               driver.findElement(By.xpath("//span[text()='test28.1']")).click();
                               
                               
                              Thread.sleep(5000);
						       //sector
						       driver.findElement(By.xpath("//*[text()='Choose Sector']//following-sibling::ng-select")).click();
                               Thread.sleep(5000);
						       
                               driver.findElement(By.xpath("//span[text()='test28']")).click();
                               Thread.sleep(5000);
						       //role
						       driver.findElement(By.xpath("//*[text()='Choose Role ']//following-sibling::ng-select")).click();
                               Thread.sleep(18000);
                               
                               
                               driver.findElement(By.xpath("//span[text()='test27']")).click();
                               Thread.sleep(8000);
                               
                               
                               //UPLOAD EMPLOYYE PHOTO
								
								WebElement element=driver.findElement(By.xpath("//*[text()='Employee Photo']//preceding-sibling::h5//child::img"));
								
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
						       
                              WebElement ele41= driver.findElement(By.xpath("//*[text()='Phone ']//following-sibling::input"));
                              Thread.sleep(5000);
                              ele41.sendKeys("182878942115473292");
                              Thread.sleep(5000);
                              
                              WebElement ele42= driver.findElement(By.xpath("//*[text()='Email ']//following-sibling::input"));
                              Thread.sleep(5000);
                              ele42.sendKeys("qqsvjravi@gmail.com");
                              
                            Thread.sleep(5000);
                            
                            try {
                              
                            driver.findElement(By.xpath("//*[text()=' Enable Web Portal Access ']//preceding-sibling::input")).click();
                            Thread.sleep(5000);
                            }
                            
                            catch  (Exception e){
                            	System.out.println("no checkbox is there");
                            	
                            }
                            Thread.sleep(7000);
                            
                            driver.findElement(By.xpath("//button[text()='Submit']")).click();
                            
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
								driver.findElement(By.xpath("//*[text()='New Employee']//following-sibling::button")).click();								
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
//							
                           	Thread.sleep(5000);
                           	try {
                    			driver.switchTo().alert().accept();
                    		}
                    		catch (Exception e) {
                    			// TODO: handle exception
                    			System.out.println("no alet is there");
                    		}
                    		Thread.sleep(5000);
    						
    						WebElement ele43=driver.findElement(By.xpath("//*[text()='First Name in English']//parent::div//descendant::input"));
    						ele43.click();
    						ele43.clear();
    						ele43.sendKeys("testarun22.1");
    						Thread.sleep(5000);
    						
    						WebElement ele44=driver.findElement(By.xpath("//*[text()='First Name in Arabic']//parent::div//descendant::input"));
    						ele44.click();
    						ele44.clear();
    						ele44.sendKeys("testarun11.0");
    						
                          Thread.sleep(5000);
    						
    						WebElement ele45=driver.findElement(By.xpath("//*[text()='Last Name in English']//parent::div//descendant::input"));
    						ele45.click();
    						ele45.clear();
    						ele45.sendKeys("testarun11.0");
    						
    						 Thread.sleep(5000);
    							
    						WebElement ele46=driver.findElement(By.xpath("//*[text()='Last Name in Arabic']//parent::div//descendant::input"));
    						ele46.click();
    						ele46.clear();
    						ele46.sendKeys("testarun11.0");
    							
                             
    						
    						 Thread.sleep(5000);
    							
							 WebElement ele47=driver.findElement(By.xpath("//*[text()='Date of Joining']//following-sibling::input"));
							 ele47.click();
						
							 Thread.sleep(5000);
							 
							 //Date currentDate = new Date();
						       Calendar calendar4 = Calendar.getInstance();
						       // calendar.setTime(currentDate);
						       calendar4.add(Calendar.DAY_OF_MONTH, +2);
						        
						       Date previousDate4 = calendar4.getTime();
						        
						       SimpleDateFormat dateFormat4 = new SimpleDateFormat("dd-MM-yyyy");
						        
						       String previousDateString4 = dateFormat4.format(previousDate4);
						       
						       Thread.sleep(20000);
						        
						       ele47.sendKeys(previousDateString4); 
						       
						       Thread.sleep(5000);
						       
						       driver.findElement(By.xpath("//*[text()='Gender']//following-sibling::select")).click();  
						       
						       Thread.sleep(5000);
						       
						       driver.findElement(By.xpath("//option[text()='Male']")).click();
						        
                               Thread.sleep(5000);
						       //region
						       driver.findElement(By.xpath("//*[text()='Choose Region']//following-sibling::ng-select")).click();
                               Thread.sleep(5000);
						       
                               driver.findElement(By.xpath("//span[text()='test28.1']")).click();
                               
                               //sector
                              Thread.sleep(5000);
						       
						       driver.findElement(By.xpath("//*[text()='Choose Sector']//following-sibling::ng-select")).click();
                               Thread.sleep(5000);
						       
                               driver.findElement(By.xpath("//span[text()='test28']")).click();
                               Thread.sleep(5000);
						       //role
						       driver.findElement(By.xpath("//*[text()='Choose Role ']//following-sibling::ng-select")).click();
                               Thread.sleep(15000);
                               
                               driver.findElement(By.xpath("//span[text()='test27']")).click();
                               Thread.sleep(5000);
                               
                               //UPLOAD EMPLOYYE PHOTO
								
								//WebElement element1=driver.findElement(By.xpath("//*[text()='Employee Photo']//preceding-sibling::h5//child::img"));
								
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
							       
	                              WebElement ele48= driver.findElement(By.xpath("//*[text()='Phone ']//following-sibling::input"));
	                              Thread.sleep(5000);
	                              ele48.click();
	                              ele48.clear();
	                              ele48.sendKeys("123455432");
	                              Thread.sleep(5000);
	                              
	                              WebElement ele49= driver.findElement(By.xpath("//*[text()='Email ']//following-sibling::input"));
	                              Thread.sleep(5000);
	                              ele49.click();
	                              ele49.clear();
	                              ele49.sendKeys("testingarun@gmail.com");
	                              
	                            Thread.sleep(5000);
	                             
	                            try {
	                                
	                                driver.findElement(By.xpath("//*[text()=' Enable Web Portal Access ']//preceding-sibling::input")).click();
	                                Thread.sleep(5000);
	                                }
	                                
	                                catch  (Exception e){
	                                	System.out.println("no checkbox is there");
	                                	
	                                }
	                           
	                            Thread.sleep(7000);
	                            
	                            driver.findElement(By.xpath("//button[text()='Submit']")).click();
	                            
	                            Thread.sleep(18000);
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
									driver.findElement(By.xpath("//*[text()='Edit Employee']//following-sibling::button")).click();								
								}
								
								
								
								
						
								
							
							
	}
}
