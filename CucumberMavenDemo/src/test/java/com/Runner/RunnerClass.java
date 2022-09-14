package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\CucumberMavenDemo\\demoParaBankLogin.feature",
		glue = "com.stepDefination",
		dryRun = true
		
			 
		)

public class RunnerClass
{

}
