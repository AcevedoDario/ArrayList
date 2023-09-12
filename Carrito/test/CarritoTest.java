package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Carrito;
import main.Categoria;
import main.Producto;

public class CarritoTest {
	
	@Test
	public void verificarCantidadCeroEnCarritoVacio() {
		Carrito cart = new Carrito();
		assertEquals(0, cart.getCantidadProductos());
	}
	
	@Test
	public void verificarCantidadUnoEnCarrito() {
		Carrito cart = new Carrito();
		cart.agregarProducto(new Producto("yerba", 1300.0, Categoria.ALIMENTO));
		assertEquals(1, cart.getCantidadProductos());
	}
	
	@Test
	public void verificarPrecioTotalDelCarrito() {
		Carrito cart = new Carrito();
		cart.agregarProducto(new Producto("fideos", 250.0, Categoria.ALIMENTO));
		cart.agregarProducto(new Producto("pure de tomate", 500.0, Categoria.ALIMENTO));
		cart.agregarProducto(new Producto("papa", 1000.0, Categoria.ALIMENTO));
		assertEquals(1750, cart.getPrecioTotal());
	}
	
	@Test
	public void verificarPrecioTotalProductosTecnologicos() {
		Carrito cart = new Carrito();
		cart.agregarProducto(new Producto("Celular", 150000.0, Categoria.TECNOLOGIA));
		cart.agregarProducto(new Producto("TV", 150000.0, Categoria.TECNOLOGIA));
		cart.agregarProducto(new Producto("Cuchara", 15.0, Categoria.TECNOLOGIA));
		cart.agregarProducto(new Producto("Fideos", 1500.0, Categoria.ALIMENTO));
		cart.agregarProducto(new Producto("Lavandina", 150000.0, Categoria.LIMPIEZA));
		assertEquals(300015.0, cart.getPrecioTotal(Categoria.TECNOLOGIA));
	}

}
