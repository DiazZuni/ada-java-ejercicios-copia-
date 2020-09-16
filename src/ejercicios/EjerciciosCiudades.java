package ejercicios;

import java.util.Scanner;

public class EjerciciosCiudades {

	// En un trayecto entre dos ciudades se deben realizar paradas intermedias.
	// Se desea conocer cuantas paradas
	// se van a realizar en el viaje y la longitud de los trayectos en kilometros.
	// Se desea conocer la longitud
	// promedio entre ciudades y
	// cuales son las paradas mas cercanas

	// inicio
	// *------- * ---------------- * ----- * ----------- *
//	      40            100            15      60

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cuidad de partida");
		String partida = sc.next();
		System.out.println("Ingrese cuidad de destino");
		String destino = sc.next();

		System.out.println("Ingrese cantidad de paradas entre" + partida + "y" + destino);
		int cantParadas = sc.nextInt();

		int vectorDistancia[] = new int[cantParadas + 1];

		for (int i = 0; i < cantParadas; i++) {

			if (i == 0) {
				System.out.println("Ingrese distancia entre" + partida + "y" + (i + 1));
				int d = sc.nextInt();

			} else if (i == cantParadas) {
				System.out.println("Ingrese distancia entre" + i + 1 + "y" + destino);
				int d = sc.nextInt();

			} else {
				System.out.println("Ingrese distancia entre" + i + "y" + (i + 1));

			}
		}

	}

}
