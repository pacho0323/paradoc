package com.bancolombia.certificacion.paradoc.interactions;

import com.bancolombia.certificacion.paradoc.utils.RobotUtils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class IngresarCredencial implements Interaction{

	private int time;
	private String usuario;
	private String clave;
	
	public IngresarCredencial(String usuario,String clave, int time) {
    	this.usuario = usuario;
    	this.clave = clave;
    	this.time = time;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		new RobotUtils(time, usuario, clave).start();
	}
	
	public static IngresarCredencial con(String usuario, String clave,int time) {
		return Tasks.instrumented(IngresarCredencial.class, usuario,clave,time);
		
		}
}
