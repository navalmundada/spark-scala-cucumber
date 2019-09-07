package features.steps

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith
@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("classpath:features"),
  glue = Array("classpath:features.steps"),
  tags = Array("@my-tag"),
  monochrome = true,
  plugin = Array("pretty",
    "html:target/cucumber",
    "json:target/cucumber/test-report.json",
    "junit:target/cucumber/test-report.xml")
)
class testRunner {}
