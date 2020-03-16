package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FueEliminado implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PaginaCuadrante.MSJ_ELIMINADO).viewedBy(actor).asString();
	}
	
	public static FueEliminado elCuadrante() {
		return new FueEliminado();
	}

}
