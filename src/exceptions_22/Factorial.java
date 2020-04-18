package exceptions_22;


public class Factorial {
    public int factorial(int n) throws MyException {
        if(n < 0){
            throw new MyException("Not a valid number");
        }
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
}
