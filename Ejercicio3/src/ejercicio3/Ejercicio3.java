//Crear una clase llamada Alumno que mantenga información sobre las notas de
//distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
//tipo Integer con sus 3 notas.
//En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bluce tendremos el siguiente método en la clase Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
//nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
//Dentro del método se usará la lista notas para calcular el promedio final de alumno.
//Siendo este promedio final, devuelto por el método y mostrado en el main.
//Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.
package ejercicio3;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> notas = new ArrayList();

        Alumno a1 = new Alumno();

        System.out.println("Ingrese un nombre alumno");
        String nombre = leer.next();

        for (int j = 0; j < 3; j++) {
            System.out.println("Ingrese nota");
            Integer nota = leer.nextInt();
            notas.add(nota);
        }

        a1.setNombre(nombre);
        a1.setNotas(notas);

        System.out.println(a1.getNombre() + "Nombre: ");
        System.out.println("Nota: ");
        for (Integer nota : a1.getNotas()) {
            System.out.print(nota + " ");
        }

        Alumno a2 = new Alumno();
        ArrayList<Integer> notas2 = new ArrayList();


        System.out.println("Ingrese nombre alumno 2");
        String nombre2 = leer.next();
        for (int j = 0; j < 3; j++) {
            System.out.println("Ingrese nota");
            Integer nota = leer.nextInt();
            notas2.add(nota);
        }        
        
        a2.setNombre(nombre2);
        a2.setNotas(notas2);

        System.out.println("Nombre: " + a2.getNombre());
        System.out.println("Nota: ");
        for (Integer nota : a2.getNotas()) {
            System.out.print(nota + " ");
        }    

//        ArrayList<Alumno> alumnos = new ArrayList();
//
//        boolean salir;
//        String op;
//
//        do {
//            System.out.println("Desea ingresar un alumno?(s/n)");
//            op = leer.next();
//
//            if (op.equals("s")) {
//                salir = false;
//                System.out.println("Ingrese un nombre alumno");
//                String nombre = leer.next();
//
//                for (int j = 0; j < 3; j++) {
//                    System.out.println("Ingrese nota");
//                    Integer nota = leer.nextInt();
//                    notas.add(nota);
//                }
//
//                Alumno a = new Alumno(nombre, notas);
//
//                alumnos.add(a);
//            } else {
//                salir = true;
//            }
//
//        } while (salir == false);
//
//        for (Alumno aux : alumnos) {
//            System.out.println(aux.imprimir());
//
//            System.out.print("Notas: ");
//            aux.recorrerNotas();
//        }
        }

    }
