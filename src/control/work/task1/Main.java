package control.work.task1;

public class Main {
    public static void main(String[] args) {
        Measurable[] measurables = new Measurable[2];
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(1,5,4.5);
        measurables[0] = circle;
        measurables[1] = triangle;
        double sumP = 0;
        double sumS = 0;
        for(Measurable measurable: measurables){
            sumP += measurable.getP();
            sumS += measurable.getS();
        }
        System.out.println("SumP : " + sumP);
        System.out.println("SumS : " + sumS);
    }
}
