package main;

import java.util.ArrayList;

public class Carrito {
	
	private ArrayList<Producto> productos;

	public Carrito() {
		productos = new ArrayList<Producto>();
	}
	
	public int getCantidadProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public double getPrecioTotal() {
		double acumuladorPrecio = 0.0;
		for(Producto producto : productos) {
			acumuladorPrecio += producto.getPrecio();
		}
		return acumuladorPrecio;
	}
	
	public double getPrecioTotal(Categoria categoria) {
		double acumuladorPrecio = 0.0;
		for(Producto producto : productos) {
			if(producto.getCat().equals(categoria))
				acumuladorPrecio += producto.getPrecio();
		}
		return acumuladorPrecio;
	}
	
}