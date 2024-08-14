package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\Road Ninja\\eclipse-RoadNinja\\CucumberFramework\\src\\test\\resources\\Feature\\FutureJobs.feature"},
glue = {"org.FutureJobsPageStepDefinition"},
dryRun = false,
plugin = {"html:report/WebReport"},
tags = "@EditJob"
)
public class TestRunnerFutureJobsPage {

}
