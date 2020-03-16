package com.bancolombia.certificacion.paradoc.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;

public class SeFiltro implements Question<String>{

	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PaginaEncabezado.COLUMNA_COMPANIA).viewedBy(actor).asString();

	}

	public static SeFiltro elCodigo() {
		return new SeFiltro();
	}
}
