package controller;

import java.time.Period;

import model.Persona;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		System.out.println(p1);
		Persona p2 = new Persona("Lorena", 28, 'M');
		System.out.println(p2);
		Persona p3 = new Persona("Elisa", 34, "08251412T", 'M', 66, 1.62, "Ecuador", "C");
		System.out.println(p3);
		
		System.out.println(p3.calcularIMC());
		
		System.out.println(p1.esMayorDeEdad());
		System.out.println(p3.esMayorDeEdad());
		
		Persona.comprobarSexo('i');
	}

}
