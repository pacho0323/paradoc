package com.bancolombia.certificacion.paradoc.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/cuadrantesRtefte.feature",
		glue="com.bancolombia.certificacion.paradoc.stepdefinitions",
		tags="@DescargarCuadrante",
		snippets=SnippetType.CAMELCASE
			)
public class cuadrantesRtefteRunner {


}
