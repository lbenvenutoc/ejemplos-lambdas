package com.lbenvenuto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaStream {

	private static Logger logger = LoggerFactory.getLogger(PruebaStream.class);

	public static void main(String[] args) {
		DozerBeanMapper mapper = new DozerBeanMapper();
		List<Integer> listaNumerosEnteros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		logger.info("Numero de elementos de la lista " + listaNumerosEnteros.stream().count());
		logger.info("Suma de elementos " + listaNumerosEnteros.stream().reduce(0, Integer::sum));
		logger.info("Numero de elementos mayores que 5 "
				+ listaNumerosEnteros.stream().filter(numero -> numero > 5).collect(Collectors.toList()).size());

		List<Persona> listaPersonasFiltradas = Data.listarPersonas().stream().filter(p -> p.getEdad() > 18)
				.collect(Collectors.toList());
		logger.info("Numero de personas mayores de 18 " + listaPersonasFiltradas.size());

		List<PersonaDto> listaResultadoPersonasDto = listaPersonasFiltradas.stream().map(persona -> {
			PersonaDto personaDto = new PersonaDto();
			mapper.map(persona, personaDto);
			logger.info(personaDto.toString());
			return personaDto;
		}).collect(Collectors.toList());

		

	}

}
