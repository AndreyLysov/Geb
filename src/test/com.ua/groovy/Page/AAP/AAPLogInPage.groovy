package Page.AAP

import geb.Page
import geb.module.TextInput
import org.junit.Assert

class AAPLogInPage extends Page {
    static url = 'http://192.168.1.202/app/adonis/administrator'
    static at = {
        title == 'CrewPortal Login'
    }

    static content = {
        txtEmail { $('input', name: 'tbEmail').module(TextInput) }
        txtPassword { $('input', name: 'tbPassword') }
        loginButton { $('div', id: 'LogIn_CD').click() }
        invalidCredentialsMessage(required: false, wait: 5) { $ 'div', id: 'popupMessage_PWC-1' }
    }

    AAPStartPage navigateToStartPage(String email, String password) {
        fillInCredentials(email, password)
        loginButton
        browser.at AAPStartPage
    }

    void fillInCredentials(String email, String password) {
        fillInEmail(email)
        fillInPassword(password)
    }


    void fillInEmail(String email) {
        txtEmail << email
    }

    void fillInPassword(String password) {
        txtPassword << password
    }

    void invalidCredentialsMessageIsAppeared() {
        assert invalidCredentialsMessage.isDisplayed() == true
    }

    void HeadLoginLayout() {
        Assert.assertEquals(true, HeadLoginLayout.isDisplayed())
    }

    void at() {
        assert browser.isAt(AAPLogInPage) == true
    }
}