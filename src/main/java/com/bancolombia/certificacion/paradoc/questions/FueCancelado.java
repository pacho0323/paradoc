package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class FueCancelado implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		if((PaginaCuadrante.IDENTIFICADOR_CUADRANTE.resolveFor(actor).isEnabled()) && (PaginaCuadrante.DESCRIPCION_CUADRANTE.resolveFor(actor).isEnabled()) 
			&& (PaginaCuadrante.ETIQUETA_1.resolveFor(actor).isEnabled()) && (PaginaCuadrante.ETIQUETA_2.resolveFor(actor).isEnabled()) && (PaginaCuadrante.ETIQUETA_3.resolveFor(actor).isEnabled())
			&& (PaginaCuadrante.ETIQUETA_4.resolveFor(actor).isEnabled()) && (PaginaCuadrante.MENSAJE.resolveFor(actor).isEnabled()) && (PaginaCuadrante.PRIORIDAD.resolveFor(actor).isEnabled())
			)  {
			return false;
		}
		return true;
	}

	public static FueCancelado elCuadrante() {
		return new FueCancelado();
	}
	
}
