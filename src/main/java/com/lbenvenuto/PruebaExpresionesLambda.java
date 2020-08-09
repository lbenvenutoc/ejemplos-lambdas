package com.lbenvenuto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaExpresionesLambda {

	private static Logger logger = LoggerFactory.getLogger(PruebaExpresionesLambda.class);

	public static void main(String[] args) {

		// FILTRAR VALORES
		List<Integer> listaOriginal = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		listaOriginal = listaOriginal.stream().filter(n -> n > 5)
				.collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
		
		logger.info("Lista original");
		for (Integer r : listaOriginal) {
			logger.info(r.toString());
		}
		
		

	}

}
