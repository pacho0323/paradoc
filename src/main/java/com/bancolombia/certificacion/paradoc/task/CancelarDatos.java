package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.Esperar;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import com.bancolombia.certificacion.paradoc.utils.LeerCuadrante;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CancelarDatos implements Task{
  
	private String IdentificadorCuadranteCan;
	private String DescripcionCuadranteCan;
	private String Etiqueta1Can;
	private String Etiqueta2Can;
	private String Etiqueta3Can;
	private String Etiqueta4Can;
	private String MensajeCan;
	private String PrioridadCan;
	
	public CancelarDatos () {
		LeerCuadrante leercuadrante = new LeerCuadrante();
		IdentificadorCuadranteCan= leercuadrante.propiedades("IdentificadorCuadranteCan");
		DescripcionCuadranteCan=leercuadrante.propiedades("DescripcionCuadranteCan");
		Etiqueta1Can=leercuadrante.propiedades("Etiqueta1Can");
				Etiqueta2Can=leercuadrante.propiedades("Etiqueta2Can");
				Etiqueta3Can=leercuadrante.propiedades("Etiqueta3Can");
				Etiqueta4Can=leercuadrante.propiedades("Etiqueta4Can");
				MensajeCan=leercuadrante.propiedades("MensajeCan");
				PrioridadCan=leercuadrante.propiedades("PrioridadCan");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Click.on(PaginaCuadrante.MENU_CUADRANTE),
				Click.on(PaginaCuadrante.NUEVA_CONFIGURACION),
				Enter.theValue(IdentificadorCuadranteCan).into(PaginaCuadrante.IDENTIFICADOR_CUADRANTE),
				Enter.theValue(DescripcionCuadranteCan).into(PaginaCuadrante.DESCRIPCION_CUADRANTE),
				Enter.theValue(Etiqueta1Can).into(PaginaCuadrante.ETIQUETA_1),
				Click.on(PaginaCuadrante.CHK_1),
				Enter.theValue(Etiqueta2Can).into(PaginaCuadrante.ETIQUETA_2),
				Click.on(PaginaCuadrante.CHK_2),
				Enter.theValue(Etiqueta3Can).into(PaginaCuadrante.ETIQUETA_3),
				Click.on(PaginaCuadrante.CHK_3),
				Enter.theValue(Etiqueta4Can).into(PaginaCuadrante.ETIQUETA_4),
				Click.on(PaginaCuadrante.CHK_4),
				Enter.theValue(MensajeCan).into(PaginaCuadrante.MENSAJE),
				Enter.theValue(PrioridadCan).into(PaginaCuadrante.PRIORIDAD),
				Click.on(PaginaCuadrante.BTN_CANCELAR),
				Esperar.unTiempo(3000));
	
	}
	
	
	public static CancelarDatos deCuadrantes() {
		return Tasks.instrumented(CancelarDatos.class);
	}
}
