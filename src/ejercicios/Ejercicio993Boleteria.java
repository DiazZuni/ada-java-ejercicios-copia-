package ejercicios;

import java.util.Scanner;

public class Ejercicio993Boleteria {

	private static final int CANT_BOLETOS = 50;

	public static void main(String[] args) {

		mostrarTitulo("sistema de venta de boletos");

		int butacasVendidas = procesarDatos();

		mostrarDatos(butacasVendidas);

	}

	private static void mostrarDatos(int asientos) {
		System.out.println();
		mostrarTitulo("butacasVendidas");
		System.out.println("Hay" + asientos + "butacas vendidas.");

		if (asientos != CANT_BOLETOS) {
			int boletosTotales = CANT_BOLETOS - asientos;
			System.out.println("Sigamos vendiendo!");
		} else {
			System.out.println("Vendiste todos los boletos!");
		}

	}

	private static int procesarDatos() {

		Scanner sc = new Scanner(System.in);
		int boletos[] = new int[CANT_BOLETOS];
		for (int i = 0; i < boletos.length; i++) {
			boletos[i] = 0;
		}

		System.out.println("Ingrese numero de butacas a comprar entre 1 y 50 (99 para salir)");
		int butaca = sc.nextInt();

		while (butaca != 99) {

			if (boletos[butaca] == 0) {
				boletos[butaca] = 1;
				System.out.println("Perfecto! Butaca saleccionada correctamente");

			} else {
				System.out.println("Butaca ocupada. Por favor seleccione otra.");
			}

			System.out.println("Ingrese numero de butacas a comprar entre 1 y 50 (99 para salir)");
			butaca = sc.nextInt();
		}
		sc.close();

		int contador = 0;
		for (int i = 0; i < boletos.length; i++) {
			if (boletos[i] == 1) {
				contador += 1;
			}
		}

		return contador;

	}

	private static void mostrarTitulo(String titulo) {

		System.out.println(titulo.toUpperCase());
		System.out.println("------------------------------------------");
		System.out.println();
	}
}
