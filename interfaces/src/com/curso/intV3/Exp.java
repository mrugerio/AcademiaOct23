package com.curso.intV3;

public class Exp implements Operacion {
	
	int x;
	int y;
	
	public Exp(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int ejecuta() {
		return (int)(Math.pow(x, y));
	}
	
	@Override
	public String toString() {
		return "Exp [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public void ejecutaReales() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejecutaImaginarios() {
		// TODO Auto-generated method stub
		
	}
	
}
