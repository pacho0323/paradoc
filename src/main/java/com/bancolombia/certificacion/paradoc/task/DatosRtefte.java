package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.Esperar;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DatosRtefte implements Task{

	private String Codigo;
	private String NombreCompania;
	private String Logo;
	private String FechaExpedicion;
	private String AgenteRetenedor;
	private String Nit;	
	private String DigitoVerificacion;
	private String Direccion;
	private String MunicipioAgente;
	private String Departamento;
	private String CiudadRetencion;
	private String CiudadGMF;
	private String AnoGravable;
	private String ComponenteInflacionario;
	
	public DatosRtefte () {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		Codigo = leerencabezado.propiedades("Codigo");
		NombreCompania = leerencabezado.propiedades("NombreCompania");
		FechaExpedicion = leerencabezado.propiedades("FechaExpedicion");
		AgenteRetenedor = leerencabezado.propiedades("AgenteRetenedor");
		Nit = leerencabezado.propiedades("Nit");
		DigitoVerificacion = leerencabezado.propiedades("DigitoVerificacion");
		Direccion = leerencabezado.propiedades("Direccion");
		MunicipioAgente = leerencabezado.propiedades("MunicipioAgente");
		Departamento = leerencabezado.propiedades("Departamento");
		CiudadRetencion = leerencabezado.propiedades("CiudadRetencion");
		CiudadGMF = leerencabezado.propiedades("CiudadGMF");
		AnoGravable = leerencabezado.propiedades("AnoGravable");
		ComponenteInflacionario = leerencabezado.propiedades("ComponenteInflacionario");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
				actor.attemptsTo(
				Click.on(PaginaEncabezado.MENUENCABEZADO));
				
				actor.attemptsTo(
				Click.on(PaginaEncabezado.NUEVA_CONFIGURACION),
				Enter.theValue(Codigo).into(PaginaEncabezado.CODIGO),
				Enter.theValue(NombreCompania).into(PaginaEncabezado.NOMBRE_COMPANIA),
				Click.on(PaginaEncabezado.LOGO.of(Logo)),
				Enter.theValue(FechaExpedicion).into(PaginaEncabezado.FECHA_DE_EXPEDICION),//pendiente revisar calendario
				Enter.theValue(AgenteRetenedor).into(PaginaEncabezado.AGENTE_RETENEDOR),
				Enter.theValue(Nit).into(PaginaEncabezado.NIT),
				Enter.theValue(DigitoVerificacion).into(PaginaEncabezado.DIGITO_VERIFICACION),
				Enter.theValue(Direccion).into(PaginaEncabezado.DIRECCION),
				Enter.theValue(MunicipioAgente).into(PaginaEncabezado.MUNICIPIO_AGENTE_RETENEDOR),
				Enter.theValue(Departamento).into(PaginaEncabezado.DEPARTAMENTO),
				Enter.theValue(CiudadRetencion).into(PaginaEncabezado.CIUDAD_RETENCION),
				Enter.theValue(CiudadGMF).into(PaginaEncabezado.CIUDAD_GMF),
				Enter.theValue(AnoGravable).into(PaginaEncabezado.ANO_GRAVABLE),
				Enter.theValue(ComponenteInflacionario).into(PaginaEncabezado.COMPONENTE_INFLACIONARIO),
				Click.on(PaginaEncabezado.BTN_ACEPTAR)

				);
	}

	public static DatosRtefte ingresados() {
		return Tasks.instrumented(DatosRtefte.class);
	}
}
