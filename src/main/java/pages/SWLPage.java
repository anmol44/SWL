package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class SWLPage extends BasePage {

	public SWLPage(WebDriver driver) {
		super(driver);
		System.out.println("Initializing SWLPage driver :");
	}
	long millis = System.currentTimeMillis();
	java.util.Date date = new java.util.Date(millis);
	
	
	String start1 =      "//button[@class='appmagic-button-container no-focus-outline' and @title='";
	String start2 =      "']";
	By next  =      By.xpath("//div[contains(text(),'Next') and @class ='appmagic-button-label no-focus-outline']");
	By spinner =    By.xpath("(//div[@class='appmagic-image-pseudo-button'])[3]");
	
	public SWLPage load(String url ) {
		driver.get(url);
		
		return this;
	}
	
	public SWLPage clickStart() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println(date);
		
		driver.switchTo().frame("fullscreen-app-host");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='appmagic-content-control-name appmagic-control-view canvasContentDiv _vst_' and @data-control-name='Button1_15']//following-sibling::button"))).click();
		
		return this;
	}
	
	public SWLPage employeeLocalization() {
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();
		driver.switchTo().defaultContent();
		return this;
	}
	
	public SWLPage spinnerWait() {
		//driver.switchTo().frame("fullscreen-app-host");
	//	wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		return this;
	}
	
	public SWLPage selectWorkType() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElements(By.xpath("html"));
		driver.switchTo().frame("fullscreen-app-host");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='appmagic-radio-container appmagic-scrollable-control no-focus-outline']//following-sibling::div)[3]"))).click();

		return this;
	}
	
	public SWLPage locationInSWL(WebDriver driver) {
		//driver.switchTo().frame("fullscreen-app-host");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='appmagic-toggleSwitch no-focus-outline left' and @data-shortcut-id='30']"))).click();

		return this;
	}
	
	public SWLPage nextPageAfterDataFill(WebDriver driver) {
		//driver.switchTo().frame("fullscreen-app-host");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='appmagic-button-container no-focus-outline' and @tabindex='22']"))).click();
		driver.switchTo().defaultContent();
		return this;
	}
	
	public SWLPage howIAmFeelingThisWeek() {
		String[] dates = date.toString().split(" ");
		if(dates[0].toString().equalsIgnoreCase("Thu")) {
			driver.switchTo().frame("fullscreen-app-host");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='radio' and @value='Happy']"))).click();
			driver.switchTo().defaultContent();		}
		return this;
	}
	
	public SWLPage nextPageAfterHealthAndFeeling() {
		driver.switchTo().frame("fullscreen-app-host");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='appmagic-button-label no-focus-outline' and contains(text(),'Next')]"))).click();
		driver.switchTo().defaultContent();
		return this;
	}
	
	public SWLPage submit() {
		driver.switchTo().frame("fullscreen-app-host");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='appmagic-button-label no-focus-outline' and contains(text(),'Submit')]"))).click();
		driver.switchTo().defaultContent();
		return this;
	}
}
