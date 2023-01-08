package Test.TestBrainzo;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import Stepdef.JvmReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/resources/featureFile/brainzo.feature", glue = "Stepdef", monochrome = true, dryRun = false, strict = true, plugin = {
		"html:home\\dilip\\eclipse-workspace\\TestBrainzo\\AllReports\\htmlReport",
		"junit:home\\dilip\\eclipse-workspace\\TestBrainzo\\AllReports\\junitReport\\brainzo.xml",
		"json:home\\dilip\\eclipse-workspace\\TestBrainzo\\AllReports\\jsonReport\\brainzo.json" })

public class BrainzoRunner {
	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport("home\\dilip\\eclipse-workspace\\TestBrainzo\\AllReports\\jsonReport\\brainzo.json");
		
		
	}
	

}
