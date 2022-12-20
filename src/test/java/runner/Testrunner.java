package runner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features="src\\test\\java\\feature\\GoogleSearch.feature",
		glue={"stepdefination"},
		monochrome=true,
		plugin= {"pretty","junit:target/JUnitReports/report.xml",
				"json:target/JSONReports/report.json",
				"html:target/HtmlReports"}
	
		)
public class Testrunner extends AbstractTestNGCucumberTests {

}
