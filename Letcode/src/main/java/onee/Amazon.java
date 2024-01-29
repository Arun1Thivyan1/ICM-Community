package onee;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
        //for incognito mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
	
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		Actions act=new Actions(driver);
		Thread.sleep(10000);
		
		//clicking account and lists
		
		WebElement ele1=driver.findElement(By.xpath("//*[text()='Account & Lists']"));
		act.moveToElement(ele1);
		System.out.println("clicking Account and lists");
		act.build().perform();
		Thread.sleep(5000);
		
		//clicking sign in button
		WebElement ele2=driver.findElement(By.xpath("(//*[text()='Sign in'])[1]"));
		act.moveToElement(ele2);
		System.out.println("Clicking sign in button");
		act.click().build().perform();
		
		
		
		
		//WebElement ele3=driver.findElement(By.xpath("//input[@id='ap_email']"));
		
		//ele3.sendKeys("9361537648");
		
		//Handling StaleElementReferenceException
		try 
		{
			Thread.sleep(5000);
			WebElement ele3=driver.findElement(By.xpath("//input[@id='ap_email']"));
		    ele3.sendKeys("9361537648");
		    System.out.println("phone number sended");
		}
		
		catch(StaleElementReferenceException e){
			
			WebElement ele3=driver.findElement(By.xpath("//input[@id='ap_email']"));
		    ele3.sendKeys("9361537648");
		    System.out.println("phone number sended");
		}
		
		
		//clicking continue after entering mobile number
		
		WebElement elem=driver.findElement(By.xpath("//input[@id='continue']"));
		elem.click();
		System.out.println("continue button clicked");
		
		//driver.findElement(By.xpath("//*[text()='Mobiles']"));
		
		//Entering password
		
		WebElement ele4=driver.findElement(By.xpath("//*[@id='ap_password']"));
		ele4.sendKeys("Test@123");
		System.out.println("pasword is sended");
		
		//clicking sigin button after entering password
		Thread.sleep(5000);
		WebElement elem1=driver.findElement(By.xpath("//span[@id='auth-signin-button']"));
		elem1.click();
		System.out.println("sign in button clicked after entering password");
		
		Thread.sleep(5000);
		//Clicking search dropdown
		WebElement elem2=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		elem2.click();
		System.out.println("Dropdown near search bar is clicked");
		
		
		Thread.sleep(5000);
		//searching Toys and games
		
		WebElement elem3=driver.findElement(By.xpath("//option[text()='Toys & Games']"));
		elem3.click();
		System.out.println("Toys and games in search list is clicked");
	
		Thread.sleep(5000);
		
		//click search bar
		
		WebElement elem4=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		elem4.click();
		System.out.println("The Search bar is clicked");
		
		Thread.sleep(10000);
		
		//clicking5-7 years
		
		WebElement elem5=driver.findElement(By.xpath("(//*[text()='5 - 7 years'])[2]"));
		elem5.click();
		System.out.println("clicking5-7 years");
		
		
		//*[@class='a-spacing-micro']//descendant::span[text()='5 - 7 years'])[2]
		
		Thread.sleep(10000);
		//clicking under500
		
		WebElement elem7=driver.findElement(By.xpath("//span[text()='Under ₹500']"));
		elem7.click();
		System.out.println("clicking under500");
		
		Thread.sleep(10000);
		
		//The page is scrolled to required Element
		WebElement element=driver.findElement(By.xpath("(//span[text()='Imagimake Mapology India with State Capitals - Educational Toy and Learning Aid for Boys and Girls - India Map Puzzle - Jigsaw Puzzle, 25 Pieces'])[2]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
		
		element.click();
		
		
		
		System.out.println("The page is scrolled to required Element");
		//Thread.sleep(5000);
		
		//element.click();
		//The Number of Quantity is clicked
		
		
		
		
		
		//ADD TO CART
		Thread.sleep(10000);
		
		WebElement element2=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		element2.click();
		System.out.println("Cart button is clicked");
		
		
		
		//driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-5']")).click();
		//WebElement element=driver.findElement(By.xpath("(//span[@class=\"a-size-base-plus a-color-base a-text-normal\" and text()='Skillmatics Board Game - Rapid Rumble, Fun for Family Game Night, Educational Toys, Card Games for Kids, Teens and Adults, Gifts for Boys and Girls Ages 6, 7, 8, 9 and Up'])[2]"));
		/*WebElement element=driver.findElement(By.xpath("(//span[contains(text(),'Skillmatics Board Game')])[1]"));
		act.moveToElement(element);
		act.click().build().perform();*/
}
}
