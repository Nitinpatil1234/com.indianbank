package mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage {
	
	public static void main(String arg[]) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saatva.com/?utm_source=imwaveinc&utm_medium=affiliate&click_id=1100lvTM3Xam&coupon=ktznlumbzxwrfktr");
		driver.findElement(By.xpath("//img[@alt='Saatva Classic Mattress']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Add 1 Item to Cart']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Modern Foam Mattress']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Add 1 Item to Cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".masthead-site-nav-module__linkItemContainer-310>svg>title#cartIcon")).click();
		System.out.println("Deepak Yadav");
		
	}
}
