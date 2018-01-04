package Page.ACP

import geb.Page

class ACPStartPage extends Page{
    static url = 'http://192.168.1.202/app_testupgrade/testupgrade/StartScreen'

    static at = {
        title == 'Adonis Personnel Portal'
    }

    static content = {
        tileTAA {$('div', id:'divTileTimeAndAttendance').click()}
        logoffButton { $('a', id: 'logOffLink').click() }
    }

    ACPLogInPage logOff() {
        logoffButton
        browser.at ACPLogInPage
    }

    TAAPage navigateToTAA() {
        tileTAA
        browser.at TAAPage
    }
}
