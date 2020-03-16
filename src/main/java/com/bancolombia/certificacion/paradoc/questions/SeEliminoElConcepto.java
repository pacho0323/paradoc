package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

	public class SeEliminoElConcepto implements Question<String> {

		@Override
		public String answeredBy(Actor actor) {
			String mensaje= Text.of(PaginaConcepto.MSJ_INSERTADO).viewedBy(actor).asString();
			String aux= mensaje.split("fue ")[1];
			System.out.println(aux);
			 return aux;
		}
		
		public static SeEliminoElConcepto delSistema() {
			return new SeEliminoElConcepto();
		}
	}

