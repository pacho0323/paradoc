package com.bancolombia.certificacion.paradoc.task;

import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.OPCION_CONCEPTORETEICA;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

	public class DescargarConceptosReteica implements Task{

		@Override
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(
					Click.on(OPCION_CONCEPTORETEICA),
					Click.on(PaginaCuadrante.BTN_DESCARGAR));
			
		}
		public static DescargarConceptosReteica aWindows() {
			return Tasks.instrumented(DescargarConceptosReteica.class);
		  }
	}

