package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	WebDriver driver;
	public login(WebDriver driver) {
		this.driver=driver;
		
	}
	public void clicklogin() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	public void enterusername(String s) {
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys(s);
	}
	public void enterpw(String s) {
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys(s);
	}

}
