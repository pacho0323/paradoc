package com.bancolombia.certificacion.paradoc.task;


import com.bancolombia.certificacion.paradoc.userinterface.PaginaMensajes;
import com.bancolombia.certificacion.paradoc.utils.LeerMensaje;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InfoMsjGrafico implements Task{

	private String TipoMensaje;
	private String Nombre;
	private String Codigo;
	private String Ruta;
	
	public InfoMsjGrafico() {
		LeerMensaje leermensaje = new LeerMensaje();
		TipoMensaje = leermensaje.propiedades("TipoMensaje");
		Nombre =leermensaje.propiedades("Nombre");
		Codigo =leermensaje.propiedades("Codigo");
		Ruta= leermensaje.propiedades("Ruta");
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(PaginaMensajes.MENSAJE_NUEVO),
				Click.on(PaginaMensajes.TIPO_MENSAJE_GRAFICO.of(TipoMensaje)),
				Enter.theValue(Nombre).into(PaginaMensajes.NOMBRE_MENSAJE_GRAFICO),
				Enter.theValue(Codigo).into(PaginaMensajes.CODIGO_MENSAJE_GRAFICO));
				PaginaMensajes.BOTON_MENSAJE_GRAFICO.resolveFor(actor).sendKeys(Ruta);
				
			actor.attemptsTo(Click.on(PaginaMensajes.BOTON_ACEPTAR));
		
	}

	public static InfoMsjGrafico seIngresa() {
		return Tasks.instrumented(InfoMsjGrafico.class);
	}

}
