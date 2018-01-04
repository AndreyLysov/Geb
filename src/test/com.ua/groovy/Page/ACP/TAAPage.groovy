package Page.ACP

import geb.Page

class TAAPage extends Page{
    static at = {
        browser.currentUrl == 'http://192.168.1.202/APP_TestUpgrade/TimeAndAttendance/TimeAndAttendanceTitles'
    }

    static content = {
        tileMyTimeSheets {$('div', id:'divTileMyTimesheet').click()}
        logoffButton { $('a', id: 'logOffLink').click() }
    }

    ACPLogInPage logOff() {
        logoffButton
        browser.at ACPLogInPage
    }

    MyTimeSheetPage navigateToMyTimeSheet() {
        tileMyTimeSheets
        browser.at MyTimeSheetPage
    }
}
