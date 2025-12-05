package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.recruitement;

public class tc3_rec_add_valid {
	WebDriver driver;
	recruitement r;
	@Given("the user is in the recruitement page for valid")
	public void the_user_is_in_the_recruitement_page_for_valid() {
		driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		r.clickrecruitement();

	}
	@When("he enters {String} as firstname {String} as middlename {String} as lastname and {String} as email")
	public void whentc3(String s1, String s2, String s3, String email) {
		r.clickadd1();
		r.entername(s1,s2,s3);
		r.enteremail(email);
		
	}
	@Then("he successfully adds the candidate")
	public void thentc3() {
		System.out.println("success");
		driver.quit();
	}

}
