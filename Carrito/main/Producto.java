package main;

import java.util.Objects;

public class Producto {
	private String nombre;
	private double precio;
	private Categoria cat;
	
	public Producto (String nombre, double precio, Categoria cat) {
		this.nombre = nombre;
		this.precio = precio;
		this.cat = cat;
	}
	
	public Producto () {
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public Categoria getCat() {
		return cat;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cat, nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return cat == other.cat && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}	
}
