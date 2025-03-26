package RunnerAll;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/BfeatureProject4/searchAndVerify.feature","src/test/java/CsearchAndverifyStepsProject3/searchMultipleItemsSteps.java"},
        glue = {"CsearchAndverifyStepsProject3"},
        plugin = {"pretty","html:target/site/cucumber-pretty.html","json:target/cucumber/cucumber.json"},
        monochrome = true,
        dryRun = false,
        tags =""
)
public class runAll extends AbstractTestNGCucumberTests {
}
