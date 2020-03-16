package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DatosRteIva implements Task{

	private String Codigoiva;
	private String NombreCompaniaiva;
	private String Logoiva;
	private String FechaExpedicioniva;
	private String AgenteRetenedoriva;
	private String Nitiva;	
	private String DigitoVerificacioniva;
	private String Direccioniva;
	private String MunicipioAgenteiva;
	private String Departamentoiva;
	private String CiudadRetencioniva;
	private String CiudadGMFiva;
	private String AnoGravableiva;
	private String ComponenteInflacionarioiva;
	
	public DatosRteIva () {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		Codigoiva = leerencabezado.propiedades("Codigoiva");
		NombreCompaniaiva = leerencabezado.propiedades("NombreCompaniaiva");
		FechaExpedicioniva = leerencabezado.propiedades("FechaExpedicioniva");
		AgenteRetenedoriva = leerencabezado.propiedades("AgenteRetenedoriva");
		Nitiva = leerencabezado.propiedades("Nitiva");
		DigitoVerificacioniva = leerencabezado.propiedades("DigitoVerificacioniva");
		Direccioniva = leerencabezado.propiedades("Direccioniva");
		MunicipioAgenteiva = leerencabezado.propiedades("MunicipioAgenteiva");
		Departamentoiva = leerencabezado.propiedades("Departamentoiva");
		CiudadRetencioniva = leerencabezado.propiedades("CiudadRetencioniva");
		CiudadGMFiva = leerencabezado.propiedades("CiudadGMFiva");
		AnoGravableiva = leerencabezado.propiedades("AnoGravableiva");
		ComponenteInflacionarioiva = leerencabezado.propiedades("ComponenteInflacionarioiva");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
				actor.attemptsTo(
				Click.on(PaginaEncabezado.OPCION_ENCABEZADORETEIVA),		
				Click.on(PaginaEncabezado.NUEVA_CONFIGURACION),
				Enter.theValue(Codigoiva).into(PaginaEncabezado.CODIGO),
				Enter.theValue(NombreCompaniaiva).into(PaginaEncabezado.NOMBRE_COMPANIA),
				//Click.on(PaginaEncabezado.LOGO.of(Logoiva)),
				Enter.theValue(FechaExpedicioniva).into(PaginaEncabezado.FECHA_DE_EXPEDICION),//pendiente revisar calendario
				Enter.theValue(AgenteRetenedoriva).into(PaginaEncabezado.AGENTE_RETENEDOR),
				Enter.theValue(Nitiva).into(PaginaEncabezado.NIT),
				Enter.theValue(DigitoVerificacioniva).into(PaginaEncabezado.DIGITO_VERIFICACION),
				Enter.theValue(Direccioniva).into(PaginaEncabezado.DIRECCION),
				Enter.theValue(MunicipioAgenteiva).into(PaginaEncabezado.MUNICIPIO_AGENTE_RETENEDOR),
				Enter.theValue(Departamentoiva).into(PaginaEncabezado.DEPARTAMENTO),
				Enter.theValue(CiudadRetencioniva).into(PaginaEncabezado.CIUDAD_RETENCION),
				Enter.theValue(CiudadGMFiva).into(PaginaEncabezado.CIUDAD_GMF),
				Enter.theValue(AnoGravableiva).into(PaginaEncabezado.ANO_GRAVABLE),
				Enter.theValue(ComponenteInflacionarioiva).into(PaginaEncabezado.COMPONENTE_INFLACIONARIO),
				Click.on(PaginaEncabezado.BTN_ACEPTAR));
	}

	public static DatosRteIva ingresados() {
		return Tasks.instrumented(DatosRteIva.class);
	}
}
