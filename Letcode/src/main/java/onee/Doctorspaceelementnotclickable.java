package onee;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Doctorspaceelementnotclickable {

	
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
				
				Thread.sleep(5000);
				
				//select clinic
				
				WebElement ele3=driver.findElement(By.xpath("//label[text()='Title']//following-sibling::ng-select"));
				System.out.println(ele3.getText());
				ele3.click();
				
				Thread.sleep(8000);
					
				WebElement ele5=driver.findElement(By.xpath("//span[text()='Mr']"));
				System.out.println(ele5.getText());
				ele5.click();
				
				//Thread.sleep(5000);
				//select gender
				
				
				WebElement ele7=driver.findElement(By.xpath("//label[text()='Gender']//following-sibling::ng-select"));
				System.out.println(ele7.getText());
				ele7.click();
				
				Thread.sleep(8000);
					
				WebElement ele8=driver.findElement(By.xpath("//span[text()='Male']"));
				System.out.println(ele8.getText());
				ele8.click();
				
				//FIRSTNAME
				
				Thread.sleep(5000);
				WebElement ele9=driver.findElement(By.xpath("//*[text()='First Name']//following-sibling::input"));
				System.out.println(ele9.getText());
				ele9.click();
				
				ele9.sendKeys("Mohammed");
				//driver.findElement(By.xpath("//*[text()='First Name']")).sendKeys("Mohammed");
				
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
				
				
				
				
				
				
				
				
				
				
				
				//Thread.sleep(5000);
				
				//driver.findElement(By.xpath("//*[text()='Upload Staff Profile']//preceding-sibling::h5//child::img")).sendKeys("C:\\Users\\Naresh\\Pictures\4.jpg");
				
				
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
				
				
				
				
				
				
				Thread.sleep(10000);
				
				
				
				
				
				
				
				
				
				
				
				//WebElement ele30=driver.findElement(By.xpath("//label[text()='Code']//following-sibling::ng-select"));
				
				//JavascriptExecutor js=(JavascriptExecutor) driver;
				//js.executeScript("arguments[0].click();", ele30);
				
				//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
				//wait.until(ExpectedConditions.elementToBeClickable(ele30));
				//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele30);
				
				//Actions act=new Actions(driver);
				//act.moveToElement(ele30).click().build().perform();
				//ele30.click();
				//Thread.sleep(8000);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			//PASSWORD
				
				Thread.sleep(10000);
				try {
					driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input")).click();
				}
				
				catch(Exception e){
					JavascriptExecutor js=(JavascriptExecutor) driver;
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
				
				Thread.sleep(10000);
				
				try {
					driver.findElement(By.xpath("//label[text()='Code']//following-sibling::ng-select")).click();
				}
				catch(Exception e){
					JavascriptExecutor js=(JavascriptExecutor) driver;
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
				
               //LANGUAGES SPOKEN IN ARAIC
				
				WebElement ele22=driver.findElement(By.xpath("//label[text()='Language Spoken in Arabic']//following-sibling::ng-select"));
				System.out.println(ele22.getText());
				ele22.click();
				
				Thread.sleep(5000);
					
				WebElement ele23=driver.findElement(By.xpath("//span[text()='إنجليزي']"));
				System.out.println(ele23.getText());
				ele23.click();
				
				
				
				
				
				
				//MEDICAL REG NO
				
				
				Thread.sleep(10000);
				
				try {
					driver.findElement(By.xpath("//label[text()='Medical Reg No']//following-sibling::input"));
				}
				catch(Exception e)
				{
					JavascriptExecutor js=(JavascriptExecutor) driver;
					js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()='Medical Reg No']//following-sibling::input")));
					driver.findElement(By.xpath("//label[text()='Medical Reg No']//following-sibling::input")).click();
				}
				Thread.sleep(5000);
				WebElement ele24=driver.findElement(By.xpath("//label[text()='Medical Reg No']//following-sibling::input"));
				Thread.sleep(5000);
				ele24.sendKeys("222");
				//MEDICAL LICENSE EXPIRY
				
				
				
				
				
				
				
				
				
				
				
				//EXPERIENCE
				
	        Thread.sleep(10000);
				
				try {
					driver.findElement(By.xpath("//label[text()='Experience']//following-sibling::textarea"));
				}
				catch(Exception e)
				{
					JavascriptExecutor js=(JavascriptExecutor) driver;
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
				
		        Thread.sleep(10000);
		        
		        
		        
		        
		        
		        
		        
		        
		       
					
					try {
						driver.findElement(By.xpath("//input[@id='teleconsultationCheck']")).click();
					}
					
					catch(ElementClickInterceptedException e)
					{
						JavascriptExecutor js=(JavascriptExecutor) driver;
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
					
			        Thread.sleep(10000);
						
						try {
							driver.findElement(By.xpath("//label[text()='Short Biography']//following-sibling::textarea"));
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
						
					//ACTIVE UPLOAD	
				    
                     //  Thread.sleep(10000);
                       
                     //  driver.findElement(By.xpath("//label[text()=' Active ']")).click();
                      // Thread.sleep(10000);
                       
                      // driver.findElement(By.xpath("//*[text()='Upload Attachments']//following-sibling::input")).click();
						
                      /* Thread.sleep(10000);
                       
                      //driver.findElement(By.xpath("//label[text()=' Active ']")).click();
                       
                       
						try {
							driver.findElement(By.xpath("//label[text()=' Active ']"));
						}
						catch(Exception e)
						{
							JavascriptExecutor js=(JavascriptExecutor) driver;
							js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()=' Active ']")));
							Thread.sleep(5000);
							driver.findElement(By.xpath("//label[text()=' Active ']")).click();
						}*/
						
						
						Thread.sleep(60000);
						
						try {
							driver.findElement(By.xpath("(//span[text()='emotional problems'])[1]"));
						}
						
						catch(Exception e)
						{
							JavascriptExecutor js=(JavascriptExecutor) driver;
							js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//span[text()='emotional problems'])[1]")));
							Thread.sleep(60000);
							driver.findElement(By.xpath("(//span[text()='emotional problems'])[1]")).click();
						}	
						
						
						
						
						
						
						
						
						
				    
				
				
				
				
				
			
}
}