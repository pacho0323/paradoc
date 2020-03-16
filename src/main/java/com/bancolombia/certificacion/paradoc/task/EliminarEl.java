package com.bancolombia.certificacion.paradoc.task;

import java.util.Iterator;
import java.util.List;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaMensajes;
import com.bancolombia.certificacion.paradoc.utils.LeerMensaje;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EliminarEl implements Task{

	
	private String CodigoEli;
	
	public EliminarEl() {
		LeerMensaje leermensaje = new LeerMensaje();
		CodigoEli = leermensaje.propiedades("CodigoEli");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> myElements = PaginaMensajes.MSJ_GRAFICO_COLUMNA_CODIGO.resolveAllFor(actor);
		Iterator<WebElementFacade> archivos = myElements.iterator();
	
		for (WebElementFacade webElementFacade : myElements) {
			if (webElementFacade.getText().equals(CodigoEli)){	
				webElementFacade.click();
				break;
				}			
			}
		actor.attemptsTo(Click.on(PaginaMensajes.BOTON_ELIMINAR));
		
		
	}

	public static EliminarEl MensajeGrafico() {
		return Tasks.instrumented(EliminarEl.class);
	  }
}
