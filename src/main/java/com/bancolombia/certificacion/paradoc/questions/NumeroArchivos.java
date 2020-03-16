package com.bancolombia.certificacion.paradoc.questions;

import java.io.File;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NumeroArchivos implements Question<Integer>{

	private final String empaquetado= "\\\\10.8.69.8\\e$\\PARADOC_IN_TARJETAS\\Empaquetado";
	private final String tarjetas = "\\\\10.8.69.8\\e$\\PARADOC_IN_TARJETAS\\Tarjetas";
	private final String pmx = "\\\\10.8.69.8\\e$\\PARADOC_IN_TARJETAS\\PMX";
	
	public int ContarArchivos(String ruta){
		File carpeta = new File(ruta);
	    int c=0;
	        if (carpeta.exists()) {
	            File[] ficheros = carpeta.listFiles(); //Listar archivos en carpeta
	            for (File f: ficheros) {
	            	c = c+1;
	                System.out.println(f.getName());
	            }
	        } 
	        System.out.println(c);
	        return c;
		
	}
	@Override
	public Integer answeredBy(Actor actor) {
		 
		int contadorArchivos= ContarArchivos(empaquetado)+ContarArchivos(tarjetas)+ContarArchivos(pmx);
		return contadorArchivos;
		 
		             } 
	
	public static NumeroArchivos enRepositorio() {
		return new NumeroArchivos();
	  }
	}
	

