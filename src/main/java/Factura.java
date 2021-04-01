/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carloseduardojesusleon
 */
public class Factura {
    private String numero;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura() {
        
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double getTotalFactura () {
        double total = this.cantidad * this.precio;
        if(this.precio < 0) {
            this.precio = 0.0;
        }
        
        if(total < 0) {
            total = 0;
        }
        
        return total;
        
    }
    
    
}
