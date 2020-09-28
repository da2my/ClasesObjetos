package model;

public class Viaje {
	private String from;
	private String to;
	private String code;
	private float price=(float) 460.7;
	private int adults;
	private int child;
	private float importe;
	private float adu;
	private float chi;

	public Viaje(String code) {
		this.code = code.toUpperCase();
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChild() {
		return child;
	}

	public void setChild(int child) {
		this.child = child;
	}
	
	public float reserva(int plzChild, int plzAdults) {
		if ((plzAdults+plzChild)<=180) {
			adu = plzAdults*price;
			chi=((plzChild*price)*20)/100;
		}else {
			System.out.println("Error");
		}
		
		return importe=adu+chi;
	}

	@Override
	public String toString() {
		return "Viaje [from=" + from + ", to=" + to + ", code=" + code + ", price=" + price + ", adults=" + adults
				+ ", child=" + child + "]";
	}

	
}
