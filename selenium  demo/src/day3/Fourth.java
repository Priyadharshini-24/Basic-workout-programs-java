package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourth {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RIYARAVI\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("software testing");
	    driver.findElement(By.xpath("//input[@type=\"submit\"]")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//a[@href=\"https://www.guru99.com/software-testing-introduction-importance.html\"]")).click();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//a[@href=\"https://www.softwaretestingmaterial.com/software-testing/\"]")).click();
	    driver.close();

	}

}
