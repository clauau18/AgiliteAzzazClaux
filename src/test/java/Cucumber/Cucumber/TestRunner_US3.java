package Cucumber.Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Cucumber/Cucumber/US3.feature", glue="StepDefUs03SoignerHeros.java")
public class TestRunner_US3 {
	
}
