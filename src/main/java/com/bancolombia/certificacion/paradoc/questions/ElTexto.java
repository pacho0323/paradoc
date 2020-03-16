package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElTexto implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(PaginaPrincipal.MENU_CERTIFICADO).viewedBy(actor).asString();	}
    
	public static ElTexto delMenu() {
		return new ElTexto();
	}
}
