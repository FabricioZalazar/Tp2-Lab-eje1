package TP1Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TP1Lab {

    public static void main(String[] args) {

        //EJE 1
        Scanner leer = new Scanner(System.in);
        ArrayList<String> Lista = new ArrayList();
        boolean bandera = true;
        while (bandera) {
            System.out.println("ingrese la raza de perro meessi");
            String raza = leer.nextLine();
            Lista.add(raza);
            System.out.println("quiere ingresar otra raza");
            System.out.println("ingrese S para si o N para no");
            String respuesta = leer.nextLine();

            while (!respuesta.equalsIgnoreCase("n") && !respuesta.equalsIgnoreCase("s")) {

                System.out.println(" *** ERROR *** ingrese una letra correcta");
                respuesta = leer.nextLine();
            }

            if (respuesta.equalsIgnoreCase("N")) {
                bandera = false;
            }

        }
        System.out.println("Lista de razas de perros:");
        for (String ele : Lista) {
            System.out.println("Raza = " + ele);
        }

        //EJE 2
        System.out.print("Introduce una raza para buscar y eliminar: ");
        String razaABuscar = leer.nextLine();

        Iterator<String> buscador = Lista.iterator();
        boolean encontrado = false;
        while (buscador.hasNext()) {
            String raza = buscador.next();
            if (raza.equalsIgnoreCase(razaABuscar)) {
                buscador.remove();
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Raza eliminada.");
        } else {
            System.out.println("Raza no encontrada.");
        }

        // Ordenar la lista
        Collections.sort(Lista);

        // Mostrar la lista ordenada
        System.out.println("Lista de razas ordenada:");
        for (String raza : Lista) {
            System.out.println(raza);
        }

        //EJE 3
        List<Pelicula> ListadePeli = new ArrayList();

        while (bandera) {
            System.out.println("ingrese director");
            String director = leer.nextLine();
            System.out.println("ingrese titulo");
            String titulo = leer.nextLine();
            System.out.println("ingrese duracion en horas");
            double duracion = leer.nextDouble();
            leer.nextLine();
            Pelicula p1 = new Pelicula(director, titulo, duracion);

            ListadePeli.add(p1);

            System.out.println("quiere guardar otra pelicula?");
            System.out.println("ingrese s o n");
            String respuesta = leer.nextLine();

            while (!respuesta.equalsIgnoreCase("n") && !respuesta.equalsIgnoreCase("s")) {

                System.out.println(" *** ERROR *** ingrese una letra correcta");
                respuesta = leer.nextLine();
            }

            if (respuesta.equalsIgnoreCase("N")) {
                bandera = false;
            }

        }
        //A: MUESTRA LOS TITULOS DE PELICULA
        System.out.println("La lista de pelicula es ");
        for (Pelicula p2 : ListadePeli) {
            System.out.println(p2.getTitulo());
        }
        System.out.println("-----------------------------------------------");
        //B. MUESTRA LA DURACION DE LA PELICULA
        System.out.println("la lista de peliculas de mas de una hora es ");
        for (Pelicula object : ListadePeli) {
            if (object.getDuracion() > 1) {
                System.out.println(object.getTitulo());
            }
        }
        System.out.println("-----------------------------------------------");
        //C.  PELICULAS ORDENADAS DE MAYOR A MENOR
        System.out.println("peliculas ordenadas mayor a menor");
        Collections.sort(ListadePeli, Pelicula.DeMayoraMenor);

        for (Pelicula p2 : ListadePeli) {
            System.out.println(p2.getTitulo() + " [" + p2.getDuracion() + "]");
        }
        System.out.println("-----------------------------------------------");
        // D. ORDENADAS DE MENOR A MAYOR.
        System.out.println("peliculas ordenadas menor a mayor");
        Collections.sort(ListadePeli, Pelicula.DeMenoraMayor);

        for (Pelicula p2 : ListadePeli) {
            System.out.println(p2.getTitulo() + " [" + p2.getDuracion() + "]");
        }
        System.out.println("-----------------------------------------------");
        // E. ORDENAR ALFABETICAMENTE POR TITULO
        System.out.println("peliculas ordenadas alfabeticamente");
        Collections.sort(ListadePeli, Pelicula.OrdenarAlfabeticamente);

        for (Pelicula p2 : ListadePeli) {
            System.out.println(p2.getTitulo());
        }
        System.out.println("-----------------------------------------------");
        // F. ORDENAR ALFABETICAMENTE POR DIRECTOR
        System.out.println("peliculas ordenadas por director");
        Collections.sort(ListadePeli, Pelicula.OrdenarAlfabeticamenteDirector);

        for (Pelicula p2 : ListadePeli) {
            System.out.println(p2.getTitulo() + " [" + p2.getDirector() + "]");
        }

        //Prueba git
        System.out.println("Hola");
        System.out.println("");

        //PRUEBA GIT
        System.out.println("-----------------------------------------------");
        
        //Maiaameeeeeeeeeee!!
    }

}
