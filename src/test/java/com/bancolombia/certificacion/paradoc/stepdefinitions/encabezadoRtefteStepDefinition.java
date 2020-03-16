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
import com.bancolombia.certificacion.paradoc.task.DatosRtefte;
import com.bancolombia.certificacion.paradoc.task.DescargarArchivo;
import com.bancolombia.certificacion.paradoc.task.EliminarRtefte;
import com.bancolombia.certificacion.paradoc.task.FiltrarRtefte;
import com.bancolombia.certificacion.paradoc.task.InfoRtefte;
import com.bancolombia.certificacion.paradoc.task.ModificarRtefte;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class encabezadoRtefteStepDefinition {

	//@Managed(driver="chrome",options="--start-maximized --ignore-certificate-errors --disable-infobars")
	//private WebDriver chrome;
	
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
	

	@When("^El cliente Ingresa la informacion que va a estar en el encabezado$")
	public void elClienteIngresaLaInformacionQueVaAEstarEnElEncabezado()  {
		theActorInTheSpotlight().attemptsTo(DatosRtefte.ingresados());
	}

	@Then("^Y al crear el encabezado se mostrara (.*)$")
	public void yAlCrearElEncabezadoSeMostraraElElementoFueInsertado(String palabra)  {
		theActorInTheSpotlight().should(seeThat(ElEncabezado.seGuardo(),equalTo(palabra)));
	}
	
	@When("^El cliente Modifica la informacion del Encabezado$")
	public void elClienteModificaLaInformacionDelEncabezado()  {
		theActorInTheSpotlight().attemptsTo(ModificarRtefte.deEncabezado());
	}
	
	@Then("^Al modificar el encabezado se visualizara El elemento (.*)$")
	public void alModificarElEncabezadoSeVisualizaraElElementoFueActualizado(String dato)  {
		theActorInTheSpotlight().should(seeThat(SeModifico.elEncabezado(),containsString(dato)));
	}

	@When("^El cliente Elimina la informacion que no quiere ver en los encabezados$")
	public void elClienteEliminaLaInformacionQueNoQuiereVerEnLosEncabezados() {
		theActorInTheSpotlight().attemptsTo(EliminarRtefte.elEncabezado());
	}


	@Then("^Al eliminar el encabezado mostrara un mensaje El elemento (.*)$")
	public void alEliminarElEncabezadoMostraraUnMensajeElElementoFueEliminado(String mensaje) {
		theActorInTheSpotlight().should(seeThat(SeElimino.elEncabezado(), containsString(mensaje)));
	}
	
	@When("^El cliente Digita los datos para el encabezado$")
	public void elClienteDigitaLosDatosParaElEncabezado()  {
		theActorInTheSpotlight().attemptsTo(InfoRtefte.seIngresa());
	}

	@Then("^Al cancelar el encabezado se deshabilitara el formulario de encabezado$")
	public void alCancelarElEncabezadoSeDeshabilitaraElFormularioDeEncabezado()  {
		theActorInTheSpotlight().should(seeThat(SeCancelo.elEncabezado(),equalTo(true)));
	}
	
	@When("^El cliente Filtra el codigo del Encabezado$")
	public void elClienteFiltraElCDigoDelEncabezado()  {
		theActorInTheSpotlight().attemptsTo(FiltrarRtefte.enElEncabezado());
	}

	@Then("^Al filtrar el codigo del encabezado mostrara la el nombre de la compania (.*)$")// verificar ya que el nombre de la compa�ia cambia
	public void alFiltrarElCodigoDelEncabezadoMostraraLaElNombreDeLaCompaniaBANCOLOMBIA(String Compania)  {
		theActorInTheSpotlight().should(seeThat(SeFiltro.elCodigo(),equalTo(Compania)));
	}

	@When("^El cliente Descarga el archivo de encabezados creados de Retefuente$")
	public void elClienteDescargaElArchivoDeEncabezadosCreadosDeRetefuente() {
		theActorInTheSpotlight().attemptsTo(DescargarArchivo.deEncabezado());
	}

	@Then("^El archivo encabezado que se descargo se guardara en la carpeta Downloads$")
	public void elArchivoEncabezadoQueSeDescargoSeGuardaraEnLaCarpetaDownloads() {
		theActorInTheSpotlight().should(seeThat(SeDescargo.archivo(), equalTo("encabezado.txt")));
	}
}
