
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carloseduardojesusleon
 */
public class PruebaFactura {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la descripción del producto");
        String descripcion = sc.nextLine();
        System.out.println("Ingresa el precio del producto");
        double precio = parseDouble(sc.nextLine());
        System.out.println("Ingresa la cantidad del producto");
        int cantidad = parseInt(sc.nextLine());
        System.out.println("********************");
        
        Factura factura = new Factura();
        factura.setDescripcion(descripcion);
        factura.setCantidad(cantidad);
        factura.setPrecio(precio);
        factura.setNumero("01042021F");
        
        double total = factura.getTotalFactura();
        System.out.println("Número de factura: " + factura.getNumero());
        System.out.println("Articulo: " + factura.getDescripcion());
        System.out.println("Precio: " + factura.getPrecio());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Total: " + total);
        
    }
}
