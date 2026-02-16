# Sistema de Gestión de Pedidos

## Descripción
Este es mi **primer proyecto en Java** como práctica de programación orientada a objetos.  
Es un sistema muy básico de gestión de pedidos que me ayudó a entender cómo se crean y relacionan las clases, cómo trabajar con listas de objetos y cómo mostrar información en la consola.

El proyecto permite:

- Crear clientes con nombre, email y un ID único.
- Crear productos con nombre, precio y un ID.
- Crear pedidos asociados a un cliente, agregando productos.
- Calcular el total de cada pedido aplicando IVA del 21% y un descuento del 10% si el total supera 100€.
- Mostrar en consola los clientes, productos y pedidos con sus totales.

---

## Tecnologías utilizadas
- Java (JDK 23)
- Programación Orientada a Objetos (POO)
- `ArrayList` para manejar listas de clientes, productos y pedidos
- IntelliJ IDEA Community Edition (IDE)

---

## Estructura del proyecto
com.sthefany.pedido

├── Main.java  Clase principal para ejecutar el sistema

── model

├── Cliente.java  Clase que representa un cliente

├── Producto.java Clase que representa un producto

└── Pedido.java  Clase que representa un pedido y su lógica

---
## Cómo ejecutar
1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main.java` haciendo click derecho → Run 'Main'.
3. En la consola se mostrarán:
    - La lista de clientes registrados.
    - La lista de productos disponibles.
    - Un pedido de ejemplo con los productos agregados y el total calculado.

---

## Ejemplo de salida en consola
Sistema de Gestión de Pedidos iniciado...

Clientes registrados:

Cliente{id=1, nombre='Sthefany', email='sthefany@email.com
'}

Cliente{id=2, nombre='Juan', email='juan@email.com
'}

Productos disponibles:

Producto{id=1, nombre='Camiseta', precio=25.99}

Producto
{id=2, nombre='Pantalón', precio=39.5}

Pedido creado:

Pedido{
id=1
cliente=Sthefany
fecha=2026-02-16
productos=

Camiseta : 25.99

Pantalón : 39.5

total=79.24

}
---

## Qué aprendí con este proyecto
- Cómo crear **clases y objetos** en Java.
- Cómo usar **listas (`ArrayList`)** para almacenar múltiples objetos.
- Cómo relacionar objetos (un `Pedido` tiene un `Cliente` y varios `Productos`).
- Cómo calcular valores y aplicar reglas (IVA y descuentos).
- Cómo mostrar resultados en consola y organizar el código de manera clara.

---

## Futuras mejoras
Con más práctica, me gustaría:
- Permitir crear varios pedidos interactivos desde consola.
- Guardar pedidos en archivos para consultarlos después.
- Crear un menú para elegir clientes, productos y pedidos.
- Mejorar el formato del total y los productos en la salida de consola.

---

> Proyecto realizado como parte de mis prácticas de programación y mi aprendizaje de Java.
