//  Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
//  esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
//  horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
//  cuenta lo que se pide a continuación:
//
//  En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
//  usuario todos sus datos y guardándolos en el objeto Pelicula.
//  Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
//  quiere crear otra Pelicula o no.
//  Después de ese bucle realizaremos las siguientes acciones:
//  • Mostrar en pantalla todas las películas.
//  • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//  • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//  en pantalla.
//  • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//  en pantalla.
//  • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
//  • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
//
package ejercicio4;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        ArrayList<Pelicula> peliculas = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        boolean agregar = true;
        String op;

        while (agregar) {

            System.out.println("Ingrese titulo de la pelicula");
            String pelicula = leer.next();

            System.out.println("Ingrese el nombre del director");
            String director = leer.next();

            System.out.println("Ingrese la duracion(EN HORAS)");
            Integer duracion = leer.nextInt();

            Pelicula p1 = new Pelicula(pelicula, director, duracion);

            peliculas.add(p1);

            System.out.println("Agregar mas?");
            op = leer.next();
            if (op.equalsIgnoreCase("s")) {
                agregar = true;
            } else {
                agregar = false;
            }
        }

        //mostrar todas las peliculas
        System.out.println("Todas las peliculas");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }

        //mostrar peliculas con mayor duracion a una hora
        System.out.println("Peliculas con mas de una hora");
        for (Pelicula aux : peliculas) {
            if (aux.getDuracion()>1) {
                System.out.println(aux.toString());    
            }
            
        }
        
        
        
        
        //ordenar por duracion de mayor a menor
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionMayor);
        System.out.println("Ordenadas duracion mayor a menor");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
            }
        //ordenar por duracion de menor a mayor
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionMenor);
        System.out.println("Ordenadas duracion menor a mayor");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }

        //ordenar alfabeticamente por titulo
        Collections.sort(peliculas, Comparadores.ordenarPorTitulo);
        System.out.println("Ordenadas titulo");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        //ordenar alfabeticamente por director
        Collections.sort(peliculas, Comparadores.ordenarPorDirector);
        System.out.println("Ordenadas director");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
    }

}
