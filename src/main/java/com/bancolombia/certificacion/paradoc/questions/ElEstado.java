package com.bancolombia.certificacion.paradoc.questions;

import static com.bancolombia.certificacion.paradoc.userinterface.PaginaInsumo.COMPARACION_COLUMNA_ESTADO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElEstado implements Question<Boolean>{

	private String estado;
	
	
	public ElEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
	     
		return Text.of(COMPARACION_COLUMNA_ESTADO).viewedBy(actor).asList().contains(estado);
	}
		
	public static ElEstado esta(String estado) {
		return new ElEstado(estado);
	  }

}
