public class Bubble { 
    public int[] sort(int[] arreglo){
        int cambios = 0;
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Pasada " + i);
            boolean combinaciones = false;
            for (int j = 1; j < arreglo.length; j++){
                comparaciones++;
                if (arreglo[j-1] > arreglo[j]){
                    cambios++;
                    combinaciones = true;
                    int aux = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
            if (!combinaciones){
                break;
            }
            System.out.println("Cambios " + i + ": " + cambios);
            System.out.println("Comparaciones " + i + ": " + comparaciones);
        }
        System.out.println("Cambios totales: " + cambios);
        System.out.println("Comparaciones totales: " + comparaciones);
        return arreglo;
    }
}