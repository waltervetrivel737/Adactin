package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilis.JvmReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinetion",
		plugin={"json:src\\test\\resources\\Reports\\adactin.json",
				"rerun:src\\test\\resources\\Rerun\\faild.txt"},
		dryRun=false,monochrome=true,strict=true,tags="@kee")
public class RunnerClass {
	
	@AfterClass
	public static void report() {
		JvmReports.togenrtJvmreport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\adactin.json");
	}
}
