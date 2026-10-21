public class App {
    public static void main(String[] args) throws Exception {

        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        System.out.println("--- Bubble ---");
        Bubble bubble = new Bubble();
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);
        System.out.println();

        System.out.println("--- Selection ---");
        Selection selection = new Selection();
        selection.sort(c);
        System.out.println();

        Insertion insertion = new Insertion();
        insertion.sort(d);
    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }
}