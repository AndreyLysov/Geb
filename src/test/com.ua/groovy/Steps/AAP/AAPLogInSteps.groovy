package Steps.AAP

import cucumber.api.DataTable
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import geb.Browser
import Page.AAP.AAPLogInPage
import Page.AAP.AAPStartPage

class AAPLogInSteps {
    AAPLogInPage aapLogInPage
    AAPStartPage aapStartPage

    @When('^fill in log in form$')
    void fillInLogInForm(DataTable credentials) throws Throwable {
        aapLogInPage.fillInCredentials(credentials.raw().get(1).get(1), credentials.raw().get(2).get(1))
    }

    @When('^click the "Log In" button$')
    void clickTheLogInButton() throws Throwable {
        aapLogInPage.loginButton
    }

    @When('^log in with credentials$')
    void logInWithCredentials(DataTable credentials) throws Throwable {
        aapStartPage = aapLogInPage.navigateToStartPage(
                credentials.raw().get(1).get(1),
                credentials.raw().get(2).get(1))
    }

    @Then('^user is on the Adonis Personnel Portal page$')
    void userIsOnTheAdonisPersonnelPortalPage() throws Throwable {
        aapStartPage.at()
        println 'User is on the start page'
    }

    @When('^click the "Log off" button$')
    void clickTheLogOffButton() throws Throwable {
        aapStartPage.logOff()
    }

    @Then('^user is on the admin portal login page$')
    void userIsOnTheAdminPortalLoginPage() throws Throwable {
        aapLogInPage.at()
        println 'user is on the login Page'
    }

    @When('^enter \"([^\"]*)\" into the email field$')
    void enterIntoTheEmailField(String email) throws Throwable {
        aapLogInPage.fillInEmail(email)
    }

    @When('^enter \"([^\"]*)\" into the password field$')
    void enterIntoThePasswordField(String password) throws Throwable {
        aapLogInPage.fillInPassword(password)
    }

    @Then('^invalid credentials message is displayed$')
    void invalidCredentialsMessageIsDisplayed() throws Throwable {
        aapLogInPage.invalidCredentialsMessageIsAppeared()
    }


    @Given('^open admin portal login page$')
    void openAdminPortalLoginPage() throws Throwable {
        Browser.drive {
            aapLogInPage = to AAPLogInPage
        }
    }


}
