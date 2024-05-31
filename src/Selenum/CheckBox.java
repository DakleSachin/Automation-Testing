package Selenum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
	     //driver.findElement(By.xpath("//tbody/tr/td/input[1]")).click();
		
		List <WebElement> checkboxes=driver.findElements(By.xpath("//tbody/tr/td/input"));
		System.out.println("totle no of check boxes " + checkboxes.size());
		
		// Single check box
		
		for (int i=0;i<=checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		
		// All check box
		
		for (WebElement chbox:checkboxes) {
			
			chbox.click();
		}
		
		
		// Select check boc
		
         for (WebElement chbox:checkboxes) {
			
		      String cbox=chbox.getAttribute("id");
		      if (cbox.equals("Product 1")	|| cbox.equals("Product 1"));
		      
		      
	     }
	}

}
