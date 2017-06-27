package Recursividade;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {

		int maior = 0;
		int aux;

		int vetor[] = new int[10];
		Scanner entrada = new Scanner(System.in);

		System.out.println("---------------------------------------------------");
		System.out.println("Maior Valor Entre 10 Numeros Inteiros Digitados: ");
		System.out.println("---------------------------------------------------");

		for (int i = 0; i < 10; i++) {
			System.out.println("Solicite os Valores: ");
			vetor[i] = entrada.nextInt();
			aux = vetor[i];

			if (maior < aux) {
				maior = vetor[i];
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Maior Valor Entre 10 Numeros Inteiros Digitados: " +maior);
		System.out.println("---------------------------------------------------");
	}
}