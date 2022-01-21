package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature/AddToCart.feature"
		,glue={"stepDefinition"}
		)

public class TestRunner {

}