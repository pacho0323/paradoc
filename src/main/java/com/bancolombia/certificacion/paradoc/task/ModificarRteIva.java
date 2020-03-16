package com.bancolombia.certificacion.paradoc.task;

import java.util.Iterator;
import java.util.List;

import com.bancolombia.certificacion.paradoc.interactions.BuscarElDato;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ModificarRteIva implements Task {

	private String Codigofiltrariva;
	private String CodigoModiva;
	private String NombreCompaniaModiva;
	private String LogoModiva;
	private String FechaExpedicionModiva;
	private String AgenteRetenedorModiva;
	private String NitModiva;	
	private String DigitoVerificacionModiva;
	private String DireccionModiva;
	private String MunicipioAgenteModiva;
	private String DepartamentoModiva;
	private String CiudadRetencionModiva;
	private String CiudadGMFModiva;
	private String AnoGravableModiva;
	private String ComponenteInflacionarioModiva;
	
	public ModificarRteIva () {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		Codigofiltrariva = leerencabezado.propiedades("Codigofiltrariva");
		CodigoModiva = leerencabezado.propiedades("CodigoModiva");
		NombreCompaniaModiva = leerencabezado.propiedades("NombreCompaniaModiva");
		FechaExpedicionModiva = leerencabezado.propiedades("FechaExpedicionModiva");
		AgenteRetenedorModiva = leerencabezado.propiedades("AgenteRetenedorModiva");
		NitModiva = leerencabezado.propiedades("NitModiva");
		DigitoVerificacionModiva = leerencabezado.propiedades("DigitoVerificacionModiva");
		DireccionModiva = leerencabezado.propiedades("DireccionModiva");
		MunicipioAgenteModiva = leerencabezado.propiedades("MunicipioAgenteModiva");
		DepartamentoModiva = leerencabezado.propiedades("DepartamentoModiva");
		CiudadRetencionModiva = leerencabezado.propiedades("CiudadRetencionModiva");
		CiudadGMFModiva = leerencabezado.propiedades("CiudadGMFModiva");
		AnoGravableModiva = leerencabezado.propiedades("AnoGravableModiva");
		ComponenteInflacionarioModiva = leerencabezado.propiedades("ComponenteInflacionarioModiva");
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(PaginaEncabezado.OPCION_ENCABEZADORETEIVA),
				BuscarElDato.enLaTablaDelSistema(PaginaEncabezado.COLUMNA_CODIGO, PaginaConcepto.PAGINAS, Codigofiltrariva),
				Click.on(PaginaEncabezado.BTN_MODIFICAR),
				Enter.theValue(CodigoModiva).into(PaginaEncabezado.CODIGO),
				Enter.theValue(NombreCompaniaModiva).into(PaginaEncabezado.NOMBRE_COMPANIA),
				//Click.on(PaginaEncabezado.LOGO.of(LogoModiva)),
				Enter.theValue(FechaExpedicionModiva).into(PaginaEncabezado.FECHA_DE_EXPEDICION),//pendiente revisar calendario
				Enter.theValue(AgenteRetenedorModiva).into(PaginaEncabezado.AGENTE_RETENEDOR),
				Enter.theValue(NitModiva).into(PaginaEncabezado.NIT),
				Enter.theValue(DigitoVerificacionModiva).into(PaginaEncabezado.DIGITO_VERIFICACION),
				Enter.theValue(DireccionModiva).into(PaginaEncabezado.DIRECCION),
				Enter.theValue(MunicipioAgenteModiva).into(PaginaEncabezado.MUNICIPIO_AGENTE_RETENEDOR),
				Enter.theValue(DepartamentoModiva).into(PaginaEncabezado.DEPARTAMENTO),
				Enter.theValue(CiudadRetencionModiva).into(PaginaEncabezado.CIUDAD_RETENCION),
				Enter.theValue(CiudadGMFModiva).into(PaginaEncabezado.CIUDAD_GMF),
				Enter.theValue(AnoGravableModiva).into(PaginaEncabezado.ANO_GRAVABLE),
				Enter.theValue(ComponenteInflacionarioModiva).into(PaginaEncabezado.COMPONENTE_INFLACIONARIO),
				Click.on(PaginaEncabezado.BTN_ACEPTAR));
	      }
		
	public static ModificarRteIva deEncabezado() {
		return Tasks.instrumented(ModificarRteIva.class);
	  }
	}

