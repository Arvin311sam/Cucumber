package com.bdd.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public static WebDriver driver;

	@FindBy(id = "email")
	private WebElement name;
	@FindBy(id = "passwd")
	private WebElement pass;
	@FindBy(id = "SubmitLogin")
	private WebElement signin;
	public Login(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Login.driver = driver;
	}
	public WebElement getName() {
		return name;
	}
	public void setName(WebElement name) {
		this.name = name;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public WebElement getSignin() {
		return signin;
	}
	public void setSignin(WebElement signin) {
		this.signin = signin;
	}

}
