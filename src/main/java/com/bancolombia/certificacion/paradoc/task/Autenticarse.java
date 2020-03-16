package com.bancolombia.certificacion.paradoc.task;

import com.bancolombia.certificacion.paradoc.interactions.IngresarCredencial;
import com.bancolombia.certificacion.paradoc.utils.LeerArchivo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Autenticarse implements Task {

	
	private String usuario;
	private String clave;
	
	public Autenticarse() {
		LeerArchivo leerarchivo = new LeerArchivo();
		usuario = leerarchivo.propiedades("usuario");
		clave = leerarchivo.propiedades("clave");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(IngresarCredencial.con(usuario, clave,5000));
		
	}

	public static Autenticarse enPopUp() {
	return Tasks.instrumented(Autenticarse.class);
	}
	
}
