package com.bancolombia.certificacion.paradoc.task;


import com.bancolombia.certificacion.paradoc.userinterface.PaginaMensajes;
import com.bancolombia.certificacion.paradoc.utils.LeerMensaje;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InfoMsjTexto implements Task{

	private String TipoMensajeTexto;
	private String NombreMsjTexto;
	private String Texto;
	
	public InfoMsjTexto() {
		LeerMensaje leermensaje = new LeerMensaje();
		TipoMensajeTexto = leermensaje.propiedades("TipoMensajeTexto");
		NombreMsjTexto =leermensaje.propiedades("NombreMsjTexto");
		Texto =leermensaje.propiedades("Texto");
		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(PaginaMensajes.MENSAJE_NUEVO),
				Click.on(PaginaMensajes.TIPO_MSJ_TEXTO.of(TipoMensajeTexto)),
				Enter.theValue(NombreMsjTexto).into(PaginaMensajes.NOMBRE_MSJ_TEXTO),
				Enter.theValue(Texto).into(PaginaMensajes.TEXTO_MSJ_TEXTO),
				Click.on(PaginaMensajes.BOTON_ACEPTAR));
		
	}

	public static InfoMsjTexto seIngresa() {
		return Tasks.instrumented(InfoMsjTexto.class);
	}

}
