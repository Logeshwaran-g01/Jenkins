package stepdefs;

import Pages.LoginPage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class LoginStepDefs {

    private WebDriver driver;
    LoginPage loginPage;
    String url = "https://dribbble.com/session/new";

    public LoginStepDefs(TestContext context){
              driver = context.getDriver();
    }
    @Given("navigate to the login page")
    public void navigateToTheLoginPage() {

        loginPage = new LoginPage(driver);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("user enter the {string} and {string}")
    public void userEnterTheUsernameAndPassword(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
    }

    @And("user clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.login.click();
    }

    @Then("homepage should be displayed")
    public void homepageShouldBeDisplayed() {
        Assert.assertEquals("https://dribbble.com/following", driver.getCurrentUrl());
    }

    @Given("a browser is opened")
    public void aBrowserIsOpened() {
        //driver = new ChromeDriver();
    }
}
