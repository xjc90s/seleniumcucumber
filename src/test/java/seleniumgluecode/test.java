package seleniumgluecode;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {

	WebDriver driver= new FirefoxDriver();
	WebElement section;
	@When("^I load LoveToKnow page$")
	  public void i_load_lovetoknow_page() throws Throwable {
	    driver.get("http://lovetoknow.com");
	  }
	
	@Then("^Page title is displayed$")
	  public void page_title_is() throws Throwable {
		String title="LoveToKnow: Advice you can trust";
	    assertEquals(title, driver.getTitle());
	  }

	@When("^I access News and Populars Topics section$")
	public void i_access_news_and_populars_topics_section() throws Throwable {
		section=driver.findElement(By.xpath("//section[2]header/h2"));
		
	    throw new PendingException();
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^News and Popular Topics section is displayed$")
	public void news_and_popular_topics_section_is_displayed() throws Throwable {
		assertEquals("News & Populars Topics",section.getText());
	    throw new PendingException();
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
