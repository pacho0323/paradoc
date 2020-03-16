package com.bancolombia.certificacion.paradoc.task;

import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.OPCION_CONCEPTO;

import com.bancolombia.certificacion.paradoc.interactions.BuscarElDato;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.utils.LeerConcepto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EliminarConcepto implements Task {
	private String CodigoFiltrarEl;
	
	public EliminarConcepto () {
		LeerConcepto leerconcepto = new LeerConcepto();
		CodigoFiltrarEl= leerconcepto.propiedades("CodigoFiltrarEl");
	   
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(Click.on(OPCION_CONCEPTO),
				BuscarElDato.enLaTablaDelSistema(PaginaConcepto.LOCALIZARCODIGO,PaginaConcepto.PAGINAS,CodigoFiltrarEl),
				Click.on(PaginaConcepto.BTN_ELIMINAR),
				Click.on(PaginaConcepto.BTNELIMINAR)
				);
	
	}
	public static EliminarConcepto deRetefte() {
		return Tasks.instrumented(EliminarConcepto.class);
	}
}
