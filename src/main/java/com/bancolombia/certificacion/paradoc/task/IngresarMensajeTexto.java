package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.Mantener;
import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarMensajeTexto implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(MENU_CERTIFICADO),
		Mantener.elemento(MENU_MENSAJES, OPCION_MENSAJES_TEXTO, OPCION_MENSAJES_TEXTO_LISTADO));
		
	}
	
 public static IngresarMensajeTexto listado() {
	 return new IngresarMensajeTexto();
    }
 
}
