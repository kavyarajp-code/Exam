package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class recruitement {
	WebDriver driver;
	public recruitement(WebDriver driver) {
		this.driver=driver;
		
	}
	public void clickrecruitement() {
		WebElement rec=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));
		rec.click();
	}
	public void clickadd1() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		
	}
	public void entername(String fname,String mname,String lname) {
		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("middleName")).sendKeys(mname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}
	public void enteremail(String s) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys(s);
	}

}
