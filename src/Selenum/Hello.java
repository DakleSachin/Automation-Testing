package Selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) {
		
	
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement Searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println(Searchbox.isDisplayed());
	
	}

}
