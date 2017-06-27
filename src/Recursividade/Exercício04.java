package Recursividade;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {

		int vetor[] = new int[10];
		Scanner entrada = new Scanner(System.in);
		int aux;
		int menor = 100000;
		
		System.out.println("---------------------------------------------------");
		System.out.println("Menor Valor Entre 10 Numeros Inteiros Digitados: ");
		System.out.println("---------------------------------------------------");

		for(int i = 0; i < 10; i++){
			System.out.println("Solicite os Valores: ");
			vetor[i] = entrada.nextInt();
		    aux = vetor[i];
			    if (menor > aux) {
				    menor = vetor[i];

			    }
			}
		System.out.println("---------------------------------------------------");
		System.out.println("Menor Valor Entre 10 Numeros Inteiros Digitados: ");
		System.out.println("---------------------------------------------------");

		}

}
