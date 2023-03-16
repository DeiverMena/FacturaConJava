/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ventas;

/**
 *
 * @author Deiver
 */
public class Orden  {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTO = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTO];
    }
    
    public void agregarProducto(Producto producto){
        if(contadorProductos < Orden.MAX_PRODUCTO){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo numero de productos ("+MAX_PRODUCTO+")");
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();    
        }
        return total;
    }
    
    public void MostrarOrden(){
        System.out.println("IdOrden: "+ this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("total de la Orden $ = " + totalOrden);
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]+"\n");
        }
                
    }
}
