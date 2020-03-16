package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaMensajes;
import com.bancolombia.certificacion.paradoc.utils.LeerMensaje;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CancelarEl implements Task{

	private String TipoMensajecan;
	private String Nombrecan;
	private String Codigocan;
	private String Rutacan;
	
	public CancelarEl() {
		LeerMensaje leermensaje = new LeerMensaje();
		TipoMensajecan = leermensaje.propiedades("TipoMensajecan");
		Nombrecan =leermensaje.propiedades("Nombrecan");
		Codigocan =leermensaje.propiedades("Codigocan");
		Rutacan= leermensaje.propiedades("Rutacan");
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PaginaMensajes.MENSAJE_NUEVO),
				Click.on(PaginaMensajes.TIPO_MENSAJE_GRAFICO.of(TipoMensajecan)),
				Enter.theValue(Nombrecan).into(PaginaMensajes.NOMBRE_MENSAJE_GRAFICO),
				Enter.theValue(Codigocan).into(PaginaMensajes.CODIGO_MENSAJE_GRAFICO));
				PaginaMensajes.BOTON_MENSAJE_GRAFICO.resolveFor(actor).sendKeys(Rutacan);
				
			actor.attemptsTo(Click.on(PaginaMensajes.BOTON_CANCELAR));
			}

	
	public static CancelarEl mensajeGrafico() {
		return Tasks.instrumented(CancelarEl.class);
	}
}
