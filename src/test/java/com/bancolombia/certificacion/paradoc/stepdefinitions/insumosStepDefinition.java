package com.bancolombia.certificacion.paradoc.stepdefinitions;

import static com.bancolombia.certificacion.paradoc.drivers.OwnWebDriver.hisBrowserWeb;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.openqa.selenium.WebDriver;

import com.bancolombia.certificacion.paradoc.questions.ElEstado;
import com.bancolombia.certificacion.paradoc.questions.NumeroArchivos;
import com.bancolombia.certificacion.paradoc.questions.NumeroDatos;
import com.bancolombia.certificacion.paradoc.task.CopiarInsumo;
import com.bancolombia.certificacion.paradoc.task.Desplegar;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class insumosStepDefinition {
	
	//@Managed(driver="chrome",options="--start-maximized --ignore-certificate-errors --disable-infobars")
	//private WebDriver chrome;
	
	private Actor actor =Actor.named("cliente");

	
	@Given("^El (.*) se loguea en la pagina de ingreso al modulo MAM$")
	public void elClienteSeLogueaEnLaPaginaDeIngresoAlModuloMAM(String cliente)  {
		actor.can(BrowseTheWeb.with(hisBrowserWeb().on("https://10.8.69.8/eucProfiles/")));
		}
    
	@When("^El (.*) copia los insumos a procesar y en la carpeta de Entrada pega los insumos$")
	public void elClienteCopiaLosInsumosAProcesarYEnLaCarpetaDeEntradaPegaLosInsumos(String cliente)  {
	   actor.attemptsTo(
			  CopiarInsumo.enOtraCarpeta(),
			   Desplegar.menu());
	}

	@Then("^debe comparar la cantidad de insumos que se encuentra en la carpeta de entrada con la cantidad de archivos recibidos en paradoc$")
	public void debeCompararLaCantidadDeInsumosQueSeEncuentraEnLaCarpetaDeEntradaConLaCantidadDeArchivosRecibidosEnParadoc() {
		actor.should(seeThat(NumeroArchivos.enRepositorio(),equalTo(actor.asksFor(NumeroDatos.enParadoc()))));
	}
	
	@Then("^debe visualizar que los insumos se encuentran en estado (.*) en el modulo EUC de Paradoc$")
	public void debeVisualizarQueLosInsumosSeEncuentranEnEstadoAceptadoEnElModuloEUCDeParadoc(String aceptado)  {
	  actor.should(seeThat(ElEstado.esta(aceptado)));
	   	}
	
	@Then("^debe ver que los insumos estan en estado (.*) en el modulo EUC de Paradoc$")
	public void debeVerQueLosInsumosEstanEnEstadoConInconsistenciasEnElModuloEUCDeParadoc(String coninconsistencias )  {
	 actor.should(seeThat(ElEstado.esta(coninconsistencias)));
	}

	@Then("^visualizar los insumos que se encuentran en estado (.*) en el modulo EUC de Paradoc$")
	public void visualizarLosInsumosQueSeEncuentranEnEstadoRechazadoEnElModuloEUCDeParadoc(String rechazado) {
	 actor.should(seeThat(ElEstado.esta(rechazado)));
	}


}
