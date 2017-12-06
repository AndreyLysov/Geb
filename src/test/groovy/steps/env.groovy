package steps

import cucumber.api.PendingException
import cucumber.api.Scenario
import cucumber.runtime.ScenarioImpl
import geb.Browser
import geb.binding.BindingUpdater
import org.apache.log4j.Logger
import org.openqa.selenium.OutputType
import org.openqa.selenium.WebDriverException
import org.openqa.selenium.logging.LogEntries
import org.openqa.selenium.remote.RemoteLogs

import java.util.logging.Logger

import static cucumber.api.groovy.Hooks.After
import static cucumber.api.groovy.Hooks.Before


def bindingUpdater
def theBrowser
Scenario prevScenario = null
boolean skipOtherExamples = false
boolean config = false

Logger logger = Logger.getLogger("TESTCONTEXT");
Before() { scenario ->
    if (!binding.hasVariable('browser')) {
        skipOtherExamples = false
        theBrowser = new Browser()
        bindingUpdater = new BindingUpdater(binding, theBrowser)
        bindingUpdater.initialize()
        if (!config) {
            logger.info("================================================================================")
            logger.info("======== Start Browser - " + theBrowser.getProperty('driver'))
            logger.info("================================================================================\n")
            theBrowser.properties.each { logger.info("$it.key - $it.value") }
            logger.info("===============================Browser==========================================\n")
            config = true
        }

    } else {
        // save for later screenshot taking
        theBrowser = browser

    }


}

After() { scenario ->
    bindingUpdater?.remove()
    // embed screenshot into cucumber report
    if (scenario.failed) {
        try {
            scenario.embed(theBrowser.driver.getScreenshotAs(OutputType.BYTES), "image/png")
        } catch (WebDriverException e) {
            // sometime firefox runs out of memory trying to take a screenshot, not a big deal so ignore
        } catch (MissingMethodException e) {
            // HTMLUnit doesn't support screenshots
        }

    }
}