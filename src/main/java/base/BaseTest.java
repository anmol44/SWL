package base;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import commons.Powershell;
import factory.DriverManager;

public class BaseTest {
	
	protected WebDriver driver;
	protected JavascriptExecutor javascriptExecutor;
	
	
	@BeforeMethod
	public void startDriver() throws IOException {
		
        Powershell shell = new Powershell();		
		shell.script();
		System.out.println("Registry Registered");
		driver = new DriverManager().initializeDriver();
		javascriptExecutor = (JavascriptExecutor) driver;
		
	}
	
	
	// Method to be called after each test case run
	  @AfterMethod 
	  public void quitDriver() throws InterruptedException {
	  Thread.sleep(100); 
	 driver.quit(); 
	  }
	 
	 
	 
	 
}
