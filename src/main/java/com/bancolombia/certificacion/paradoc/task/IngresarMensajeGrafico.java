package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.Mantener;
import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarMensajeGrafico implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(MENU_CERTIFICADO),
		Mantener.elemento(MENU_MENSAJES, OPCION_MENSAJES_GRAFICOS, OPCION_MENSAJES_GRAFICOS_LISTADO));
		
	}
	
 public static IngresarMensajeGrafico listado() {
	 return new IngresarMensajeGrafico();
    }
 
}
