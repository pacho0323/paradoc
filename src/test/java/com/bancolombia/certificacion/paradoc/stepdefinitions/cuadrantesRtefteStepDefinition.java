package com.bancolombia.certificacion.paradoc.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import com.bancolombia.certificacion.paradoc.questions.ElCuadrante;
import com.bancolombia.certificacion.paradoc.questions.FueCancelado;
import com.bancolombia.certificacion.paradoc.questions.FueDescargado;
import com.bancolombia.certificacion.paradoc.questions.FueEliminado;
import com.bancolombia.certificacion.paradoc.questions.FueFiltrado;
import com.bancolombia.certificacion.paradoc.questions.FueModificado;
import com.bancolombia.certificacion.paradoc.task.CancelarDatos;
import com.bancolombia.certificacion.paradoc.task.DescargarCuadrantes;
import com.bancolombia.certificacion.paradoc.task.EliminarCuadrante;
import com.bancolombia.certificacion.paradoc.task.FiltrarCuadrantes;
import com.bancolombia.certificacion.paradoc.task.IngresarDatos;
import com.bancolombia.certificacion.paradoc.task.ModificarCuadrante;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class cuadrantesRtefteStepDefinition {

	//@Managed(driver="chrome",options="--start-maximized --ignore-certificate-errors --disable-infobars")
	//private WebDriver chrome;
	
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	@When("^En la parametrizacion de cuadrantes el cliente ingresa la informacion$")
	public void enLaParametrizacionDeCuadrantesElClienteIngresaLaInformacion()  {
		theActorInTheSpotlight().attemptsTo(IngresarDatos.enCuadrantes());
	}

	@Then("^Cuando se crea el cuadrante se muestra (.*)$")
	public void cuandoSeCreaElCuadranteSeMuestraElElementoFueInsertado(String palabra)  {
		theActorInTheSpotlight().should(seeThat(ElCuadrante.seGuardo(),equalTo(palabra)));
	}

	@When("^El cliente modifica la informacion en la parametrizacion de cuadrantes$")
	public void elClienteModificaLaInformacionEnLaParametrizacionDeCuadrantes()  {
		theActorInTheSpotlight().attemptsTo(ModificarCuadrante.deRetefte());
	}

	@Then("^Al modificar el cuadrante se muestra El elemento (.*)$")
	public void alModificarElCuadranteSeMuestraElElementoFueActualizado(String mensaje)  {
		theActorInTheSpotlight().should(seeThat(FueModificado.elCuadrante(),containsString(mensaje)));
	}
	
	@When("^El cliente Elimina los datos ingresados en la parametrizacion del cuadrante$")
	public void elClienteEliminaLosDatosIngresadosEnLaParametrizacionDelCuadrante()  {
		theActorInTheSpotlight().attemptsTo(EliminarCuadrante.deRetefte());
	}

	@Then("^Al eliminar el cuadrante de retefte se visualiza un mensaje El elemento (.*)$")
	public void alEliminarElCuadranteDeRetefteSeVisualizaUnMensajeElElementoFueEliminado(String mensaje)  {
		theActorInTheSpotlight().should(seeThat(FueEliminado.elCuadrante(), containsString(mensaje)));
	}
	
	@When("^En  cuadrantes el cliente digita la informacion$")
	public void enCuadrantesElClienteDigitaLaInformacion(){
		theActorInTheSpotlight().attemptsTo(CancelarDatos.deCuadrantes());
	}


	@Then("^Se cancela el encabezad cuadrante y se deshabilita el formulario$")
	public void seCancelaElEncabezadCuadranteYSeDeshabilitaElFormulario(){
		theActorInTheSpotlight().should(seeThat(FueCancelado.elCuadrante(), equalTo(true)));
	}
	
	@When("^El cliente filtra el identificador del cuadrante$")
	public void elClienteFiltraElIdentificadorDelCuadrante()  {
		theActorInTheSpotlight().attemptsTo(FiltrarCuadrantes.deRetefte());
	}

	@Then("^Al filtrar la identificacion del cuadrante se vera la descripcion del cuadrante (.*)$")
	public void alFiltrarLaIdentificacionDelCuadranteSeVeraLaDescripcionDelCuadranteObligacionesACargo(String Descripcion) {
		theActorInTheSpotlight().should(seeThat(FueFiltrado.elCuadrante(), equalTo(Descripcion)));
	}
	
	@When("^Se Descarga archivo de cuadrantes creados en la parametrizacion de Retefte$")
	public void seDescargaArchivoDeCuadrantesCreadosEnLaParametrizacionDeRetefte() {
		theActorInTheSpotlight().attemptsTo(DescargarCuadrantes.deRetefte());
	}

	@Then("^Al Descargar el archivo cuadrante se almacenara en la carpeta Downloads de windows$")
	public void alDescargarElArchivoCuadranteSeAlmacenaraEnLaCarpetaDownloadsDeWindows()  {
		theActorInTheSpotlight().should(seeThat(FueDescargado.archivoCuadrantes(),equalTo("reporte_CUADRANTE.txt")));
	}
}
