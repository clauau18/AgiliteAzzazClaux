package Cucumber.Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Cucumber/Cucumber/US2.feature", glue="StepDefUs02ChangerArme.java")
public class TestRunner_US2 {
	
}
