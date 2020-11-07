package model;

import model.types.Clase;

public class BilletesAvion {

	private String nombre;
	private String nif;
	private Clase tipo;

	public BilletesAvion() {

	}

	public BilletesAvion(String nombre, String nif) {
		this.nombre = nombre;
		this.nif = nif;
	}

	public BilletesAvion(Clase tipo) {
		this.tipo = tipo;
	}

	public BilletesAvion(String nombre, String nif, Clase tipo) {
		this.nombre = nombre;
		this.nif = nif;
		this.tipo = tipo;
	}

//

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Clase getTipo() {
		return tipo;
	}

	public void setTipo(Clase tipo) {
		this.tipo = tipo;
	}

//	

	@Override
	public String toString() {
		return "BilletesAvion [nombre=" + nombre + ", nif=" + nif + ", tipo=" + tipo + "]";
	}

//	
	public static void facturar(BilletesAvion ob) {
		int asiento = 0;
		System.out.print("El asiento asignado segun la clase es el #");
		if (ob.getTipo().equals(Clase.VIP)) {
			do {
				asiento = (int) (Math.random() * 100 * (Math.random() == 1 ? 1 : 1));
			} while (!(asiento <= 20));
			System.out.println(Integer.toString(asiento));
		} else if (ob.getTipo().equals(Clase.BUSINESS)) {
			while (!(asiento > 20 && asiento <= 50)) {
				asiento = (int) (Math.random() * 100 * (Math.random() == 1 ? 1 : 1));
			}
			System.out.println(Integer.toString(asiento));
		} else if (ob.getTipo().equals(Clase.TURISTA)) {
			while (!(asiento > 50 && asiento <= 100)) {
				asiento = (int) (Math.random() * 100 * (Math.random() == 1 ? 1 : 1));
			}
			System.out.println(Integer.toString(asiento));
		}
	}

	public boolean complemento(String comp) {
		boolean poder = false;
		if (comp.equalsIgnoreCase("Baño")) {
			poder = true;
		}
		if (comp.equalsIgnoreCase("Catering")) {
			poder = true;
		}
		return poder;
	}

	public int numMaletas(int num) {
		int maleta = 1;
		if (maleta < num) {
			maleta = num;
		}
		return maleta;
	}

	public void reservaInicial(BilletesAvion ob) {
		if (ob.getNombre().equalsIgnoreCase(nombre) && ob.getNif().equalsIgnoreCase(nif)) {
			System.out.println("La reserva Inicial, por nombre y nif, esta hecha");
		}
	}

	public void reservaInicial1(BilletesAvion obj) {
		if (obj.getTipo().equals(Clase.VIP)||obj.getTipo().equals(Clase.BUSINESS)||obj.getTipo().equals(Clase.TURISTA)) {
			System.out.println("La reserva Inicial, por Clase, esta hecha");
		}
	}

//	
//	ob.getTipo().equals(Clase.VIP) || ob.getTipo().equals(Clase.BUSINESS)
//	|| ob.getTipo().equals(Clase.TURISTA)

}
