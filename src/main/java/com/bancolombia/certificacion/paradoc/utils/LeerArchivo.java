package com.bancolombia.certificacion.paradoc.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LeerArchivo {

	public String propiedades (String valor) {
		Properties properties = new Properties();
		
			try {
				InputStream stream = new FileInputStream("./datos.properties");
				properties.load(stream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return properties.getProperty(valor);
		 		
	}

}
