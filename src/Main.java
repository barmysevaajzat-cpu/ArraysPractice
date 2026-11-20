
public static void main(String[] args) {
    int[] a = { 4,6,8,-9,-2,0,5,-12,-3,7};
    int positive = 0;
    int negative = 0;
    int zero = 0;
    for(int i = 0; i < a.length; i++){
        if(a[i] >0){
            positive++;
        }else if( a[i] < 0){
            negative++;
        }else {
            zero++;
        }
    }
    System.out.println("Array:  " +Arrays.toString(a));
    System.out.println("Positive: "+positive);
    System.out.println("Negative: "+ negative);
    System.out.println("Zero: " + zero);
}
