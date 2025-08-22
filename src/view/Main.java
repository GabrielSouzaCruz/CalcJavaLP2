package view;

import model.Calculator;

public class Main {
	
	public static void main(String [] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.sum(2, 4));
		System.out.println(calc.sum(2, 4));
		System.out.println(calc.div(10, 2));
		System.out.println(calc.mult(5, 5));
		
		System.out.println("Historio de operações");
		for(String operation : calc.getResults()) {
			System.out.println(operation);
		}
	}

}
