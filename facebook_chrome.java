package learn_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_chrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*   String expectedURL = "https://www.yahoo.com/?gws_rd=ssl";*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\learn_testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.google.com/?gws_rd=ssl");
	 
	     String actualURL= driver.getCurrentUrl();
        

         //compare the actual URL of the page with the expected one and print
         if (actualURL.contentEquals("https://www.google.com/?gws_rd=ssl"))
         {
             System.out.println("Test pass!");
         } 
         else {   
             System.out.println("Test Fail!");
         }
         
         String Actualtitle=driver.getTitle();
         if(Actualtitle.contentEquals("Google"))
         {
        	 System.out.println("title pass");
         }
         else
         {
        	 System.out.println("title fail");
         }
        
        System.out.println( driver.getPageSource());
			
			
							

	}

}


