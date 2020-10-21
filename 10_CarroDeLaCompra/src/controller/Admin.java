package controller;

import model.Carro;
import model.Producto;

public class Admin {

	public static void main(String[] args) {
		
		new Tienda().mostrarProductos();
		new Tienda().mostrarPrecio();
	}
}
