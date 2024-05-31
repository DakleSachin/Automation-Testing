package Selenum;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		WebElement FirstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
		FirstName.sendKeys("sachin");
		
		WebElement LastName=driver.findElement(By.id("LastName"));
		LastName.sendKeys("dakle");

		driver.findElements(By.xpath("//select[@name='DateOfBirthDay']"));

	}

}