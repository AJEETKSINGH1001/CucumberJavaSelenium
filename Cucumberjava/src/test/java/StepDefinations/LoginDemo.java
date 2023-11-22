package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class LoginDemo {

    private WebDriver driver;

    @Given("the user is on the login page")
    public void navigateToLoginPage() {
    	System.setProperty("webdriver.chrome.driver","C:/Users/Ajeet/git/CucumberJavaSelenium/Cucumberjava/src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");  // replace with your actual login page URL
    }

    @When("the user enters valid username {string} and password {string}")
    public void enterValidCredentials(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @When("clicks the login button")
    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.id("submit")); // replace with the actual ID of your login button
        loginButton.click();
    }

    @Then("the user should be redirected to the home page")
    public void verifyHomePage() {
        // Add verification logic for the home page URL or any other indicator of successful login
        assertEquals("https://practicetestautomation.com/logged-in-successfully/", driver.getCurrentUrl()); // replace with your expected home page URL
    }

    @Then("the user should see a welcome message")
    public void verifyWelcomeMessage() {
        // Add verification logic for the presence of a welcome message
        WebElement welcomeMessage = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1")); // replace with the actual ID of the welcome message element
        assertEquals("Congratulations student. You successfully logged in!", welcomeMessage.getText()); // replace with your expected welcome message
    }

    @Then("close the browser")
    public void closeBrowser() {
        driver.quit();
    }
}
