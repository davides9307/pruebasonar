package org.gradle;

public class ProcesoPrincipal {

	
	public static void main(String[] args) {
		
	ServicioCalculadora servicio = new ServicioCalculadora();
	int res = servicio.sumar(4, 3);
	System.out.println("El resultadoe es ");
	System.out.println(res);
		
	}

	
	
	
	
	
	
}
