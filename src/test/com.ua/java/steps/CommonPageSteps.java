package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonPageSteps extends AbstractPageSteps {

    WebDriver driver = getDriver();

    @Given("^navigate to log in admin page$")
    public void navigateToLogInAdminPage() throws Throwable {
        driver.navigate().to("http://192.168.1.202/app/adonis/administrator");
    }

    @Then("^close the browser$")
    public void closeTheBrowser() throws Throwable {
        driver.quit();
    }
}
