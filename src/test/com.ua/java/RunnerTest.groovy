import cucumber.api.CucumberOptions
import cucumber.api.SnippetType
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/cucumber",
        glue = "steps",
        tags = "@test",
        snippets = SnippetType.CAMELCASE
)
class RunnerTest {
//    Leave me empty
}