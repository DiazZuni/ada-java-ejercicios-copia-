package ejercicios;

import java.util.Scanner;

public class Ejercicio999CajasCobranza {

	// arrays unidimensionales > tipo_dato array [] = new Tipo_dato[]; x= cantidad
	// de
	// array.length > longitud del array

	public static void main(String[] args) {

		float total = 0f;
		int cantFact = 0;
		float promedio = 0;
		int cajas[] = new int[4];
		for (int i = 0; i < cajas.length; i++) {
			cajas[i] = 0;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese su nombre");
		String nombre = sc.next();

		System.out.println("Bienvenido/a " + nombre + "!");
		System.out.println("Ingrese el importe de su factura (0 para salir)");
		float importe = sc.nextFloat();

		while (importe != 0) {

			System.out.println("Ingrese numero de caja 1- ; 2- ; 3- ; 0 para terminar");
			int caja = sc.nextInt();

			if (caja >= 1 && caja < 5) {
				cajas[caja - 1] = cajas[caja - 1] + 1;
				total = total + importe;

			} else {
				System.out.println(" Numero de caja erroneo, ingrese nuevamente los datos.");
			}

			System.out.println("Ingrese el importe de su factura (0 para salir)");
			importe = sc.nextFloat();
		}

		for (int i = 0; i <= cajas.length - 1; i++) {
			System.out.println("La caja" + (i + 1) + "tiene" + cajas[i] + "facturas");
			cantFact = cantFact + cajas[i];
		}
		System.out.println("Canatidad de facturas:" + cantFact);
		promedio = total / cantFact;

		System.out.println("Importe total:" + total);
		System.out.println("Importe promedio:" + promedio);
	}

}
