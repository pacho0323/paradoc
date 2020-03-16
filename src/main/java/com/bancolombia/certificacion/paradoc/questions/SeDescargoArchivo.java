	package com.bancolombia.certificacion.paradoc.questions;

	import java.io.File;

	import net.serenitybdd.screenplay.Actor;
	import net.serenitybdd.screenplay.Question;

	public class SeDescargoArchivo implements Question<String>{

		private final String Descargas= "C:\\Users\\jfbuiles\\Downloads";
		
		public String ListarArchivos(String ruta){
			File carpeta = new File(ruta);
		      String nombre = "";
		        if (carpeta.exists()) {
		            File[] ficheros = carpeta.listFiles(); //Listar archivos en carpeta
		            for (File f: ficheros) {
		            	
		            	if (f.getName().equals("reporte_CONCEPTO.txt"))
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
		
		public static SeDescargoArchivo alSistema() {
			return new SeDescargoArchivo();
		  }
	}

