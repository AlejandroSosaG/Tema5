package ejercicioscopiaincersion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		int[] tablaEnteros = new int[10];
		int[] repes = new int[0];
		int valor;
		int indice = 0;
		boolean encontrado;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tablaEnteros.length; i++) {
			System.out.println("Introduzca un número");
			tablaEnteros[i] = sc.nextInt();
		}
		for (int i : tablaEnteros) {
			valor = tablaEnteros[i];
			encontrado = false;
			for (int j : repes) {
				if(valor == repes[j]) encontrado = true;
			}
			if(!encontrado) {
				repes = Arrays.copyOf(repes, repes.length+1);
				repes[indice] = valor;
				indice++;
			}
		}
		System.out.println(Arrays.toString(repes));
	}
}
