package cucumberXserenityStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberXserenityStepDef {
	
	WebDriver driver;
	
	
	@Given("open a page with url in  browser")
	public void open_url() {
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	}


	@When("enter valid login  credentials")
	public void validLogin() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
	}
	
	@When("enter invalid login  credentials")
	public void invalidLogin() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@your");

		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
	}
	
	
	@And("click on login")
	public void login() {

		driver.findElement(By.tagName("button")).click();
		
	}
	
	@Then("verify login")
	public void verifyLogin() {
		WebElement dash = driver.findElement(By.linkText("Dashboard"));
		
		org.testng.Assert.assertEquals(dash.isDisplayed(), true, "Login failed");
	}
	
	
	@And("terminate browser")
	public void tearDown() {
		driver.quit();	}
	 
}
