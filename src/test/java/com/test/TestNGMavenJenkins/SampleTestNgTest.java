package com.test.TestNGMavenJenkins;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNgTest {
ChromeDriver driver;

	
@BeforeTest
public void setup() {
//System.setProperty("webdriver.chromedriver", "/Users/kanha/ProjectComponents/WebDriver/chromedriver.exe");	
driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();

}
	
  @Test
  public void testCase1() {
	  System.out.println("This is first Test Case");
  }
  
  @Test
  public void testCase2() {
	  System.out.println("This is second Test Case");
  }
  
  @Test
  public void testCase3() {
	  System.out.println("This is third Test Case");
  }
  
  @AfterTest
  public void tearDown() {
	  driver.close();
  }
}
