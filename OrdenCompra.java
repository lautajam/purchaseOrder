package compra;

import java.util.Date;

public class OrdenCompra {

	private String descripcion;
	private Date fecha;
	private Cliente cliente;
	private Producto[] productos = new Producto[4];
	private Integer identificador;
	private int indiceProducto;

	private static int id;

	public OrdenCompra(String descripcion) {

		this.descripcion = descripcion;
		this.identificador = ++id;

	}

	public Integer getIdentificador() {

		return identificador;

	}

	public String getDescripcion() {

		return descripcion;

	}

	public Date getFecha() {

		return fecha;

	}

	public void setFecha(Date fecha) {

		this.fecha = fecha;

	}

	public Cliente getCliente() {

		return cliente;

	}

	public void setCliente(Cliente cliente) {

		this.cliente = cliente;

	}

	public Producto[] getProductos() {

		return productos;

	}

	public void addProducto(Producto producto) {

		if (indiceProducto < this.productos.length) {
			this.productos[indiceProducto++] = producto;

		}

	}

	public static int total(Producto[] productos) {

		int total = 0;

		for (int i = 0; i < productos.length; i++) {

			total += productos[i].getPrecio();

		}

		return total;

	}

}
