package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class CancelarConceptoRetefuente implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		if((PaginaConcepto.CUADRANTE.resolveFor(actor).isEnabled()) && (PaginaConcepto.CODIGO_CONCEPTO.resolveFor(actor).isEnabled()) 
			&& (PaginaConcepto.DESCRIPCION_CONCEPTO.resolveFor(actor).isEnabled()) && (PaginaConcepto.TOTAL.resolveFor(actor).isEnabled()) && (PaginaCuadrante.BTN_CANCELAR.resolveFor(actor).isEnabled())
			)  {
			return false;
		}else {
				return true;
			}
		
	}

	public static CancelarConceptoRetefuente enElSistema() {
		return new CancelarConceptoRetefuente();
	}
	
}
