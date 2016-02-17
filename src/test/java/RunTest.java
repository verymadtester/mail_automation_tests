import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Sergei_Shatilov on 12/24/2015.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "json:target/cucumber.json","html:target/cucumber.html"}
)
public class RunTest {
}
