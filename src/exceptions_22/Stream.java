package exceptions_22;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        double c = 1e-6;
        int[] st1 = {1,0,1,1,0,0,0};
        int[] st2 = {0,1,0,0,0,1,0};
        int[] st3 = {0,0,0,0,1,0,0};
        int[] st4 = {0,0,0,0,0,0,1};
        List<int[]> mass = new ArrayList<>();
        mass.add(st1);
        mass.add(st2);
        mass.add(st3);
        mass.add(st4);
        int x = 1;
        double constx =  1 - c;
        for(int[] arr: mass){
            double sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum += (arr[arr.length - i - 1]) * Math.pow(constx, i);
            }
            System.out.println(x + " " + sum);
            x++;
        }
    }
}
