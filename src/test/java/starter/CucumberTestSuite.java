package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/login.feature"}
        ,glue = {"starter/stepdefinitions"},
        tags = "@LoginExitoso",
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE


)
public class CucumberTestSuite {}
