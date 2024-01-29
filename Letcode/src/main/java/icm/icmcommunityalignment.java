package icm;

import java.awt.AWTException;
import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class icmcommunityalignment 
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
			
	//newlocation
			
			try {
				driver.switchTo().alert().accept();
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("no alet is there");
			}
	//color check 
			
			
			
           Thread.sleep(5000);
			
			//icm community color check
			WebElement ele10=driver.findElement(By.xpath("//*[text()='ICM Community']"));
			
			
			String colr10=ele10.getCssValue("color");
			System.out.println(colr10);
			
		
			if(colr10.equals("rgba(34, 34, 34, 1)"))
				
			{
				System.out.println("Icm community heading color is correct");
			}
			else {
				System.out.println("Icm community heading color is not correct");
			}
			
			 Thread.sleep(5000);
				
				//total employees color check
				WebElement ele11=driver.findElement(By.xpath("//*[text()='Total Employees']"));
				
				
				String colr11=ele11.getCssValue("color");
				System.out.println(colr11);
				
			
				if(colr11.equals("rgba(34, 34, 34, 1)"))
					
				{
					System.out.println("total employees color is correct");
				}
				else {
					System.out.println("total employees color is not correct");
				}
				
				//total employees number colr check
				
				 Thread.sleep(5000);
					
					
					WebElement ele12=driver.findElement(By.xpath("//*[text()='35']"));
					
					
					String colr12=ele12.getCssValue("color");
					System.out.println(colr12);
					
				
					if(colr12.equals("rgba(45, 64, 153, 1)"))
						
					{
						System.out.println("total employees number color is correct");
					}
					else {
						System.out.println("total employees number color is not correct");
					}
				
			Thread.sleep(5000);
			//prev btn colr check
			
			WebElement ele5=driver.findElement(By.xpath("//*[@id='regionListTable_previous']"));
			
			
			String colr5=ele5.getCssValue("color");
			System.out.println(colr5);
		
			
			if(colr5.equals("rgba(102, 102, 102, 1)"))
				
			{
				System.out.println("Previous button color is correct");
			}
			else {
				System.out.println("Previous button color is not correct");
			}
			
			
			
			
           Thread.sleep(5000);
			//list head clr check
			
			WebElement ele3=driver.findElement(By.xpath("//*[text()='Location Name']"));
			
			
			String colr2=ele3.getCssValue("color");
			System.out.println(colr2);
			
			
	if(colr2.equals("rgba(45, 64, 153, 1)"))
				
			{
				System.out.println("list headings color is correct");
			}
			else {
				System.out.println("list headings color is not correct");
			}
			
		//new loc btn clr check
	
	  Thread.sleep(5000);
		
		
		WebElement ele13=driver.findElement(By.xpath("//*[text()='New Location']"));
		
		
		String colr13=ele13.getCssValue("background-color");
		System.out.println(colr13);
		
		
if(colr13.equals("rgba(45, 64, 153, 1)"))
			
		{
			System.out.println("new loc btn color is correct");
		}
		else {
			System.out.println("new loc btn color is not correct");
		}
	
	  Thread.sleep(5000);
		
	//margin left (dout)(op comes as 0)
	  
	  WebElement ele14=driver.findElement(By.xpath("//*[text()='Showing 1 to 10 of 40 entries']"));
		
		
		String colr14=ele14.getCssValue("margin-left");
		System.out.println(colr14);
		
		

	  Thread.sleep(5000);
			
            SoftAssert sf= new SoftAssert();
			
			String actual= driver.findElement(By.xpath("//*[text()='ICM Community']")).getText();
			System.out.println(actual);
			
			String expec="ICM Community";
			
			sf.assertEquals(actual,expec,"failed");
			
			String actual1= driver.findElement(By.xpath("//*[text()=' Locations']")).getText();
			System.out.println(actual1);
			
			String expec1=" Location";
			
			
			sf.assertEquals(actual1,expec1,"fail");
			
			
			try {
				sf.assertAll();
				
			}catch(AssertionError e)
			{
			
				System.out.println(e.getMessage());
			}
			
			
		
			//distance between two cards
			
			WebElement ele15=driver.findElement(By.xpath("(//*[@class='card-body p-0 d-flex justify-content-center align-items-center'])[2]"));
			WebElement ele17=driver.findElement(By.xpath("(//*[@class='card-body p-0 d-flex justify-content-center align-items-center'])[3]"));
			
	       Point loc1=ele15.getLocation();
	       Point loc2=ele17.getLocation();
	       
	       
	       int x1= ele15.getLocation().getX()+ele15.getSize().getWidth()/2;
	       int x2= ele17.getLocation().getX()+ele17.getSize().getWidth()/2;
	       
	       
	       int hzdis=Math.abs(x2-x1);
	       System.out.println(hzdis);
	       
	     
	   	WebElement ele18=driver.findElement(By.xpath("(//*[@class='card-body p-0 d-flex justify-content-center align-items-center'])[2]"));
		WebElement ele19=driver.findElement(By.xpath("(//*[@class='card-body p-0 d-flex justify-content-center align-items-center'])[3]"));
		
     
       
       
       int x3= ele18.getLocation().getX()+ele15.getSize().getWidth();
       int x4= ele19.getLocation().getX();
       
       
       int hzdis1=Math.abs(x4-x3);
       System.out.println(hzdis1);
       
       
    	WebElement ele20=driver.findElement(By.xpath("(//*[@class='card-body p-0 d-flex justify-content-center align-items-center'])[3]"));
   		WebElement ele21=driver.findElement(By.xpath("(//*[@class='card-body p-0 d-flex justify-content-center align-items-center'])[4]"));
   		
        
          
          
          int x5= ele20.getLocation().getX()+ele20.getSize().getWidth();
            

          System.out.println(x5);
          
          int x6= ele21.getLocation().getX();
        
          System.out.println(x6);
          
          
          int hzdis2=Math.abs(x6-x5);
          System.out.println(hzdis2);
	       
	       
//	       System.out.println(loc1);
//	       System.out.println(loc2);
//	  
//	       double  dis= calculateDistance(loc1,loc2);
//	       
//	
//	}
////
//	private static double calculateDistance(Point point1, Point point2) {
//		// TODO Auto-generated method stub
//		int deltax= point2.getX()-point1.getX();
//		int deltay= point2.getY()-point1.getY();
//		double ans=Math.sqrt(deltax*deltax+deltay*deltay);
//		System.out.println(ans);
//		return ans;
//	
//	
//	
////	double horizontalDistance(Button button1, Button button2) {
////	    double x1 = button1.getCenterX();
////	    double x2 = button2.getCenterX();
////
////	    double horizontalDistance = Math.abs(x2 - x1);
////	    return horizontalDistance;
	}
	
	}
		
		
		
		
		
		
	

	


