package Selenum;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedList {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SACHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formstone.it/components/dropdown/demo/");

		WebElement newoption=driver.findElement(By.id("demo_label"));
		
		Select drplist=new Select (newoption);
		
		List<WebElement> options=drplist.getOptions();
		
		ArrayList orignalList= new ArrayList();
		ArrayList tempList=new ArrayList();
		
		for(WebElement option:options) {
			
			orignalList.add(option.getText());
			tempList.add(option.getText());
		}
		
		System.out.println("orignal list"+ orignalList);
		System.out.println("temp list"+ tempList);
		
	
		Collections.sort(tempList);
		
		System.out.println("orignal list"+ orignalList);
		System.out.println("temp list"+ tempList);
		
		if (orignalList.equals(tempList)) {
			
			System.out.println("List is Sorted");
		}
		else
		{
			System.out.println("List is Unsorted");
		}
		 
	}

}
