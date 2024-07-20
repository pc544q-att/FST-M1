package activities;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
  //  tags = "@activity1",
  //  tags = "@activity2",
  //  tags = "@activity3"
    	//  tags = "@activity4"
    	//  tags = "@activity5"
    	
    tags = "@SimpleAlert",
    plugin = {"pretty","html: test-reports","json: test-reports/json-report.json"},
   
     monochrome = true
)

public class ActivitiesRunner {
    //empty
}

