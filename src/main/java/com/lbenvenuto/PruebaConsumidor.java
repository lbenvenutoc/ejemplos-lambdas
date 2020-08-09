package com.lbenvenuto;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaConsumidor {

	private static Logger logger = LoggerFactory.getLogger(PruebaConsumidor.class);

	public static void main(String[] args) {
		Consumer<Persona> saludoPersona = p -> logger.info("Hola " + p.getNombre());
		saludoPersona.accept(new Persona("43396240", "Benvenuto", "Calderon", "Luis Alexis"));
	}

}
