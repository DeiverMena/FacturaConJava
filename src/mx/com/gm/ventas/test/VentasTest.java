/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

/**
 *
 * @author Deiver
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto productoUno = new Producto("Camisa", 50.00);
        Producto productoDos = new Producto("Pantalon", 100.00);
        
        Orden ordenUno = new Orden();
        ordenUno.agregarProducto(productoUno);
        ordenUno.agregarProducto(productoDos);
        ordenUno.MostrarOrden();
    }
}
