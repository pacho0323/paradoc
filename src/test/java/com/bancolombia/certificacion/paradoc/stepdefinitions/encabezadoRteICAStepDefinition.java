package com.bancolombia.certificacion.paradoc.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import com.bancolombia.certificacion.paradoc.questions.SeCancelo;
import com.bancolombia.certificacion.paradoc.questions.SeDescargo;
import com.bancolombia.certificacion.paradoc.questions.SeElimino;
import com.bancolombia.certificacion.paradoc.questions.SeFiltro;
import com.bancolombia.certificacion.paradoc.questions.SeInserto;
import com.bancolombia.certificacion.paradoc.questions.SeModifico;
import com.bancolombia.certificacion.paradoc.task.DatosRteIca;
import com.bancolombia.certificacion.paradoc.task.DescargarArchivo;
import com.bancolombia.certificacion.paradoc.task.EliminarRteIca;
import com.bancolombia.certificacion.paradoc.task.FiltrarRteIca;
import com.bancolombia.certificacion.paradoc.task.InfoRteIca;
import com.bancolombia.certificacion.paradoc.task.ModificarRteIca;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class encabezadoRteICAStepDefinition {

	//@Managed(driver="chrome",options="--start-maximized --ignore-certificate-errors --disable-infobars")
	//private WebDriver chrome;
	
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

	@When("^El cliente digita la informacion que debe estar en el encabezado$")
	public void elClienteDigitaLaInformacionQueDebeEstarEnElEncabezado()  {
		theActorInTheSpotlight().attemptsTo(DatosRteIca.ingresados());
	   
	}

	@Then("^Cuando se crea el encabezado se vera (.*)$")
	public void cuandoSeCreaElEncabezadoSeVeraElElementoFueInsertado(String mensaje)  {
		theActorInTheSpotlight().should(seeThat(SeInserto.elEncabezadoReteica(), equalTo(mensaje)));
	}

	@When("^El cliente Modifica los registros del encabezado$")
	public void elClienteModificaLosRegistrosDelEncabezado()  {
		theActorInTheSpotlight().attemptsTo(ModificarRteIca.deEncabezado());
	}


	@Then("^Al modificar el encabezado se vera El elemento (.*)$")
	public void alModificarElEncabezadoSeVeraElElementoFueActualizado(String dato)  {
		theActorInTheSpotlight().should(seeThat(SeModifico.elEncabezado(), containsString(dato)));
	}

	@When("^El cliente Elimina los registros que no quiere ver en el encabezado$")
	public void elClienteEliminaLosRegistrosQueNoQuiereVerEnElEncabezado() {
		theActorInTheSpotlight().attemptsTo(EliminarRteIca.delEncabezado());
	}
	
	@Then("^Cuando se Elimina el encabezado mostrara un mensaje El elemento (.*)$")
	public void cuandoSeEliminaElEncabezadoMostraraUnMensajeElElementoFueEliminado(String mensaje)  {
		theActorInTheSpotlight().should(seeThat(SeElimino.elEncabezado(),containsString(mensaje)));
	}
	
	@When("^El cliente ingresa los registros para el encabezado$")
	public void elClienteIngresaLosRegistrosParaElEncabezado() {
		theActorInTheSpotlight().attemptsTo(InfoRteIca.seIngresa());
	}

	@Then("^Cuando se cancela el encabezado se deshabilitara el formulario$")
	public void cuandoSeCancelaElEncabezadoSeDeshabilitaraElFormulario()  {
		theActorInTheSpotlight().should(seeThat(SeCancelo.elEncabezado(), equalTo(true)));
	}
	@When("^Se Filtra el codigo del Encabezado por el cliente$")
	public void seFiltraElCodigoDelEncabezadoPorElCliente()  {
		theActorInTheSpotlight().attemptsTo(FiltrarRteIca.enElEncabezado());
	}
	
	@Then("^Luego de filtrar el codigo del encabezado si visualizara el nombre de la compania (.*)$")
	public void luegoDeFiltrarElCodigoDelEncabezadoSiVisualizaraElNombreDeLaCompaniaBancolombiaSA(String palabra)  {
		theActorInTheSpotlight().should(seeThat(SeFiltro.elCodigo(), equalTo(palabra)));
	}
	
	@When("^Se Descarga el archivo de encabezados creados de ReteICA por el cliente$")
	public void seDescargaElArchivoDeEncabezadosCreadosDeReteICAPorElCliente() {
		theActorInTheSpotlight().attemptsTo(DescargarArchivo.deEncabezado());
	  }


	@Then("^Luego de Descargar el archivo encabezado se almacena en la carpeta Downloads$")
	public void luegoDeDescargarElArchivoEncabezadoSeAlmacenaEnLaCarpetaDownloads() {
		theActorInTheSpotlight().should(seeThat(SeDescargo.archivo(), equalTo("encabezado.txt")));
	}
	
	
}
