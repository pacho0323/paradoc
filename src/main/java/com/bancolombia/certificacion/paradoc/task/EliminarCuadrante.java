package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.BuscarElDato;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import com.bancolombia.certificacion.paradoc.utils.LeerCuadrante;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EliminarCuadrante implements Task{
	
	private String IdentificadorCuadranteEliminar;

	public EliminarCuadrante() {
		LeerCuadrante leercuadrante = new LeerCuadrante();
		IdentificadorCuadranteEliminar = leercuadrante.propiedades("IdentificadorCuadranteEliminar");
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PaginaCuadrante.MENU_CUADRANTE),
				BuscarElDato.enLaTablaDelSistema(PaginaCuadrante.IDENTIFICADORDEL_CUADRANTE, PaginaConcepto.PAGINAS, IdentificadorCuadranteEliminar),	
				Click.on(PaginaCuadrante.BTN_ELIMINAR),
		        Click.on(PaginaCuadrante.BTN_ELIM_SI));
			}
	
	public static EliminarCuadrante deRetefte() {
		return Tasks.instrumented(EliminarCuadrante.class);
	  }

}
