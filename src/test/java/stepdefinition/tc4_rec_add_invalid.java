package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.recruitement;

public class tc4_rec_add_invalid {
	WebDriver driver;
	recruitement r;
	
	@Given("the user is in the recruitement page for invalid")
	public void iven_the_user_is_in_the_recruitement_page_for_invalid() {
		driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		r.clickrecruitement();
	}

	
	@When("he enters {String} as firstname {String} as middlename {String} as lastname and {String} as email for inv")
	public void whentc4(String s1, String s2, String s3, String email) {
		r.clickadd1();
		r.entername(s1,s2,s3);
		r.enteremail(email);
		
	}
	@Then("system shows error")
	public void thentc4() {
		System.out.println("enter valid details");
		driver.quit();
	}


}
