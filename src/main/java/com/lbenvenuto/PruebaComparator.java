package com.lbenvenuto;

import java.util.Comparator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaComparator {

	private static Logger logger = LoggerFactory.getLogger(PruebaComparator.class);

	public static void main(String[] args) {
		Comparator<Persona> personaMayor = (p, q) -> p.getApellidoPaterno().compareTo(q.getApellidoPaterno());
		Data.listarPersonas().sort(personaMayor);
		Data.listarPersonas().forEach(p->logger.info(p.toString()));
	}

}
