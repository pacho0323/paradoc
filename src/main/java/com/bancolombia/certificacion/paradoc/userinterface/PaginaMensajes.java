package com.bancolombia.certificacion.paradoc.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaMensajes {

	public static final Target MENSAJE_NUEVO= Target.the("").locatedBy("//input[@id='ctl00_ContentPlaceHolder1_btNew']");
	public static final Target NOMBRE_MENSAJE_GRAFICO= Target.the("").locatedBy("//input[@id='ctl00_ContentPlaceHolder1_txbName']");
	public static final Target TIPO_MENSAJE_GRAFICO= Target.the("").locatedBy("//select[@id='ctl00_ContentPlaceHolder1_ddlMessageType']");
	public static final Target CODIGO_MENSAJE_GRAFICO= Target.the("").locatedBy("//input[@id='ctl00_ContentPlaceHolder1_txbCode']");
	public static final Target BOTON_MENSAJE_GRAFICO= Target.the("").locatedBy("//input[@id='ctl00_ContentPlaceHolder1_FileUpload']");
	public static final Target BOTON_ACEPTAR= Target.the("").locatedBy("//input[@id='ctl00_ContentPlaceHolder1_btOkNew']");
	public static final Target BOTON_ELIMINAR= Target.the("").locatedBy("//input[@id='ctl00_ContentPlaceHolder1_btDelete']");
	public static final Target BOTON_CANCELAR= Target.the("").locatedBy("//input[@id='ctl00_ContentPlaceHolder1_btCancel']");
	public static final Target BOTON_MODIFICAR= Target.the("").locatedBy("//input[@id='ctl00_ContentPlaceHolder1_btUpdate']");
	public static final Target MSJ= Target.the("").locatedBy("//span[@id='ctl00_ContentPlaceHolder1_lblError']");                                           
	public static final Target MSJ_GRAFICO_COLUMNA_CODIGO= Target.the("").locatedBy("//table[@id='ctl00_ContentPlaceHolder1_gridViewMessages']/tbody/tr/td[2]");
	public static final Target TIPO_MSJ_TEXTO= Target.the("").locatedBy("//select[@id='ctl00_ContentPlaceHolder1_ddlMessageType']");
	public static final Target NOMBRE_MSJ_TEXTO= Target.the("").locatedBy("//input[@id='ctl00_ContentPlaceHolder1_txbName']");
	public static final Target TEXTO_MSJ_TEXTO= Target.the("").locatedBy("//textarea[@id='ctl00_ContentPlaceHolder1_txbContent']");
	public static final Target COLUMNA_NOMBRE= Target.the("").locatedBy("//table[@id='ctl00_ContentPlaceHolder1_gridViewMessages']//tbody/tr/td[1]");
	public static final Target BOTON_ACEPTARMODIFICAR= Target.the("").locatedBy("//input[@id='ctl00_ContentPlaceHolder1_btOkUpdate']");
	
}
