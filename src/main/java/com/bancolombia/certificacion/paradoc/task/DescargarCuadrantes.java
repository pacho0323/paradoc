package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DescargarCuadrantes implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(PaginaCuadrante.MENU_CUADRANTE),
				Click.on(PaginaCuadrante.BTN_DESCARGAR));
		
	}
	public static DescargarCuadrantes deRetefte() {
		return Tasks.instrumented(DescargarCuadrantes.class);
	  }
}
