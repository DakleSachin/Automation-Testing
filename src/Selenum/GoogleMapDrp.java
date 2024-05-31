/*package Selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapDrp {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https//wwww.twoplugs.com/");
		
		driver.findElement(By.id("Live posting")).click();
		
		WebElement Searchbox=driver.findElement(By.id("Enter value"));
		
		Searchbox.clear();
		
	    Searchbox.sendKeys("india");
	    
	    
	    String text;
	    
	    do 
	    {
	    	
	    	Searchbox.sendKeys(Keys.ARROW_DOWN);
	    	
	    		text:Searchbox.getAttribute("value");
	    	
	    	if (text.equals("india mumbai"))
	    	
	    	{
	    		
	    		Searchbox.sendKeys(Keys.ENTER);
	    		break;
	    		
	    	}
	    }
	    
	}

}*/
