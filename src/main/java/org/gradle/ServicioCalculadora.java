package org.gradle;

public class ServicioCalculadora {
	
	private int operando1;
	private int operando2;
	public ServicioCalculadora(int operando1, int operando2) {
		super();
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public ServicioCalculadora() {
		
		
	}
	public int getOperando1() {
		return operando1;
	}
	public void setOperando1(int operando1) {
		this.operando1 = operando1;
	}
	public int getOperando2() {
		return operando2;
	}
	public void setOperando2(int operando2) {
		this.operando2 = operando2;
	}
	
	
	
	public int sumar(int a , int b) {
		
		return a+b;
	}
	
	
	

}
