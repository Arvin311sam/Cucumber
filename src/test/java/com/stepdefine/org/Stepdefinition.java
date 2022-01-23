package com.stepdefine.org;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.bdd.org.Base;
import com.helper.org.FileReaderManager;
import com.helper.org.PageObjectManager;
import com.runner.org.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Base {
	public static WebDriver driver = RunnerClass.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("Go to automation pratice for shopping")
	public void go_to_automation_pratice_for_shopping() throws IOException {
	 String getur = FileReaderManager.getinstanceFRM().getinstanceCR().getur();
		geturl(getur);
	}

	@Given("User enter valid credentails")
	public void user_enter_valid_credentails(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<Map<String, String>> asMaps = dataTable.asMaps(String.class, String.class);
		String string = asMaps.get(0).get("username");
		String string2 = asMaps.get(0).get("password");
		type(pom.getlog().getName(), string);
		type(pom.getlog().getPass(), string2);
	}

	@Then("click login button")
	public void click_login_button() {
		click(pom.getlog().getSignin());

	}

	@Given("click tshirt option")
	public void click_tshirt_option() {
		click(pom.getts().getThsirt());

	}

	@When("click quick view t shirts")
	public void click_quick_view_t_shirts() {
		click(pom.getts().getImage());
	}

	@When("faded tshirt size")
	public void faded_tshirt_size() {
		System.out.println("size ok");
	}

	@When("click add a cart")
	public void click_add_a_cart() {
		driver.switchTo().frame(0);
		click(pom.getfa().getAdd());
		driver.switchTo().defaultContent();
		click(pom.getfa().getProceed());
		

	}

	@When("Proceed checkout all")
	public void proceed_checkout_all() {
		click(pom.getfa().getProceeds());
	}

	@When("shippig section to clear")
	public void shippig_section_to_clear() throws InterruptedException {
		click(pom.geto().getOrder());
		click(pom.geto().getShipping());
		click(pom.geto().getClose());
		waits(pom.geto().getCgv());
		click(pom.geto().getCgv());
		click(pom.geto().getShip());

	}

	@Then("click payements")
	public void click_payements() {
		System.out.println("its done");

	}

}
