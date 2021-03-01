package learn_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calander_set {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://ar.hotels.com/");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement checkin=driver.findElement(By.id("qf-0q-localised-check-in"));
		WebElement checkout=driver.findElement(By.id("qf-0q-localised-check-out"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+"2020/07/31"+"');", checkin);
		js.executeScript("arguments[0].setAttribute('value','"+"2020/10/31"+"');", checkout);
		
		

	}

}
