package com.bancolombia.certificacion.paradoc.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;

public class FueFiltrado implements Question<String>{

	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PaginaCuadrante.COLUMNA_DESCRIPCION_CUADRANTE).viewedBy(actor).asString();

	}

	public static FueFiltrado elCuadrante() {
		return new FueFiltrado();
	}
}
