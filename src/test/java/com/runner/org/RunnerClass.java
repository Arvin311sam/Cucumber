package com.runner.org;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.bdd.org.Base;
import com.helper.org.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\org", glue = "com\\stepdefine\\org",
monochrome = true)
public class RunnerClass {

	public static WebDriver driver;
	@BeforeClass
	public static void getbrowser() throws IOException {
		 String getbrowser = FileReaderManager.getinstanceFRM().getinstanceCR().getbrowser();
		driver = Base.setup(getbrowser);
	}
	@AfterClass
	public static void getquit() {
		driver.quit();
	}
}
