package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.Copiar;
import com.bancolombia.certificacion.paradoc.utils.LeerRutas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CopiarInsumo implements Task {
	
	private String rutaSalidaCentinela;
	private String rutaServidorCentinela;
	private String rutaSalidaTarjetas;
	private String rutaServidorTarjetas;
	
	public CopiarInsumo() {
		LeerRutas leerrutas = new LeerRutas();
		rutaSalidaCentinela = leerrutas.propiedades("rutaSalidaCentinela");
		rutaServidorCentinela =leerrutas.propiedades("rutaServidorCentinela");
		rutaSalidaTarjetas = leerrutas.propiedades("rutaSalidaTarjetas");
		rutaServidorTarjetas = leerrutas.propiedades("rutaServidorTarjetas");
		}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Copiar.yPegarArchivosInsumos(rutaSalidaCentinela,rutaServidorCentinela,rutaSalidaTarjetas,rutaServidorTarjetas));
		//text.yPegarArchivosInsumos();
		
		
		//PaginaInsumo.CARPETACENTINELA.resolveFor(actor).click();
		//actor.attemptsTo(Click.on(PaginaInsumo.CARPETACENTINELA));
		//actor.attemptsTo(Copiar.archivosInsumos());
			}

	public static CopiarInsumo enOtraCarpeta() {
		return Tasks.instrumented(CopiarInsumo.class);
		}
}
