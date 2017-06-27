package Recursividade;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int soma;
		int v1, v2, v3, v4, v5, v6, v7, v8, v9, v10;

		System.out.println("--------------------------------------");
		System.out.println("Soma Entre 10 Valores Inteiros: ");
		System.out.println("--------------------------------------");

		System.out.println("Informe o Primeiro Valor: ");
		v1 = entrada.nextInt();
		System.out.println("Informe o Segundo Valor: ");
		v2 = entrada.nextInt();
		System.out.println("Informe o Terceiro Valor: ");
		v3 = entrada.nextInt();
		System.out.println("Informe o Quarto Valor: ");
		v4 = entrada.nextInt();
		System.out.println("Informe o Quinto Valor: ");
		v5 = entrada.nextInt();
		System.out.println("Informe o Sexto Valor: ");
		v6 = entrada.nextInt();
		System.out.println("Informe o Setimo Valor: ");
		v7 = entrada.nextInt();
		System.out.println("Informe o Oitavo Valor: ");
		v8 = entrada.nextInt();
		System.out.println("Informe o Nono Valor: ");
		v9 = entrada.nextInt();
		System.out.println("Informe o Decimo Valor: ");
		v10 = entrada.nextInt();

		soma = v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10;

		System.out.println("--------------------------------------");
		System.out.println("O Resultado E: " + soma);
		System.out.println("--------------------------------------");

	}
}
