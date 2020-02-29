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
        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = arr[i];
        }

        for (int x : b) {
            System.out.println(x);
        }
        System.out.println("__________________________________________");
        arr[5] = 34214;
        for (int x : b) {
            System.out.println(x);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        boolean b1 = Arrays.equals(arr,b);
        System.out.println(b1);
        int [] a1 = new int[5];
        int [] a2 = {3,5,6,7,2,4,7,3,1};
    }

    public static int[] getRandomArray(int n) {
        int[] help = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            help[i] = random.nextInt();
        }
        return help;
    }
}
