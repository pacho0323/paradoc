package com.bancolombia.certificacion.paradoc.task;

import java.util.Iterator;
import java.util.List;

import com.bancolombia.certificacion.paradoc.interactions.Esperar;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaMensajes;
import com.bancolombia.certificacion.paradoc.utils.LeerMensaje;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ModificarMensaje implements Task{
  
	private String NombreMsjTextoFil;
	private String TipoMensajeTextoMod;
	private String NombreMsjTextoMod;
	private String TextoMod;
	
	
	public ModificarMensaje () {
		LeerMensaje Leermensaje = new LeerMensaje();
		NombreMsjTextoFil= Leermensaje.propiedades("NombreMsjTextoFil");
		TipoMensajeTextoMod= Leermensaje.propiedades("TipoMensajeTextoMod");
		NombreMsjTextoMod=Leermensaje.propiedades("NombreMsjTextoMod");
		TextoMod=Leermensaje.propiedades("TextoMod");
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		List<WebElementFacade> myElements = PaginaMensajes.COLUMNA_NOMBRE.resolveAllFor(actor);
		Iterator<WebElementFacade> archivos = myElements.iterator();
	
		for (WebElementFacade webElementFacade : myElements) {
			if (webElementFacade.getText().equals(NombreMsjTextoFil)){	
				webElementFacade.click();
				break;
				}			
			}
		
		actor.attemptsTo(Click.on(PaginaMensajes.BOTON_MODIFICAR),

				Enter.theValue(NombreMsjTextoMod).into(PaginaMensajes.NOMBRE_MSJ_TEXTO),
				Enter.theValue(TextoMod).into(PaginaMensajes.TEXTO_MSJ_TEXTO),
				Click.on(PaginaMensajes.BOTON_ACEPTARMODIFICAR),
				Esperar.unTiempo(3000));
	
	}
	
	
	public static ModificarMensaje deTexto() {
		return Tasks.instrumented(ModificarMensaje.class);
	}
}
