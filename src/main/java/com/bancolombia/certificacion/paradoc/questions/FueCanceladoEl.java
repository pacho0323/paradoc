package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaMensajes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class FueCanceladoEl implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		if((PaginaMensajes.NOMBRE_MSJ_TEXTO.resolveFor(actor).equals("")) && (PaginaMensajes.TEXTO_MSJ_TEXTO.resolveFor(actor).equals("")))  {
			return false;
		}
		return true;
	}

	public static FueCanceladoEl elMensaje() {
		return new FueCanceladoEl();
	}
	
}
