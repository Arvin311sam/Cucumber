package com.bdd.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {

	public static WebDriver driver;

	@FindBy(name = "processAddress")
	private WebElement order;
	@FindBy(name = "processCarrier")
	private WebElement shipping;
	@FindBy(xpath = "//*[@id=\"order\"]/div[2]/div/div/a")
	private WebElement close;
	@FindBy(xpath = "//*[@id=\"form\"]/div/p[2]/label")
	private WebElement cgv;
	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	private WebElement ship;

	public Order(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Order.driver = driver;
	}

	public WebElement getOrder() {
		return order;
	}

	public void setOrder(WebElement order) {
		this.order = order;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public void setShipping(WebElement shipping) {
		this.shipping = shipping;
	}

	public WebElement getCgv() {
		return cgv;
	}

	public void setCgv(WebElement cgv) {
		this.cgv = cgv;
	}

	public WebElement getShip() {
		return ship;
	}

	public void setShip(WebElement ship) {
		this.ship = ship;
	}
	public WebElement getClose() {
		return close;
	}

	public void setClose(WebElement close) {
		this.close = close;
	}

}
