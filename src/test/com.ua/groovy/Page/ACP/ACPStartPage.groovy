package Page

import geb.Page

class ACPStartPage extends Page{
    static url = 'http://192.168.1.202/app_testupgrade/testupgrade/StartScreen'

    static at = {
        println 'start at'
        title == 'Adonis Personnel Portal'
        println 'finish at'
    }

    static content = {
        println 'start content'
        tileTAA {$('div', id:'divTileTimeAndAttendance')}
        logoffButton { $('a', id: 'logOffLink').click() }
        println 'finish content'
    }

    ACPLogInPage logOff() {
        logoffButton
        return new ACPLogInPage()
    }

    TAAPage navigateToTAA() {
        tileTAA.click()
        return new TAAPage()
    }
}
