package enum_21;

public enum Color {
    RED(255, 0, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), WHITE(255, 255, 255),
    BLACK(0, 0, 0);

    private int r, g, b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getRGBValues() {
        return "(" + r + "," + g + "," + b + ")";
    }

}
