package com.bancolombia.certificacion.paradoc.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaConcepto {

	public static final Target NUEVA_CONFIGURACION= Target.the("").locatedBy("//input[@id='btNew']");
	public static final Target TIPO_CERTIFICADO= Target.the("").located(By.id("ddCerTributario"));
	public static final Target SELECCIONAR_CERTIFICADO= Target.the("").locatedBy("//select[@id='ddCerTributario']/option[contains(text(),'{0}')]");
	public static final Target CUADRANTE= Target.the("").locatedBy("//select[@id=\"ddCuadrante\"]");
	public static final Target CUADRANTE_CONCEPTO= Target.the("").locatedBy("//select[@id='ddCuadrante']/option[contains(text(),'{0}')]");
	public static final Target CODIGO_CONCEPTO= Target.the("").locatedBy("//input[@id='textAdName']");
	public static final Target DESCRIPCION_CONCEPTO= Target.the("").locatedBy("//input[@id='textField03']");
	public static final Target TOTAL= Target.the("").located(By.id("ddEsTotal"));
	public static final Target ES_TOTAL= Target.the("").locatedBy("//select[@id='ddEsTotal']/option[contains(text(),'{0}')]");
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
    public static final Target COLUMNA_CODIGO_CONCEPTO= Target.the("").locatedBy("//tbody[@id=\"AditionaDataTable\"]/tr/td[1]");
    public static final Target BTN_SIGUIENTE= Target.the("").locatedBy("//ul[@class=\"pagination pagination-sm\"]/li[@class=\"\"]/a[1]");
    public static final Target PAGE1= Target.the("").locatedBy("//ul[@class=\"pagination pagination-sm\"]/li[@class=\"\"]/a[@pagenum=\"0\"]");
    public static final Target PAGINAS= Target.the("").locatedBy("//ul[@class=\"pagination pagination-sm\"]/li[@class=\"\"]/a[@pagenum='{0}']");
   // public static final Target DATOS= Target.the("").locatedBy("//table[@id='tblCustomers']/tbody/tr/td[1][.='{0}']");
    public static final Target BTNELIMINAR= Target.the("").locatedBy("//div[@class=\"modal-content\"]/div[3]/button[1]");
    public static final Target LOCALIZARCODIGO= Target.the("").locatedBy("//tbody[@id=\"AditionaDataTable\"]/tr/td[.='{0}']");
    }
