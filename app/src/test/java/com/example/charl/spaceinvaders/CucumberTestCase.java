package com.example.charl.spaceinvaders;

/**
 * Created by josegarben on 22/4/17.
 */

        import org.junit.runner.RunWith;

        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        glue = "classpath:com.example.charl.spaceinvaders",
        features = "classpath:features//MovementSteps.feature"
)

public class CucumberTestCase {
}
