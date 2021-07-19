package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Login\\login.feature"},
glue= {"Stepdefinition"},
monochrome =true, //to make console output in a better format 
dryRun = false ,
strict = true )

public class Test_Runner {

}
