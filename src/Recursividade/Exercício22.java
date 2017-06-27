package Recursividade;

import java.util.Scanner;

public class Exercício22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.println("Entre com um Numero Inteiro: ");
		num = entrada.nextInt();
		System.out.println("Resultado: " + fibonacci(num));
	}

	public static int fibonacci(int x) {

		if (x == 1 || x == 2) {
			return 1;
		} else if (x > 2) {
			return x * fibonacci(x - 1) + fibonacci(x - 2);
		}

	}

}
