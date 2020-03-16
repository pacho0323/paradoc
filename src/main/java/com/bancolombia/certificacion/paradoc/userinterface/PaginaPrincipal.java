package com.bancolombia.certificacion.paradoc.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {

		public static final Target MENU_CERTIFICADO= Target.the("Opcion Certificado del menu principal").locatedBy("//ul[@class=\"nav nav-pills\"]/li[1]/a[contains(text(),'{0}')]");
		public static final Target MENU_TARJETAS= Target.the("Opcion Tarjetas del menu principal").locatedBy("//ul[@class=\"nav nav-pills\"]/li[6]/a[contains(text(),'Tarjetas')]");
		public static final Target MENU_PROCESO= Target.the("Men? proceso de la opcion Tarjetas").locatedBy("//li[@class=\"dropdown open\"]/ul/li[5]/a[contains(text(),'Proceso')]");
		public static final Target OPCION_CONTROL_DE_PROCESO= Target.the("Opcion de proceso").locatedBy("//li[@class=\"dropdown open\"]/ul/li[5]/ul/li[2]/a[contains(text(),'Control de Proceso')]");
		public static final Target MENU_CONFIGURACION_CERTIFICADO= Target.the("").locatedBy("//a[contains(text(),'{0}')][1]");
		public static final Target OPCION_CTRETEFTE_CERTIFICADO= Target.the("").locatedBy("//a[contains(text(),'CT Retefuente')][1]");
		//public static final Target ENCABEZADO_CTRETEFTE1= Target.the("Opcion de encabezado").locatedBy("//*[@id=\"aspnetForm\"]/div[3]/div[4]/nav/ul/li[1]/ul/li[6]/ul/li[7]/ul/li[1]/a");
		public static final Target ENCABEZADO_CTRETEFTE1= Target.the("Opcion de encabezado").locatedBy("//*[@id='aspnetForm']/div[3]/div[4]/nav/ul/li[1]/ul/li[7]/ul/li[7]/ul/li[1]/a");
		public static final Target OPCION_CTRETEIVA_CERTIFICADO= Target.the("").locatedBy("//a[contains(text(),'CT ReteIVA')][1]");
		public static final Target ENCABEZADO_CTRETEIVA= Target.the("").locatedBy("//*[@id='aspnetForm']/div[3]/div[4]/nav/ul/li[1]/ul/li[7]/ul/li[8]/ul/li/a");
		public static final Target CUADRANTE_CTRETEFTE= Target.the("").locatedBy("//*[@id=\"aspnetForm\"]/div[3]/div[4]/nav/ul/li[1]/ul/li[7]/ul/li[7]/ul/li[2]/a");
		public static final Target OPCION_CTRETEICA_CERTIFICADO= Target.the("").locatedBy("//a[contains(text(),'CT ReteICA')][1]");
		public static final Target ENCABEZADO_CTRETEICA= Target.the("").locatedBy("//*[@id=\"aspnetForm\"]/div[3]/div[4]/nav/ul/li[1]/ul/li[7]/ul/li[9]/ul/li/a");
		public static final Target MENU_MENSAJES= Target.the("").locatedBy("//a[contains(text(),'Mensajes')][1]");
		public static final Target OPCION_MENSAJES_GRAFICOS= Target.the("").locatedBy("//a[contains(text(),'Mensajes Gr�ficos')][1]");
		public static final Target OPCION_MENSAJES_GRAFICOS_LISTADO= Target.the("").locatedBy("//a[contains(text(),'Listado')][1]");
		public static final Target OPCION_MENSAJES_TEXTO= Target.the("").locatedBy("//a[contains(text(),'Mensajes de Texto')][1]");
		public static final Target OPCION_MENSAJES_TEXTO_LISTADO= Target.the("").locatedBy("//*[@id='aspnetForm']/div[3]/div[4]/nav/ul/li[1]/ul/li[1]/ul/li[2]/ul/li[1]/a");
		public static final Target OPCION_CONCEPTO= Target.the("").locatedBy("//ul[@class=\"nav nav-pills\"]/li[1]/ul/li[7]/ul/li[8]/ul/li[3]/a[contains(text(),'Conceptos')]");
		public static final Target OPCION_CT= Target.the("").locatedBy("//ul[@class=\"nav nav-pills\"]/li[1]/ul/li[7]/ul/li/a[contains(text(),'{0}')]");
		public static final Target OPCION_CONCEPTORETEIVA= Target.the("").locatedBy("//ul[@class=\"nav nav-pills\"]/li[1]/ul/li[7]/ul/li[9]/ul/li[2]/a[contains(text(),'Conceptos')]");
		public static final Target OPCION_CONCEPTORETEICA= Target.the("").locatedBy("//ul[@class=\"nav nav-pills\"]/li[1]/ul/li[7]/ul/li[10]/ul/li[2]/a[contains(text(),'Conceptos')]");
		public static final Target FILTROCOLUMNACODIGO= Target.the("").locatedBy("//table[@id=\"tblCustomers\"]/tbody/tr/td[1][.='{0}']");
}
