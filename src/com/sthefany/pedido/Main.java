package com.sthefany.pedido;

import com.sthefany.pedido.model.Cliente;
import com.sthefany.pedido.model.Producto;
import com.sthefany.pedido.model.Pedido;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema de Gestión de Pedidos iniciado...");

// Lista de clientes
        ArrayList<Cliente> clientes = new ArrayList<>();

// Crear clientes
        Cliente c1 = new Cliente(1, "Sthefany", "sthefany@email.com");
        Cliente c2 = new Cliente(2, "Juan", "juan@email.com");

// Añadir a la lista
        clientes.add(c1);
        clientes.add(c2);

        // Lista de productos
        ArrayList<Producto> productos = new ArrayList<>();

// Crear productos
        Producto p1 = new Producto(1, "Camiseta", 25.99);
        Producto p2 = new Producto(2, "Pantalón", 39.50);

// Añadir a la lista
        productos.add(p1);
        productos.add(p2);

        System.out.println("\nClientes registrados:");
        for (Cliente c : clientes) {
            System.out.println(c); // usa toString() automáticamente
        }

        System.out.println("\nProductos disponibles:");
        for (Producto p : productos) {
            System.out.println(p);
        }

        Pedido pedido1 = new Pedido(1, c1);

        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p2);

        System.out.println("\nPedido creado:");
        System.out.println(pedido1);

    }


}
