package com.bancolombia.certificacion.paradoc.questions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaEncabezado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class SeCancelo implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		if((PaginaEncabezado.CODIGO.resolveFor(actor).isEnabled()) && (PaginaEncabezado.NOMBRE_COMPANIA.resolveFor(actor).isEnabled()) 
			&& (PaginaEncabezado.LOGO.resolveFor(actor).isEnabled()) && (PaginaEncabezado.AGENTE_RETENEDOR.resolveFor(actor).isEnabled()) && (PaginaEncabezado.NIT.resolveFor(actor).isEnabled())
			&& (PaginaEncabezado.DIGITO_VERIFICACION.resolveFor(actor).isEnabled()) && (PaginaEncabezado.DIRECCION.resolveFor(actor).isEnabled()) && (PaginaEncabezado.MUNICIPIO_AGENTE_RETENEDOR.resolveFor(actor).isEnabled())
			&& (PaginaEncabezado.DEPARTAMENTO.resolveFor(actor).isEnabled()) && (PaginaEncabezado.CIUDAD_RETENCION.resolveFor(actor).isEnabled()) && (PaginaEncabezado.CIUDAD_GMF.resolveFor(actor).isEnabled())
			&& (PaginaEncabezado.ANO_GRAVABLE.resolveFor(actor).isEnabled()) && (PaginaEncabezado.COMPONENTE_INFLACIONARIO.resolveFor(actor).isEnabled()))  {
			return false;
		}
		return true;
	}

	public static SeCancelo elEncabezado() {
		return new SeCancelo();
	}
	
}
