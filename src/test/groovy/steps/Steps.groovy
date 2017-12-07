package steps

import cucumber.api.PendingException
import org.junit.Assert
import page.AAPLogInPage
import page.APPStartPage

import static cucumber.api.groovy.EN.*

Given(~/^open admin portal login page$/) { ->
    to AAPLogInPage
//    Assert.assertTrue(false)
}

When(~/^enter "([^"]*)" into the email field$/) { String email ->
    page.fillInEmail(email)
}



When(~/^enter "([^"]*)" into the password field$/) { String password ->
    page.fillInPassword(password)
}

When(~/^click the 'Log In' button$/) { ->
    page.loginButton
}

Then(~/^user is on the Adonis Personnel Portal page$/) { ->
    at APPStartPage
}

Then(~/^invalid credentials message is displayed$/) { ->
    page.invalidCredentialsMessageIsAppeared()
}
When(~/^click the 'Log off' button$/) { ->
    page.logoffButton
}
Then(~/^admin portal login page is opened$/) { ->
    at AAPLogInPage
}
And(~/^email field is empty$/) { ->
    page.txtEmail << 'say hi'
    Assert.assertTrue(false)
}