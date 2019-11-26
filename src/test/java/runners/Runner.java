package runners;



import io.cucumber.java.an.Cuan;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber",
        features = "src/test/resources/features",
        glue = "steps",
        tags="@datatables3",
        dryRun=false

)


public class Runner {
}
