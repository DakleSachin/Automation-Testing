package Selenum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementVsFindelements {

	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		
		//FindElement --- Return the single element
		
		WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		search.sendKeys("Iphone"); // Iphone
		
		//FindElements --- Return the multiple element 
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='master-wrapper-content']//li"));
		System.out.println(ele.size()); // 4
		
		
		

	}

}
