package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RIYARAVI\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("software testing");
	    driver.findElement(By.xpath("//input[@type=\"submit\"]")).sendKeys(Keys.ENTER);
	    
		 String title=driver.getTitle();
		    if(title.equals("software testing - Google Search"))
		    {
		      System.out.println("Pass:Title is software testing-Google search");
		    }
		    else
		    {
		      System.out.println("Fail:Title is not software testing-Google search: actual title is : "+title);
		    }

		   driver.quit();
	}
	}
