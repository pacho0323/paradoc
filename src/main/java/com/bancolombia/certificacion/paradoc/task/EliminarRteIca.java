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

public class EliminarRteIca implements Task{
	
	private String CodigoEliminarica;

	public EliminarRteIca() {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		CodigoEliminarica = leerencabezado.propiedades("CodigoEliminarica");
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(PaginaEncabezado.OPCION_ENCABEZADO),
		BuscarElDato.enLaTablaDelSistema(PaginaEncabezado.COLUMNA_CODIGO,PaginaConcepto.PAGINAS,CodigoEliminarica),
		Click.on(PaginaEncabezado.BTN_ELIMINAR),
		Click.on(PaginaEncabezado.BTN_ELIM_SI)
				);

	}
	
	public static EliminarRteIca delEncabezado() {
		return Tasks.instrumented(EliminarRteIca.class);
	  }

}
