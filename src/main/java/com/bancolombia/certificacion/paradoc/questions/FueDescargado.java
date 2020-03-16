package com.bancolombia.certificacion.paradoc.questions;

import java.io.File;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FueDescargado implements Question<String>{

	private final String Descargas= "C:\\Users\\jfbuiles\\Downloads";
	
	public String ListarArchivos(String ruta){
		File carpeta = new File(ruta);
	      String nombre = "";
	        if (carpeta.exists()) {
	            File[] ficheros = carpeta.listFiles(); //Listar archivos en carpeta
	            for (File f: ficheros) {
	            	
	            	if (f.getName().equals("reporte_CUADRANTE.txt"))
	            	{
	            		nombre = (f.getName());
	            	}
	            	
	            }
	        } 
	  	        return nombre;
		
	}
	@Override
	public String answeredBy(Actor actor) {
		String archivo= ListarArchivos(Descargas);
		return archivo;
	}
	
	public static FueDescargado archivoCuadrantes() {
		return new FueDescargado();
	  }
}
