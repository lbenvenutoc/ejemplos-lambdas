package com.lbenvenuto;

import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaSupplier {

	private static Logger logger = LoggerFactory.getLogger(PruebaSupplier.class);

	public static void main(String[] args) {
		Supplier<Persona> proveedorPersona = () -> new Persona("43396240", "Benvenuto", "Calderon", "Luis Alexis", 34);
		logger.info("La persona obtenida es " + proveedorPersona.get().toString());
	}

}
