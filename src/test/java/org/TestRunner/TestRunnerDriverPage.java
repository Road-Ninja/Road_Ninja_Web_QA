package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\Road Ninja\\eclipse-RoadNinja\\CucumberFramework\\src\\test\\resources\\Feature\\DriverPage.feature"},
glue = {"org.DriverPageStepSefinition"},
dryRun = false,
plugin = {"html:report/WebReport"},
tags = "@Search"
)
public class TestRunnerDriverPage {

}
