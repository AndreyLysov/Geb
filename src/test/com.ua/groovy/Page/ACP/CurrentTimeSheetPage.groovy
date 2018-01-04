package Page.ACP

import geb.Page

class CurrentTimeSheetPage extends Page {
    static at = {
        browser.currentUrl == 'http://192.168.1.202/APP_TestUpgrade/TimeAndAttendance/RegisterHours'
    }

    static content = {
        firstTimeBlock { $('div', id: 'scTimesheet_containerBlock_DXCntv0_0') }
        logoffButton { $('a', id: 'logOffLink').click() }
    }

    ACPLogInPage logOff() {
        logoffButton
        browser.at ACPLogInPage
    }
}
