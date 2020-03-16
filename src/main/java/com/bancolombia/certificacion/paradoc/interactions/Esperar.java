package com.bancolombia.certificacion.paradoc.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Esperar implements Interaction {

	private int tiempo;
 
    public Esperar(int tiempo) {
           this.tiempo = tiempo;
    }
    
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		 InternalSystemClock clock = new InternalSystemClock();
         clock.pauseFor(tiempo);
	}

	public static Esperar unTiempo(int tiempo) {
        return Tasks.instrumented(Esperar.class, tiempo);
    }
}
