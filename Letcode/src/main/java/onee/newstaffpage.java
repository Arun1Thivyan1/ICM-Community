package onee;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class newstaffpage {
	
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
					JavascriptExecutor js =(JavascriptExecutor) driver;	
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
								
								Thread.sleep(5000);
									
								WebElement ele4=driver.findElement(By.xpath("//span[text()='TestThar']"));
								System.out.println(ele4.getText());
								ele4.click();
								
								Thread.sleep(5000);
								
		             //SELECT TITLE           
								WebElement ele3=driver.findElement(By.xpath("//label[text()='Title']//following-sibling::ng-select"));
								System.out.println(ele3.getText());
								ele3.click();
								Thread.sleep(5000);
								
								WebElement ele5=driver.findElement(By.xpath("//span[text()='Mr']"));
								System.out.println(ele5.getText());
								ele5.click();
								
								Thread.sleep(5000);
	                 //SELECT GENDER
								
								
								WebElement ele7=driver.findElement(By.xpath("//label[text()='Gender']//following-sibling::ng-select"));
								System.out.println(ele7.getText());
								ele7.click();
								Thread.sleep(5000);
								
								WebElement ele8=driver.findElement(By.xpath("//span[text()='Male']"));
								System.out.println(ele8.getText());
								ele8.click();
								
		             //FIRSTNAME
								
								Thread.sleep(5000);
								WebElement ele9=driver.findElement(By.xpath("//*[text()='First Name']//following-sibling::input"));
								System.out.println(ele9.getText());
								ele9.click();
								
								ele9.sendKeys("Mohammed");
								
								
		             //FIRSTNAME IN ARABIC
								Thread.sleep(3000);
								WebElement ele10=driver.findElement(By.xpath("//*[text()='First Name in Arabic']//following-sibling::input"));
								System.out.println(ele10.getText());
								ele10.click();
								
								ele10.sendKeys("Mohammed AR");
								
								
								
		              //LASTNAME
								
								Thread.sleep(3000);
								WebElement ele11=driver.findElement(By.xpath("//*[text()='Last Name']//following-sibling::input"));
								System.out.println(ele11.getText());
								ele11.click();
								
								ele11.sendKeys("Bismilal");
								
		              //LASTNAME IN ARABIC
							
								Thread.sleep(3000);
								WebElement ele12=driver.findElement(By.xpath("//*[text()='Last Name in Arabic']//following-sibling::input"));
								System.out.println(ele12.getText());
								ele12.click();
								
								ele12.sendKeys("Bismilal AR");
								
								
		               //EMAILID
								
								Thread.sleep(3000);
								WebElement ele13=driver.findElement(By.xpath("//*[text()='Email ID']//following-sibling::input"));
								System.out.println(ele13.getText());
								ele13.click();
								
								ele13.sendKeys("Bismi@gmail.com");
								
		               //NATIONALITY
								
								
								Thread.sleep(5000);
								WebElement ele14=driver.findElement(By.xpath("//label[text()='Nationality']//following-sibling::ng-select"));
								System.out.println(ele14.getText());
								ele14.click();
								
								Thread.sleep(5000);
								WebElement ele15=driver.findElement(By.xpath("//span[text()='Saudi Arabia']"));
								System.out.println(ele15.getText());
								ele15.click();
								Thread.sleep(5000);
		               //UPLOAD STAFF PROFILE
								WebElement element=driver.findElement(By.xpath("//*[text()='Upload Staff Profile']//preceding-sibling::h5//child::img"));
								
								element.click();
								
								Thread.sleep(3000);
								
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
								
                     //PASSWORD
								
								Thread.sleep(5000);
								try {
									driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input")).click();
								}
								
								catch(Exception e){
									
									js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input")));	
									
									 driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input")).click();
								}
								
								WebElement ele17=driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input"));
								System.out.println(ele17.getText());
								
								ele17.sendKeys("Bis1");
								
                      //CONFIRM PASSWORD
								Thread.sleep(3000);
								WebElement ele18=driver.findElement(By.xpath("//*[text()='Confirm Password']//following-sibling::input"));
								System.out.println(ele18.getText());
								ele18.click();
								
								ele18.sendKeys("Bis1 AR");
								
                        //CODE		
								
								Thread.sleep(5000);
								
								try {
									driver.findElement(By.xpath("//label[text()='Code']//following-sibling::ng-select")).click();
								}
								catch(Exception e){
									
									js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//label[text()='Code']//following-sibling::ng-select")));
									
									driver.findElement(By.xpath("//label[text()='Code']//following-sibling::ng-select")).click();
								}
								
								Thread.sleep(8000);
								driver.findElement(By.xpath("//span[text()='+966']")).click();
								
								
                          //MOBILE NUMBER
								Thread.sleep(5000);
								WebElement ele19=driver.findElement(By.xpath("//*[text()='Mobile Number']//following-sibling::input"));
								System.out.println(ele19.getText());
								ele19.click();
								
								ele19.sendKeys("529292176");
								
                           //LANGUAGES SPOKEN
								
								WebElement ele20=driver.findElement(By.xpath("//label[text()='Languages Spoken']//following-sibling::ng-select"));
								System.out.println(ele20.getText());
								ele20.click();
								
								Thread.sleep(5000);
									
								WebElement ele21=driver.findElement(By.xpath("//span[text()='English']"));
								System.out.println(ele21.getText());
								ele21.click();
								
                          //MEDICAL REG NO
								
								
								Thread.sleep(5000);
								
								try {
									driver.findElement(By.xpath("//label[text()='Medical Reg No']//following-sibling::input"));
								}
								catch(Exception e)
								{
									
									js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()='Medical Reg No']//following-sibling::input")));
									driver.findElement(By.xpath("//label[text()='Medical Reg No']//following-sibling::input")).click();
								}
								Thread.sleep(5000);
								WebElement ele24=driver.findElement(By.xpath("//label[text()='Medical Reg No']//following-sibling::input"));
								Thread.sleep(5000);
								ele24.sendKeys("222");								
								
								
		                     //EXPERIENCE
								
						        Thread.sleep(5000);
									
									try {
										driver.findElement(By.xpath("//label[text()='Experience']//following-sibling::textarea"));
									}
									catch(Exception e)
									{
										
										js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()='Experience']//following-sibling::textarea")));
										driver.findElement(By.xpath("//label[text()='Experience']//following-sibling::textarea")).click();
									}
									Thread.sleep(5000);
									WebElement ele25=driver.findElement(By.xpath("//label[text()='Experience']//following-sibling::textarea"));
									Thread.sleep(5000);
									ele25.sendKeys("5");
		                     //EXPERIENCE IN ARABIC
									
									Thread.sleep(3000);
									WebElement ele26=driver.findElement(By.xpath("//*[text()='Experience in Arabic']//following-sibling::textarea"));
									System.out.println(ele26.getText());
									ele26.click();
									ele26.sendKeys("5 AR");
									
		                     //SERVICE TYPE
									
							        Thread.sleep(5000);
							        	
										try {
											driver.findElement(By.xpath("//input[@id='teleconsultationCheck']")).click();
										}
										
										catch(ElementClickInterceptedException e)
										{
											
											js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='teleconsultationCheck']")));
											//Thread.sleep(5000);
											//driver.findElement(By.xpath("//input[@id='teleconsultationCheck']")).click();
										}
										
										Thread.sleep(5000);
										WebElement ele27=driver.findElement(By.xpath("//input[@id='inclinicCheck']//following-sibling::label[text()='In Clinic']"));
									    ele27.click();
									    Thread.sleep(5000);
										WebElement ele28=driver.findElement(By.xpath("//input[@id='homevisitCheck']//following-sibling::label[text()='Home Visit']"));
									    ele28.click();
									    
			                 //SHORT BIOGRAPHY
										
								        Thread.sleep(5000);
											
											try {
												driver.findElement(By.xpath("//label[text()='Short Biography']//following-sibling::textarea"));
											}
											catch(Exception e)
											{
												
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
											
				          //UPLOAD ATTACHMENTS							
											
									try {
										driver.findElement(By.xpath("(//div[@class='mb-4'])[21]")).click();
									}
											
									catch(Exception e) {
										js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//div[@class='mb-4'])[21]")));
										
									}
									
									Thread.sleep(10000);
									WebElement ele31=driver.findElement(By.xpath("(//div[@class='mb-4'])[21]"));
									act.moveToElement(ele31).moveByOffset(15, 15).click().build().perform();
								
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
									
									
									Thread.sleep(4000);
									
						//CLICKING ACTIVE BUTTON			
									try {
										driver.findElement(By.xpath("//label[text()=' Active ']")).click();
									}
									catch(Exception e)
									{
										
										js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()=' Active ']")));
										Thread.sleep(5000);
										driver.findElement(By.xpath("//label[text()=' Active ']")).click();
									}
						//SELECTING SPECIALIZATION	
									  
									  
									  Thread.sleep(3000);
									  
									  try {
											driver.findElement(By.xpath("//*[@id='1572-selectable']")).click();
										}
									 
										catch(Exception e)
										{
											
											js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id='1572-selectable']")));
											//Thread.sleep(5000);
											//driver.findElement(By.xpath("//*[@id='1572-selectable']")).click();
											
										}
							//INCLINIC AVAILABILITY TIME
									  Thread.sleep(3000);
									  try {
									  driver.findElement(By.xpath("(//label[text()='Consultation Time'])[1]//following-sibling::input")).click();
									  }
									  catch(Exception e)
									  {
										  js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//label[text()='Consultation Time'])[1]//following-sibling::input")));
										 // driver.findElement(By.xpath("(//label[text()='Consultation Time'])[1]//following-sibling::input")).click();
									  }
									WebElement eleme1=driver.findElement(By.xpath("(//label[text()='Consultation Time'])[1]//following-sibling::input"));
									  
									eleme1.sendKeys("10"); 
									Thread.sleep(3000);  
									WebElement eleme2=driver.findElement(By.xpath("(//label[text()='Buffer Time'])[1]//following-sibling::input")); 
									 eleme2.sendKeys("5"); 
									 
									 Thread.sleep(3000); 
									 WebElement eleme3=driver.findElement(By.xpath("(//label[text()='Consultation Fee'])[1]//following-sibling::input")); 
									 eleme3.sendKeys("150");  	
									
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									//TELE AVAILABILITY TIME
									 Thread.sleep(3000);
									 
									 WebElement eleme4=driver.findElement(By.xpath("(//label[text()='Consultation Time'])[2]//following-sibling::input"));
									  
									eleme4.sendKeys("10"); 
									 
									 Thread.sleep(3000);
									 
									 WebElement eleme5=driver.findElement(By.xpath("(//label[text()='Buffer Time'])[2]//following-sibling::input")); 
									 eleme5.sendKeys("5"); 
									 
									 Thread.sleep(3000); 
									 WebElement eleme7=driver.findElement(By.xpath("(//label[text()='Consultation Fee'])[2]//following-sibling::input")); 
									 eleme7.sendKeys("190");
									 
									 
									 
									 
									 
									 
									 
									 
									 
									//SATURDAY TIME
									try
									{
										driver.findElement(By.xpath("//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div")).click();
									}
									catch(Exception e) {
										
					               js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div")));
					               //driver.findElement(By.xpath("//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div")).click();
									}
									
									Thread.sleep(3000);
									
									WebElement elem8=driver.findElement(By.xpath("//span[text()='11:00']"));
									elem8.click();
									
									
									Thread.sleep(3000);
									
									driver.findElement(By.xpath("(//label[text()='Saturday']//ancestor::div[@class='col-md-2 align-items-center justify-content-center']//following-sibling::div)[2]")).click();
									Thread.sleep(3000);
									driver.findElement(By.xpath("//span[text()='13:00']")).click();
									//WebElement eleme9=driver.findElement(By.xpath("(//label[text()='Start Date']//following-sibling::input)[1]"));
									//act.moveToElement(eleme9).moveByOffset(80, 0).click().perform();
									
									
									
								
								
								

}
}