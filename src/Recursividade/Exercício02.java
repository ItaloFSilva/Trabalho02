package Recursividade;

public class Exercício02 {
	public static void main(String[] args) {
		imprimir(100);
	}

	public static void imprimir(int x) {
		System.out.println(x);
		x -= 1;
		if (x >= 0) {
			imprimir(x);
		}
	}
}
