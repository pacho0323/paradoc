package com.bancolombia.certificacion.paradoc.stepdefinitions;

import static org.hamcrest.core.IsEqual.equalTo;

import org.openqa.selenium.WebDriver;

import com.bancolombia.certificacion.paradoc.questions.ElTexto;
import com.bancolombia.certificacion.paradoc.task.Autenticarse;

import static com.bancolombia.certificacion.paradoc.drivers.OwnWebDriver.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class loguinStepDefinition {

	@Before
	public void ingresarCredenciales () {
		actor.wasAbleTo(Autenticarse.enPopUp());
	}
	
	//@Managed(driver="chrome",options="--start-maximized --ignore-certificate-errors --disable-infobars")
	//private WebDriver chrome;
	
	private Actor actor =Actor.named("cliente");
	/*
	@Given("^El (.*) se encuentra en la pagina de ingreso al modulo MAM$")
	public void elClienteSeEncuentraEnLaPaginaDeIngresoAlModuloMAM(String cliente)  {
	   actor.can(BrowseTheWeb.with(hisBrowserWeb().on("https://10.8.69.8/eucProfiles/")));
	}*/

	@When("^Ingresa las credenciales$")
	public void ingresaLasCredenciales()  {
		actor.attemptsTo(Autenticarse.enPopUp());
	}

	@Then("^debe de visualizar el menu (.*)$")
	public void debeDeVisualizarElMenuCertificados(String dato)  {
		actor.should(seeThat(ElTexto.delMenu(),equalTo(dato)));
	}

}
