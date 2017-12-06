package page

import geb.Page
import org.junit.Assert

class AAPLogInPage extends Page {
    static url = 'http://192.168.1.202/app/adonis/administrator'
    static at = {
        title == 'CrewPortal Login'
    }

    static content = {
        txtEmail { $('input', name: 'tbEmail') }
        txtPassword { $('input', name: 'tbPassword') }
        loginButton { $('div', id: 'LogIn_CD').click() }
        invalidCredentialsMessage(required: false, wait: 5) { $ 'div', id: 'popupMessage_PWC-1' }
    }

    void loginWithCredentials(String email, String password) {
        fillInEmail(email)
        fillInPassword(password)
        loginButton
    }

    void fillInEmail(String email) {
        txtEmail << email
    }

    void fillInPassword(String password) {
        txtPassword << password
    }

    void invalidCredentialsMessageIsAppeared() {
        Assert.assertEquals(true, invalidCredentialsMessage.isDisplayed())
    }
}