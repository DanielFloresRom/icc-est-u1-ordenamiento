import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import models.Estudiante;

public class App {
    public static void main(String[] args) {
        //runEjemplosObjetos();
        //runComparators();
        runComparatorObj();
        runComparatorObj2();
    }

    private static void runComparatorObj2(){

        Estudiante e1 = new Estudiante("Juan", 19);
        Estudiante[] estudiantes = {e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 8.6),
        };

        Comparator<Estudiante>compNota=Comparator.comparingDouble(e-> e.getNota());
        Arrays.sort(estudiantes,compNota);
        for(int i=0;i<estudiantes.length;i++){
            System.out.println(estudiantes[i]);
        }
        System.out.println("***********************************");

        Estudiante e2 = new Estudiante("Juan", 19);
        List<Estudiante> estudiantess = new ArrayList<>(List.of(
            e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 8.6)
        ));

        estudiantess.sort(Comparator.comparingDouble(Estudiante::getNota));
        for (Estudiante e : estudiantes) {
        System.out.println(e);
        }

    }

    private static void runComparatorObj(){
        List<Integer> numeros=new ArrayList<>(List.of(5, 6, 4, 1, 2, 3));
        numeros.sort(Comparator.naturalOrder()); // O tambien puede ser numeros.sort(null)----- Menor a mayor
        numeros.sort(Comparator.reverseOrder());//mayor a menor
        System.out.println(numeros);

    }


    private static void runComparators() {
        Integer[] original = {5, 6, 4, 1, 2, 3};
        Arrays.sort(original);
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i]);
        }
        System.out.println("---------");
        Arrays.sort(original, Comparator.reverseOrder());
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i]);
        }
    }

    private static void runEjemplosObjetos() {

        Estudiante e1 = new Estudiante("Juan", 19);

        Estudiante[] estudiantes = {e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 8.6),

        };
        Bubble b = new Bubble();
        b.sortEstudiantes(estudiantes);
        printArregloEstudiantes(estudiantes);
    }

    private static void printArregloEstudiantes(Estudiante[] estudiantes) {

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
        }
    }

    public static void runEjemplosPrimitivos() {
        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        Bubble bubble = new Bubble();

        printArreglo(b);
        bubble.bubbleSort(b);
        printArreglo(b);
        
        System.out.println("\n");
        System.out.println("---Selection---");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        System.out.println("\n");
        System.out.println("---Insertion---");
        //Insertion insertion = new Insertion();
        printArreglo(d);
        //insertion.sort(d);
        printArreglo(d);
    }

    public static void printArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}