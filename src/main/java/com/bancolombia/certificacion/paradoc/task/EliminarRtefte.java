package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.BuscarElDato;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EliminarRtefte implements Task{
	
	private String CodigoEliminar;

	public EliminarRtefte() {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		CodigoEliminar = leerencabezado.propiedades("CodigoEliminar");
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PaginaEncabezado.MENUENCABEZADO),
				BuscarElDato.enLaTablaDelSistema(PaginaConcepto.LOCALIZARCODIGO, PaginaConcepto.PAGINAS, CodigoEliminar),		
				Click.on(PaginaEncabezado.BTN_ELIMINAR),
				Click.on(PaginaEncabezado.BTN_ELIM_SI)
				);
	}
	
	public static EliminarRtefte elEncabezado() {
		return Tasks.instrumented(EliminarRtefte.class);
	  }

}
