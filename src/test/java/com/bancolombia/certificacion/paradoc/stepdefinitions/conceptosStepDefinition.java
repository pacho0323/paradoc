package com.bancolombia.certificacion.paradoc.stepdefinitions;

import static com.bancolombia.certificacion.paradoc.drivers.OwnWebDriver.hisBrowserWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import com.bancolombia.certificacion.paradoc.questions.CancelarConceptoRetefuente;
import com.bancolombia.certificacion.paradoc.questions.ElConcepto;
import com.bancolombia.certificacion.paradoc.questions.ElElementoFue;
import com.bancolombia.certificacion.paradoc.questions.ElFiltroRetefuente;
import com.bancolombia.certificacion.paradoc.questions.SeDescargoArchivo;
import com.bancolombia.certificacion.paradoc.task.CancelarConceptoReteIca;
import com.bancolombia.certificacion.paradoc.task.CancelarConceptoReteiva;
import com.bancolombia.certificacion.paradoc.task.CancelarConceptosRetefuente;
import com.bancolombia.certificacion.paradoc.task.DescargarConceptosRetefuente;
import com.bancolombia.certificacion.paradoc.task.DescargarConceptosReteica;
import com.bancolombia.certificacion.paradoc.task.DescargarConceptosReteiva;
import com.bancolombia.certificacion.paradoc.task.EliminarConcepto;
import com.bancolombia.certificacion.paradoc.task.EliminarConceptoReteica;
import com.bancolombia.certificacion.paradoc.task.EliminarConceptoReteiva;
import com.bancolombia.certificacion.paradoc.task.FiltrarConceptoRetefuente;
import com.bancolombia.certificacion.paradoc.task.FiltrarConceptoReteica;
import com.bancolombia.certificacion.paradoc.task.FiltrarConceptoReteiva;
import com.bancolombia.certificacion.paradoc.task.InfoConcepto;
import com.bancolombia.certificacion.paradoc.task.IngresarAlMenu;
import com.bancolombia.certificacion.paradoc.task.IngresarConcepto;
import com.bancolombia.certificacion.paradoc.task.IngresarConceptoReteica;
import com.bancolombia.certificacion.paradoc.task.ModificarConcepto;
import com.bancolombia.certificacion.paradoc.task.ModificarConceptoReteica;
import com.bancolombia.certificacion.paradoc.task.ModificarConceptoReteiva;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class conceptosStepDefinition {

//	@Managed(driver="chrome",options="--start-maximized --ignore-certificate-errors --disable-infobars")
//	private WebDriver chrome;
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

	@Given("^El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion (.*) - (.*) - (.*)$")
	public void elClienteSeLogueaEnParadocModuloMAMEIngresaALaOpcionCertificadosConfiguraciónCTRetefuente(String Opcion1, String Opcion2, String Opcion3)  {
		// Write code here that turns the phrase above into concrete actions
		theActorCalled("Laura").can(BrowseTheWeb.with(hisBrowserWeb().on("https://10.8.69.8/eucProfiles/")));
	    theActorInTheSpotlight().attemptsTo(IngresarAlMenu.opcion(Opcion1, Opcion2, Opcion3));
	}

	@When("^El cliente ingresa informacion para la parametrizacion de los conceptos$")
	public void elClienteIngresaInformacionParaLaParametrizacionDeLosConceptos()  {
		theActorInTheSpotlight().attemptsTo(InfoConcepto.seIngresa());
	}

	@Then("^Al crear el concepto se muestra (.*)$")
	public void alCrearElConceptoSeMuestraElElementoFueInsertado(String mensaje)  {
		theActorInTheSpotlight().should(seeThat(ElConcepto.seGuardo(), equalTo(mensaje)));

	}
	
	@When("^Modificar la informacion de los conceptos$")
	public void modificarLaInformacionDeLosConceptos()  {
		theActorInTheSpotlight().attemptsTo(ModificarConcepto.deRetefte());		 
	}

	@Then("^Al modificar el concepto se muestra (.*)$")
	public void alModificarElConceptoSeMuestraActualizado(String mensaje)  {
		theActorInTheSpotlight().should(seeThat(ElElementoFue.actualizado(), equalTo(mensaje)));
	}
	@When("^Elimina la informacion de los conceptos$")
	public void eliminaLaInformacionDeLosConceptos()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(EliminarConcepto.deRetefte());
	}


	@Then("^Al eliminar el concepto se muestra (.*)$")
	public void alEliminarElConceptoSeMuestraEliminado(String mensaje) {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().should(seeThat(ElElementoFue.actualizado(), equalTo(mensaje)));
	}
	@When("^El cliente ingresa informacion para la parametrizacion de los conceptos Reteiva$")
	public void elClienteIngresaInformacionParaLaParametrizacionDeLosConceptosReteiva() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(IngresarConcepto.enElSistema());
	}
	@When("^Modifica la informacion de los conceptos reteiva$")
	public void modificaLaInformacionDeLosConceptosReteiva()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(ModificarConceptoReteiva.delSistema());
	}
	@When("^Elimina la informacion de los conceptos reteiva$")
	public void eliminaLaInformacionDeLosConceptosReteiva()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(EliminarConceptoReteiva.delSistema());
	}
	@When("^El cliente ingresa informacion para la parametrizacion de los conceptos ReteICA$")
	public void elClienteIngresaInformacionParaLaParametrizacionDeLosConceptosReteICA()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(IngresarConceptoReteica.enElSistema());
	}
	@When("^Modifica la informacion de los conceptos ReteICA$")
	public void modificaLaInformacionDeLosConceptosReteICA()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(ModificarConceptoReteica.delSistema());
	}
	@When("^Elimina la informacion de los conceptos ReteICA$")
	public void eliminaLaInformacionDeLosConceptosReteICA()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(EliminarConceptoReteica.delSistema());
	}
	@When("^El cliente filtra el codigo del concepto$")
	public void elClienteFiltraElCodigoDelConcepto()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(FiltrarConceptoRetefuente.delSistema());
	}
	@Then("^Al filtrar el codigo del concepto este debe ser igual (.*)$")
	public void alFiltrarElCodigoDelConceptoEsteDebeSerIgual(String codigo)  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().should(seeThat(ElFiltroRetefuente.fue(codigo), equalTo(codigo)));
	}
	@When("^El cliente filtra el codigo del concepto Reteiva$")
	public void elClienteFiltraElCodigoDelConceptoReteiva()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(FiltrarConceptoReteiva.delSistema());
	}
	@When("^El cliente filtra el codigo del concepto Reteica$")
	public void elClienteFiltraElCodigoDelConceptoReteica()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(FiltrarConceptoReteica.delSistema());
	}
	@When("^En  cuadrantes el cliente digita la informacion de Retefuente$")
	public void enCuadrantesElClienteDigitaLaInformacionDeRetefuente() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(CancelarConceptosRetefuente.enElSistema());
	}


	@Then("^Se cancela el encabezado cuadrante y se deshabilita el formulario$")
	public void seCancelaElEncabezadoCuadranteYSeDeshabilitaElFormulario()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().should(seeThat(CancelarConceptoRetefuente.enElSistema(), equalTo(true)));
	}
	
	@When("^En  cuadrantes el cliente digita la informacion de Reteiva$")
	public void enCuadrantesElClienteDigitaLaInformacionDeReteiva()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(CancelarConceptoReteiva.enElSistema());
	}
	@When("^En  cuadrantes el cliente digita la informacion de Reteica$")
	public void enCuadrantesElClienteDigitaLaInformacionDeReteica()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(CancelarConceptoReteIca.enElSistema());
	}
	@When("^Se Descarga archivo de cuadrantes creados en la parametrizacion de retefuente$")
	public void seDescargaArchivoDeCuadrantesCreadosEnLaParametrizacionDeRetefuente()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(DescargarConceptosRetefuente.aWindows());
	}
	@Then("^Al Descargar el archivo cuadrante se almacenara en la carpeta Downloads de windows con el nombre (.*)$")
	public void alDescargarElArchivoCuadranteSeAlmacenaraEnLaCarpetaDownloadsDeWindowsConElNombreReporte_CONCEPTOTxt(String nombreArchivo) {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().should(seeThat(SeDescargoArchivo.alSistema(), equalTo(nombreArchivo)));
	}
	@When("^Se Descarga archivo de cuadrantes creados en la parametrizacion de ReteIVA$")
	public void seDescargaArchivoDeCuadrantesCreadosEnLaParametrizacionDeReteIVA() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(DescargarConceptosReteiva.aWindows());
	}
	@When("^Se Descarga archivo de cuadrantes creados en la parametrizacion de ReteICA$")
	public void seDescargaArchivoDeCuadrantesCreadosEnLaParametrizacionDeReteICA()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(DescargarConceptosReteica.aWindows());
	}
}
