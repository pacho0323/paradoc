package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.Esperar;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InfoRteIva implements Task {

	
	private String CodigoCaniva;
	private String NombreCompaniaCaniva;
	private String LogoCaniva;
	private String FechaExpedicionCaniva;
	private String AgenteRetenedorCaniva;
	private String NitCaniva;	
	private String DigitoVerificacionCaniva;
	private String DireccionCaniva;
	private String MunicipioAgenteCaniva;
	private String DepartamentoCaniva;
	private String CiudadRetencionCaniva;
	private String CiudadGMFCaniva;
	private String AnoGravableCaniva;
	private String ComponenteInflacionarioCaniva;
	
	public InfoRteIva () {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		CodigoCaniva = leerencabezado.propiedades("CodigoCaniva");
		NombreCompaniaCaniva = leerencabezado.propiedades("NombreCompaniaCaniva");
		FechaExpedicionCaniva = leerencabezado.propiedades("FechaExpedicionCaniva");
		AgenteRetenedorCaniva = leerencabezado.propiedades("AgenteRetenedorCaniva");
		NitCaniva = leerencabezado.propiedades("NitCaniva");
		DigitoVerificacionCaniva = leerencabezado.propiedades("DigitoVerificacionCaniva");
		DireccionCaniva = leerencabezado.propiedades("DireccionCaniva");
		MunicipioAgenteCaniva = leerencabezado.propiedades("MunicipioAgenteCaniva");
		DepartamentoCaniva = leerencabezado.propiedades("DepartamentoCaniva");
		CiudadRetencionCaniva = leerencabezado.propiedades("CiudadRetencionCaniva");
		CiudadGMFCaniva = leerencabezado.propiedades("CiudadGMFCaniva");
		AnoGravableCaniva = leerencabezado.propiedades("AnoGravableCaniva");
		ComponenteInflacionarioCaniva = leerencabezado.propiedades("ComponenteInflacionarioCaniva");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Click.on(PaginaEncabezado.OPCION_ENCABEZADORETEIVA),
				Click.on(PaginaEncabezado.NUEVA_CONFIGURACION),
				Enter.theValue(CodigoCaniva).into(PaginaEncabezado.CODIGO),
				Enter.theValue(NombreCompaniaCaniva).into(PaginaEncabezado.NOMBRE_COMPANIA),
				//Click.on(PaginaEncabezado.LOGO.of(LogoCaniva)),
				Enter.theValue(FechaExpedicionCaniva).into(PaginaEncabezado.FECHA_DE_EXPEDICION),//pendiente revisar calendario
				Enter.theValue(AgenteRetenedorCaniva).into(PaginaEncabezado.AGENTE_RETENEDOR),
				Enter.theValue(NitCaniva).into(PaginaEncabezado.NIT),
				Enter.theValue(DigitoVerificacionCaniva).into(PaginaEncabezado.DIGITO_VERIFICACION),
				Enter.theValue(DireccionCaniva).into(PaginaEncabezado.DIRECCION),
				Enter.theValue(MunicipioAgenteCaniva).into(PaginaEncabezado.MUNICIPIO_AGENTE_RETENEDOR),
				Enter.theValue(DepartamentoCaniva).into(PaginaEncabezado.DEPARTAMENTO),
				Enter.theValue(CiudadRetencionCaniva).into(PaginaEncabezado.CIUDAD_RETENCION),
				Enter.theValue(CiudadGMFCaniva).into(PaginaEncabezado.CIUDAD_GMF),
				Enter.theValue(AnoGravableCaniva).into(PaginaEncabezado.ANO_GRAVABLE),
				Enter.theValue(ComponenteInflacionarioCaniva).into(PaginaEncabezado.COMPONENTE_INFLACIONARIO),
				Click.on(PaginaEncabezado.BTN_CANCELAR),
				Esperar.unTiempo(5000)
				);
	}

	public static InfoRteIva seIngresa() {
		return Tasks.instrumented(InfoRteIva.class);
	}
}
