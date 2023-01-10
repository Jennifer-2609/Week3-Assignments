package week3assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Roja");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Roja");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("7299871525");
		driver.findElement(By.id("password_step_input")).sendKeys("Oasys@123");
		WebElement findElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select tool=new Select(findElement);
		tool.selectByIndex(25);
		WebElement findElement2 = driver.findElement(By.id("month"));
		Select tool1=new Select(findElement2);
		tool1.selectByValue("9");
		WebElement findElement3 = driver.findElement(By.id("year"));
		Select tool2=new Select(findElement3);
		tool2.selectByVisibleText("1998");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		System.out.println(driver.findElement(By.xpath("//label[text()='Female']")).isSelected());
		driver.close();
	}
}
//FaceBook:// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		// Step 5: Add implicit wait
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enter the password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female" 
		//( A normal click will do for this step) 

