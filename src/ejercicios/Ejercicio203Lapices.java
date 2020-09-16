package ejercicios;

import java.util.Scanner;

public class Ejercicio203Lapices {

	private static final int PRECIO_MIN = 90;
	private static final int PRECIO_MAY = 85;

	public static void main(String[] args) {
		// de 1000 en adelante precio 85
		// si no precio 90
		// solicitar cantidad de lapices
		// informar el total

		System.out.println("Bienvenido/a a La Libreria - sector lapices");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de lapices a comprar");
		int lapices = sc.nextInt();
		int total = 0;
		if (lapices < 1000) {
			total = lapices * PRECIO_MIN;

		} else {
			total = lapices * PRECIO_MAY;
		}
		sc.close();
		System.out.println("El total es a pagar es de: $" + total);
	}

}
