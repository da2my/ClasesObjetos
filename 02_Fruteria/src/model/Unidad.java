package model;

public class Unidad {

	private String nombre;
	private String origen;
	private double kg;
	private double precioCoste;
	private double precioVenta;

//	Constructores

	public Unidad() {

	}

	public Unidad(String nombre, String origen, double kg, double precioCoste, double precioVenta) {
		this.nombre = nombre;
		this.origen = origen;
		this.kg = kg;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
	}

//	Getters & Setters
	public String getNomFruta() {
		return nombre;
	}

	public void setNomFruta(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public double getPrecioCoste() {
		return precioCoste;
	}

	public void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

//	Metodos
	public double rebajar(double porcentaje) {
		double rebaja;
		double ventaRebajada;
		rebaja = (this.precioVenta * porcentaje) / 100;
		ventaRebajada = this.precioVenta - rebaja;
//		if (ventaRebajada < precioCoste) {
//			System.out.println("No se aplica rebaja ");
//			return this.precioVenta;
//			
//		}else if (ventaRebajada>precioCoste){
//			System.out.println("Se rebaja en ");
//			return ventaRebajada;
//		}else {
//			return this.precioVenta;
//		}
		double x = ventaRebajada < precioCoste ? this.precioVenta :  ventaRebajada; 
		return x;

	}

	public double vender(double kg) {
		if (kg > this.kg) {
			kg--;
		} else {
			System.out.println("Error");
		}
		return kg;
	}

	public String mismoOrigen(Unidad u, Unidad x) {
		System.out.println("El origen de estos dos cargamentos es: ");
		if (u.getOrigen().equals(origen) && x.getOrigen().equals(origen)) {
			System.out.println("El mismo origen " + "'" + origen + "'");

		} else {
			System.out.println("Diferente origen");
		}
		return "";
	}

	@Override
	public String toString() {
		return "Unidad [nombre=" + nombre + ", origen=" + origen + ", kg=" + kg + ", precioCoste=" + precioCoste
				+ ", precioVenta=" + precioVenta + "]";
	}

}
