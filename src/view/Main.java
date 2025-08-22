package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Calculator;

public class Main {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		Scanner scanner = new Scanner(System.in);
		String option = "";
		double num1, num2;
		int intNum;

		do {
			System.out.println("--- Menu de Opções ---");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Divisão");
			System.out.println("4 - Multiplicação");
			System.out.println("5 - Resto da Divisão");
			System.out.println("6 - Fatorial");
			System.out.println("7 - Decimal para Binário");
			System.out.println("8 - Decimal para Hexadecimal");
			System.out.println("9 - Adicionar Percentual (N + X%)");
			System.out.println("10 - Subtrair Percentual (N - X%)");
			System.out.println("11 - Percentual de (X% de N)");
			System.out.println("N - Sair");
			System.out.print("Escolha uma opção: ");

			option = scanner.next();

			try {
				switch (option) {
					case "1":
						System.out.print("Digite o primeiro número: ");
						num1 = scanner.nextDouble();
						System.out.print("Digite o segundo número: ");
						num2 = scanner.nextDouble();
						System.out.println("Resultado: " + calc.sum(num1, num2));
						break;
					case "2":
						System.out.print("Digite o primeiro número: ");
						num1 = scanner.nextDouble();
						System.out.print("Digite o segundo número: ");
						num2 = scanner.nextDouble();
						System.out.println("Resultado: " + calc.sub(num1, num2));
						break;
					case "3":
						System.out.print("Digite o primeiro número: ");
						num1 = scanner.nextDouble();
						System.out.print("Digite o segundo número: ");
						num2 = scanner.nextDouble();
						System.out.println("Resultado: " + calc.div(num1, num2));
						break;
					case "4":
						System.out.print("Digite o primeiro número: ");
						num1 = scanner.nextDouble();
						System.out.print("Digite o segundo número: ");
						num2 = scanner.nextDouble();
						System.out.println("Resultado: " + calc.mult(num1, num2));
						break;
					case "5":
						System.out.print("Digite o primeiro número: ");
						num1 = scanner.nextDouble();
						System.out.print("Digite o segundo número: ");
						num2 = scanner.nextDouble();
						System.out.println("Resultado: " + calc.mod(num1, num2));
						break;
					case "6":
						System.out.print("Digite o número: ");
						num1 = scanner.nextDouble();
						System.out.println("Resultado: " + calc.factorial(num1));
						break;
					case "7":
						System.out.print("Digite o número decimal: ");
						intNum = scanner.nextInt();
						System.out.println("Resultado: " + calc.decimalToBinary(intNum));
						break;
					case "8":
						System.out.print("Digite o número decimal: ");
						intNum = scanner.nextInt();
						System.out.println("Resultado: " + calc.decimalToHexadecimal(intNum));
						break;
					case "9":
						System.out.print("Digite o número (N): ");
						num1 = scanner.nextDouble();
						System.out.print("Digite o percentual (X): ");
						num2 = scanner.nextDouble();
						System.out.println("Resultado: " + calc.addPercentage(num1, num2));
						break;
					case "10":
						System.out.print("Digite o número (N): ");
						num1 = scanner.nextDouble();
						System.out.print("Digite o percentual (X): ");
						num2 = scanner.nextDouble();
						System.out.println("Resultado: " + calc.subtractPercentage(num1, num2));
						break;
					case "11":
						System.out.print("Digite o percentual (X): ");
						num1 = scanner.nextDouble();
						System.out.print("Digite o número (N): ");
						num2 = scanner.nextDouble();
						System.out.println("Resultado: " + calc.percentageOf(num2, num1));
						break;
					case "N":
						System.out.println("Saindo...");
						break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
				scanner.nextLine(); // Clear the buffer
			} catch (IllegalArgumentException e) {
				System.out.println("Erro: " + e.getMessage());
			}
			System.out.println();
		} while (!option.equalsIgnoreCase("N"));

		System.out.println("Histórico de operações:");
		for (String operation : calc.getResults()) {
			System.out.println(operation);
		}
		
		scanner.close();
	}
}