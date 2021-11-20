package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\welcome\\Downloads\\BDD\\CBDD\\src\\test\\java\\Features\\TestCase.feature",
		glue="StepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests{

}
