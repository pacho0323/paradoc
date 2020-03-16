package com.bancolombia.certificacion.paradoc.task;

import java.util.Iterator;
import java.util.List;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaMensajes;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerMensaje;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EliminarMensaje implements Task{
	
	private String NombreMsjTextoElim;

	public EliminarMensaje() {
		LeerMensaje leermensaje= new LeerMensaje();
		NombreMsjTextoElim = leermensaje.propiedades("NombreMsjTextoElim");
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> myElements = PaginaMensajes.COLUMNA_NOMBRE.resolveAllFor(actor);
		Iterator<WebElementFacade> archivos = myElements.iterator();
	
		for (WebElementFacade webElementFacade : myElements) {
			if (webElementFacade.getText().equals(NombreMsjTextoElim)){	
				webElementFacade.click();
				break;
				}			
			}
		actor.attemptsTo(Click.on(PaginaMensajes.BOTON_ELIMINAR));
		
	}
	
	public static EliminarMensaje deTexto() {
		return Tasks.instrumented(EliminarMensaje.class);
	  }

}
