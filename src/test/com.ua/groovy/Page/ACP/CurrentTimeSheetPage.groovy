package Page

import geb.Page
import page.ACPLogInPage

class CurrentTimeSheetPage extends Page {
    static at = {
        pageUrl == 'http://192.168.1.202/APP_TestUpgrade/TimeAndAttendance/RegisterHours'
    }

    static content = {
        firstTimeBlock { $('div', id: 'scTimesheet_containerBlock_DXCntv0_0') }
        logoffButton { $('a', id: 'logOffLink').click(new ACPLogInPage()) }
    }

    ACPLogInPage logOff() {
        logoffButton
    }
}
