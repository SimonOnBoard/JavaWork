public class ArrayMaximum {
    public static void main(String[] args) {
        System.out.println(maxOfArray(new int[]{3, 5, 1},0));
    }
    public static int maxOfArray(int[] mas, int k){
        if(k == mas.length - 1){
            return mas[k];
        }
        else{
            int m = maxOfArray(mas, k + 1);
            return m > mas[k] ? m : mas[k];
        }
    }
}
