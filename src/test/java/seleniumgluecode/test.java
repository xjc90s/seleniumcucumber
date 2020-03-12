package seleniumgluecode;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.After;
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
	public void i_access_news_and_populars_topics_section() {
		section=driver.findElement(By.cssSelector(".features > header:nth-child(1) > h2:nth-child(1)"));
	}

	@Then("^News and Popular Topics section is displayed$")
	public void news_and_popular_topics_section_is_displayed(){
		
		assertEquals("New & Popular Topics",section.getText());
	}

	@Then("^Entertainment is displayed$")
	public void entertainment_is_displayed() {
		section=driver.findElement(By.linkText("Entertainment"));
		assertEquals("Entertainment",section.getText());
	}

	@Then("Health is displayed$")
	public void Health_is_displayed() {
		section=driver.findElement(By.linkText("Health"));
		assertEquals("Health",section.getText());
	}
	@Then("^Money is displayed$")
	public void money_is_displayed() {
		section=driver.findElement(By.linkText("Money"));
		assertEquals("Money",section.getText());
	}
	@Then("^Technology is displayed$")
	public void Technology_is_displayed() {
		section=driver.findElement(By.linkText("Technology"));
		assertEquals("Technology",section.getText());
	}
	@Then("^Beauty and Fashion is displayed$")
	public void beauty_and_fashion_is_displayed() {
		section=driver.findElement(By.linkText("Beauty & Fashion"));
		assertEquals("Beauty & Fashion",section.getText());
	}	
	
	@Then("^Home and Garden is displayed$")
	public void home_and_garden_is_displayed() {
		section=driver.findElement(By.linkText("Home & Garden"));
		assertEquals("Home & Garden",section.getText());
	}	
	@When("^I access article Other Names for a Man Purse$")
	public void i_access_article_other_names_for_a_man_purse() {
		section=driver.findElement(By.linkText("Other Names for a Man Purse"));
		section.click();
	}
	
	
	@When("^I add a comment in the article$")
	public void i_add_a_comment_in_the_article() {
		section=driver.findElement(By.xpath("//*[@id=\"title-1\"]/main/aside/div[1]/div[2]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", section);
		/*Actions actions = new Actions(driver);
		actions.moveToElement(section);
		actions.perform();
		*/
		section.click();
		WebElement element = (new WebDriverWait(driver, 10))
				   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form\"]/form/div/div[3]/div[2]/div/div[1]/div[1]/p")));

		element.sendKeys("Cool purses photos");
	}
	
	
	@When("^I should see next article$")
	public void i_should_see_next_article() {
		section=driver.findElement(By.xpath("/html/body/div[3]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", section);
	}
	@After
	public void clean_up() {
		driver.quit();
	}

}
