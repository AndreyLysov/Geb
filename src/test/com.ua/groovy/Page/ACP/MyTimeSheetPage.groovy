package Page.ACP

import geb.Page

class MyTimeSheetPage extends Page {
    static at = {
        browser.currentUrl == 'http://192.168.1.202/APP_TestUpgrade/TimeAndAttendance/MyTimesheets'
    }

    static content = {
        btnCurrentTimeSheet { $('div', id: 'miTimeSheetMenu_DXI0_T').click() }
        logoffButton { $('a', id: 'logOffLink').click() }
    }

    ACPLogInPage logOff() {
        logoffButton
        browser.at ACPLogInPage
    }

    CurrentTimeSheetPage openCurrentTimeSheet() {
        btnCurrentTimeSheet
        browser.at CurrentTimeSheetPage
    }
}
