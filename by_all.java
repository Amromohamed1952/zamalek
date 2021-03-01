package learn_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class by_all {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\learn_testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.google.com");
	//	driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//how to write byAll *** write by then ctrl+space
		
		/*driver.findElement(new ByAll(By.name("email"),By.id("email"))).sendKeys("01065756689");
		driver.findElement(new ByIdOrName("pass")).sendKeys("Asd123zxc");
		driver.findElement(new ByChained(By.id("loginbutton"),By.tagName("input"))).click();*/
		
		
		driver.findElement(new ByChained(By.className("CwaK9"),By.tagName("span"))).click();
		
		
		
		

	}

}
