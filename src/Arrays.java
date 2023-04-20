public class Arrays {
    public static void main(String[] args) {
//        Forma 1 de construir arrays
        int[] conjunto ={1, 2, 3, 4, 5, 6, 7};
        for(int i = 0;i < conjunto.length;i++) {
            System.out.printf("%d - ", conjunto[i]);
        }
        System.out.println();
        for(int f:conjunto) {
            System.out.printf("%d - ", f);
        }
    }
}
