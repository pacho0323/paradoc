package com.bancolombia.certificacion.paradoc.task;

import java.util.Iterator;
import java.util.List;

import com.bancolombia.certificacion.paradoc.interactions.Esperar;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FiltrarRtefte implements Task{

	private String CodigoBuscar;
	//private String NombreCompaniaBus;
	
	public FiltrarRtefte () {
		LeerEncabezado leerencabezado = new LeerEncabezado();
		CodigoBuscar = leerencabezado.propiedades("CodigoBuscar");
			}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PaginaEncabezado.MENUENCABEZADO));
		actor.attemptsTo(Enter.theValue(CodigoBuscar).into(PaginaEncabezado.TXT_FILTRAR),
				Click.on(PaginaEncabezado.BTN_FILTRAR));
		
		List<WebElementFacade> myElements = PaginaEncabezado.COLUMNA_CODIGO.resolveAllFor(actor);
		
		Iterator<WebElementFacade> archivos = myElements.iterator();
		for (WebElementFacade webElementFacade : myElements) {
			if (webElementFacade.getText().equals(CodigoBuscar)) {	
				webElementFacade.click();
				Esperar.unTiempo(5000);
				}			
			}
			}
	
   public static FiltrarRtefte enElEncabezado() {
   return Tasks.instrumented(FiltrarRtefte.class);
   }
  
   
}
