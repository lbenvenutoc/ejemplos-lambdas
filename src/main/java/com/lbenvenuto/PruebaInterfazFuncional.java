package com.lbenvenuto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaInterfazFuncional {
	
	private static Logger logger = LoggerFactory.getLogger(PruebaInterfazFuncional.class);

	public static void main(String[] args) {

		Operacion suma = (int a, int b) -> a + b;
		Operacion resta = (int a, int b) -> a - b;

		logger.info(""+suma.operacion(10, 20));
		logger.info(""+resta.operacion(10, 20));
	}

}
