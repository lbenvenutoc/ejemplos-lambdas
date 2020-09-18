package com.lbenvenuto;

import java.util.Arrays;
import java.util.List;

public class Data {

	public static List<Persona> listarPersonas() {
		return Arrays.asList(new Persona(1, "43396240", "Benvenuto", "Calderon", "Luis Alexis", 34),
				new Persona(2, "32012568", "Ccasani", "Magallanes", "Jose", 15));
	}

}
