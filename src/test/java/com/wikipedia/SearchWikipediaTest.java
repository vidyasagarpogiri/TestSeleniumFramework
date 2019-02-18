/*
 * @author Naveen Khunteta
 * 
 */

package com.wikipedia;
               

import java.util.Random;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.crm.qa.base.TestBase;


public class SearchWikipediaTest extends TestBase{

	   
	public SearchWikipediaTest(){
			super();
			
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {	
		initialization();
	}
	
	/*@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}*/
	                        
	
	@Test()
	public void SearchWikipedia(){
		String[] keyWords = {"Marvels","Superman","Ironman","Batman","Wonderwomen","Captain America","Avengers"};
		int id = new Random().nextInt(keyWords.length);
		String random = (keyWords[id]);
		System.out.println(random);
		com.wikipedia.SearchPage.searchText(random);
	}
	

	  



	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}
