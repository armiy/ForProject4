package RunnerAll;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/BfeatureProject4/searchAndVerify.feature"},
        glue = {"CsearchAndverifyStepsProject3"},
        plugin = {"pretty","html:target/site/cucumber-pretty.html","json:target/cucumber/cucumber.json"},
        monochrome = true,
        dryRun = false,
        tags =""
)
public class runAll {
}
