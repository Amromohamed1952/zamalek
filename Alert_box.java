package learn_testing00001;
package learn_testing00002;
package learn_testing00003;
package learn_testing00000;
package learn_testing00000;
package learn_testing00000;
package learn_testing00000;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_box {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\learn_testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		/*driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("11111");*/

		
		System.out.println(driver.switchTo().alert().getText());
	
	
		

	}

}
