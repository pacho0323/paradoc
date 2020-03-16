package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.BuscarElDato;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ModificarRteIca implements Task {

	private String Codigofiltrarica;
	private String CodigoModica;
	private String NombreCompaniaModica;
	private String LogoModica;
	private String FechaExpedicionModica;
	private String AgenteRetenedorModica;
	private String NitModica;	
	private String DigitoVerificacionModica;
	private String DireccionModica;
	private String MunicipioAgenteModica;
	private String DepartamentoModica;
	private String CiudadRetencionModica;
	private String CiudadGMFModica;
	private String AnoGravableModica;
	private String ComponenteInflacionarioModica;
	
	public ModificarRteIca () {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		Codigofiltrarica = leerencabezado.propiedades("Codigofiltrarica");
		CodigoModica = leerencabezado.propiedades("CodigoModica");
		NombreCompaniaModica = leerencabezado.propiedades("NombreCompaniaModica");
		FechaExpedicionModica = leerencabezado.propiedades("FechaExpedicionModica");
		AgenteRetenedorModica = leerencabezado.propiedades("AgenteRetenedorModica");
		NitModica = leerencabezado.propiedades("NitModica");
		DigitoVerificacionModica = leerencabezado.propiedades("DigitoVerificacionModica");
		DireccionModica = leerencabezado.propiedades("DireccionModica");
		MunicipioAgenteModica = leerencabezado.propiedades("MunicipioAgenteModica");
		DepartamentoModica = leerencabezado.propiedades("DepartamentoModica");
		CiudadRetencionModica = leerencabezado.propiedades("CiudadRetencionModica");
		CiudadGMFModica = leerencabezado.propiedades("CiudadGMFModica");
		AnoGravableModica = leerencabezado.propiedades("AnoGravableModica");
		ComponenteInflacionarioModica = leerencabezado.propiedades("ComponenteInflacionarioModica");
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(PaginaEncabezado.OPCION_ENCABEZADO),
				BuscarElDato.enLaTablaDelSistema(PaginaEncabezado.COLUMNA_CODIGO,PaginaConcepto.PAGINAS,Codigofiltrarica),
				Click.on(PaginaEncabezado.BTN_MODIFICAR),
				Enter.theValue(CodigoModica).into(PaginaEncabezado.CODIGO),
				Enter.theValue(NombreCompaniaModica).into(PaginaEncabezado.NOMBRE_COMPANIA),
				//Click.on(PaginaEncabezado.LOGO.of(LogoModica)),
				Enter.theValue(FechaExpedicionModica).into(PaginaEncabezado.FECHA_DE_EXPEDICION),//pendiente revisar calendario
				Enter.theValue(AgenteRetenedorModica).into(PaginaEncabezado.AGENTE_RETENEDOR),
				Enter.theValue(NitModica).into(PaginaEncabezado.NIT),
				Enter.theValue(DigitoVerificacionModica).into(PaginaEncabezado.DIGITO_VERIFICACION),
				Enter.theValue(DireccionModica).into(PaginaEncabezado.DIRECCION),
				Enter.theValue(MunicipioAgenteModica).into(PaginaEncabezado.MUNICIPIO_AGENTE_RETENEDOR),
				Enter.theValue(DepartamentoModica).into(PaginaEncabezado.DEPARTAMENTO),
				Enter.theValue(CiudadRetencionModica).into(PaginaEncabezado.CIUDAD_RETENCION),
				Enter.theValue(CiudadGMFModica).into(PaginaEncabezado.CIUDAD_GMF),
				Enter.theValue(AnoGravableModica).into(PaginaEncabezado.ANO_GRAVABLE),
				Enter.theValue(ComponenteInflacionarioModica).into(PaginaEncabezado.COMPONENTE_INFLACIONARIO),
				Click.on(PaginaEncabezado.BTN_ACEPTAR));
	      }
		
	public static ModificarRteIca deEncabezado() {
		return Tasks.instrumented(ModificarRteIca.class);
	  }
	}

