package control.work;


import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] a = {5, 8, 13, 48, 24, 2, 53};
        int min = a[0];
        //нахождение нулевого элемента
        for (int x : a) {
            if (x < min) min = x;
        }
        reverse(a, min);
        min = a.length - min;
        int b1 = (int) Math.ceil(((min - 1) - 0 + 1) /(double) 2);
        int help;
        for (int i = 0; i < b1; i++) {
            help = a[i];
            a[i] = a[min - i - 1];
            a[min - i - 1] = help;
        }
        System.out.println(Arrays.toString(a));
        b1 = (int) Math.ceil((a.length - 1 - (min) + 1) / (double) 2);
        for (int i = 0; i < b1; i++) {
            help = a[i + min];
            a[i + min] = a[a.length - 1 - i];
            a[a.length - 1 - i] = help;
        }
        System.out.println(Arrays.toString(a));
        b1 = (int) Math.ceil((a.length / 2d));
        for (int i = 0; i < b1; i++) {
            help = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = help;
        }
        System.out.println(Arrays.toString(a));
    }

    private static void reverse(int[] a, int min) {
        int b[] = new int[a.length];
        int counter = 0;
        for(int i = a.length - min; i < a.length; i++){
            b[counter] = a[i];
            counter++;
        }
        for(int i = 0; i < a.length - min; i++){
            b[counter] = a[i];
            counter++;
        }
        System.out.println(Arrays.toString(b));
        System.out.println("_____");
    }
}
