package org.gradle;

import org.junit.Test;

import junit.framework.Assert;

public class ServicioCalcudoraTest {

	
	@Test
	public void Serviciocalculadora() {
		
	//Arrange	
	ServicioCalculadora servicio = new ServicioCalculadora();
	//Act
	int res = servicio.sumar(4, 3);
	
	//Assert
	Assert.assertEquals(res, 7);
		
		
	}
	
	
}
