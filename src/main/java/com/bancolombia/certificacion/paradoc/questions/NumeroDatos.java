package com.bancolombia.certificacion.paradoc.questions;

import static com.bancolombia.certificacion.paradoc.userinterface.PaginaInsumo.COMPARACION_COLUMNA_ARCHIVOS;
import static com.bancolombia.certificacion.paradoc.userinterface.PaginaInsumo.COMPARACION_COLUMNA_ESTADO;

import java.util.Iterator;
import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NumeroDatos implements Question<Integer>{

	@Override
	public Integer answeredBy(Actor actor) {
		List<WebElementFacade> myElements = COMPARACION_COLUMNA_ESTADO.resolveAllFor(actor);
		
		List<WebElementFacade> info = COMPARACION_COLUMNA_ARCHIVOS.resolveAllFor(actor);
		Iterator<WebElementFacade> archivos = info.iterator();
		int c=0;
		
		for (WebElementFacade webElementFacade : myElements) {
			if ((webElementFacade.getText().contains("Aceptado")) || (webElementFacade.getText().contains("Con inconsistencias")) || (webElementFacade.getText().contains("Rechazado")) ) {
				c = c + Integer.parseInt(archivos.next().getText());
			}
		}return c;
	}

	
	public static NumeroDatos enParadoc() {
		return new NumeroDatos();
		}
	}


