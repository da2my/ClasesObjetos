package controller;

import model.Viaje;

public class Admin {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Viaje v1 = new Viaje("rues4");
		Viaje v2 = new Viaje("enus8");
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		
		System.out.println(v1.reserva(100, 200));
	}

}
