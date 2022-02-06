package br.cin.ufpe;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "calculadoraTest.feature", glue = "src/", tags = {"soma, div, mul, sub"})
public class Runner {

}
