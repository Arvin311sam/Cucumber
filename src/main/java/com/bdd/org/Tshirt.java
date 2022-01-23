package com.bdd.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt {

	public static WebDriver driver;

	@FindBy(xpath = "(//a[.='T-shirts'])[2]")
	private WebElement thsirt;
	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement image;

	public Tshirt(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Tshirt.driver = driver;
	}

	public WebElement getThsirt() {
		return thsirt;
	}

	public void setThsirt(WebElement thsirt) {
		this.thsirt = thsirt;
	}

	public WebElement getImage() {
		return image;
	}

	public void setImage(WebElement image) {
		this.image = image;
	}

}
