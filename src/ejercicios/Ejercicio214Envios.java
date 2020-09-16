package ejercicios;

import java.util.Scanner;

public class Ejercicio214Envios {

	/*
	 * Una compañía de paquetería internacional tiene servicio en algunos países de
	 * América del Norte, América Central, América del Sur, Europa y Asia. El costo
	 * por el servicio de paquetería se basa en el peso del paquete y la zona a la
	 * que va dirigido. Lo anterior se muestra en la siguiente tabla: Parte de su
	 * política implica que los paquetes con un peso superior a 5 kg no son
	 * transportados, esto por cuestiones de logística y de seguridad. Realice un
	 * algoritmo para determinar el cobro por la entrega de un paquete o, en su
	 * caso, el rechazo de la entrega; represéntelo mediante diagrama de flujo y
	 * pseudocódigo.
	 */

	// definmos zona como float

	private static final int zona_1 = 11;
	private static final int zona_2 = 10;
	private static final int zona_3 = 12;
	private static final int zona_4 = 24;
	private static final int zona_5 = 27;
	private static final int PESO_MAX = 5000;

	public static void main(String[] args) {

		System.out.println("Bienvenido a The America's, servicio de mensajeria internacional");
		System.out.println("****************************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, ingrese el peso de su paquete en gramos");
		int peso = sc.nextInt();

		if (peso > 0 && peso <= PESO_MAX) {

			System.out.println("Siendo America del Norte zona 1, America Central zona 2, America del Sur zona 3:");
			System.out.println("Ingrese zona de envio");
			int zona = sc.nextInt();
			sc.close();

			int costoEnvio = 0;
			switch (zona) {
			case 1:
				costoEnvio = peso * zona_1;
				break;
			case 2:
				costoEnvio = peso * zona_2;
				break;
			case 3:
				costoEnvio = peso * zona_3;
				break;
			case 4:
				costoEnvio = peso * zona_4;
				break;
			case 5:
				costoEnvio = peso * zona_5;
				break;
			default:
				System.out.println("Zona incorrecta");
			}

			System.out.println("El costo del envio de su paquete sera de:" + costoEnvio);

		} else {
			System.out.println("Sin servicio en la zona");
		}
		System.out.println("Gracias por elegirnos. Lo esperamos pronto !");
	}
}
