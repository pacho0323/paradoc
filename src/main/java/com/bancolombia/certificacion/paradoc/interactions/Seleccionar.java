package com.bancolombia.certificacion.paradoc.interactions;


import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.*;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Interaction{

	private String menu,submenu;
	
	public Seleccionar(String menu) {
		this.menu = menu;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(OPCION_CTRETEFTE_CERTIFICADO.called(menu).of(menu)),
				Click.on(ENCABEZADO_CTRETEFTE1.called(submenu).of(submenu))
				);
	}
	
	public static Seleccionar elMenu(String menu) {
		return Tasks.instrumented(Seleccionar.class, menu);
	}
	
	public Seleccionar yElSubmenu(String submenu) {
		this.submenu=submenu;
		return this;
	}

}
