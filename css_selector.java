package learn_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\learn_testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		//send key by css
		
		driver.findElement(By.cssSelector("#email")).sendKeys("amro");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		//or
		driver.findElement(By.cssSelector("input#email")).sendKeys("123456");
	
		
		
		
		
		
		
		

	}

}
