package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\Road Ninja\\eclipse-RoadNinja\\CucumberFramework\\src\\test\\resources\\Feature\\PastJobs.feature"},
glue = {"org.PastJobPageStepDefinition"},
dryRun = false,
plugin = {"html:report/WebReport"},
tags = "@PaidJob"
)
public class TestRunnerPastJobPage {

}
