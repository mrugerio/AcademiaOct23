package com.curso.intV2;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("InterfacesV1");
		Operacion[] arrayOpe = {new Exp(8,4),
				new Div(8,4),new Suma(8,4),
				new Resta(8,4),new Multi(8,4)};

		aplicar(arrayOpe);
		
	}

	private static void aplicar(Operacion[] arrayOpe) {
		for(Operacion ope : arrayOpe) {
			//POLIMORFISMO
			System.out.println(ope);
			System.out.println(ope.ejecuta());
		}
	}

}
