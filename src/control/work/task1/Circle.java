package control.work.task1;

public class Circle implements Measurable {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    //доделать проверку на то что радиус не отрицательный, можно возбуждать exception
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getP() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getS() {
        return Math.PI * r * r;
    }
}
