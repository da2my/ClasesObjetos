package model;

import java.util.ArrayList;
import java.util.Random;

public class Alumno {

	private int numMatricula;
	private float notaProg;
	private float notaBBDD;
	private float notaSis;

	public Alumno() {

	}

	public Alumno(float notaProg, float notaBBDD, float notaSis) {
		this.notaProg = notaProg;
		this.notaBBDD = notaBBDD;
		this.notaSis = notaSis;
	}

//	public Alumno(int numMatricula, float notaProg, float notaBBDD, float notaSis) {
//		this.numMatricula = numMatricula;
//		this.notaProg = notaProg;
//		this.notaBBDD = notaBBDD;
//		this.notaSis = notaSis;
//	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public float getNotaProg() {
		return notaProg;
	}

	public void setNotaProg(float notaProg) {
		this.notaProg = notaProg;
	}

	public float getNotaBBDD() {
		return notaBBDD;
	}

	public void setNotaBBDD(float notaBBDD) {
		this.notaBBDD = notaBBDD;
	}

	public float getNotaSis() {
		return notaSis;
	}

	public void setNotaSis(float notaSis) {
		this.notaSis = notaSis;
	}

//Metodo de tipo ArrayList || Instancia un objeto de tipo ArrayList "al" || Con un for que, por cada iteración crea un objeto nuevo de la clase Alumno
	public static ArrayList<Alumno> creaAlumnos(int numAlumnos) {
		Random r = new Random();
		Random r1 = new Random();
		Random r2 = new Random();
		ArrayList<Alumno> al = new ArrayList<Alumno>();
		for (int i = 0; i < numAlumnos; i++) {
			float notaP = (float) r.nextInt(9)+1;
			float notaB = (float) r1.nextInt(9)+1;
			float notaS = (float) r2.nextInt(9)+1;
			Alumno alumno = new Alumno(notaP, notaB,notaS);
			al.add(alumno);
		}
		return al;
	}

	@Override
	public String toString() {
		return "Alumno [notaProg=" + notaProg + ", notaBBDD=" + notaBBDD + ", notaSis=" + notaSis + "]";
	}

}
