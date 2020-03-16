package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaMensajes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SeCanceloEl implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		if((PaginaMensajes.NOMBRE_MENSAJE_GRAFICO.resolveFor(actor).isEnabled()) && (PaginaMensajes.CODIGO_MENSAJE_GRAFICO.resolveFor(actor).isEnabled())
	)  {
		return false;
	}
	return true;
}
	public static SeCanceloEl mensajeGrafico() {
		return new SeCanceloEl();
	}
}
