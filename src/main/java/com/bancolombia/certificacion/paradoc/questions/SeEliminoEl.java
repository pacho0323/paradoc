package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaMensajes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SeEliminoEl implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
	return Text.of(PaginaMensajes.MSJ).viewedBy(actor).asString();
	}

	public static SeEliminoEl elMensajeGrafico() {
		return new SeEliminoEl();
	}
}
