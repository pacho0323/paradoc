package com.bancolombia.certificacion.paradoc.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/encabezadoRteICA.feature",
		glue="com.bancolombia.certificacion.paradoc.stepdefinitions",
		tags="@DescargarReteICA",
		snippets=SnippetType.CAMELCASE
			)
public class encabezadoRteICARunner {

}
