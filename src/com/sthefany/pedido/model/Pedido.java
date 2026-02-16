package com.sthefany.pedido.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {


    private int id;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private LocalDate fecha;

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.fecha = LocalDate.now();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Producto p : productos) {
            total += p.getPrecio();
        }

        // Aplicar IVA 21%
        total = total * 1.21;

        // Descuento del 10% si supera 100€
        if (total > 100) {
            total = total * 0.90;
        }

        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente.getNombre() +
                ", fecha=" + fecha +
                ", total=" + calcularTotal() +
                '}';
    }

}

