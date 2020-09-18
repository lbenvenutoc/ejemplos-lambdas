package com.lbenvenuto;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaFunction {

	private static Logger logger = LoggerFactory.getLogger(PruebaFunction.class);

	public static void main(String[] args) {
		int numeroPrueba = 12;
		Function<Integer, Integer> numeroAlCuadrado = a -> a * a;
		logger.info("El numero " + numeroPrueba + " al cuadrado es " + numeroAlCuadrado.apply(numeroPrueba));

	}

}
