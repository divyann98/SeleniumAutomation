package Flipkart_Task;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_Task {

	private static final String Assert = null;

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","/home/qq379/Selenium/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("TV");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//Implicit_Wait
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[contains(text(),'OnePlus Y Series 80 cm (32 inch) HD Ready LED Smart Android TV')]")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String parent=driver.getWindowHandle();
		//driver.switchTo().window(parent);
		//System.out.println(parent);
		
		Set<String> win=driver.getWindowHandles();
		
		ArrayList<String> a1=new ArrayList<String>(win);
		
		driver.switchTo().window(a1.get(1));
		
		//Validate_Title
		
		String title=driver.getTitle();
		System.out.println(title);
		org.testng.Assert.assertEquals(title, "OnePlus Y Series 80 cm (32 inch) HD Ready LED Smart Android TV Online at best Prices In India");
		
		//Explicit_Wait
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("43")));
		
		driver.findElement(By.xpath("//a[@class='_1fGeJ5 PP89tw']")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		
		driver.close();
		driver.quit();
       
		

	}

}
