package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlesearch {
	
//	WebDriver driver = null;
//	
//	@Given("the user is on the Google homepage")
//	public void the_user_is_on_the_google_homepage() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User at google page");
//	   // throw new io.cucumber.java.PendingException();
//	    System.setProperty("webdriver.chrome.driver","C:/Users/Ajeet/git/CucumberJavaSelenium/Cucumberjava/src/test/resources/Drivers/chromedriver.exe");
//	    driver= new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//	    driver.manage().window().maximize();	
//	    
//		// Navigate to Google homepage
//        driver.get("https://www.google.com");
//	}
//
//	@When("the user enters the search text {string} in the search textbox")
//	public void the_user_enters_the_search_text_in_the_search_textbox(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User enters in search box");
//	    //throw new io.cucumber.java.PendingException();
//
//          // Find the search textbox by name attribute
//        WebElement searchBox = driver.findElement(By.name("q"));
//
//        // Enter the search text "Cucumber Gherkin"
//        searchBox.sendKeys("GameChange Solutions");
//        // Submit the form (press Enter)
//        searchBox.sendKeys(Keys.RETURN);
//	}
//
//	@When("clicks the search button")
//	public void clicks_the_search_button() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User clicks the search");
//	   WebElement searchBox = null;
//		// throw new io.cucumber.java.PendingException();
//
//        // Wait for a few seconds to see the search results
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//		
//	}
//
//	@Then("the user should see search results related to {string}")
//	public void the_user_should_see_search_results_related_to(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Search results seen");
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//


}
