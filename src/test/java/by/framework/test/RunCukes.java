package by.framework.test;

import com.epam.reportportal.cucumber.ScenarioReporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by skinner on 01.05.2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"com.epam.reportportal.cucumber.ScenarioReporter", "pretty", "html:target/cucumber"},
        glue = "by.framework.test.step",
        features = "src/test/resources/features"
)
public class RunCukes {
}
