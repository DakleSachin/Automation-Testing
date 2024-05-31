package Selenum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDrp {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		WebElement BirthDay=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		seclectOption(BirthDay, "5");
		
		WebElement BirthMonth=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		seclectOption(BirthMonth, "June");
		
		WebElement BirthYear=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		seclectOption(BirthYear, "2002");
	}
	
	
	
	public static void seclectOption (WebElement ele, String value) {
		
		Select option=new Select(ele);
		
		List <WebElement> selectone=option.getOptions();
		
		for (WebElement OneEle:selectone) {
			
			if(OneEle.getText().equals(value));
			
			{
				OneEle.click();
				break;
			}
			
		}	
		
	} 
		
}
