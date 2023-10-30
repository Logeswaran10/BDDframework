package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = ".\\src\\test\\java\\featureFiles\\Login.feature",
		glue = "stepDefinitions",
		dryRun = false // feature file is newly created - browser will not launch but
					  // all the scenarios will get annotation methods
					  // false - execute
		
		)

public class RunnerIO extends AbstractTestNGCucumberTests {

}
