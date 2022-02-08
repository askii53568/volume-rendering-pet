package models;

public class TFColor {

    public double r, g, b, a;

    public TFColor() {
        r = g = b = a = 1.0;
    }

    public TFColor(double red, double green, double blue, double alpha) {
        r = red;
        g = green;
        b = blue;
        a = alpha;
    }

    @Override
    public String toString() {
        String text = "(" + r + ", " + g + ", " + b + ", " + a + ")";
        return text;
    }
}