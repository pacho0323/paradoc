package com.bancolombia.certificacion.paradoc.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInsumo {

	public static final Target COMPARACION_COLUMNA_ARCHIVOS = Target.the("").locatedBy("//table[@id='ctl00_ContentPlaceHolder1_GridViewDatos']//tbody//td[2]");
	public static final Target COMPARACION_COLUMNA_ESTADO = Target.the("").locatedBy("//table[@id='ctl00_ContentPlaceHolder1_GridViewDatos']//tbody//td[5]");
}
