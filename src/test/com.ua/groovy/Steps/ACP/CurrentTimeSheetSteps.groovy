package Steps

import Page.ACP.ACPLogInPage
import Page.ACP.ACPStartPage
import Page.ACP.CurrentTimeSheetPage
import Page.ACP.MyTimeSheetPage
import Page.ACP.TAAPage
import cucumber.api.java.en.Given
import geb.Browser
import geb.Page

class CurrentTimeSheetSteps extends Page{
    ACPLogInPage acpLogInPage
    ACPStartPage acpStartPage
    TAAPage taaPage
    MyTimeSheetPage myTimeSheetPage
    CurrentTimeSheetPage currentTimeSheetPage

    @Given('^navigate to the current time sheet page$')
    void navigateToTheCurrentTimeSheetPage() throws Throwable {
        Browser.drive {
            acpLogInPage = to ACPLogInPage
        }
        acpStartPage = acpLogInPage.loginWithCredentials(30941, 1)
        assert acpStartPage.title == 'Adonis Personnel Portal'
        taaPage = acpStartPage.navigateToTAA()
        myTimeSheetPage = taaPage.navigateToMyTimeSheet()
        currentTimeSheetPage = myTimeSheetPage.openCurrentTimeSheet()
    }


}
