	package com.bancolombia.certificacion.paradoc.task;

	import static com.bancolombia.certificacion.paradoc.userinterface.PaginaPrincipal.OPCION_CONCEPTO;

import com.bancolombia.certificacion.paradoc.userinterface.PaginaConcepto;
import com.bancolombia.certificacion.paradoc.userinterface.PaginaCuadrante;
import com.bancolombia.certificacion.paradoc.utils.LeerConcepto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

	public class CancelarConceptosRetefuente implements Task{
	  
		private String Cuadrante;
		private String Codigo;
		private String DescripcionConcepto;
		private String Total;
		
		public CancelarConceptosRetefuente () {
			LeerConcepto leerconcepto = new LeerConcepto();
			leerconcepto.propiedades("TipoCertificado");
			Cuadrante = leerconcepto.propiedades("Cuadrante");
			Codigo =leerconcepto.propiedades("Codigo");
			DescripcionConcepto =leerconcepto.propiedades("DescripcionConcepto");
			Total =leerconcepto.propiedades("Total");
		}
		
		@Override
		public <T extends Actor> void performAs(T actor) {
			// TODO Auto-generated method stub
			actor.attemptsTo(
					Click.on(OPCION_CONCEPTO),
					Click.on(PaginaConcepto.NUEVA_CONFIGURACION),
					Click.on(PaginaConcepto.CUADRANTE),
					Click.on(PaginaConcepto.CUADRANTE_CONCEPTO.of(Cuadrante)),
					Enter.theValue(Codigo).into(PaginaConcepto.CODIGO_CONCEPTO),
					Enter.theValue(DescripcionConcepto).into(PaginaConcepto.DESCRIPCION_CONCEPTO),
					Click.on(PaginaConcepto.TOTAL),
					Click.on(PaginaConcepto.ES_TOTAL.of(Total)),
					Click.on(PaginaCuadrante.BTN_CANCELAR)
					);
		
		}
				public static CancelarConceptosRetefuente enElSistema() {
			return Tasks.instrumented(CancelarConceptosRetefuente.class);
		}
	}

