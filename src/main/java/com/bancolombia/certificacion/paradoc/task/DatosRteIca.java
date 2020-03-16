package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.Esperar;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DatosRteIca implements Task{

	private String Codigoica;
	private String NombreCompaniaica;
	private String Logoica;
	private String FechaExpedicionica;
	private String AgenteRetenedorica;
	private String Nitica;	
	private String DigitoVerificacionica;
	private String Direccionica;
	private String MunicipioAgenteica;
	private String Departamentoica;
	private String CiudadRetencionica;
	private String CiudadGMFica;
	private String AnoGravableica;
	private String ComponenteInflacionarioica;
	
	public DatosRteIca () {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		Codigoica = leerencabezado.propiedades("Codigoica");
		NombreCompaniaica = leerencabezado.propiedades("NombreCompaniaica");
		FechaExpedicionica = leerencabezado.propiedades("FechaExpedicionica");
		AgenteRetenedorica = leerencabezado.propiedades("AgenteRetenedorica");
		Nitica = leerencabezado.propiedades("Nitica");
		DigitoVerificacionica = leerencabezado.propiedades("DigitoVerificacionica");
		Direccionica = leerencabezado.propiedades("Direccionica");
		MunicipioAgenteica = leerencabezado.propiedades("MunicipioAgenteica");
		Departamentoica = leerencabezado.propiedades("Departamentoica");
		CiudadRetencionica = leerencabezado.propiedades("CiudadRetencionica");
		CiudadGMFica = leerencabezado.propiedades("CiudadGMFica");
		AnoGravableica = leerencabezado.propiedades("AnoGravableica");
		ComponenteInflacionarioica = leerencabezado.propiedades("ComponenteInflacionarioica");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
				actor.attemptsTo(
				Click.on(PaginaEncabezado.OPCION_ENCABEZADO));
				actor.attemptsTo(Click.on(PaginaEncabezado.NUEVA_CONFIGURACION),
				Enter.theValue(Codigoica).into(PaginaEncabezado.CODIGO),
				Enter.theValue(NombreCompaniaica).into(PaginaEncabezado.NOMBRE_COMPANIA),
				//Click.on(PaginaEncabezado.LOGO.of(Logoica)),
				Enter.theValue(FechaExpedicionica).into(PaginaEncabezado.FECHA_DE_EXPEDICION),//pendiente revisar calendario
				Enter.theValue(AgenteRetenedorica).into(PaginaEncabezado.AGENTE_RETENEDOR),
				Enter.theValue(Nitica).into(PaginaEncabezado.NIT),
				Enter.theValue(DigitoVerificacionica).into(PaginaEncabezado.DIGITO_VERIFICACION),
				Enter.theValue(Direccionica).into(PaginaEncabezado.DIRECCION),
				Enter.theValue(MunicipioAgenteica).into(PaginaEncabezado.MUNICIPIO_AGENTE_RETENEDOR),
				Enter.theValue(Departamentoica).into(PaginaEncabezado.DEPARTAMENTO),
				Enter.theValue(CiudadRetencionica).into(PaginaEncabezado.CIUDAD_RETENCION),
				Enter.theValue(CiudadGMFica).into(PaginaEncabezado.CIUDAD_GMF),
				Enter.theValue(AnoGravableica).into(PaginaEncabezado.ANO_GRAVABLE),
				Enter.theValue(ComponenteInflacionarioica).into(PaginaEncabezado.COMPONENTE_INFLACIONARIO),
				Click.on(PaginaEncabezado.BTN_ACEPTAR),
				Esperar.unTiempo(5000)
				);
	}

	public static DatosRteIca ingresados() {
		return Tasks.instrumented(DatosRteIca.class);
	}
}
