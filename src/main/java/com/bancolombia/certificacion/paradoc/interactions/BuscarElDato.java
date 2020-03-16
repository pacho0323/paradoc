package com.bancolombia.certificacion.paradoc.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

	public class BuscarElDato implements Interaction {
    private Target target, target1;
    private String datoBuscar;
		
		public BuscarElDato(Target target, Target target1, String datoBuscar) {
		this.target = target;
		this.target1 = target1;
		this.datoBuscar = datoBuscar;
	}

		@Override
		public <T extends Actor> void performAs(T actor) {

			boolean a=true;
			int b=1;
			while(a) {
			       if(target.of(datoBuscar).resolveFor(actor).isPresent()) {
			    	   actor.attemptsTo(Click.on(target.of(datoBuscar)));
			    	   a=false;
			       }else {
			    	   actor.attemptsTo(Click.on(target1.of(String.valueOf(b))));  
			       }
			       
			     b++;  
			}
			
		}
		
		public static BuscarElDato enLaTablaDelSistema(Target target, Target target1, String datoBuscar) {
			return Tasks.instrumented(BuscarElDato.class, target, target1, datoBuscar);
			
			}

	}

