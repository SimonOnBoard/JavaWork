package exceptions_22;


public class Factorial {
    public int fact(int n) throws Exception {
        if(n < 0){
            throw new IllegalArgumentException("Not a valid number");
        }
        if(n == 0){
            return 1;
        }
        else{
            return n * fact(n - 1);
        }
    }
}
