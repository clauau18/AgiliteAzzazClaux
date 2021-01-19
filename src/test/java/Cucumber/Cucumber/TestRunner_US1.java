package Cucumber.Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Cucumber/Cucumber/US1.feature", glue="StepDefUs01AmeliorerArme.java")
public class TestRunner_US1 {
	
}
