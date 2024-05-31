package Selenum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownsBootstrap {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=33");
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		
		List <WebElement> DrpOption=driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//li"));
		
		System.out.println("option number is "+DrpOption.size());
		
		
		for (WebElement OneOption:DrpOption) {
			
			if(OneOption.getText().equals("Login"));{
				
				OneOption.click();
				break;
			}
		}
	}

}
