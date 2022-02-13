package day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class First {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RIYARAVI\\Desktop\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.seleniumhq.org/download/");
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    driver.quit();

	}
}
