package catb_fee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fee_management {

	public static void main(String[] args) {
		 try {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Software Testing\\chromedriver\\chromedriver.exe");
		 
			//Creating WebDriver instance
          WebDriver driver = new ChromeDriver();
          
          //Navigate to web page
          driver.get("https://uatums.digivarsity.com/");
          
          //Maximizing window
          driver.manage().window().maximize();
          
		        // login to new website 
		 driver.findElement(By.id("UserName")).sendKeys("admin");
		 driver.findElement(By.id("Password")).sendKeys("tl@20201");
		 driver.findElement(By.className("blue")).click();
		 System.out.println("Logged IN Successfully");
		Thread.sleep(4000);
		
		
		
	} catch (Exception e) {}

	}

}
