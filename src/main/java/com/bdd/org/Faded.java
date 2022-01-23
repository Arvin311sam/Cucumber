package com.bdd.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Faded {

	public static WebDriver driver;


	@FindBy(name = "Submit")
	private WebElement add;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed;
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement proceeds;
	public Faded(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Faded.driver = driver;
	}
	
	public WebElement getAdd() {
		return add;
	}
	public void setAdd(WebElement add) {
		this.add = add;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public void setProceed(WebElement proceed) {
		this.proceed = proceed;
	}

	public WebElement getProceeds() {
		return proceeds;
	}
	public void setProceeds(WebElement proceeds) {
		this.proceeds = proceeds;
	
}
}