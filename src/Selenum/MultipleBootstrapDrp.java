package Selenum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBootstrapDrp {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=33");
		
		driver.findElement(By.xpath("//div[@class='nav float-end']//i[@class='fas fa-caret-down']")).click();
		
		
		List<WebElement> EleList=driver.findElements(By.xpath("//div[@class='nav float-end']//li[@class='list-inline-item']//li"));
		
		System.out.println("the no is "+EleList.size());
		
		selectOption(EleList,"Register");
		
	
		// Multiple Bootstrap DropDown
		
	}

	
	public static void selectOption (List<WebElement> ele, String value) {
		
		for (WebElement option:ele) {
			
			if (option.getText().equals(value)) {
				
				option.click();
				
				break;
			}
		}
		
	}

}
