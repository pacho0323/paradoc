package com.bancolombia.certificacion.paradoc.task;


import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.OPCION_CONCEPTORETEIVA;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import com.bancolombia.certificacion.paradoc.utils.LeerConcepto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FiltrarConceptoReteiva implements Task{

	private String CodigoFiltrar;
	
	public FiltrarConceptoReteiva() {
		LeerConcepto leerconcepto = new LeerConcepto();
		CodigoFiltrar= leerconcepto.propiedades("CodigoFiltrar");

			}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(OPCION_CONCEPTORETEIVA),
				Enter.theValue(CodigoFiltrar).into(PaginaCuadrante.TXT_FILTRAR),
				Click.on(PaginaCuadrante.BTN_FILTRAR));
				}
	
   public static FiltrarConceptoReteiva delSistema() {
   return Tasks.instrumented(FiltrarConceptoReteiva.class);
   }
  
   
}

