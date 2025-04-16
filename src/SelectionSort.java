public class SelectionSort {

    public static void main(String[] args) {
        int b = 5;
        mystery(b, b--, --b, ++b);
    }

    public static void mystery(int x, int y, int z, int a){
        System.out.println(x + " " + y + " " + z + " " + a);
    }
}
