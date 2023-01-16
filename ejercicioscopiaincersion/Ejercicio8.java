	package ejercicioscopiaincersion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		int[] array = new int[1]; // Este es el array en el que introduciremos la secuencia aritmética.
		int v; // Esta variable es el valor inicial que tendrá el primer número.
		int i; // Esta es la cantidad que se incrementará.
		int cant; // Esta variable es la cantidad de números que desea el usuario.
		// Creación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el primer valor del array.
		System.out.println("Introduzca el valor inicial");
		// Asignamos a v el valor escrito por el usuario.
		v = sc.nextInt();
		// Pedimos al usuario la cantidad de números a sumar.
		System.out.println("Introduzca el incremento");
		// Asignamos a i el valor escrito por el usuario.
		i = sc.nextInt();
		// Pedimos al usuario la cantidad de números que desea.
		System.out.println("Introduzca la cantidad de elementos a crear");
		// Asignamos a cant el valor escrito por el usuario.
		cant = sc.nextInt();
		// Asignamos a la primera posición del array el valor de v.
		array[0] = v;
		/*
		 * Recorremos el bucle mientras el valor de j sea menor al de cant a la vez que el valor de j va aumentando.
		 * @j Lo inicializamos a valor 1.
		 */
		for (int j = 1; j < cant; j++) {
			// Aumentamos el tamaño del array en 1.
			array = Arrays.copyOf(array, array.length+1);
			// Asignamos a v su valor actual más el de i.
			v += i;
			// Asignamos a la posición j del array el valor v.
			array[j] = v;
		}
		// Mostramos por pantalla el array completo.
		System.out.println(Arrays.toString(array));
		// Cerramos el escaner.
		sc.close();
	}
}
