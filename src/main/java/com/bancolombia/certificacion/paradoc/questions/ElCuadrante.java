package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElCuadrante implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PaginaCuadrante.MSJ_INSERTADO).viewedBy(actor).asString();
	}
	
	public static ElCuadrante seGuardo() {
		return new ElCuadrante();
	}
}
