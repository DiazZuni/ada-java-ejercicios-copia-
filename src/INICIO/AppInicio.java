package INICIO;

import INICIO.clase1.Usuario;

/**
 * JAVADOC: primer clase de java
 * 
 * @author zuni_
 *
 */
public class AppInicio {
	/**
	 * 
	 * @param args
	 */
	// metodo publico de nombre main con parametros.
	public static void main(String[] args) { // firma del metodo

		// declaro variable una sola vez la primera
		// tipo + nombre
		Usuario user1 = null;// hasta aca el valor es null
		System.out.println(user1);

		// asigno un nuevo objeto Usuario a la variable
		user1 = new Usuario();// la variable deja de ser null
		System.out.println(user1);
	}
}