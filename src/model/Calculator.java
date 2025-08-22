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
		double sub = num1 - num2;
		saveOperation(num1, "-", num2, sub);
		return sub;
	}

	public double mult(double num1, double num2) {
		double mult = num1 * num2;
		saveOperation(num1, "*", num2, mult);
		return mult;
	}

	public double div(double num1, double num2) {
		if (num2 == 0)
			throw new IllegalArgumentException("O divisor não pode ser 0.");
		double div = num1 / num2;
		saveOperation(num1, "/", num2, div);
		return div;
	}

	public double mod(double num1, double num2) {
		if (num2 == 0)
			throw new IllegalArgumentException("O divisor não pode ser 0.");
		double mod = num1 % num2;
		saveOperation(num1, "%", num2, mod);
		return mod;
	}

	public double factorial(double num) {
		if (num < 0)
			throw new IllegalArgumentException("O número deve ser positivo para calcular o fatorial.");
		double result = 1;
		for (int i = 2; i <= num; i++) {
			result *= i;
		}
		saveOperation(num, "!", 0, result);
		return result;
	}

	public String decimalToBinary(int num) {
		String result = Integer.toBinaryString(num);
		saveOperation(num, "-> binário", 0, result);
		return result;
	}

	public String decimalToHexadecimal(int num) {
		String result = Integer.toHexString(num);
		saveOperation(num, "-> hexadecimal", 0, result);
		return result;
	}

	public double addPercentage(double num, double percent) {
		double result = num + (num * (percent / 100));
		saveOperation(num, " + " + percent + "%", 0, result);
		return result;
	}

	public double subtractPercentage(double num, double percent) {
		double result = num - (num * (percent / 100));
		saveOperation(num, " - " + percent + "%", 0, result);
		return result;
	}

	public double percentageOf(double num, double percent) {
		double result = num * (percent / 100);
		saveOperation(num, "% de", percent, result);
		return result;
	}

	public List<String> getResults() {
		return results;
	}

	public void saveOperation(double num1, String operation, double num2, double result) {
		String operationStr;
		if (operation.equals("% de")) {
			operationStr = String.format("%.2f %% de %.2f = %.2f", num1, num2, result);
		} else if (operation.equals("!")) {
			operationStr = String.format("%.0f! = %.2f", num1, result);
		} else if (operation.contains("%")) {
			operationStr = String.format("%.2f %s = %.2f", num1, operation, result);
		} else {
			operationStr = String.format("%.2f %s %.2f = %.2f", num1, operation, num2, result);
		}
		results.add(operationStr);
	}

	public void saveOperation(int num1, String operation, int num2, String result) {
		String operationStr = String.format("%d %s = %s", num1, operation, result);
		results.add(operationStr);
	}
}