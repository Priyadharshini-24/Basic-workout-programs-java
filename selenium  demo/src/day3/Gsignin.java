package day3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsignin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RIYARAVI\\Desktop\\chromedriver\\chromedriver.exe");
           
		   WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            String url = "https://accounts.google.com/signin";

            driver.get(url);

            driver.findElement(By.id("identifierId")).sendKeys("raj8805"); 

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);                

            driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();         

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);        

            driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("asassassa");             

            driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 

    }  


	}


