package Recursividade;

public class Exercício07 {

	public static void main(String[] args) {
		imprimir(1);
	}

	public static void imprimir(int x) {
		System.out.println(x);
		x += 2;
		if (x <= 100) {
			imprimir(x);
		}
	}
}
