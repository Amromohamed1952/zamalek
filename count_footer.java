package learn_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count_footer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\learn_testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
	/*	driver.get("https://www.bbc.com/");
		WebElement footer=driver.findElement(By.className("orb-footer-primary-links"));
		System.out.println(footer.findElements(By.tagName("a")).size());*/

		
		//Test yallakora no of footer
		/*driver.get("https://www.yallakora.com/");
		WebElement yallkorafotter=driver.findElement(By.className("navMenu"));
		System.out.println(yallkorafotter.findElements(By.tagName("a")).size());*/
		
		
		//filgoal footer
	/*	driver.get("https://www.youm7.com");
		WebElement youm7footer=driver.findElement(By.cssSelector("body.main-container:nth-child(2) footer.row.footer:nth-child(5) div.row.footer-up div.container > div.col-xs-8.footerMenu"));
		System.out.println(youm7footer.findElements(By.tagName("a")).size());*/
		
		
		
	


	}

}
