package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SeInserto implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PaginaEncabezado.MSJ_INSERTADO).viewedBy(actor).asString();
	}
	
	public static SeInserto elEncabezadoReteica() {
		return new SeInserto();
	}
}
