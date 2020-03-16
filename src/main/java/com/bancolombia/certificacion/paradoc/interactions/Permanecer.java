package com.bancolombia.certificacion.paradoc.interactions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class Permanecer implements Interaction{

	private Target target1, target2;
	
	
	public Permanecer(Target target1, Target target2) {
		this.target1 = target1;
		this.target2 = target2;
	
	}

    private Actions action(Actor actor) {
    	return new Actions(BrowseTheWeb.as(actor).getDriver());
    }
    
	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElement element= target1.resolveFor(actor);
		WebElement element2= target2.resolveFor(actor);

		action(actor).moveToElement(element).perform();
		action(actor).moveToElement(element2).perform();
	
	}

	
	public static Permanecer PresionandoElemento(Target target1, Target target2) {
		return Tasks.instrumented(Permanecer.class , target1, target2);
	}
}
