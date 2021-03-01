package learn_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chroooooom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\auto\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.google.com/?gws_rd=ssl");
	 /*   String expectedURL = "https://www.yahoo.com/?gws_rd=ssl";*/
	     String actualURL;
        actualURL = driver.getCurrentUrl();

         //compare the actual URL of the page with the expected one and print
         if (actualURL.contentEquals("https://www.google.com/?gws_rd=ssl")){
             System.out.println("Test pass!");
         } 
         else {   
             System.out.println("Test Fail!");
         }
	
			
			
							

	}

}
