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

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class javascriptexecutorandtryandcatch {
	
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
						
						
						//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
						Thread.sleep(35000);
						WebElement ele1=driver.findElement(By.xpath("//*[text()='New Staff']"));
						System.out.println(ele1.getText());
						ele1.click();
						
						
						Thread.sleep(10000);
						
						
						
						
//					/*	//SELECTCLINIC
//						
//						
//						
//						WebElement ele2=driver.findElement(By.xpath("//label[text()='Select Clinic']//following-sibling::ng-select"));
//						System.out.println(ele2.getText());
//						ele2.click();
//						
//						Thread.sleep(8000);
//							
//						WebElement ele4=driver.findElement(By.xpath("//span[text()='TestThar']"));
//						System.out.println(ele4.getText());
//						ele4.click();
//						
//						
//						
//					/*	//SHORT BIOGRAPHY
//						
//				        Thread.sleep(10000);
//				        
//				       	
//							try {
//								driver.findElement(By.xpath("//label[text()='Short Biography']//following-sibling::textarea"));
//							}
//							catch(Exception e)
//							{
//								//JavascriptExecutor js=(JavascriptExecutor) driver;
//								js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()='Short Biography']//following-sibling::textarea")));
//								Thread.sleep(5000);
//								driver.findElement(By.xpath("//label[text()='Short Biography']//following-sibling::textarea")).click();
//							}
//							Thread.sleep(3000);
//							WebElement ele29=driver.findElement(By.xpath("//label[text()='Short Biography']//following-sibling::textarea"));
//							Thread.sleep(5000);
//							ele29.sendKeys("Bio");
//					    //SHORT BIOGRAPHY IN ARABIC
//							Thread.sleep(5000);
//							WebElement ele30=driver.findElement(By.xpath("//label[text()='Short Biography in Arabic']//following-sibling::textarea"));
//							System.out.println(ele30.getText());
//							ele30.click();
//							
//							ele30.sendKeys("Bio AR");*/
//							
//							
//						
//						
//						
//						
//						
//						
//							
//							
//							
//							
//							
//					
//						
//						
//							
//				//CLICKING ACTIVE BUTTON(-------------DOUT----------------)
//					/*Thread.sleep(10000);
//							
//					  try {
//							driver.findElement(By.xpath("//label[text()=' Active ']//preceding-sibling::input")).click();
//						}
//						catch(Exception e)
//						{
//							//JavascriptExecutor js=(JavascriptExecutor) driver;
//							js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()=' Active ']//preceding-sibling::input")));
//						}
//							Thread.sleep(10000);
//							driver.findElement(By.xpath("//label[text()=' Active ']//preceding-sibling::input")).click();
//							
//					  Thread.sleep(15000);*/
//					  
//					  
//					 
//					  
//					/*//SELECTING SPECIALIZATION	
//					  
//					  
//					  Thread.sleep(10000);
//					  
//					  try {
//							driver.findElement(By.xpath("//*[@id='1572-selectable']")).click();
//						}
//					 
//						catch(Exception e)
//						{
//							//JavascriptExecutor js1=(JavascriptExecutor) driver;
//							js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id='1572-selectable']")));
//							//Thread.sleep(5000);
//							//driver.findElement(By.xpath("//*[@id='1572-selectable']")).click();
//							
//						}*/
//						//INCLINIC AVAILABILITY TIME
//					  Thread.sleep(10000);
//					  try {
//					  driver.findElement(By.xpath("(//label[text()='Consultation Time'])[1]//following-sibling::input")).click();
//					  }
//					  catch(Exception e)
//					  {
//						  js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//label[text()='Consultation Time'])[1]//following-sibling::input")));
//						  driver.findElement(By.xpath("(//label[text()='Consultation Time'])[1]//following-sibling::input")).click();
//					  }
//					WebElement eleme1=driver.findElement(By.xpath("(//label[text()='Consultation Time'])[1]//following-sibling::input"));
//					  
//					eleme1.sendKeys("10"); 
//					Thread.sleep(5000);  
//					WebElement eleme2=driver.findElement(By.xpath("(//label[text()='Buffer Time'])[1]//following-sibling::input")); 
//					 eleme2.sendKeys("5"); 
//					 
//					 Thread.sleep(5000); 
//					 WebElement eleme3=driver.findElement(By.xpath("(//label[text()='Consultation Fee'])[1]//following-sibling::input")); 
//					 eleme3.sendKeys("150");  
//					 
//					//TELE AVAILABILITY TIME
//					 Thread.sleep(5000);
//					 
//					 WebElement eleme4=driver.findElement(By.xpath("(//label[text()='Consultation Time'])[2]//following-sibling::input"));
//					  
//					eleme4.sendKeys("10"); 
//					 
//					 Thread.sleep(10000);
//					//SATURDAY TIME
//					try
//					{
//						driver.findElement(By.xpath("//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div")).click();
//					}
//					catch(Exception e) {
//						
//	               js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div")));
//	               driver.findElement(By.xpath("//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div")).click();
//					}
//					//Thread.sleep(10000);
//		
//					//WebElement elem5=driver.findElement(By.xpath("//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div"));
//					//elem5.click();
//					Thread.sleep(10000);
//					
//					WebElement elem8=driver.findElement(By.xpath("//span[text()='11:00']"));
//					elem8.click();
//					
//					
//					Thread.sleep(7000);
//					WebElement eleme9=driver.findElement(By.xpath("(//label[text()='Start Date']//following-sibling::input)[1]"));
//					act.moveToElement(eleme9).moveByOffset(80, 0).click().perform();
//					
//					
//					
//					
//					Thread.sleep(8000);
//					
//					
//					Date currentDate = new Date();
//			        Calendar calendar = Calendar.getInstance();
//			        calendar.setTime(currentDate);
//			        calendar.add(Calendar.DAY_OF_MONTH, 1);
//			        Date previousDate = calendar.getTime();
//			        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//			        String previousDateString = dateFormat.format(previousDate);
//			        
//		
//			        eleme9.sendKeys(previousDateString);  
					
					
					
					
					
					
					
					
					
					
					
					Thread.sleep(5000);
					
					
					try {
						driver.findElement(By.xpath("(//div[@class='mb-41'])[21]")).click();
						
//						//*[@formcontrolname='careGiverAttachment']
					}

					catch (Exception e) {
						js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//div[@class='mb-4'])[21]")));
						System.out.println("1111");
						System.out.println(e);
			//e.printStackTrace();
						
					}
					
					
					/*try {
						driver.findElement(By.xpath("//input[@class='form-control ng-valid ng-touched ng-dirty']")).click();
					}
							
					catch(Exception e) {
						js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@class='form-control ng-valid ng-touched ng-dirty']")));
						
					}*/
					
					//Thread.sleep(10000);
					//WebElement ele31=driver.findElement(By.xpath("//input[@class='form-control ng-valid ng-touched ng-dirty']"));
					//act.moveToElement(ele31).moveByOffset(15, 15).click().build().perform();
				
					Thread.sleep(3000);
					
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
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					/*WebElement elem7=driver.findElement(By.xpath("//*[@id='a0f20043b8e3']//descendant::div[@id='a0f20043b8e3-1']"));
					driver.switchTo().frame(elem7);
					elem7.click();*/
					
					 
					 
					 
							
	}
}
