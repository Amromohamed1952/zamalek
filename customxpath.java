package learn_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\learn_testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("01065756689");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Asd123zxc");
		driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();
		
		
		
		
		
		
		

	}

}
