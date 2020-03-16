package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.Esperar;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaMensajes;
import com.bancolombia.certificacion.paradoc.utils.LeerCuadrante;
import com.bancolombia.certificacion.paradoc.utils.LeerMensaje;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CancelarMensaje implements Task{
  
	//private String TipoMensajeTextoCan;
	private String NombreMsjTextoCan;
	private String TextoCan;

			
	public CancelarMensaje () {
		LeerMensaje leermensaje = new LeerMensaje();
		//TipoMensajeTextoCan= leermensaje.propiedades("TipoMensajeTextoCan");
		NombreMsjTextoCan=leermensaje.propiedades("NombreMsjTextoCan");
		TextoCan=leermensaje.propiedades("TextoCan");
			}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(PaginaMensajes.MENSAJE_NUEVO),
				//Enter.theValue(TipoMensajeTextoCan).into(PaginaMensajes.TIPO_MSJ_TEXTO),
				Enter.theValue(NombreMsjTextoCan).into(PaginaMensajes.NOMBRE_MSJ_TEXTO),
				Enter.theValue(TextoCan).into(PaginaMensajes.TEXTO_MSJ_TEXTO),
				Click.on(PaginaMensajes.BOTON_CANCELAR),
				Esperar.unTiempo(3000));
	
	}
	
	
	public static CancelarMensaje deTexto() {
		return Tasks.instrumented(CancelarMensaje.class);
	}
}
