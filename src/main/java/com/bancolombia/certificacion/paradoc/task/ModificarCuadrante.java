package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.BuscarElDato;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import com.bancolombia.certificacion.paradoc.utils.LeerCuadrante;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ModificarCuadrante implements Task{
  
	private String IdentificadorCuadranteFil;
	private String DescripcionCuadrante;
	private String Etiqueta1;
	private String Etiqueta2;
	private String Etiqueta3;
	private String Etiqueta4;
	private String Mensaje;
	private String Prioridad;
	
	public ModificarCuadrante () {
		LeerCuadrante leercuadrante = new LeerCuadrante();
		IdentificadorCuadranteFil= leercuadrante.propiedades("IdentificadorCuadranteFil");
		DescripcionCuadrante=leercuadrante.propiedades("DescripcionCuadrante");
		Etiqueta1=leercuadrante.propiedades("Etiqueta1");
				Etiqueta2=leercuadrante.propiedades("Etiqueta2");
				Etiqueta3=leercuadrante.propiedades("Etiqueta3");
				Etiqueta4=leercuadrante.propiedades("Etiqueta4");
				Mensaje=leercuadrante.propiedades("Mensaje");
				Prioridad=leercuadrante.propiedades("Prioridad");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(PaginaCuadrante.MENU_CUADRANTE),
				BuscarElDato.enLaTablaDelSistema(PaginaCuadrante.IDENTIFICADORDEL_CUADRANTE, PaginaConcepto.PAGINAS, IdentificadorCuadranteFil),
				Click.on(PaginaCuadrante.BTN_MODIFICAR),
				Enter.theValue(DescripcionCuadrante).into(PaginaCuadrante.DESCRIPCION_CUADRANTE),
				Enter.theValue(Etiqueta1).into(PaginaCuadrante.ETIQUETA_1),
				Click.on(PaginaCuadrante.CHK_1),
				Click.on(PaginaCuadrante.CHK_1),
				Enter.theValue(Etiqueta2).into(PaginaCuadrante.ETIQUETA_2),
				Click.on(PaginaCuadrante.CHK_2),
				Enter.theValue(Etiqueta3).into(PaginaCuadrante.ETIQUETA_3),
				Click.on(PaginaCuadrante.CHK_3),
				Enter.theValue(Etiqueta4).into(PaginaCuadrante.ETIQUETA_4),
				Click.on(PaginaCuadrante.CHK_4),
				Enter.theValue(Mensaje).into(PaginaCuadrante.MENSAJE),
				Enter.theValue(Prioridad).into(PaginaCuadrante.PRIORIDAD),
				Click.on(PaginaCuadrante.BTN_ACEPTAR)				
				);
		
	}
	
		
	public static ModificarCuadrante deRetefte() {
		return Tasks.instrumented(ModificarCuadrante.class);
	}
}
