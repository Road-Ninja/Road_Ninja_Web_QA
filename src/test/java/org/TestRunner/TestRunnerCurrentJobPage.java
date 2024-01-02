package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\susan\\eclipse-RoadNinja\\CucumberFramework\\src\\test\\resources\\Feature\\Current.feature"},
glue = {"org.CurrentJobsPageStepDefinition"},
dryRun = false,
plugin = {"html:report/WebReport"},
tags = "@SearchJob"
)
public class TestRunnerCurrentJobPage {

}
