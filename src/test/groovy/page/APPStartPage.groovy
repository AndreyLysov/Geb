package page

import geb.Page

class APPStartPage extends Page {
    static url = 'http://192.168.1.202/app/adonis/StartScreen'

    static at = {
        title == 'Adonis Personnel Portal'
    }
}
