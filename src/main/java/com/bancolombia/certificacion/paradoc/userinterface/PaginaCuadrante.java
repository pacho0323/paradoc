package com.bancolombia.certificacion.paradoc.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaCuadrante {

	public static final Target NUEVA_CONFIGURACION= Target.the("").locatedBy("//input[@id='btNew']");
	public static final Target IDENTIFICADOR_CUADRANTE= Target.the("").locatedBy("//input[@id='textAdName']");
	public static final Target DESCRIPCION_CUADRANTE= Target.the("").locatedBy("//input[@id='textField01']");
	public static final Target ETIQUETA_1= Target.the("").locatedBy("//input[@id='textField02']");
	public static final Target ETIQUETA_2= Target.the("").locatedBy("//input[@id='textField03']");
    public static final Target ETIQUETA_3= Target.the("").locatedBy("//input[@id='textField04']");
    public static final Target ETIQUETA_4= Target.the("").locatedBy("//input[@id='textField05']");
    public static final Target MENSAJE= Target.the("").locatedBy("//textarea[@id='textFieldData']");
    public static final Target PRIORIDAD= Target.the("").locatedBy("//input[@id='textFieldType']");
    public static final Target CHK_1= Target.the("").locatedBy("//input[@id='myCheck01']");
    public static final Target CHK_2= Target.the("").locatedBy("//input[@id='myCheck02']");
    public static final Target CHK_3= Target.the("").locatedBy("//input[@id='myCheck03']");
    public static final Target CHK_4= Target.the("").locatedBy("//input[@id='myCheck04']");
    public static final Target BTN_ACEPTAR= Target.the("").locatedBy("//input[@id='btOk']");
    public static final Target BTN_MODIFICAR= Target.the("").locatedBy("//input[@id='btUpdate']");
    public static final Target BTN_ELIMINAR= Target.the("").locatedBy("//button[@id='btDelete']");
    public static final Target BTN_FILTRAR= Target.the("").locatedBy("//input[@id='btnFiltrar']");
    public static final Target BTN_DESCARGAR= Target.the("").locatedBy("//input[@id='btnExport']");
    public static final Target BTN_CANCELAR= Target.the("").locatedBy("//input[@id='btCancel'] ");
    public static final Target MSJ_INSERTADO= Target.the("").locatedBy("//span[@id='lblError1']");
   public static final Target COLUMNA_CODIGO_CUADRANTE= Target.the("").locatedBy("//tbody[@id='AditionaDataTable']/tr/td[2]");
    public static final Target COLUMNA_DESCRIPCION_CUADRANTE= Target.the("").locatedBy("//tbody[@id='AditionaDataTable']/tr/td[1]");
    public static final Target MSJ_ACTUALIZADO_CUADRANTE=Target.the("").locatedBy("//span[@id='lblError1']");
    public static final Target BTN_ELIM_SI= Target.the("").locatedBy("//div[@class='modal-footer']/button[@onclick='EliminarItem();']");
    public static final Target MSJ_ELIMINADO=Target.the("").locatedBy("//span[@id='lblError1']");
    public static final Target TXT_FILTRAR= Target.the("").locatedBy("//input[@id='filtroCliente']");
    public static final Target MENU_CUADRANTE= Target.the("").locatedBy("//ul[@class=\"nav nav-pills\"]/li[1]/ul/li[7]/ul/li[8]/ul/li[2]/a[contains(text(),'Cuadrante')]");
    public static final Target IDENTIFICADORDEL_CUADRANTE= Target.the("").locatedBy("//tbody[@id='AditionaDataTable']/tr/td[2][.='{0}']");
    
    }
