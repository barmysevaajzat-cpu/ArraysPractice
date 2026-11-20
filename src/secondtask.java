import java.util.Arrays;

public class secondtask {
    public static void main(String[] args) {
        int[] a = {1, 9, -9, -8, 0, -12, 33, 7};
        int max = a [0];
        int maxindex = 0;
        int min = a [0];
        int minindex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxindex = i;
            } else if (a[i] < min) {
                min = a[i];
                minindex = i;
            }
        }
        System.out.println("Array:  " + Arrays.toString(a));
        System.out.println("The largest number: " + max +" at index "+ maxindex);
        System.out.println("The smallest number: " + min+ " at index "+ minindex);

    }
}
