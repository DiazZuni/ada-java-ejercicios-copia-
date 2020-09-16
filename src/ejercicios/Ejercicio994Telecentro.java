package ejercicios;

import java.util.Scanner;

public class Ejercicio994Telecentro {

	public static void main(String[] args) {

		int cantServiciosvendidos = 0;
		int servicios[] = new int[4];

		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese su numero de cliente");
		int cliente = sc.nextInt();

		System.out.println("Seleccione el servicio que desea contratar (0 para salir)");
		System.out.println("Telefonia > 1 / Banda ancha > 2 / Tv > 3");
		int servicioElegido = sc.nextInt();
		if (servicioElegido >= 0 && servicioElegido < 4) {
			servicios[servicioElegido - 1] = servicios[servicioElegido - 1] + 1;

		} else {
			System.out.println(" Numero de opcion erronea.");
		}

		System.out.println("Selccione el servicio que desea contratar (0 para salir)");

		for (int i = 0; i <= servicios.length - 1; i++) {
			System.out.println("El servicio " + (i + 1) + " fue contratado por " + servicios[i] + " clientes ");
			cantServiciosvendidos = cantServiciosvendidos + servicios[i];
		}
		sc.close();
	}
}
