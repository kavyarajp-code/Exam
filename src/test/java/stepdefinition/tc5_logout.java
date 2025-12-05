package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc5_logout {
	WebDriver driver=new EdgeDriver();
	
	
	@Given("the user is in the home page for logout")
	public void giventc5() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
	}
	@When("the user clicks logout")
		public void tc5when() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/img")).click();
		driver.findElement(By.linkText("Logout"));
	
	}
	@Then("Then the user logs out")
		public void thentc5() {
			
		
		System.out.println("log out successfull");
		driver.quit();
		
	}
	
	

}
