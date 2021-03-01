package learn_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gogole_search {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\learn_testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("الحمد لله رب العاملين");
		//driver.findElement(By.partialLinkText("ضربة حظ")).click();
		driver.findElement(By.partialLinkText("Recent projects")).click();
	//	driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("hellllo");		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
