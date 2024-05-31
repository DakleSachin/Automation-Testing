package Selenum;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SingleDrpandMultipleDrp {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		WebElement DrpDateEle=driver.findElement(By.name("DateOfBirthDay"));
		
		Select DrpDate=new Select(DrpDateEle);
		
		DrpDate.selectByVisibleText("3");
        
	}

}
