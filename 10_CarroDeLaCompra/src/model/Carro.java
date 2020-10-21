package model;

public class Carro {
	
	private String nombre;
	private String direccion;
	private String nif;
	
	public Carro() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

//	public double facturaFinal(double precioBase, double precioDescuento, double) {
//		double factura = 0;
//		return factura;
//	}
	
	@Override
	public String toString() {
		return "Carro [nombre=" + nombre + ", direccion=" + direccion + ", nif=" + nif + "]";
	}
}
