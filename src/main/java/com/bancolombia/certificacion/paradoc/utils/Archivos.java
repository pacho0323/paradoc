package com.bancolombia.certificacion.paradoc.utils;

import java.io.File;

public class Archivos {

	public static void main(String[] args) {
		
	    File carpeta = new File("C:\\Users\\1550768\\Desktop\\hola");
	    int c=0;
	        if (carpeta.exists()) {
	            File[] ficheros = carpeta.listFiles(); //Listar archivos en carpeta
	            
	            File[] ficheros2 = carpeta.listFiles();
	            
	            
	            for (File f: ficheros) {
	            	c = c+1;
	                System.out.println(f.getName());
	               
	            }
	        } else {
           
	        }
	        System.out.println("Num " + c);
	        
	        
	        int x=contarArchivos("C:\\Users\\1550768\\Desktop\\hola\\frf")+contarArchivos("C:\\Users\\1550768\\Desktop\\hola\\uyy");
	        System.out.println(x+"Suma de archivos");
	
	       
	      } 
	
	static int count = 0;
	private static int getFile(String dirPath) {
	    File f = new File(dirPath);
	    File[] files = f.listFiles();

	    if (files != null)
	    for (int i = 0; i < files.length; i++) {
	        count++;
	        File file = files[i];

	        if (file.isDirectory()) {   
	             getFile(file.getAbsolutePath()); 
	        }
	    }
	    return count;
	}
	
	
	private static int contarArchivos(String ruta) {
	    File carpeta = new File(ruta);
	    int c=0;
	        if (carpeta.exists()) {
	            File[] ficheros = carpeta.listFiles(); //Listar archivos en carpeta
	            
	            File[] ficheros2 = carpeta.listFiles();
	            
	            
	            for (File f: ficheros) {
	            	c = c+1;
	                System.out.println(f.getName());
	               
	            }
	        }
	        return c;
	}
	
}
