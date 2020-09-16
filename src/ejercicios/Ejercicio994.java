package ejercicios;

import java.util.Scanner;

public class Ejercicio994 {

	private static final int SERVICIOS_DISPONIBLES = 3;

	/*
	 * Una empresa de comunicaciones ofrece servicio de telefonía, banda ancha y tv
	 * digital. Cada uno de los servicios tiene un precio diferente (Telefonía: 10,
	 * Banda ancha: 15, TV, 20). Se desea contar cuántos clientes optan por cada
	 * servicio para luego conocer la facturación de cada uno de los servicios. Se
	 * deben ingresar los clientes por número (cliente = 0 para finalizar).
	 */

	public static void main(String[] args) {

		logueoCliente();

		seleccionServicio();

	}

	private static void seleccionServicio() {
		// cliente elije servicio
		System.out.println("Selccione el servicio que desea contratar;");
		System.out.println("Telefonia > 1 / Banda ancha > 2 / Tv > 3");
		Scanner sc = new Scanner(System.in);
		int servicioElegido = sc.nextInt();

		int serviciosVendidos[] = new int[SERVICIOS_DISPONIBLES];

	}

	private static void logueoCliente() {
		// requerimos numero de cliente
		System.out.println("Bienvenido/a a su Sucursal Virtual");
		System.out.println("Por favor, ingrese su numero de cliente para empezar su gestion o 0 para salir ");
		Scanner sc = new Scanner(System.in);
		int cliente = sc.nextInt();
	}
}
