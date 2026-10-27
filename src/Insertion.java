public class Insertion {

    public static void main(String[] args) {
        int[] arreglo = {5, 6, 4, 1, 2, 3};

        System.out.println(" Selection Insertion");
        System.out.println("Original:");
        imprimirArreglo(arreglo);

        ordenarInsercionDescendente(arreglo);

        System.out.println("Ordenado Des");
        imprimirArreglo(arreglo);
    }

    public static void ordenarInsercionDescendente(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int aux = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < aux) {
                arr[j + 1] = arr[j];
                j--;
            }

            int posInsercion = j + 1;
            arr[posInsercion] = aux;

            if (posInsercion != i) {
                System.out.println("El aux= " + aux + " se inserta en pos " + posInsercion);
            }
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }
}