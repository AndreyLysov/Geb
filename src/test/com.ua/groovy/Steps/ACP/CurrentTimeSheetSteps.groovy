package Steps

import cucumber.api.java.en.Given
import geb.Browser
import geb.Page
import page.ACPLogInPage
import page.ACPStartPage
import page.CurrentTimeSheetPage
import page.MyTimeSheetPage
import page.TAAPage

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
        acpStartPage.logOff()
        /*taaPage = acpStartPage.navigateToTAA()
        myTimeSheetPage = taaPage.navigateToMyTimeSheet()
        currentTimeSheetPage = myTimeSheetPage.openCurrentTimeSheet()*/
    }


}
