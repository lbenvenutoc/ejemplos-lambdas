package com.lbenvenuto;

import java.util.function.Predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaPredicado {

	private static Logger logger = LoggerFactory.getLogger(PruebaPredicado.class);

	public static void main(String[] args) {
		int numeroPrueba = 5;
		Predicate<Integer> esNumeroPar = n -> n % 2 == 0;
		logger.info("¿El numero " + numeroPrueba + " es par? " + esNumeroPar.test(numeroPrueba));
	}

}
