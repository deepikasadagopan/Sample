package automationTesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		
		System.setProperty("webdriver.chromedriver.driver","/chromeDriver");
		
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		 
		 driver.manage().window().maximize();
		 WebElement button1 = driver.findElement(By.id("button1")); 
		 
		 int n=5;
		 
		 for(int i = 0; i<n; i++)
		 {
			 button1.click();
		 Thread.sleep(3000);
		 }
//		 String h = driver.getWindowHandle();
//		 System.out.println(h);
		 
		 Set<String> s = driver.getWindowHandles();
				 
				 for (String alls: s)
				 {
					 
					System.out.println(alls);
					
					 
				 }
		 driver.quit();
		 
		 
		 
	}

}
