import models.Estudiante;

public class Bubble {
    public void bubbleSort(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 1; j < numeros.length - i; j++) {
                if (numeros[j - 1] > numeros[j]) {
                    int temp = numeros[j - 1];
                    numeros[j - 1] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        System.out.println("Arreglo ordenado:" + java.util.Arrays.toString(numeros));
    }

    public void sortEstudiantes(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length - 1; i++) {
            boolean cambio = false;
            for (int j = 0; j < estudiantes.length - 1 - i; j++) {
                if (estudiantes[j].getNota() > estudiantes[j + 1].getNota()) {
                    Estudiante temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                    cambio = true;
                }
            }
            if (!cambio) {
                break;
            }
        }
    }
}