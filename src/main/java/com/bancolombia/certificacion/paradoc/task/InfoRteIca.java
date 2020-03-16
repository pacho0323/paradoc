package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.Esperar;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InfoRteIca implements Task {

	
	private String CodigoCanica;
	private String NombreCompaniaCanica;
	private String LogoCanica;
	private String FechaExpedicionCanica;
	private String AgenteRetenedorCanica;
	private String NitCanica;	
	private String DigitoVerificacionCanica;
	private String DireccionCanica;
	private String MunicipioAgenteCanica;
	private String DepartamentoCanica;
	private String CiudadRetencionCanica;
	private String CiudadGMFCanica;
	private String AnoGravableCanica;
	private String ComponenteInflacionarioCanica;
	
	public InfoRteIca () {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		CodigoCanica = leerencabezado.propiedades("CodigoCanica");
		NombreCompaniaCanica = leerencabezado.propiedades("NombreCompaniaCanica");
		FechaExpedicionCanica = leerencabezado.propiedades("FechaExpedicionCanica");
		AgenteRetenedorCanica = leerencabezado.propiedades("AgenteRetenedorCanica");
		NitCanica = leerencabezado.propiedades("NitCanica");
		DigitoVerificacionCanica = leerencabezado.propiedades("DigitoVerificacionCanica");
		DireccionCanica = leerencabezado.propiedades("DireccionCanica");
		MunicipioAgenteCanica = leerencabezado.propiedades("MunicipioAgenteCanica");
		DepartamentoCanica = leerencabezado.propiedades("DepartamentoCanica");
		CiudadRetencionCanica = leerencabezado.propiedades("CiudadRetencionCanica");
		CiudadGMFCanica = leerencabezado.propiedades("CiudadGMFCanica");
		AnoGravableCanica = leerencabezado.propiedades("AnoGravableCanica");
		ComponenteInflacionarioCanica = leerencabezado.propiedades("ComponenteInflacionarioCanica");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(PaginaEncabezado.OPCION_ENCABEZADO));
		actor.attemptsTo(Click.on(PaginaEncabezado.NUEVA_CONFIGURACION),
				Enter.theValue(CodigoCanica).into(PaginaEncabezado.CODIGO),
				Enter.theValue(NombreCompaniaCanica).into(PaginaEncabezado.NOMBRE_COMPANIA),
				//Click.on(PaginaEncabezado.LOGO.of(LogoCanica)),
				Enter.theValue(FechaExpedicionCanica).into(PaginaEncabezado.FECHA_DE_EXPEDICION),//pendiente revisar calendario
				Enter.theValue(AgenteRetenedorCanica).into(PaginaEncabezado.AGENTE_RETENEDOR),
				Enter.theValue(NitCanica).into(PaginaEncabezado.NIT),
				Enter.theValue(DigitoVerificacionCanica).into(PaginaEncabezado.DIGITO_VERIFICACION),
				Enter.theValue(DireccionCanica).into(PaginaEncabezado.DIRECCION),
				Enter.theValue(MunicipioAgenteCanica).into(PaginaEncabezado.MUNICIPIO_AGENTE_RETENEDOR),
				Enter.theValue(DepartamentoCanica).into(PaginaEncabezado.DEPARTAMENTO),
				Enter.theValue(CiudadRetencionCanica).into(PaginaEncabezado.CIUDAD_RETENCION),
				Enter.theValue(CiudadGMFCanica).into(PaginaEncabezado.CIUDAD_GMF),
				Enter.theValue(AnoGravableCanica).into(PaginaEncabezado.ANO_GRAVABLE),
				Enter.theValue(ComponenteInflacionarioCanica).into(PaginaEncabezado.COMPONENTE_INFLACIONARIO),
				Click.on(PaginaEncabezado.BTN_CANCELAR),
				Esperar.unTiempo(5000)
				);
	}

	public static InfoRteIca seIngresa() {
		return Tasks.instrumented(InfoRteIca.class);
	}
}
