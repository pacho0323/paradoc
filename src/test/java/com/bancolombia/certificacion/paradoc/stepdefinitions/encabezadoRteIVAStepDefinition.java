package com.bancolombia.certificacion.paradoc.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import com.bancolombia.certificacion.paradoc.questions.ElEncabezado;
import com.bancolombia.certificacion.paradoc.questions.SeCancelo;
import com.bancolombia.certificacion.paradoc.questions.SeDescargo;
import com.bancolombia.certificacion.paradoc.questions.SeElimino;
import com.bancolombia.certificacion.paradoc.questions.SeFiltro;
import com.bancolombia.certificacion.paradoc.questions.SeModifico;
import com.bancolombia.certificacion.paradoc.task.DatosRteIva;
import com.bancolombia.certificacion.paradoc.task.DescargarArchivo;
import com.bancolombia.certificacion.paradoc.task.EliminarRteIva;
import com.bancolombia.certificacion.paradoc.task.FiltrarRteIva;
import com.bancolombia.certificacion.paradoc.task.InfoRteIva;
import com.bancolombia.certificacion.paradoc.task.ModificarRteIva;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class encabezadoRteIVAStepDefinition {

	//@Managed(driver="chrome",options="--start-maximized --ignore-certificate-errors --disable-infobars")
	//private WebDriver chrome;
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
    
	@When("^En la parametrizacion de encabezados el cliente ingresa la informacion$")
	public void enLaParametrizacionDeEncabezadosElClienteIngresaLaInformacion() {
		theActorInTheSpotlight().attemptsTo(DatosRteIva.ingresados());
	}

	@Then("^Cuando se crea el encabezado se muestra (.*)$")
	public void cuandoSeCreaElEncabezadoSeMuestraElElementoFueInsertado(String palabra)  {
		theActorInTheSpotlight().should(seeThat(ElEncabezado.seGuardo(),equalTo(palabra)));
	}

	@When("^En la parametrizacion del encabezado el cliente modifica la informacion$")
	public void enLaParametrizacionDelEncabezadoElClienteModificaLaInformacion() {
		theActorInTheSpotlight().attemptsTo(ModificarRteIva.deEncabezado());
	}

	@Then("^Cuando se modifica el encabezado de reteiva se mostrara El elemento (.*)$")
	public void cuandoSeModificaElEncabezadoDeReteivaSeMostraraElElementoFueActualizado(String palabra)  {
		theActorInTheSpotlight().should(seeThat(SeModifico.elEncabezado(),containsString(palabra)));
	}
	
	@When("^En la parametrizacion del encabezado el cliente Elimina la informacion que no requiere de los encabezados$")
	public void enLaParametrizacionDelEncabezadoElClienteEliminaLaInformacionQueNoRequiereDeLosEncabezados()  {
		theActorInTheSpotlight().attemptsTo(EliminarRteIva.delEncabezado());
	}

	@Then("^Al eliminar el encabezado de reteiva muestra un mensaje El elemento (.*)$")
	public void alEliminarElEncabezadoDeReteivaMuestraUnMensajeElElementoFueEliminado(String dato)  {
		theActorInTheSpotlight().should(seeThat(SeElimino.elEncabezado(), containsString(dato)));
	}

	@When("^Se digita la informacion para el encabezado$")
	public void seDigitaLaInformacionParaElEncabezado() {
		theActorInTheSpotlight().attemptsTo(InfoRteIva.seIngresa());
	}

	@Then("^Se cancela el encabezado y se deshabilita el formulario de encabezado$")
	public void seCancelaElEncabezadoYSeDeshabilitaElFormularioDeEncabezado() {
		theActorInTheSpotlight().should(seeThat(SeCancelo.elEncabezado(), equalTo(true)));
	}
	
	@When("^Se filtra el codigo del Encabezado por el cliente$")
	public void seFiltraElCodigoDelEncabezadoPorElCliente()  {
		theActorInTheSpotlight().attemptsTo(FiltrarRteIva.enElEncabezado());
	}

	@Then("^Cuando se filtra el codigo del encabezado se visualizara el nombre de la compania (.*)$")// verificar ya que el nombre de la compa�ia cambia
	public void cuandoSeFiltraElCodigoDelEncabezadoSeVisualizaraElNombreDeLaCompaniaBANCOLOMBIA(String compania)  {
		theActorInTheSpotlight().should(seeThat(SeFiltro.elCodigo(), equalTo(compania)));
	}
	
	@When("^Se Descarga el archivo de encabezados creados de ReteIVA por el cliente$")
	public void seDescargaElArchivoDeEncabezadosCreadosDeReteIVAPorElCliente() {
		theActorInTheSpotlight().attemptsTo(DescargarArchivo.deEncabezado());
	}


	@Then("^Cuando se Descarga el archivo encabezado se almacenara en la carpeta Downloads de windows$")
	public void cuandoSeDescargaElArchivoEncabezadoSeAlmacenaraEnLaCarpetaDownloadsDeWindows() {
		theActorInTheSpotlight().should(seeThat(SeDescargo.archivo(), equalTo("encabezado.txt")));
	}

}
