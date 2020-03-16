package com.bancolombia.certificacion.paradoc.task;

import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.OPCION_CONCEPTO;

import com.bancolombia.certificacion.paradoc.interactions.BuscarElDato;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.utils.LeerConcepto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ModificarConcepto implements Task{
  
	private String CodigoFiltrar;
	private String CuadranteMod;
	private String CodigoMod;
	private String DescripcionConceptoMod;
	private String TotalMod;
	
	
	public ModificarConcepto () {
		LeerConcepto leerconcepto = new LeerConcepto();
		CodigoFiltrar= leerconcepto.propiedades("CodigoFiltrar");
		CuadranteMod=leerconcepto.propiedades("CuadranteMod");
		CodigoMod=leerconcepto.propiedades("CodigoMod");
		DescripcionConceptoMod=leerconcepto.propiedades("DescripcionConceptoMod");
		TotalMod=leerconcepto.propiedades("TotalMod");
	   
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(OPCION_CONCEPTO),
				BuscarElDato.enLaTablaDelSistema(PaginaConcepto.LOCALIZARCODIGO,PaginaConcepto.PAGINAS,CodigoFiltrar),
				Click.on(PaginaConcepto.BTN_MODIFICAR),
				Click.on(PaginaConcepto.CUADRANTE),
				Click.on(PaginaConcepto.CUADRANTE_CONCEPTO.of(CuadranteMod)),
				Enter.theValue(CodigoMod).into(PaginaConcepto.CODIGO_CONCEPTO),
				Enter.theValue(DescripcionConceptoMod).into(PaginaConcepto.DESCRIPCION_CONCEPTO),
				Click.on(PaginaConcepto.TOTAL),
				Click.on(PaginaConcepto.ES_TOTAL.of(TotalMod)),
				Click.on(PaginaConcepto.BTN_ACEPTAR)
				);


	}		

	public static ModificarConcepto deRetefte() {
		return Tasks.instrumented(ModificarConcepto.class);
	}
}
