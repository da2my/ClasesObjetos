package model;

import java.util.Arrays;

public class ContParametros {

	private static String[] lista;
	private static int numParametros;

	public ContParametros(String[] lista) {
		this.lista = lista;
	}

	public String[] getLista() {
		return lista;
	}

	public void setLista(String[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ContParametros [lista=" + Arrays.toString(lista) + "]";
	}

	public static void numParametros(String[] list) {
		int num = 0;
		for (String string : list) {
			System.out.print("Posición " + numParametros++ + ": ");
			System.out.println(string);
			num = numParametros;
		}
		System.out.println();
		System.out.println("El número de parámetros es: " + num);
	}
}
