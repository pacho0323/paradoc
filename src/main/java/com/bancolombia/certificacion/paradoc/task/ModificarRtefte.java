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

public class ModificarRtefte implements Task {

	private String Codigofiltrar;
	private String CodigoMod;
	private String NombreCompaniaMod;
	private String LogoMod;
	private String FechaExpedicionMod;
	private String AgenteRetenedorMod;
	private String NitMod;	
	private String DigitoVerificacionMod;
	private String DireccionMod;
	private String MunicipioAgenteMod;
	private String DepartamentoMod;
	private String CiudadRetencionMod;
	private String CiudadGMFMod;
	private String AnoGravableMod;
	private String ComponenteInflacionarioMod;
	
	public ModificarRtefte () {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		Codigofiltrar = leerencabezado.propiedades("Codigofiltrar");
		CodigoMod = leerencabezado.propiedades("CodigoMod");
		NombreCompaniaMod = leerencabezado.propiedades("NombreCompaniaMod");
		FechaExpedicionMod = leerencabezado.propiedades("FechaExpedicionMod");
		AgenteRetenedorMod = leerencabezado.propiedades("AgenteRetenedorMod");
		NitMod = leerencabezado.propiedades("NitMod");
		DigitoVerificacionMod = leerencabezado.propiedades("DigitoVerificacionMod");
		DireccionMod = leerencabezado.propiedades("DireccionMod");
		MunicipioAgenteMod = leerencabezado.propiedades("MunicipioAgenteMod");
		DepartamentoMod = leerencabezado.propiedades("DepartamentoMod");
		CiudadRetencionMod = leerencabezado.propiedades("CiudadRetencionMod");
		CiudadGMFMod = leerencabezado.propiedades("CiudadGMFMod");
		AnoGravableMod = leerencabezado.propiedades("AnoGravableMod");
		ComponenteInflacionarioMod = leerencabezado.propiedades("ComponenteInflacionarioMod");
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PaginaEncabezado.MENUENCABEZADO),
				BuscarElDato.enLaTablaDelSistema(PaginaConcepto.LOCALIZARCODIGO, PaginaConcepto.PAGINAS, Codigofiltrar),
				Click.on(PaginaEncabezado.BTN_MODIFICAR),
				Enter.theValue(CodigoMod).into(PaginaEncabezado.CODIGO),
				Enter.theValue(NombreCompaniaMod).into(PaginaEncabezado.NOMBRE_COMPANIA),
				Click.on(PaginaEncabezado.LOGO.of(LogoMod)),
				Enter.theValue(FechaExpedicionMod).into(PaginaEncabezado.FECHA_DE_EXPEDICION),//pendiente revisar calendario
				Enter.theValue(AgenteRetenedorMod).into(PaginaEncabezado.AGENTE_RETENEDOR),
				Enter.theValue(NitMod).into(PaginaEncabezado.NIT),
				Enter.theValue(DigitoVerificacionMod).into(PaginaEncabezado.DIGITO_VERIFICACION),
				Enter.theValue(DireccionMod).into(PaginaEncabezado.DIRECCION),
				Enter.theValue(MunicipioAgenteMod).into(PaginaEncabezado.MUNICIPIO_AGENTE_RETENEDOR),
				Enter.theValue(DepartamentoMod).into(PaginaEncabezado.DEPARTAMENTO),
				Enter.theValue(CiudadRetencionMod).into(PaginaEncabezado.CIUDAD_RETENCION),
				Enter.theValue(CiudadGMFMod).into(PaginaEncabezado.CIUDAD_GMF),
				Enter.theValue(AnoGravableMod).into(PaginaEncabezado.ANO_GRAVABLE),
				Enter.theValue(ComponenteInflacionarioMod).into(PaginaEncabezado.COMPONENTE_INFLACIONARIO),
				Click.on(PaginaEncabezado.BTN_ACEPTAR)
				);
	      }
		
	public static ModificarRtefte deEncabezado() {
		return Tasks.instrumented(ModificarRtefte.class);
	  }
	}

