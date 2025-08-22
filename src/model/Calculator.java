package model;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	private List<String> results;
	
	public Calculator() {
		results = new ArrayList<String>();
	}
	public double sum(double num1, double num2) {
		double sum = num1 + num2;
		saveOperation(num1, "+", num2, sum);
		return sum;
	}
	
	public double sub(double num1, double num2) {
		double sub =  num1 - num2;
		saveOperation(num1, "-", num2, sub);
		return sub;
	}
	
	public double mult(double num1, double num2) {
		double mult =  num1 * num2;
		saveOperation(num1, "*", num2, mult);
		return mult;
	}
	
	public double div(double num1, double num2) {
		if(num1 <=0 ||num2 <= 0) throw new IllegalArgumentException("O numero não pode ser 0 ou negativo");
		double div =  num1/num2;
		saveOperation(num1, "/", num2, div);
		return div;
	}
	
	public List<String> getResults(){
		return results;
	}
	
	public void saveOperation(double num1, String operation, double num2, double result) {
		String operationStr = String.format("%.2f %s %.2f = %.2f", num1, operation, num2, result);
		
		results.add(operationStr);
	}
}
