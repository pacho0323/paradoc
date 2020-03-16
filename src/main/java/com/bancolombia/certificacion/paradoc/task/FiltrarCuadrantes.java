package com.bancolombia.certificacion.paradoc.task;

import java.util.Iterator;
import java.util.List;

import com.bancolombia.certificacion.paradoc.interactions.Esperar;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;
import com.bancolombia.certificacion.paradoc.utils.LeerCuadrante;
import com.bancolombia.certificacion.paradoc.utils.LeerEncabezado;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FiltrarCuadrantes implements Task{

	private String IdentificadorCuadrante;
	//private String NombreCompaniaBus;
	
	public FiltrarCuadrantes () {
		LeerCuadrante leercuadrante = new LeerCuadrante();
		IdentificadorCuadrante = leercuadrante.propiedades("IdentificadorCuadrante");
			}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PaginaCuadrante.MENU_CUADRANTE));
		actor.attemptsTo(Enter.theValue(IdentificadorCuadrante).into(PaginaCuadrante.TXT_FILTRAR),
				Click.on(PaginaCuadrante.BTN_FILTRAR));
		
		List<WebElementFacade> myElements = PaginaCuadrante.COLUMNA_CODIGO_CUADRANTE.resolveAllFor(actor);
		
		Iterator<WebElementFacade> archivos = myElements.iterator();
		for (WebElementFacade webElementFacade : myElements) {
			if (webElementFacade.getText().equals(IdentificadorCuadrante)) {	
				webElementFacade.click();
				Esperar.unTiempo(5000);
				}			
			}
			}
	
   public static FiltrarCuadrantes deRetefte() {
   return Tasks.instrumented(FiltrarCuadrantes.class);
   }
  
   
}
