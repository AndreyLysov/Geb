package Steps

import cucumber.api.java.en.Given
import geb.Browser
import page.ACPLogInPage

class ACPLogInPageSteps {
    ACPLogInPage acpLogInPage

    @Given('^open crew portal login page$')
    void openCrewPortalLoginPage() throws Throwable {
        Browser.drive {
            acpLogInPage = to ACPLogInPage
        }
    }
}
