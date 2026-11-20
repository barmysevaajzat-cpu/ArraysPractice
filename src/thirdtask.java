import java.util.Arrays;

public class thirdtask {
    public static void main(String[] args) {
        int[] a = { 10,20,30,40,50,60 };
        int sum = 0;
        for( int i = 0; i < a.length;i++){
            sum+=a[i];
        }
        double average = (double) sum/a.length;
        int big = 0;
        for( int i = 0; i < a.length;i++){
           if( a[i] > average){
               big++;
           }
        }
        System.out.println("Array:  " + Arrays.toString(a));
        System.out.println("Average: "+ average);
        System.out.println("Number above average: "+big);
    }
}
