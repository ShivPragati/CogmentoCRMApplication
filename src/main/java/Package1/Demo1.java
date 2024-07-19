package Package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	protected static WebDriver driver;
	public static void main(String[] args) {
		//System.out.println("login page functionality created by swati");
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	   driver.manage().window().maximize();
	   driver.get("https://ui.cogmento.com/");
	   driver.findElement(By.name("email")).sendKeys("prafulp1010@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("Pr@ful0812");
	   
	
	
	
	
	
	
	}
}
