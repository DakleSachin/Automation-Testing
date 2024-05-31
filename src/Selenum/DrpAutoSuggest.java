package Selenum;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrpAutoSuggest {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
	    
       List <WebElement> List=driver.findElements(By.xpath("//div[@id='Alh6id']//div[@role='option']//div[1]/span"));
       
       System.out.println(List.size());
       
       
       for(WebElement Listoption:List) {
    	   
    	   if(Listoption.getText().equals("selenium download")) {
    		   Listoption.click();
    		   break;
    		   
    	   }
       }

	}

}
