package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElConcepto implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PaginaConcepto.MSJ_INSERTADO).viewedBy(actor).asString();
	}
	
	public static ElConcepto seGuardo() {
		return new ElConcepto();
	}
}
