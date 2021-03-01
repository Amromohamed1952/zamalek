package learn_testing;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\learn_testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		
		List <WebElement> checklist= driver.findElements(By.xpath("//input[@type='checkbox']"));
		checklist.get(0).click();
		checklist.get(1).click();
		checklist.get(2).click();
		
		//or this 
		/*
		driver.findElements(By.xpath("//input[@type='checkbox']")).get(0).click();
		driver.findElements(By.xpath("//input[@type='checkbox']")).get(1).click();
		driver.findElements(By.xpath("//input[@type='checkbox']")).get(2).click();
		*/
		

	}

}
