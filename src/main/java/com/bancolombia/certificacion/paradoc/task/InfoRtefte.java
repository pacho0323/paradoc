package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.Esperar;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InfoRtefte implements Task {

	
	private String CodigoCan;
	private String NombreCompaniaCan;
	private String LogoCan;
	private String FechaExpedicionCan;
	private String AgenteRetenedorCan;
	private String NitCan;	
	private String DigitoVerificacionCan;
	private String DireccionCan;
	private String MunicipioAgenteCan;
	private String DepartamentoCan;
	private String CiudadRetencionCan;
	private String CiudadGMFCan;
	private String AnoGravableCan;
	private String ComponenteInflacionarioCan;
	
	public InfoRtefte () {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		CodigoCan = leerencabezado.propiedades("CodigoCan");
		NombreCompaniaCan = leerencabezado.propiedades("NombreCompaniaCan");
		FechaExpedicionCan = leerencabezado.propiedades("FechaExpedicionCan");
		AgenteRetenedorCan = leerencabezado.propiedades("AgenteRetenedorCan");
		NitCan = leerencabezado.propiedades("NitCan");
		DigitoVerificacionCan = leerencabezado.propiedades("DigitoVerificacionCan");
		DireccionCan = leerencabezado.propiedades("DireccionCan");
		MunicipioAgenteCan = leerencabezado.propiedades("MunicipioAgenteCan");
		DepartamentoCan = leerencabezado.propiedades("DepartamentoCan");
		CiudadRetencionCan = leerencabezado.propiedades("CiudadRetencionCan");
		CiudadGMFCan = leerencabezado.propiedades("CiudadGMFCan");
		AnoGravableCan = leerencabezado.propiedades("AnoGravableCan");
		ComponenteInflacionarioCan = leerencabezado.propiedades("ComponenteInflacionarioCan");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(PaginaEncabezado.MENUENCABEZADO));
		actor.attemptsTo(Click.on(PaginaEncabezado.NUEVA_CONFIGURACION),
				Enter.theValue(CodigoCan).into(PaginaEncabezado.CODIGO),
				Enter.theValue(NombreCompaniaCan).into(PaginaEncabezado.NOMBRE_COMPANIA),
				Click.on(PaginaEncabezado.LOGO.of(LogoCan)),
				Enter.theValue(FechaExpedicionCan).into(PaginaEncabezado.FECHA_DE_EXPEDICION),//pendiente revisar calendario
				Enter.theValue(AgenteRetenedorCan).into(PaginaEncabezado.AGENTE_RETENEDOR),
				Enter.theValue(NitCan).into(PaginaEncabezado.NIT),
				Enter.theValue(DigitoVerificacionCan).into(PaginaEncabezado.DIGITO_VERIFICACION),
				Enter.theValue(DireccionCan).into(PaginaEncabezado.DIRECCION),
				Enter.theValue(MunicipioAgenteCan).into(PaginaEncabezado.MUNICIPIO_AGENTE_RETENEDOR),
				Enter.theValue(DepartamentoCan).into(PaginaEncabezado.DEPARTAMENTO),
				Enter.theValue(CiudadRetencionCan).into(PaginaEncabezado.CIUDAD_RETENCION),
				Enter.theValue(CiudadGMFCan).into(PaginaEncabezado.CIUDAD_GMF),
				Enter.theValue(AnoGravableCan).into(PaginaEncabezado.ANO_GRAVABLE),
				Enter.theValue(ComponenteInflacionarioCan).into(PaginaEncabezado.COMPONENTE_INFLACIONARIO),
				Click.on(PaginaEncabezado.BTN_CANCELAR),
				Esperar.unTiempo(5000)
				);
	}

	public static InfoRtefte seIngresa() {
		return Tasks.instrumented(InfoRtefte.class);
	}
}
