public class Insertion {
    public void sort(int[] arreglo) {
        System.out.println("--- Insertion ---");
        System.out.println("Original");
        imprimirArreglo(arreglo);
        for (int i = 1; i < arreglo.length; i++) {
            int key = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] < key) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;
            if (j + 1 != i) {
                System.out.println("El aux= " + key + " se inserta en pos " + (j + 1));
            }
        }
        System.out.println("Ordenado Des");
        imprimirArreglo(arreglo);
    }
    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}