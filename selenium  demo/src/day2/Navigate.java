package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RIYARAVI\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.gmail.com");
		driver.manage().window().maximize();
	    driver.findElement(By.id("identifierId")).sendKeys("priyadharshini24.bca@gmail.com");
	    driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@label=\"Phone number or email\"]")).sendKeys("6385561837");
	    driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	    driver.quit();
	}
}


