//Se requiere un programa que lea y guarde países, y para evitar que se ingresen
//repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
//guardará el país en el conjunto y después se le preguntará al usuario si quiere
//guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
//guardados en el conjunto.
//Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
//recordar como se ordena un conjunto.
//Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
//se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
//ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
//se le informará al usuario.

package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<String> paises = new HashSet();
        
        boolean agregar;
        String op;
        String pais;
        
        
        System.out.println("Ingrese un pais");
        pais = leer.next();
        
        paises.add(pais);
        
        do {
            
            System.out.println("Desea ingresar otro pais?");
            op= leer.next();
            
            if (op.equalsIgnoreCase("s")) {
                
                System.out.println("Ingrese el pais");
                pais = leer.next();
                paises.add(pais);
                agregar=true;
            }else{
                agregar=false;
            }
            
        } while (agregar);
        
        
        //ordenar HashSet
        
        ArrayList<String> paisesLista = new ArrayList(paises);
        Collections.sort(paisesLista);
        
        for (String aux : paisesLista) {
            System.out.print(aux + " ");
        }
        System.out.println(" ");
        
        Iterator<String> it = paisesLista.iterator();
        
        System.out.println("Ingrese el pais a eliminar");
        String paisEliminar = leer.next();
        
        int tamanioAntes = paisesLista.size();
        
        while (it.hasNext()) {
            String aux1 = it.next();
            
            if (aux1.equalsIgnoreCase(paisEliminar)) {
                it.remove();
            }
        }
        
        int tamanioDespues = paisesLista.size();
        
        if (tamanioAntes==tamanioDespues) {
            System.out.println("No se ha encontrado el pais que deseaba eliminar");
            
        }
        
        
        System.out.println("Lista actualizada");
        for (String aux2 : paisesLista) {
            System.out.print(aux2 + " ");
        }
        
    }
    
}
