package com.wikipedia;

import java.util.concurrent.TimeUnit;   
   
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;       

import com.crm.qa.base.TestBase;
      
public class SearchPage extends TestBase {  

	public static By searchInputText = By.id("searchInput");
	public static By searchButton = By.xpath("//button[@type='submit']");
	
	
	// Initializing the Page Objects:
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public static void searchText(String text){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(searchInputText).sendKeys(text);
		driver.findElement(searchButton).click();
	}
	
	
	

}
