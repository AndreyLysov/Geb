package Steps

import Page.ACP.ACPLogInPage
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import geb.Browser
import org.junit.Before

class CurrentTimeSheetSteps extends BaseSteps{

    @Given('^navigate to the current time sheet page$')
    void navigateToTheCurrentTimeSheetPage() throws Throwable {

        app.acpLogInPage.loginWithCredentials(30941, 1)
        app.acpStartPage.navigateToTAA()
        app.taaPage.navigateToMyTimeSheet()
        app.myTimeSheetPage.openCurrentTimeSheet()
    }

    @Then('^user create new time registration$')
    void userCreateNewTimeRegistration() {



    }
}
