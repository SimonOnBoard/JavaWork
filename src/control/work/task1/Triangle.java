package control.work.task1;

public class Triangle implements Measurable {
    private double side1;
    private double side2;
    private double side3;

    //Todo обработать случай когда такого треугольника не существует

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //
    @Override
    public double getP() {
        return side1 + side2 + side3;
    }

    @Override
    public double getS() {
        double p = getP();
        p /= 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
