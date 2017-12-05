package steps

import Page.AAPLogInPage
import geb.Browser

import static cucumber.api.groovy.EN.*



Given(~/^admin portal '(\d+)' login page$/) { arg1 ->
    go "/administrator"
}

When(~/^enter 'admin@crewportal\.cp' into the email field$/) { ->
    // Write code here that turns the phrase above into concrete actions

}

When(~/^enter '(\d+)' into the password field$/) { int arg1 ->
    // Write code here that turns the phrase above into concrete actions

}

When(~/^click the 'Log In' button$/) { ->
    // Write code here that turns the phrase above into concrete actions

}

Then(~/^user is on the Adonis Personnel Portal page$/) { ->
    // Write code here that turns the phrase above into concrete actions

}