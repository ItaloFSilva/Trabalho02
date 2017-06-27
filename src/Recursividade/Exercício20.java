package Recursividade;

import java.util.Scanner;

public class Exercício20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.println("Digite um Numero Inteiro: ");
		num = entrada.nextInt();
		System.out.println("O Resultado do Valor Solicitado E: " + fat(num));

	}

	public static int fat(int x) {

		if (x <= 1) {
			return 1;
		} else {
			return x * fat(x - 1);
		}

	}

}
