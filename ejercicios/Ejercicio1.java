package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*100+1);
		}
	}

}
