package Selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterClearCaptureText {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		
		// Enter and Clear text from input box
		
        inputbox.sendKeys("Iphone 15 pro max"); // Iphone 15 pro max
        
        inputbox.clear();     
        
        
        // Capture text from inputbox
        // Using getattribute();
        
        System.out.println(inputbox.getAttribute("value")); //Iphone 15 pro max
        
        
        // differrens between get.text() and get.attribute();
        
        //Get.attribute();
        System.out.println(inputbox.getAttribute("value")); //Iphone 15 pro max
        
        
        //Get.text();  
        System.out.println(inputbox.getText()); // NO VALUE  ALWASE CAPTURE INNER TEXT
        

	}

}
