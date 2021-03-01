package learn_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class faaaaabook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\learn_testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("firstname")).sendKeys("amr");
		driver.findElement(By.name("lastname")).sendKeys("mohamed");
		driver.findElement(By.name("reg_email__")).sendKeys("opwyfbyxfuwoxehejr@awdrt.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("opwyfbyxfuwoxehejr@awdrt.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("01065756689");
		//date
		WebElement day=driver.findElement(By.id("day"));
		Select dayvalue=new Select(day);
		dayvalue.selectByIndex(1);
				
		WebElement month=driver.findElement(By.id("month"));
		Select monthvalue=new Select(month);
		monthvalue.selectByVisibleText("May");
						
		WebElement year=driver.findElement(By.id("year"));
		Select yearvalue=new Select(year);
		yearvalue.selectByValue("1986");
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		
		//driver.findElement(By.id("u_0_13")).click();
		//or this one for id which has number
		driver.findElement(By.cssSelector("button[id*='u_0_']")).click();
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
