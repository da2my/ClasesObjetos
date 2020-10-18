package model;

import model.types.IVA;

public class Producto {

	private String nombre;
	private double precioBase;
	private IVA tipoIVA;
	
	public Producto() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public IVA getTipoIVA() {
		return tipoIVA;
	}

	public void setTipoIVA(IVA tipoIVA) {
		this.tipoIVA = tipoIVA;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", tipoIVA=" + tipoIVA + "]";
	}

}
