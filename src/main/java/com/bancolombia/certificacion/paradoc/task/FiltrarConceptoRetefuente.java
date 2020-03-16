package com.bancolombia.certificacion.paradoc.task;

import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.OPCION_CONCEPTO;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import com.bancolombia.certificacion.paradoc.utils.LeerConcepto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
public class FiltrarConceptoRetefuente implements Task{

	private String CodigoFiltrar;
	
	public FiltrarConceptoRetefuente() {
		LeerConcepto leerconcepto = new LeerConcepto();
		CodigoFiltrar= leerconcepto.propiedades("CodigoFiltrar");

			}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(OPCION_CONCEPTO),
				Enter.theValue(CodigoFiltrar).into(PaginaCuadrante.TXT_FILTRAR),
				Click.on(PaginaCuadrante.BTN_FILTRAR));
				}
	
   public static FiltrarConceptoRetefuente delSistema() {
   return Tasks.instrumented(FiltrarConceptoRetefuente.class);
   }
  
   
}

