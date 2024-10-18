package com.example.tests; // Adjust package according to your folder structure

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features",   // Path to your .feature files
  glue = "com.example.tests.steps",           // Path to your step definitions
  plugin = {"pretty", "html:target/cucumber-reports"},  // For reporting
  tags = {"@Test"}
)
public class RunCucumberTest {
  // This class remains empty, it is used only as an entry point for JUnit to run the Cucumber tests
}
