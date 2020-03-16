package com.bancolombia.certificacion.paradoc.utils;

import java.io.IOException;

import com.bancolombia.certificacion.paradoc.interactions.Copiar;

import net.serenitybdd.screenplay.Tasks;

public class text {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
String [] args2= {"CMD","/C","COPY","/Y","C:\\Users\\1550768\\Desktop\\1\\1.txt","\\\\10.8.69.8\\e$\\PARADOC_IN_TARJETAS"};
Process p = Runtime.getRuntime().exec(args2);
p.waitFor();
	}
	
	public static Copiar yPegarArchivosInsumos() {
		return Tasks.instrumented(Copiar.class);
		
		}

}
