
public class App {
    public static void main(String[] args) throws Exception {
        int[] original={5,3,4,1,2};
        int[] b=original.clone();
        int[] c=original;

        Bubble buuble=new Bubble();
        printArreglo(b);
        buuble.sort(b);
        printArreglo(b);
    }

    public static void printArreglo(int[]arreglo){
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+"-");
        }
        System.out.println();
    }

}
