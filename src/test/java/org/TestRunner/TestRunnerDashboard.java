package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\Road Ninja\\eclipse-RoadNinja\\CucumberFramework\\src\\test\\resources\\Feature\\Dashboard.feature"},
glue = {"org.DashBoardStepDefinition"},
dryRun = false,
plugin = {"html:report/WebReport"},
tags = "@Notifications"
)
public class TestRunnerDashboard {

}
