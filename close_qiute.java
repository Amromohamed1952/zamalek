package learn_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_qiute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\learn_testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.get("https://maktoob.yahoo.com/?p=us");
		
		//driver.close();//  close only this browser
		driver.quit(); // close all browser that open with seleinum

	}

}
