package com.bancolombia.certificacion.paradoc.task;

import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.*;


import com.bancolombia.certificacion.paradoc.interactions.Mantener;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarRteIva implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(MENU_CERTIFICADO),
				Mantener.elemento(MENU_CONFIGURACION_CERTIFICADO,OPCION_CTRETEIVA_CERTIFICADO,ENCABEZADO_CTRETEIVA)
				);
		
	}
	public static IngresarRteIva opcion() {
		return new IngresarRteIva();
	    }
}
