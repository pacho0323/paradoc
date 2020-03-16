package com.bancolombia.certificacion.paradoc.interactions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Presionar implements Interaction{

	private Target target;
	
	
	public Presionar(Target target) {
		this.target = target;
	}

    private Actions action(Actor actor) {
    	return new Actions(BrowseTheWeb.as(actor).getDriver());
    }
    
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		WebElement element= target.resolveFor(actor);
		action(actor).clickAndHold(element).build().perform();

	}

	
	public static Presionar elemento(Target target) {
		return Tasks.instrumented(Presionar.class , target);
	}
}
