package Recursividade;

import java.util.Scanner;

public class Exercício11 {

    public static void main(String[] args) {
        int[][][] matriz = new int[5][5][5];
        salvarmatriz(matriz, 0, 0, 0);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    System.out.println(matriz[i][j][k]);
                }
            }
        }
    }

    public static void salvarmatriz(int[][][] matriz, int i, int j, int k) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        matriz[i][j][k] = in.nextInt();
        k++;
        if (k == 5) {
            k = 0;
            j++;
        }
        if (j == 5) {
            j = 0;
            i++;
        }
        if (i < 5) {
            salvarmatriz(matriz, i, j, k);
        }
    }
}
