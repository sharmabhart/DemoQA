import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo 
{
	
	public static void main(String[] args) throws InterruptedException
	   {
		WebDriverManager.chromedriver().setup();
		//  System.setProperty("webdriver.chrome.driver","C:\\Users\\MonaSharma\\eclipse-workspace\\DemoQa\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/automation-practice-form");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		  driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Bharti");		  
		  driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Rani");
		  driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("bharti@gmail.com");
		  driver.findElement(By.xpath("//*[text()=\"Female\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("1234567896");
		  //driver.findElement(By.xpath("//*[@id='dateOfBirthInput']")).click();
		  //driver.findElement(By.xpath("//*[@id='dateOfBirthInput']")).clear();
		  //driver.findElement(By.xpath("//*[@aria-label='Choose Tuesday, June 27th, 2023']")).click();
		  driver.findElement(By.xpath("//*[@id='subjectsContainer']")).sendKeys("DemoQa Testing");  
		  driver.findElement(By.xpath("//*[text()='Sports']")).click();
		  driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("jellyfish technologies,noida");
		  driver.findElement(By.xpath("//*[@class=' css-yk16xz-control']")).click();
		  driver.findElement(By.xpath("//*[@class=' css-yk16xz-control']")).sendKeys(Keys.ARROW_DOWN);	  
		  driver.findElement(By.xpath("//*[@class=' css-yk16xz-control']")).sendKeys(Keys.ENTER);
		  driver.findElement(By.xpath("//*[text()='Submit']")).click();
}
}
