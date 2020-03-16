package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DescargarArchivo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(PaginaEncabezado.OPCION_ENCABEZADORETEIVA));
				//Click.on(PaginaEncabezado.OPCION_ENCABEZADO));
		//actor.attemptsTo(Click.on(PaginaEncabezado.MENUENCABEZADO));
		actor.attemptsTo(Click.on(PaginaEncabezado.BTN_DESCARGAR));
		
	}
	public static DescargarArchivo deEncabezado() {
		return Tasks.instrumented(DescargarArchivo.class);
	  }
}
