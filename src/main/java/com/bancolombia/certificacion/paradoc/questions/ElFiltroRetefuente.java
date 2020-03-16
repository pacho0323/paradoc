package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

	public class ElFiltroRetefuente implements Question<String> {
     private String codigo;
     public ElFiltroRetefuente(String codigo) {
	this.codigo=codigo;
}
		@Override
		public String answeredBy(Actor actor) {
			return Text.of(PaginaPrincipal.FILTROCOLUMNACODIGO.of(codigo)).viewedBy(actor).asString();
		}
		
		public static ElFiltroRetefuente fue(String codigo) {
			return new ElFiltroRetefuente(codigo);
		}
	}
