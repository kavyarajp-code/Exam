package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.login;

public class tc2_invalid_login {
	WebDriver driver;
	login l;
	@Given("the user is in the login page for invalid")
	public void the_user_is_in_the_login_page_for_invalid() {
		driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("he enters {String} as username and {String} as Password for inv")
	public void whentc2(String s1,String s2) {
		l.enterusername(s1);
		l.enterpw(s2);
	}
	@Then("he navigates to the home page")
	public void thentc2() {
		l.clicklogin();
		System.out.println("Invalid login credentials");
		driver.quit();
	}
	

}
