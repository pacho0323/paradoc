package com.bancolombia.certificacion.paradoc.stepdefinitions;

import static com.bancolombia.certificacion.paradoc.drivers.OwnWebDriver.hisBrowserWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import static org.hamcrest.Matchers.containsString;


import org.openqa.selenium.WebDriver;

import com.bancolombia.certificacion.paradoc.questions.ElMensajeGrafico;
import com.bancolombia.certificacion.paradoc.questions.SeCanceloEl;
import com.bancolombia.certificacion.paradoc.questions.SeEliminoEl;
import com.bancolombia.certificacion.paradoc.task.CancelarEl;
import com.bancolombia.certificacion.paradoc.task.EliminarEl;
import com.bancolombia.certificacion.paradoc.task.InfoMsjGrafico;
import com.bancolombia.certificacion.paradoc.task.IngresarMensajeGrafico;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class mensajesGraficosStepDefinition {

	//@Managed(driver="chrome",options="--start-maximized --ignore-certificate-errors --disable-infobars")
	//private WebDriver chrome;
	
	private Actor actor =Actor.named("cliente");
	/*
	@Given("^El cliente se loguea en la pagina de paradoc ingresa al modulo MAM en la opcion Mensajes Graficos$")
	public void elClienteSeLogueaEnLaPaginaDeParadocIngresaAlModuloMAMEnLaOpcionMensajesGraficos()  {
		actor.can(BrowseTheWeb.with(hisBrowserWeb().on("https://10.8.69.8/eucProfiles/")));
		actor.attemptsTo(IngresarMensajeGrafico.listado());
	}*/

	@When("^El cliente ingresa la informacion en el formulario$")
	public void elClienteIngresaLaInformacionEnElFormulario()  {
	    actor.attemptsTo(InfoMsjGrafico.seIngresa());
	}

	@Then("^Al crear el mensaje grafico mostrara que (.*)$")
	public void alCrearElMensajeGraficoMostraraQueSeAlmacenElMensajeCorrectamente(String Mensaje){
		actor.should(seeThat(ElMensajeGrafico.FueCreado(),containsString(Mensaje)));
	}

	@When("^El cliente elimina el mensaje grafico creado$")
	public void elClienteEliminaElMensajeGraficoCreado() {
	    actor.attemptsTo(EliminarEl.MensajeGrafico());
	}


	@Then("^Al eliminar el mensaje grafico se vera (.*)$")
	public void alEliminarElMensajeGraficoSeVeraMensajeEliminado(String info) {
	   actor.should(seeThat(SeEliminoEl.elMensajeGrafico(), equalTo(info)));
		}

	@When("^El cliente digita la informacion$")
	public void elClienteDigitaLaInformacion() {
	   actor.attemptsTo(CancelarEl.mensajeGrafico());
	}


	@Then("^Se cancela el mensaje y se$")
	public void seCancelaElMensajeYSe(){
	actor.should(seeThat(SeCanceloEl.mensajeGrafico(), equalTo(true)));
	}
	
}
