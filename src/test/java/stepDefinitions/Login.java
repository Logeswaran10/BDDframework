package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	
	@Given("i want to launch the browser")
	public void i_want_to_launch_the_browser() {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}
	
	@Given("enter the url")
	public void enter_the_url() {
		
		driver.get("http://localhost:8888");
	   
	}
	
	@When("login page is displayed enter the valid credentials")
	public void login_page_is_displayed_enter_the_valid_credentials() {
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
	   
	}
	
	@When("Click on login button")
	public void click_on_login_button() {
	    
		
		
		driver.findElement(By.id("submitButton")).click();
		
		
	}
	
	
	@Then("validate if home page is displayed or not.")
	public void validate_if_home_page_is_displayed_or_not() {
	  
		System.out.println(driver.getTitle());
		
	}


}
