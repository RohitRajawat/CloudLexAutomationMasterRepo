package TestRun;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;

// running from testNG xml file we need to have CucumberOptions import from io.cucumber.testng and from here us io.cucumber.junit
@RunWith(Cucumber.class)
@CucumberOptions
        (        // in feature, we should give extension
                features = {"C:\\Users\\hp\\IdeaProjects\\CloudLex_MassTort_Automation\\src\\test\\Features\\AddLead.feature"},
                glue = {"StepDefinations"},
                // .java extension and C: not allowed
                plugin = {"pretty","html:target/TestReport.html"},
                // .html required for the html report generation
                monochrome = true
               // ,dryRun = true
              // ,tags = "@smoke or @sanity"       // this means OR
        )
public class TestRunner extends AbstractTestNGCucumberTests
{

}
