package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class Steps extends AbstractPageSteps{

    WebDriver driver = getDriver();

    @When("^fill in log in form$")
    public void fillInLogInForm(DataTable arg1) throws Throwable {
        System.out.println(arg1);
    }

    @When("^click the 'Log In' button$")
    public void clickTheLogInButton() throws Throwable {
        System.out.println("smth");
    }

    @Then("^user is on the Adonis Personnel Portal page$")
    public void userIsOnTheAdonisPersonnelPortalPage() throws Throwable {
        System.out.println("smth");
    }

    @When("^click the 'Log off' button$")
    public void clickTheLogOffButton() throws Throwable {
        System.out.println("smth");
    }

    @Then("^user is on the admin portal login page$")
    public void userIsOnTheAdminPortalLoginPage() throws Throwable {
        System.out.println("smth");
    }

    @When("^enter \"([^\"]*)\" into the email field$")
    public void enterIntoTheEmailField(String arg1) throws Throwable {
        System.out.println(arg1);
    }

    @When("^enter \"([^\"]*)\" into the password field$")
    public void enterIntoThePasswordField(String arg1) throws Throwable {
        System.out.println(arg1);
    }

    @Then("^invalid credentials message is displayed$")
    public void invalidCredentialsMessageIsDisplayed() throws Throwable {
        System.out.println("smth");
    }



}
