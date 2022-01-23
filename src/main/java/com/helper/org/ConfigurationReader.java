package com.helper.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigurationReader {
	public static WebDriver driver;
	public static Properties ps;

	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\BDD-Cucumber\\src\\main\\java\\com\\property\\org\\Automation.property");
		FileInputStream fis = new FileInputStream(f);
		 ps = new Properties();
		ps.load(fis);
	}
	public String getbrowser() {
		String browser = ps.getProperty("Browser");
		return browser;
	}
	public String getur() {
		String URL = ps.getProperty("URL");
		return URL;

	}

}
