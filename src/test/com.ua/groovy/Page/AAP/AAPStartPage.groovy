package Page.AAP

import geb.Page

class AAPStartPage extends Page {
    static url = 'http://192.168.1.202/app/adonis/StartScreen'

    static at = {
        title == 'Adonis Personnel Portal'
    }

    static content = {
        logoffButton { $('a', id: 'logOffLink').click() }
    }

    AAPLogInPage logOff() {
        logoffButton
        browser.at AAPLogInPage
    }

    void at() {
        assert browser.isAt(AAPStartPage) == true
    }
}