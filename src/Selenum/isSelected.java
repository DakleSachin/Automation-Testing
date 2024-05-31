package Selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
				
		WebElement Excellent=driver.findElement(By.id("pollanswers-1"));
		WebElement Good=driver.findElement(By.id("pollanswers-2"));
		WebElement Poor=driver.findElement(By.id("pollanswers-3"));
		WebElement VeryBad=driver.findElement(By.id("pollanswers-4"));
		
		System.out.println(Excellent.isSelected());
		System.out.println(Good.isSelected());
		System.out.println(Poor.isSelected());
		System.out.println(VeryBad.isSelected());
		
		Excellent.click();
		
		System.out.println(Excellent.isSelected());
		System.out.println(Good.isSelected());
		System.out.println(Poor.isSelected());
		System.out.println(VeryBad.isSelected());
		
		Good.click();
		
		System.out.println(Excellent.isSelected());
		System.out.println(Good.isSelected());
		System.out.println(Poor.isSelected());
		System.out.println(VeryBad.isSelected());
		
		Poor.click();
			
		System.out.println(Excellent.isSelected());
		System.out.println(Good.isSelected());
		System.out.println(Poor.isSelected());
		System.out.println(VeryBad.isSelected());
		
		
		VeryBad.click();
		
		System.out.println(Excellent.isSelected());
		System.out.println(Good.isSelected());
		System.out.println(Poor.isSelected());
		System.out.println(VeryBad.isSelected());
		
	}

}
