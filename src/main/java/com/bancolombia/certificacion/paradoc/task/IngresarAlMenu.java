package com.bancolombia.certificacion.paradoc.task;


import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.MENU_CERTIFICADO;
import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.MENU_CONFIGURACION_CERTIFICADO;
import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.OPCION_CT;

import com.bancolombia.certificacion.paradoc.interactions.Permanecer;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarAlMenu implements Task{
private String Opcion1, Opcion2, Opcion3;
	 
	public IngresarAlMenu(String Opcion1, String Opcion2, String Opcion3) {
	this.Opcion1 = Opcion1;
	this.Opcion2 = Opcion2;
	this.Opcion3 = Opcion3;
}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub

		actor.attemptsTo(Click.on(MENU_CERTIFICADO.of(Opcion1)));
		actor.attemptsTo(Permanecer.PresionandoElemento(MENU_CONFIGURACION_CERTIFICADO.of(Opcion2),OPCION_CT.of(Opcion3))
				);
	}

	public static IngresarAlMenu opcion(String Opcion1, String Opcion2, String Opcion3) {
		return new IngresarAlMenu(Opcion1, Opcion2, Opcion3);
	}
}

