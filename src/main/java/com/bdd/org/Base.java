package com.bdd.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static long maxtime = 50;
	static WebDriver driver;
	static WebDriverWait wait;

	public static WebDriver setup(String browsername) {
		try {
			switch (browsername) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			default:
				System.err.println("check a driver");
				break;
			}
		} catch (SessionNotCreatedException e) {
			System.out.println("Check the driver verions:" + e.getMessage());
		} catch (WebDriverException e) {
			System.out.println("selenium exceptions:" + e.getMessage());
		}

		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (TimeoutException e) {
			System.out.println("Time is over element not to be found:" + e.getMessage());
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void waits(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void geturl(String URL) {
		driver.get(URL);
	}

	public static void Takescreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sa = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\Screen\\jasmis.png");
		FileUtils.copyFile(sa, f);
	}

	public static void scroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0,0)");
	}

	public static WebElement element(String type, String value) {
		try {
			switch (type) {
			case "id":
				return driver.findElement(By.id(value));
			case "name":
				return driver.findElement(By.name(value));
			case "xpath":
				return driver.findElement(By.xpath(value));
			case "linkText":
				return driver.findElement(By.linkText(value));
			default:
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void type(WebElement element, String type) {
		element.sendKeys(type);
	}

	public static WebElement clr(String type, String value) {
		WebElement cv = driver.findElement(By.name(value));
		cv.clear();
		return cv;
	}

	public static void type(WebElement element, String type, Keys keys) {
		element.sendKeys(type, keys);
	}

	public static void Action(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void Robotic(WebElement element) throws AWTException {
		Actions a1 = new Actions(driver);
		a1.contextClick(element).perform();
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void switchtowindow(int i) {
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> li = new ArrayList<String>(windowHandles);
		driver.switchTo().window(li.get(i));
	}

	public static void wclose() {
		driver.close();
	}

	public static void selectbyvalue(WebElement element, String value) {
		new Select(element).selectByValue(value);
	}

	public static void selectbyindex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}

	public static void selectbytext(WebElement element, String text) {
		new Select(element).selectByVisibleText(text);
	}

	public static void frame(int value) {
		driver.switchTo().frame(0);
	}

	public static void q() {
		driver.quit();
	}

}
