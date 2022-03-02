//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
//El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
//decide salir, se mostrará todos los perros guardados en el ArrayList.
//
//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
//se mostrará la lista ordenada.
package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        ArrayList<String> razas = new ArrayList();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir;

        do {

            System.out.println("Ingrese raza perro");
            razas.add(leer.next());

            System.out.println("Desea salir? (S/N)");

            String opcion = leer.next();

            if (opcion.toLowerCase().equals("s")) {
                salir = true;

            } else {
                salir = false;

            }

        } while (salir == false);

        Iterator<String> it = razas.iterator();
        System.out.println("Raza que quiera eliminar?");
        String razaEliminar = leer.next();

        while (it.hasNext()) {

            String aux1 = it.next();

            if (aux1.equals(razaEliminar)) {
                it.remove();
                System.out.println("Se ha eliminado la raza " + razaEliminar);
            } 

        }
        
        Collections.sort(razas);
        System.out.println("La lista actualizada es: ");
        for (String aux : razas) {
            System.out.print(aux + " ");
        }

    }

}
