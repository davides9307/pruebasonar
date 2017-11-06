package org.gradle;

import java.util.logging.Logger;

public class ProcesoPrincipal {

	
	public static void main(String[] args) {
		
		final  Logger LOGGER =Logger.getLogger(ProcesoPrincipal.class.getName());
		
	ServicioCalculadora servicio = new ServicioCalculadora();
	int res = servicio.sumar(4, 3);
	
	LOGGER.info("El resultado es " + String.valueOf(res));
		
	}

	
	
	
	
	
	
}
