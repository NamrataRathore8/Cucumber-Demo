package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"login.feature"},
glue= {"Stepdefinition"},
monochrome =true, //to make console output in a better format 
dryRun = false ,
strict = true ,

plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}

)
public class Test_Runner {

}
