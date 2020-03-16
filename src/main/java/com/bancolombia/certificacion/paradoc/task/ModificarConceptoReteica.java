package com.bancolombia.certificacion.paradoc.task;

import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.OPCION_CONCEPTORETEICA;

import java.util.List;

import com.bancolombia.certificacion.paradoc.interactions.BuscarElDato;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.utils.LeerConcepto;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ModificarConceptoReteica implements Task{
  
	private String CodigoFiltrar;
	private String TotalMod;
	private String Codigo;
	
	
	public ModificarConceptoReteica () {
		LeerConcepto leerconcepto = new LeerConcepto();
		CodigoFiltrar= leerconcepto.propiedades("CodigoFiltrar");
		TotalMod=leerconcepto.propiedades("TotalMod");
		Codigo=leerconcepto.propiedades("Codigo");
	   
	}
	@Override
	public <T extends Actor> void performAs(T actor) {

actor.attemptsTo(Click.on(OPCION_CONCEPTORETEICA),
		BuscarElDato.enLaTablaDelSistema(PaginaConcepto.LOCALIZARCODIGO,PaginaConcepto.PAGINAS,CodigoFiltrar),
		Click.on(PaginaConcepto.BTN_MODIFICAR),
		Enter.theValue(Codigo).into(PaginaConcepto.CODIGO_CONCEPTO),
		Click.on(PaginaConcepto.DESCRIPCION_CONCEPTO),
		Click.on(PaginaConcepto.TOTAL),
		Click.on(PaginaConcepto.ES_TOTAL.of(TotalMod)),
		Click.on(PaginaConcepto.BTN_ACEPTAR)
		);
	}		

	public static ModificarConceptoReteica delSistema() {
		return Tasks.instrumented(ModificarConceptoReteica.class);
	}
}

