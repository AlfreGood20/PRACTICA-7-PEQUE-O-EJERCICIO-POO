package PRACTICA_8;

public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	
	
	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}


	public Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = capacidadMaxima;
	}


	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = (cantidadActual>capacidadMaxima)?capacidadMaxima:cantidadActual;
	}
	
	
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}


	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}


	public int getCantidadActual() {
		return cantidadActual;
	}


	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}


	public void llenarCafetera() {
		this.cantidadActual=this.capacidadMaxima;
	}
	
	
	public String ServirTaza(int cantidad) {
		int servir=0;
		if(cantidad>this.cantidadActual) {
			servir=this.cantidadActual;
			this.cantidadActual=0;
		}
		else {
			this.cantidadActual-=cantidad;
			servir=this.cantidadActual;
		}
		return (this.cantidadActual<cantidad)?"Te acabas de servir "+servir:"Te acabas de servir "+servir;
	}
	
	
	public void vaciarCafetera() {
		this.cantidadActual=0;
	}
	
	public String agregarCafe(int cantidad) {
		if(this.cantidadActual+cantidad>this.capacidadMaxima) {
			int agregado = capacidadMaxima - cantidadActual;
			this.cantidadActual=capacidadMaxima;
			return "La cafetera se llenó. Se agregaron " + agregado + " c.c. de café.";
		}
		else {
			cantidadActual += cantidad;
            return "Se agregaron " + cantidad + " c.c. de café.";
		}
	}
}
