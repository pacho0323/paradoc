
	package com.bancolombia.certificacion.paradoc.task;

	import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.OPCION_CONCEPTO;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

	public class DescargarConceptosRetefuente implements Task{

		@Override
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(
					Click.on(OPCION_CONCEPTO),
					Click.on(PaginaCuadrante.BTN_DESCARGAR));
			
		}
		public static DescargarConceptosRetefuente aWindows() {
			return Tasks.instrumented(DescargarConceptosRetefuente.class);
		  }
	}

