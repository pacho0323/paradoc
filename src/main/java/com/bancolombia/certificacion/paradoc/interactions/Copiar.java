package com.bancolombia.certificacion.paradoc.interactions;

import java.io.IOException;

import com.bancolombia.certificacion.paradoc.utils.LeerRutas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Copiar implements Interaction {

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		LeerRutas leerrutas = new LeerRutas();

		try {
			String [] args2= {"CMD","/C","COPY","/Y",leerrutas.propiedades("rutaSalidaCentinela"),leerrutas.propiedades("rutaServidorCentinela")};
			String [] args3= {"CMD","/C","COPY","/Y",leerrutas.propiedades("rutaSalidaTarjetas"),leerrutas.propiedades("rutaServidorTarjetas")};
			Process p = Runtime.getRuntime().exec(args2);
			Process c = Runtime.getRuntime().exec(args3);
			p.waitFor();
			c.waitFor();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static Copiar yPegarArchivosInsumos(String rutaSalidaCentinela, String rutaServidorCentinela, String rutaSalidaTarjetas, String rutaServidorTarjetas) {
		return Tasks.instrumented(Copiar.class, rutaSalidaCentinela,rutaServidorCentinela,rutaSalidaTarjetas,rutaServidorTarjetas);
		
		}

}
