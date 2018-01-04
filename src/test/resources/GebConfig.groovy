import org.openqa.selenium.chrome.ChromeDriver
/*

baseUrl = 'http://192.168.1.202/app/adonis/administrator'
reportsDir = "target/geb-reports"
*/
driver = {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe")
    new ChromeDriver()
}



/*
// default driver...
System.setProperty('webdriver.chrome.driver', "../resources/chromedriver.exe")
driver = {new ChromeDriver()}
*/
/*
environments {
//     specify environment via -Dgeb.env=chrome
    ie {
        def ieDriver = new File('src/test/resources/IEDriverServer.exe')
        System.setProperty('webdriver.ie.driver', ieDriver.absolutePath)
        driver = { new InternetExplorerDriver() }
    }

    chrome {
        def chromeDriver = new File('src/test/resources/chromedriver.exe') // add .exe for Windows...
        System.setProperty('webdriver.chrome.driver', chromeDriver.absolutePath)
        driver = { new ChromeDriver() }
    }

    'sauce' {
        driver = {
            // sauce.config: <browser>:<os>:<ver> eg. iphone:OSX10.9:7
            def sauceBrowser = System.properties.getProperty('sauce.config')
            def username = System.properties.getProperty('sauce.user')
            def accessKey = System.properties.getProperty('sauce.key')
            new SauceLabsDriverFactory().create(sauceBrowser, username, accessKey)
        }
    }
}*/
/*

waiting {
    timeout = 6
    retryInterval = 0.5
    slow { timeout = 12 }
    reallySlow { timeout = 24 }
}
*/