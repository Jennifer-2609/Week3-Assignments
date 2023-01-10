package week3assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.main.Option;

public class GroundDropDown {
 
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select tool=new Select(element);
		tool.selectByIndex(2);
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='Germany']")).click();
		//Select tool1=new Select(findElement);
		//tool1.selectByIndex(3);
	}
	
	
}
