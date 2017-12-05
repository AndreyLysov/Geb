package Page

import geb.Page

class AAPLogInPage extends Page{
    static url = 'http://192.168.1.202/app/adonis/administrator'
    static at = {
        title == 'CrewPortal Login'
    }

    static content = {
        txtEmail { $('input', name: 'tbEmail') }
        txtPassword { $('input', name: 'tbPassword') }
        loginButton { $('div', id: 'LogIn_CD') }
        invalidCredentialsMessage (required:false, wait:5) { $ 'div', id: 'popupMessage_PWC-1' }
    }
}