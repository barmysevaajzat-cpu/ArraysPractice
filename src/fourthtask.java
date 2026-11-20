import java.util.Arrays;

public class fourthtask {
    public static void main(String[] args) {
        int[] a = { 4,6,7,8,9,14,16};
        System.out.println("Array:  " + Arrays.toString(a));
        System.out.println("Reversed: ");
        for ( int i = a.length - 1; i >= 0; i--){
            System.out.print(" " + a[i]);
        }
    }
}
