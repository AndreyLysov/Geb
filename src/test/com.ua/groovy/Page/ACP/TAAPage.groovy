package Page

import geb.Page

class TAAPage extends Page{
    static at = {
        title == 'http://192.168.1.202/APP_TestUpgrade/TimeAndAttendance/TimeAndAttendanceTitles'
    }

    static content = {
        tileMyTimeSheets {$('div', id:'divTileMyTimesheet')}
        logoffButton { $('a', id: 'logOffLink').click() }
    }

    ACPLogInPage logOff() {
        logoffButton
        return new ACPLogInPage()
    }

    MyTimeSheetPage navigateToMyTimeSheet() {
        tileMyTimeSheets.click(new MyTimeSheetPage())
    }
}
