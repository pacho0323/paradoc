package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.Presionar;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Desplegar implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(PaginaPrincipal.MENU_TARJETAS)
				,Presionar.elemento(PaginaPrincipal.MENU_PROCESO),
       Click.on(PaginaPrincipal.OPCION_CONTROL_DE_PROCESO)
				);
	
	}
	
	public static Desplegar menu() {
		return new Desplegar();
	}

}
