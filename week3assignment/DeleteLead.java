package week3assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7299871525");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='12312']")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("12312");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(text2.contains("No records to display")) {
			System.out.println("successful deletion");
		}
		else {
			System.out.println("unsuccessful");
		}
		driver.close();
	}
	
}

/*http://leaftaps.com/opentaps/control/main
Delete Lead:
1	Launch the browser
2	Enter the username
3	Enter the password
4	Click Login
5	Click crm/sfa link
6	Click Leads link
7	Click Find leads
8	Click on Phone
9	Enter phone number
10	Click find leads button
11	Capture lead ID of First Resulting lead
12	Click First Resulting lead
13	Click Delete
14	Click Find leads
15	Enter captured lead ID
16	Click find leads button
17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
18	Close the browser (Do not log out)
*/