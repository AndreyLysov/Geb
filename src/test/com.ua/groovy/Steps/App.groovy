package Steps

import Page.ACP.ACPLogInPage
import Page.ACP.ACPStartPage
import Page.ACP.CurrentTimeSheetPage
import Page.ACP.MyTimeSheetPage
import Page.ACP.TAAPage
import geb.Page


//need to change extension from Page to some more logic
class App extends Page {
    public ACPLogInPage acpLogInPage
    public ACPStartPage acpStartPage
    public TAAPage taaPage
    public MyTimeSheetPage myTimeSheetPage
    public CurrentTimeSheetPage currentTimeSheetPage

    App() {
         acpLogInPage = browser.page(ACPLogInPage)
         acpStartPage = browser.page(ACPStartPage)
         taaPage = browser.page(TAAPage)
         myTimeSheetPage = browser.page(MyTimeSheetPage)
        currentTimeSheetPage = browser.page(CurrentTimeSheetPage)
    }
}
