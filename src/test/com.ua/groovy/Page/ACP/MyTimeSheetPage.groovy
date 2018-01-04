package Page

import geb.Page
import page.ACPLogInPage

class MyTimeSheetPage extends Page {
    static at = {
        title == 'http://192.168.1.202/APP_TestUpgrade/TimeAndAttendance/MyTimesheets'
    }

    static content = {
        btnCurrentTimeSheet { $('div', id: 'miTimeSheetMenu_DXI0_T') }
        logoffButton { $('a', id: 'logOffLink').click(new ACPLogInPage()) }
    }

    ACPLogInPage logOff() {
        logoffButton
    }

    void openCurrentTimeSheet() {
        btnCurrentTimeSheet.click(new CurrentTimeSheetPage())
    }

    class CurrentTimeSheetPage {

    }
}
