package exceptions_22;

public class Corr {
    public static void main(String[] args) {
        int[] x = {4, 5, 2, 3, 1};
        int[] y = {2, 1, 4, 3, 5};
        double avgX = 0;
        double avgY = 0;
        double s = 0;
        for (int i : x) {
            s += i;
        }
        avgX = s / 5;
        s = 0;
        for (int i : y) {
            s += i;
        }
        avgY = s / 5;

        double sumX = 0;
        double sumY = 0;
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            double k = x[i] - avgX;
            double z = y[i] - avgY;
            sumX += k;
            sumY += z;
            sum += k * z;
        }
        System.out.println(sum);
        System.out.println(sumX);
        System.out.println(sumY);
        System.out.println(sum / (Math.sqrt(Math.pow(sumX, 2)) * Math.sqrt(Math.pow(sumY, 2)) ));
    }
}
