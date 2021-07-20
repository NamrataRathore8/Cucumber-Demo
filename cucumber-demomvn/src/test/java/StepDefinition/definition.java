package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class definition {
    WebDriver driver;
    @Given("login page")
    public void login_page() {
        // Write code here that turns the phrase above into concrete actions
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents");
 	    driver = new ChromeDriver();
 	    driver.get("https://opensource-demo.orangehrmlive.com/");

    }



    @When("Enter valid name {string}")
    public void enter_valid_name(String name) {
        // Write code here that turns the phrase above into concrete actions
    	driver.findElement(By.id("txtUsername")).sendKeys(name);
    }
    @When("Enter valid password {string}")
    public void enter_valid_password(String password) {
        // Write code here that turns the phrase above into concrete actions
    	driver.findElement(By.id("txtPassword")).sendKeys(password);
    }
    @When("Click on Submit button")
    public void click_on_submit_button() {
        // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("btnLogin")).click();
    }
    @Then("I should see the username as {string}")
    public void i_should_see_the_username_as(String welcome) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	String Actual = driver.findElement(By.id("welcome")).getText();
	    String Expected = welcome;
	    Assert.assertEquals(Expected,Actual);
	    driver.findElement(By.id("Welcome")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
	    System.out.println("I am successfully logged out");
	    driver.quit();

    }

    

    	@When("Enter invalid name {string}")
    	public void enter_invalid_name(String invalidname) {
    	    // Write code here that turns the phrase above into concrete actions
    		driver.findElement(By.id("txtUsername")).sendKeys(invalidname);
    	}


    	
    	@When("Enter invalid password {string}")
    	public void enter_invalid_password(String invalidpswd) {
    	    // Write code here that turns the phrase above into concrete actions
    		driver.findElement(By.id("txtPassword")).sendKeys(invalidpswd);
    	}

        @Then("I should see username as {string}")
        public void i_should_see_username_as(String invalidcredentials) throws InterruptedException {
            // Write code here that turns the phrase above into concrete actions
        	String Actual = driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText();
    	    String Expected = invalidcredentials;
    	    Assert.assertEquals(Expected,Actual);
    	     driver.quit();

        


    }

}
	

