package Recursividade;

public class Exerc�cio06 {

	public static void main(String[] args) {
		imprimir(0);
	}

	public static void imprimir(int x) {
		System.out.println(x);
		x += 2;
		if (x <= 100) {
			imprimir(x);
		}
	}
}
