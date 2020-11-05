package controller;

import model.BilletesAvion;
import model.types.Clase;
import view.Consola;

public class Admin {


	public static void main(String[] args) {
		Consola con = new Consola();
		BilletesAvion b1 = new BilletesAvion("David", "59238023k", Clase.VIP);
		con.writeString(b1.toString());

		BilletesAvion.facturar(b1);
		con.writeBoolean(b1.complemento("baño"));
		con.writeBoolean(b1.complemento("catering"));
		con.writeInt(b1.numMaletas(3));

	}
}
