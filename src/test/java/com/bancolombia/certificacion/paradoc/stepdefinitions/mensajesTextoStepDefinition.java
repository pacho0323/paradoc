package com.bancolombia.certificacion.paradoc.stepdefinitions;

import static com.bancolombia.certificacion.paradoc.drivers.OwnWebDriver.hisBrowserWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import static org.hamcrest.Matchers.containsString;

import org.apache.tools.ant.filters.TokenFilter.ContainsString;
import org.openqa.selenium.WebDriver;

import com.bancolombia.certificacion.paradoc.questions.ElMensajedeTexto;
import com.bancolombia.certificacion.paradoc.questions.FueCancelado;
import com.bancolombia.certificacion.paradoc.questions.FueCanceladoEl;
import com.bancolombia.certificacion.paradoc.questions.FueEliminado;
import com.bancolombia.certificacion.paradoc.questions.FueEliminadoEl;
import com.bancolombia.certificacion.paradoc.questions.SeModificoEl;
import com.bancolombia.certificacion.paradoc.task.CancelarMensaje;
import com.bancolombia.certificacion.paradoc.task.EliminarMensaje;
import com.bancolombia.certificacion.paradoc.task.InfoMsjTexto;
import com.bancolombia.certificacion.paradoc.task.IngresarMensajeGrafico;
import com.bancolombia.certificacion.paradoc.task.IngresarMensajeTexto;
import com.bancolombia.certificacion.paradoc.task.ModificarMensaje;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class mensajesTextoStepDefinition {

	//@Managed(driver="chrome",options="--start-maximized --ignore-certificate-errors --disable-infobars")
	//private WebDriver chrome;
	
	private Actor actor =Actor.named("cliente");
	/*Certificacion01
	 * 
	@Given("^El cliente se loguea en la pagina de paradoc ingresa al modulo MAM en la opcion Mensajes de texto$")
	public void elClienteSeLogueaEnLaPaginaDeParadocIngresaAlModuloMAMEnLaOpcionMensajesDeTexto()  {
		actor.can(BrowseTheWeb.with(hisBrowserWeb().on("https://10.8.69.8/eucProfiles/"))); 
		actor.attemptsTo(IngresarMensajeTexto.listado());
	}*/

	@When("^El cliente ingresa la informacion en el formulario de mensajes de texto$")
	public void elClienteIngresaLaInformacionEnElFormularioDeMensajesDeTexto() {
		actor.attemptsTo(InfoMsjTexto.seIngresa());
	 
	}

	@Then("^Podra crear mensaje de texto y vera (.*)$")
	public void podraCrearMensajeDeTextoYVeraElMensajeCorrectamente(String mensaje)  {
	    actor.should(seeThat(ElMensajedeTexto.FueCreado(), containsString(mensaje)));
	}
	
	@When("^El cliente modifica los mensajes de texto$")
	public void elClienteModificaLosMensajesDeTexto() {
		actor.attemptsTo(ModificarMensaje.deTexto());
	}

	@Then("^al modificar el mensaje se muestra Se actualizo (.*)$")
	public void alModificarElMensajeSeMuestraSeActualizoElMensajeCorrectamente(String mensaje)  {
	  actor.should(seeThat(SeModificoEl.mensajeDeTexto(), containsString(mensaje)));
	}
	
	@When("^El cliente elimina mensajes de texto$")
	public void elClienteEliminaMensajesDeTexto()  {
	   actor.attemptsTo(EliminarMensaje.deTexto());
	}


	@Then("^cuando se elimina el mensaje muestra (.*)$")
	public void cuandoSeEliminaElMensajeMuestraMensajeEliminado(String info) {
	   actor.should(seeThat(FueEliminadoEl.mensajeDeTexto(), equalTo(info)));
	}
	
	@When("^El cliente ingresa informacion$")
	public void elClienteIngresaInformacion()  {
	    actor.attemptsTo(CancelarMensaje.deTexto());
	}


	@Then("^al cancelar no hay informacion en los campos$")
	public void alCancelarNoHayInformacionEnLosCampos() {
	    actor.should(seeThat(FueCanceladoEl.elMensaje(),equalTo(true)));
	}


}
