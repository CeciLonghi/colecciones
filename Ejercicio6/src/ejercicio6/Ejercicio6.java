//Se necesita una aplicación para una tienda en la cual queremos almacenar los
//distintos productos que venderemos y el precio que tendrán. Además, se necesita
//que la aplicación cuente con las funciones básicas.
//Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Double> productos = new HashMap();

        boolean agregar;
        String opcionesW;
        int opcionesS;

        do {
            System.out.println("Ingrese una opcion");
            opcionesS = leer.nextInt();
            switch (opcionesS) {
                //ingresar productos
                case 1:
                    System.out.println("Ingrese el nombre del producto");
                    String nombreProducto = leer.next();
                    System.out.println("Ingrese el precio");
                    Double precio = leer.nextDouble();
                    productos.put(nombreProducto, precio);
                    break;

                //modificar precio    
                case 2:
                    System.out.println("Ingrese el nombre del producto a modificar");
                    nombreProducto = leer.next();
                    System.out.println("Ingrese el precio modificado");
                    Double precioModificado = leer.nextDouble();
                    productos.put(nombreProducto, precioModificado);
                    break;
                //eliminar un producto    
                case 3:
                    System.out.println("Ingrese el producto que quiere eliminar");
                    nombreProducto = leer.next();
                    productos.remove(nombreProducto);
                    break;

                //mostrar    
                case 4:
                    for (Map.Entry<String, Double> aux : productos.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();

                        System.out.println(key + " vale $" + value);
                    }
                    break;
            }
            
            
            System.out.println("Quiere salir?");

            opcionesW = leer.next();

            if (opcionesW.equalsIgnoreCase("s")) {
                agregar = false;
            } else {
                agregar = true;
            }

        } while (agregar);

    }

}
