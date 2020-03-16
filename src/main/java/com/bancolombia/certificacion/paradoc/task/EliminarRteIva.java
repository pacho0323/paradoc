package com.bancolombia.certificacion.paradoc.task;

import java.util.Iterator;
import java.util.List;

import com.bancolombia.certificacion.paradoc.interactions.BuscarElDato;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EliminarRteIva implements Task{
	
	private String CodigoEliminariva;

	public EliminarRteIva() {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		CodigoEliminariva = leerencabezado.propiedades("CodigoEliminariva");
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
		Click.on(PaginaEncabezado.OPCION_ENCABEZADORETEIVA),
		BuscarElDato.enLaTablaDelSistema(PaginaEncabezado.COLUMNA_CODIGO, PaginaConcepto.PAGINAS, CodigoEliminariva),
		Click.on(PaginaEncabezado.BTN_ELIMINAR),
		Click.on(PaginaEncabezado.BTN_ELIM_SI)
				);
	
	}
	
	public static EliminarRteIva delEncabezado() {
		return Tasks.instrumented(EliminarRteIva.class);
	  }

}
