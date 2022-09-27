package compra;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploOrdenes {

	public static void main(String[] args) {

		SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");

		OrdenCompra orden_1 = new OrdenCompra("Verduleria");

		orden_1.setCliente(new Cliente("Lautaro", "Merino"));
		orden_1.setFecha(new Date());

		orden_1.addProducto(new Producto("Huerta Feliz", "Papas x5kg", 250));
		orden_1.addProducto(new Producto("Huerta Feliz", "Arvejas x10kg", 1750));
		orden_1.addProducto(new Producto("Verduleria Don Chicho", "Frutillas x3kg", 2000));
		orden_1.addProducto(new Producto("German y amigos de los vegetales", "Banana verde x1kg", 90));

		OrdenCompra orden_2 = new OrdenCompra("Carniceria");

		orden_2.setCliente(new Cliente("Julieta", "Ñañez"));
		orden_2.setFecha(new Date());

		orden_2.addProducto(new Producto("Carniceria Pedro", "15 chorizos colorados", 3400));
		orden_2.addProducto(new Producto("Granja del sol", "Milanesa de pollo x3", 200));
		orden_2.addProducto(new Producto("Carnes Hernandez", "Paleta x900gr", 1300));
		orden_2.addProducto(new Producto("LocosxelAsado", "Asado x7kg", 4000));

		OrdenCompra orden_3 = new OrdenCompra("Panaderia");

		orden_3.setCliente(new Cliente("Santiago", "Fernandez"));
		orden_3.setFecha(new Date());

		orden_3.addProducto(new Producto("Panpanpan", "Pan flautita x3kg", 300));
		orden_3.addProducto(new Producto("Medialunas del abuelo", "3 docenas de medialunas", 3100));
		orden_3.addProducto(new Producto("La veneciana", "Porcion de tiramisu", 700));
		orden_3.addProducto(new Producto("Paris panaderia", "2 docenas de sanguchitos de miga", 2800));

		OrdenCompra[] ordenCompra = { orden_1, orden_2, orden_3 };

		for (OrdenCompra orden : ordenCompra) {

			System.out.println();

			System.out.println("Numero de compra: " + orden.getIdentificador());
			System.out.println("Comprador: " + orden.getCliente());
			System.out.println("Fecha: " + dFormat.format(orden.getFecha()));

			int i = 1;

			for (Producto producto : orden.getProductos()) {

				System.out.println("Producto '" + i + "': " + producto.getNombre() + ", fabricante: "
						+ producto.getFabricante() + ", precio: $" + producto.getPrecio());

			}

		}

	}

}