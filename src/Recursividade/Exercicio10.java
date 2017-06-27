package Recursividade;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {

		int[][] matriz = new int[5][5];
		salvarmatriz(matriz, 0, 0);

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.println(matriz[i][j]);	

			  
			}
		}
	}

	public static void salvarmatriz(int[][] matriz, int i, int j) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um Numero: ");
		matriz[i][j] = in.nextInt();
		j++;
		if (j == 5) {
			j = 0;
			i++;
		}
		if (i < 5) {
			salvarmatriz(matriz, i, j);
		}
	}
}
