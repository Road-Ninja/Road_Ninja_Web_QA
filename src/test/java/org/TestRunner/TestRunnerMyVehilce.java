package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\susan\\eclipse-RoadNinja\\CucumberFramework\\src\\test\\resources\\Feature\\myvehiclepage.feature"},
glue = {"org.MyVehiclesPageStepDefinition"},
dryRun = false,
plugin = {"html:report/WebReport"},
tags = "@EditVehicle"
)
public class TestRunnerMyVehilce {

}
