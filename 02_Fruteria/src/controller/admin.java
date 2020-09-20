package controller;

import model.Unidad;

public class admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Unidad carga1 = new Unidad("Mango", "Ecuador", 10, 0.79, 1.50);
		Unidad carga2 = new Unidad("Manzana", "Ecuador", 15, 0.43, 1.35);
		Unidad carga3 = new Unidad("Higos", "Palestina", 15, 2.75, 4.50);

//		Pruebas
//		System.out.println(String.join("\n", carga1.getNomFruta(),carga1.getOrigen(), Double.toString(carga1.getKg()), Double.toString(carga1.getPrecioCoste())));
//		System.out.println(carga1.getOrigen()==carga2.getOrigen());

//		Dé de alta 3 cargamentos
		System.out.println(carga1.toString());
		System.out.println("\n" + carga2.toString());
		System.out.println("\n" + carga3.toString() + "\n");

//		Diga si los dos primeros tienen la misma procedencia
		System.out.println("\n" + carga1.mismoOrigen(carga1, carga2));

//		Rebaje el precio del tercero
		System.out.println("Precio total: "+carga3.rebajar(20));

	}

}
