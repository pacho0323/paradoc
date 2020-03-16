package com.bancolombia.certificacion.paradoc.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaEncabezado {

	public static final Target NUEVA_CONFIGURACION= Target.the("").locatedBy("//input[@id='btNew']");
	public static final Target CODIGO= Target.the("").locatedBy("//input[@id='textAdName']");
	public static final Target NOMBRE_COMPANIA= Target.the("").locatedBy("//input[@id='textField01']");
	public static final Target LOGO= Target.the("").locatedBy("//select[@id='ddField02']");
	public static final Target BTN_FECHA_EXP= Target.the("").locatedBy("//span[@class='input-group-addon']");
    public static final Target FECHA_DE_EXPEDICION= Target.the("").locatedBy("//div[@class=\"input-group date\"]/input");
    public static final Target FECHA_EXP= Target.the("").locatedBy("");
    public static final Target AGENTE_RETENEDOR= Target.the("").locatedBy("//input[@id='textField04']");
    public static final Target NIT= Target.the("").locatedBy("//input[@id='textField05']");
    public static final Target DIGITO_VERIFICACION= Target.the("").locatedBy("//input[@id='textField06']");
    public static final Target DIRECCION= Target.the("").locatedBy("//input[@id='textField07']");
    public static final Target MUNICIPIO_AGENTE_RETENEDOR= Target.the("").locatedBy("//input[@id='textField08']");
    public static final Target DEPARTAMENTO= Target.the("").locatedBy("//input[@id='textField09']");
    public static final Target CIUDAD_RETENCION= Target.the("").locatedBy("//input[@id='textField10']");
    public static final Target CIUDAD_GMF= Target.the("").locatedBy("//input[@id='textField11']");
    public static final Target ANO_GRAVABLE= Target.the("").locatedBy("//input[@id='textField12']");
    public static final Target COMPONENTE_INFLACIONARIO= Target.the("").locatedBy("//input[@id='textField13']");
    public static final Target BTN_ACEPTAR= Target.the("").locatedBy("//input[@id='btOk']");
    public static final Target MSJ_INSERTADO= Target.the("").locatedBy("//div[@id='DivError']");
    public static final Target COLUMNA_CODIGO= Target.the("").locatedBy("//tbody[@id='AditionaDataTable']/tr/td[1][contains(text(),'{0}')]");
    public static final Target COLUMNA_COMPANIA= Target.the("").locatedBy("//tbody[@id='AditionaDataTable']/tr/td[2]");
    public static final Target BTN_MODIFICAR= Target.the("").locatedBy("//input[@id='btUpdate']");
    public static final Target MSJ_ACTUALIZADO=Target.the("").locatedBy("//div[@id='DivError']");
    public static final Target BTN_ELIMINAR= Target.the("").locatedBy("//button[@id='btDelete']");
    public static final Target BTN_ELIM_SI= Target.the("").locatedBy("//div[@class='modal-footer']/button[@onclick='EliminarItem();']");
    public static final Target MSJ_ELIMINADO=Target.the("").locatedBy("//span[@id='lblError1']");
    public static final Target BTN_CANCELAR= Target.the("").locatedBy("//input[@id='btCancel'] ");
    public static final Target TXT_FILTRAR= Target.the("").locatedBy("//input[@id='filtroCliente']");
    public static final Target BTN_FILTRAR= Target.the("").locatedBy("//input[@id='btnFiltrar']");
    public static final Target BTN_DESCARGAR= Target.the("").locatedBy("//input[@id='btnExport']");
	public static final Target MENUENCABEZADO= Target.the("").locatedBy("//ul[@class=\"nav nav-pills\"]/li[1]/ul/li[7]/ul/li[8]/ul/li/a[.='Encabezado']");
	public static final Target OPCION_ENCABEZADO= Target.the("").locatedBy("//ul[@class=\"nav nav-pills\"]/li[1]/ul/li[7]/ul/li[10]/ul/li[1]/a[contains(text(),'Encabezado')]");
	public static final Target OPCION_ENCABEZADORETEIVA= Target.the("").locatedBy("//ul[@class=\"nav nav-pills\"]/li[1]/ul/li[7]/ul/li[9]/ul/li[1]/a[contains(text(),'Encabezado')]");    
}
