package Selenum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlejQueryDropDown {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectChoiceOption(driver,"choice 1"); // Single Value Select
		
		//selectChoiceOption(driver,"choice 1","choice 2","choice 3" ); // Multiple Value Select
		
		//selectChoiceOption(driver,"All"); // All Value Select
	
		
	}

	
	public static void selectChoiceOption(WebDriver driver, String... value) {
		
		List <WebElement> ChoiceList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if (!value[0].equalsIgnoreCase("All")) {
			
			for(WebElement item:ChoiceList) {
				
				String text=item.getText();
				{
					for (String val:value) {
						
						if (text.equals(val)) {
							
						    item.click();
						    break;
						}
					}
					
				}
			}
		}
		
		else {
			
			for(WebElement item:ChoiceList) {
				
				item.click();
				
			}
		}	
	}
	
}
