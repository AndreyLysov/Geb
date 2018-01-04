package Page.ACP

import geb.Page
import geb.module.TextInput

class ACPLogInPage extends Page{
    static url = 'http://192.168.1.202/app_testupgrade/testupgrade/crew'
    static at = {
        title == 'CrewPortal Login'
    }

    static content = {
        txtPin { $('input', name: 'tbPin').module(TextInput) }
        txtPassword { $('input', name: 'tbPasscode') }
        loginButton { $('div', id: 'btnLogin_CD').click() }
        invalidCredentialsMessage(required: false, wait: 5) { $ 'div', id: 'popupMessage_PWC-1' }
    }

    ACPStartPage loginWithCredentials(int pin, int password) {
        fillInPin(pin)
        fillInPassword(password)
        loginButton
        browser.at ACPStartPage
    }

    void fillInPin(int pin) {
        txtPin << pin.toString()
    }

    void fillInPassword(int password) {
        txtPassword << password.toString()
    }
}
