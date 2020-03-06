import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        String s = null;
        if (s == null) {
            System.out.println("true");
        }

        int n = 10;
        arr = getRandomArray(n);
        for (int javaLoveDi : arr) {
            System.out.println(javaLoveDi);
            javaLoveDi = 20;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.toString());



        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = arr[i];
        }
        System.out.println("__________________________________________");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        boolean result = true;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == b[i]){
                continue;
            }
            if(arr[i] != b[i]){
                result = false;
                break;
            }
        }

        boolean b1 = Arrays.equals(arr,b);
        System.out.println(b1);
        int [] a1 = new int[5];
        int [] a2 = {3,5,6,7,2,4,7,3,1};
        char[] arr1 = getRandomCharArray(n);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] getRandomArray(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
    public static char[] getRandomCharArray(int n){
        char[] newArray = new char[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            newArray[i] = (char) random.nextInt();
        }
        return newArray;
    }
}
