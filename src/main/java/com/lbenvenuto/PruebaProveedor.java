package com.lbenvenuto;

import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaProveedor {

	private static Logger logger = LoggerFactory.getLogger(PruebaProveedor.class);

	public static void main(String[] args) {
		Supplier<Persona> proveedorPersona = () -> new Persona("43396240", "Benvenuto", "Calderon", "Luis Alexis");
		logger.info("La persona obtenida es " + proveedorPersona.get().toString());
	}

}
