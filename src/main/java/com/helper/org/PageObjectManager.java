package com.helper.org;

import java.awt.Checkbox;

import org.openqa.selenium.WebDriver;

import com.bdd.org.Faded;
import com.bdd.org.Login;
import com.bdd.org.Order;
import com.bdd.org.Tshirt;

public class PageObjectManager {
	
	 public static WebDriver driver;
	 
	private Login l;
	private Tshirt ts;
	private Faded f;
	private Order o;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	public Login getlog() {
	Login l = new Login(driver);
	return l;
	}
	public Tshirt getts() {
		Tshirt ts = new Tshirt(driver);
		return ts;
	}
	public Faded getfa() {
		Faded f = new Faded(driver);
		return f;
	}
	public Order geto() {
		Order o = new Order(driver);
		return o;

	}

}
