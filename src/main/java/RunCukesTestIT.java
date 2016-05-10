import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        tags = {},
        features = "src/main/resources",
        format = {"html:target/cucumber"}
)

public class RunCukesTestIT {

}