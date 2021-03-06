package com.bancolombia.certificacion.paradoc.task;

import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.*;


import com.bancolombia.certificacion.paradoc.interactions.Mantener;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarCuadrante implements Task{

	 
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(MENU_CERTIFICADO),
				Mantener.elemento(MENU_CONFIGURACION_CERTIFICADO,OPCION_CTRETEFTE_CERTIFICADO,CUADRANTE_CTRETEFTE)
				);
	}

	public static IngresarCuadrante opcion() {
		return new IngresarCuadrante();
	}
}
